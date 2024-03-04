grammar Operaciones;


expr:   ('^') expr expr
    |   ('*' | '/') expr  expr
    |   ('+' | '-') expr  expr
    |   INT
    |   FLOAT
    |   '(' expr ')'
    ;

INT :   [0-9]+;
FLOAT : [0-9]+'.'[0-9]+;
WS  :   [ \t\r\n]+ -> skip;