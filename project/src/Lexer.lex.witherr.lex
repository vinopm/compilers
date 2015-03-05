/* JFlex example: part of Java language lexer 
specification */
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */
%%
%class Lexer
%unicode
%cup
%line
%column
%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

  private void error(String msg) {
    System.out.println("Lexical error: Error in line " + yyline + ", column " + yycolumn + ": " + msg + " Continuing scan from scanner state YYINITIAL.");
    yybegin(YYINITIAL);
  }
%}
 LineTerminator = "\n"
InputCharacter = [^\n]
WhiteSpace = {LineTerminator} | [ \t\v\f\r]
/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} 

TraditionalComment   = "/#" ~"#/"
EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}


Bool = "T" | "F"


Identifier = [a-zA-Z][a-zA-Z0-9_]*
//Int = 0 | [-]? [1-9] [0-9]*
Int = 0 | [1-9] [0-9]*
String = "\"" ~"\""
Rat = {Int}_ "-"* {Int} "/" "-"* {Int}
Float = {Int} "." [0-9]+ 
Char = \'[ -~]\'

//%state STRING IN_SINGLE_QUOTE EXPECT_SINGLE_QUOTE

%%
<YYINITIAL> {

	"!" 	 { return symbol(sym.EXCLAMATION); }
	"&&" 	 { return symbol(sym.AMPERSANDAMPERSAND); }
	"-" 	 { return symbol(sym.MINUS); }
	"+" 	 { return symbol(sym.PLUS); }
	"*" 	 { System.out.printf("* "); return symbol(sym.ASTERISK); }
	"/" 	 { System.out.printf("/ "); return symbol(sym.FSLASH); }
	"^" 	 { System.out.printf("^ "); return symbol(sym.CARAT); }
	"[" 	 { System.out.printf("[ "); return symbol(sym.LSQUAREBRACKET); }
	"]" 	 { System.out.printf("] "); return symbol(sym.RSQUAREBRACKET); }
	"(" 	 { System.out.printf("( "); return symbol(sym.LBRACKET); }
	")" 	 { System.out.printf(") "); return symbol(sym.RBRACKET); }
	"::" 	 { System.out.printf(":: "); return symbol(sym.COLONCOLON); }
	":" 	 { System.out.printf(": "); return symbol(sym.COLON); }
	"<" 	 { System.out.printf("< "); return symbol(sym.LTHAN); }
	">" 	 { System.out.printf("> "); return symbol(sym.MTHAN); }
	"||" 	 { System.out.printf("|| "); return symbol(sym.PIPEPIPE); }
	"<=" 	 { System.out.printf("<= "); return symbol(sym.LTHANEQUALITY); }
	"=>" 	 { System.out.printf("=> "); return symbol(sym.IMPLICATION); }
	"!=" 	 { System.out.printf("!= "); return symbol(sym.EXCLAMATIONEQUALITY); }
	";" 	 { System.out.printf("; "); return symbol(sym.SEMICOLON); }
	"{" 	 { System.out.printf("{ "); return symbol(sym.LBRACE); }
	"}" 	 { System.out.printf("} "); return symbol(sym.RBRACE); }
	"." 	 { System.out.printf(". "); return symbol(sym.DOT); }
	"," 	 { System.out.printf(", "); return symbol(sym.COMMA); }
	":=" 	 { System.out.printf(":= "); return symbol(sym.EQUALITY); }
	"=" 	 { System.out.printf("= "); return symbol(sym.EQUALITYEQUALITY); }
	"tdef" 	 { System.out.printf("tdef "); return symbol(sym.TDEF); }
	"fdef" 	 { System.out.printf("fdef "); return symbol(sym.FDEF); }
	"while"  { System.out.printf("while "); return symbol(sym.WHILE); }
	"do" 	 { System.out.printf("do "); return symbol(sym.DO); }
	"od"	 { System.out.printf("od "); return symbol(sym.OD); }
	"return" { System.out.printf("return "); return symbol(sym.RETURN); }
	"read" 	 { System.out.printf("read "); return symbol(sym.READ); }
	"print"  { System.out.printf("print "); return symbol(sym.PRINT); }
	"if" 	 { System.out.printf("if "); return symbol(sym.IF); }
	"else" 	 { System.out.printf("else "); return symbol(sym.ELSE); }
	"forall" { System.out.printf("forall "); return symbol(sym.FORALL); }
	"fi" 	 { System.out.printf("fi "); return symbol(sym.FI); }
	"in" 	 { System.out.printf("in "); return symbol(sym.IN); }
	"bool"	{ System.out.printf("bool "); return symbol(sym.BOOL); }
	"main"	{ System.out.printf("main "); return symbol(sym.MAIN); }
	"seq"	{ System.out.printf("seq "); return symbol(sym.SEQ); }
	"dict"	{ System.out.printf("dict "); return symbol(sym.DICT); }
	"len"	{ System.out.printf("len "); return symbol(sym.LEN); }
	"alias"	{ System.out.printf("alias "); return symbol(sym.ALIAS); }
	"then"	{ System.out.printf("then "); return symbol(sym.THEN); }
	"top"	{ System.out.printf("top "); return symbol(sym.TOP); }
	"char"	{ System.out.printf("char "); return symbol(sym.CHAR); }
	"rat"	{ System.out.printf("rat "); return symbol(sym.RAT); }
	"float"	{ System.out.printf("float "); return symbol(sym.FLOAT); }
	"int"	{ System.out.printf("int "); return symbol(sym.INT); }

	{Char}	{ System.out.printf(yytext() + " "); return symbol(sym.CHAR_CONSTANT, yytext().substring(1,2)); }
	{String} { System.out.printf(yytext() + " "); return symbol(sym.STRING_CONSTANT, yytext().substring(1, yytext().length()-1)); }
	{Comment} {}
	{WhiteSpace} {}
	{Rat}	{ System.out.printf(yytext() + " "); return symbol(sym.RAT_CONSTANT, new String(yytext())); }
	{Float}	{ System.out.printf(yytext() + " "); return symbol(sym.FLOAT_CONSTANT, new Float(yytext())); }
	{Int}	{ System.out.printf(yytext() + " "); return symbol(sym.INT_CONSTANT, new Integer(yytext())); }
	{Bool}	{ System.out.printf(yytext() + " "); return symbol(sym.BOOL_CONSTANT, new Boolean("T".equals(yytext()))); }

	

  /* identifiers */ 
  {Identifier}                   { System.out.printf(yytext() + " "); return symbol(sym.IDENTIFIER, yytext()); }
}


 /* error fallback */
[^]                              { /*throw new Error("Illegal character<" +yytext()+ ">");*/ error("character " + yytext() + " not expected. "); }

