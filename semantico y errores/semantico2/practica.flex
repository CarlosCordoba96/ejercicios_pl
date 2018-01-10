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
[0-9]+		{return symbol(sym.Number,new Integer(yytext()));}
"oct" {return symbol(sym.OCT,new String(yytext()));}
"hex" {return symbol(sym.HEX,new String(yytext()));}
"bin" {return symbol(sym.BIN,new String(yytext()));}
";"                        {return symbol(sym.PUNTOYCOMA); }


[ \t\r\n\f] { /* ignora delimitadores */ }
