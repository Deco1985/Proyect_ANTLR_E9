package com.mycompany.operacione;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;

public class EvaluarExpresionesPrefijas {

    public static class EvalListener extends OperacionesBaseListener {


        // Método para evaluar la expresión y devolver el resultado
public double evaluate(ParseTree tree) {
    if (tree instanceof OperacionesParser.ExprContext) {
        OperacionesParser.ExprContext expr = (OperacionesParser.ExprContext) tree;

        // Verifica si el nodo es un valor numérico directo (INT o FLOAT)
        if (expr.INT() != null) {
            return Double.parseDouble(expr.INT().getText());
        } else if (expr.FLOAT() != null) {
            return Double.parseDouble(expr.FLOAT().getText());
        }

        // Verifica si la expresión contiene operaciones
        if (expr.getChildCount() > 0 && expr.getChild(0) instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) expr.getChild(0);
            String text = terminalNode.getText();

            // Omite los paréntesis, evalúa solo el contenido entre ellos
            if (text.equals("(") && expr.getChildCount() == 3) {
                return evaluate(expr.expr(0)); // Evalúa la expresión entre paréntesis
            } else {
                // Procesa operadores y evalúa operandos
                double left = evaluate(expr.expr(0)); // Primer operando
                double right = evaluate(expr.expr(1)); // Segundo operando
                return calculate(left, right, text); // Utiliza 'text' como operador
            }
        }
    }
    throw new RuntimeException("Componente desconocido en el árbol de análisis: " + tree.getText());
}

        // Método auxiliar para realizar los cálculos
        private double calculate(double left, double right, String operator) {
            switch (operator) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
                case "*":
                    return left * right;
                case "/":
                    return left / right;
                case "^":
                    return Math.pow(left, right);
                default:
                    throw new UnsupportedOperationException("Operador desconocido: " + operator);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String nombreDelArchivo = "src\\main\\java\\com\\mycompany\\operacione\\expresion.txt";

        String expresion;
        try {
            // Lee la expresión desde el archivo
            expresion = new String(Files.readAllBytes(Paths.get(nombreDelArchivo)));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        OperacionesLexer lexer = new OperacionesLexer(CharStreams.fromString(expresion));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OperacionesParser parser = new OperacionesParser(tokens);
        ParseTree tree = parser.expr();

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener listener = new EvalListener();
        walker.walk(listener, tree);

        System.out.println("Resultado: " + listener.evaluate(tree));
        
                // Muestra el árbol de análisis en una ventana GUI
        JFrame frame = new JFrame("Árbol de Análisis");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewer.setScale(1.5); // Escala un poco el árbol
        panel.add(viewer);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}