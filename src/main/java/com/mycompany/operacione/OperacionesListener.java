package com.mycompany.operacione;

// Generated from C:/Users/elcab/Documents/ProyectoTLP/Operaciones.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperacionesParser}.
 */
public interface OperacionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(OperacionesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(OperacionesParser.ExprContext ctx);
}