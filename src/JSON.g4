/** Taken from "The Definitive ANTLR 4 Reference" by Terence Parr */
grammar JSON;

/*
 * Parser Rules
 */

json                : value ;

my_object           : '{' pair (',' pair)* '}' | '{' '}' ;

pair                : STRING ':' value ;

array               : '[' value (',' value)* ']' | '[' ']' ;

value               : STRING
                    | NUMBER
                    | my_object
                    | array
                    | 'true'
                    | 'false'
                    | 'null'
                    ;

/*
 * Lexer Rules
 */

STRING              : '"' (ESC | ~ ["\\])* '"' ;
fragment ESC        : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE    : 'u' HEX HEX HEX HEX ;
fragment HEX        : [0-9a-fA-F] ;
NUMBER              : '-'? INT '.' [0-9] + EXP? | '-'? INT EXP | '-'? INT ;
fragment INT        : '0' | [1-9] [0-9]* ;
fragment EXP        : [Ee] [+\-]? INT ;
WS                  : [ \t\n\r] + -> skip ;