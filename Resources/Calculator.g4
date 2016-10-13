grammar  Calculator  ;

start : idenStmt | exprStmt ';' | writeStmt ;

idenStmt : Type Iden ;

exprStmt : Iden '='  ( '('expr')' | Iden | Constant)  ;

expr : ('+'|'-'|'*'|'/')( '('expr')' | Iden | Constant );

writeStmt : 'write('Iden');';


Type : 'int' | 'float';
Iden : [(a-z)|(A-Z)]+[(A-Z)|(a-z)|('_')|(0-9)]*;
Constant : [1-9][0-9]*('.')?[0-9]*;
WS : [\t\n\r\s' ']+ -> skip;


