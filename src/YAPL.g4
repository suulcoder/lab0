/** Grammar from my_class files */
grammar YAPL;

/*
 * Parser Rules
 */

program             : (my_class)+ ;

my_class            : 'my_class' TYPE ('inherits' TYPE)? '{' (feature ';')* '}' ;

feature             : (ID '(' '[' formal (',' formal)* ']' ')' ':' TYPE '{' expr '}')
                    |  ID ':' TYPE '[' '<-' expr ']'
                    ;

formal              : ID ':' TYPE ;

expr                : ID '<-' expr
                    | expr '[' '@' TYPE ']' '.' ID '(' '[' expr (',' expr)* ']' ')'
                    | 'if' expr 'then' expr 'else' expr 'fi'
                    | 'while' expr 'loop' expr 'pool' 
                    | '{' (expr ';')+ '}'
                    | 'let' ID ':' TYPE '[' '<-' expr ']' (',' ID ':' TYPE '[' '<-' expr ']')* 'in' expr
                    | 'new' TYPE
                    | 'isvoID' expr
                    | expr '+' expr
                    | expr '-' expr
                    | expr '*' expr
                    | expr '/' expr
                    | '~' expr
                    | expr '<' expr
                    | expr '<=' expr
                    | expr '=' expr
                    | 'not' expr
                    | '(' expr ')'
                    | ID
                    | INT
                    | STRING
                    | 'true'
                    | 'false'
                    ;

/*
 * Lexer Rules
 */

STRING              : '"' (ESC | ~ ["\\])* '"' ;
fragment ESC        : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE    : 'u' HEX HEX HEX HEX ;
fragment HEX        : [0-9a-fA-F] ;
INT                 : '0' | [1-9] [0-9]* ;
ID                  : [a-zA-Z] [0-9a-zA-Z]? ;
TYPE                : [a-zA-Z] [0-9a-zA-Z]? ;

