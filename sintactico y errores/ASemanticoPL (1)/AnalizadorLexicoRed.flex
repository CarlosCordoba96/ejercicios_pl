//* --------------------------Seccion codigo-usuario ------------------------*/ 

import java_cup.runtime.*;

%% 

/* -----------------Seccionde opciones y declaraciones -----------------*/ 
/*--OPCIONES --*/ 
/* Nombre de la clase generada para el analizadorlexico*/ 

%class analex 

/* Indicar funcionamientoautonomo*/ 


/* Posibilitar acceso a la columna y fila actual de analisis para depurar el funcionamiento*/ 

%line

%column

/* Habilitar la compatibilidad con el interfaz CUP para el generador sintáctico */

%cup 

/*--DECLARACIONES --*/ 

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
/* ------------------------Seccion de reglaslexicas: Patron Accion----------------------*/
<YYINITIAL> {

[A-Z]+ 		{return symbol(sym.NombreRed,new String(yytext()));}	

[a-z]+		{return symbol(sym.Usuario,new String(yytext()));}

[a-z]+[0-9]+	{return symbol(sym.Password,new String(yytext()));}
	
"Participantes"	{return symbol(sym.Participantes);}

"Vinculos"		{return symbol(sym.Vinculos);}

"Origen:"		{return symbol(sym.Origen);}	

"Destino:"		{return symbol(sym.Destino);}	

[0-9][0-9]		{return symbol(sym.Digito,new Integer(yytext()));}	

";"			{return symbol(sym.PuntoyComa);}
"-"			{return symbol(sym.Guion);}

[ \t\r\n\f] 	{ /* ignora delimitadores */ }
. 			{System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}



}/* fin YYinitial */
