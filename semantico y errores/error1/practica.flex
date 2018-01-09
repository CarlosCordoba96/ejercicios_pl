/* --------------------------Seccion codigo-usuario ------------------------ */
import java_cup.runtime.Symbol;

/* --------------------------Seccion codigo-usuario ------------------------ */
import java_cup.runtime.Symbol;

%%
/* ----------------- Seccion de opciones y declaraciones  ----------------- */

%cup
%{


 private Symbol symbol(int type) {

   return new Symbol(type,yyline,yycolumn);

 }

private Symbol symbol(int type,Object value){
	return new Symbol(type,yyline,yycolumn,value);
}


/* Fin symbol */


%} /* Fin Declaraciones */

%%
/* ------------------------ Seccion de reglas lexicas ---------------------- */

"a"                        {return symbol(sym.a,new String(yytext())); }
"b"                         {return symbol(sym.b,new String(yytext())); }

[ \t\r\n\f] { /* ignora delimitadores */ }
