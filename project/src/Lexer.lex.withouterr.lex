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
Int = 0 | [1-9] [0-9]*
String = "\"" ~"\""
Rat = {Int}_ "-"* {Int} "/" "-"* {Int}
Float = {Int} "." [0-9]+ 
Char = \'[ -~]\'

//%state STRING IN_SINGLE_QUOTE EXPECT_SINGLE_QUOTE

%%
<YYINITIAL> {

	"!" { return symbol(sym.EXCLAMATION); }
"&&" { return symbol(sym.AMPERSANDAMPERSAND); }
"-" { return symbol(sym.MINUS); }
"+" { return symbol(sym.PLUS); }
"*" { return symbol(sym.ASTERISK); }
"/" { return symbol(sym.FSLASH); }
"^" { return symbol(sym.CARAT); }
"[" { return symbol(sym.LSQUAREBRACKET); }
"]" { return symbol(sym.RSQUAREBRACKET); }
"(" { return symbol(sym.LBRACKET); }
")" { return symbol(sym.RBRACKET); }
"::" { return symbol(sym.COLONCOLON); }
":" { return symbol(sym.COLON); }
"<" { return symbol(sym.LTHAN); }
">" { return symbol(sym.MTHAN); }
"||" { return symbol(sym.PIPEPIPE); }
"<=" { return symbol(sym.LTHANEQUALITY); }
"=>" { return symbol(sym.IMPLICATION); }
"!=" { return symbol(sym.EXCLAMATIONEQUALITY); }
";" { return symbol(sym.SEMICOLON); }
"{" { return symbol(sym.LBRACE); }
"}" { return symbol(sym.RBRACE); }
"." { return symbol(sym.DOT); }
"," { return symbol(sym.COMMA); }
":=" { return symbol(sym.EQUALITY); }
"=" { return symbol(sym.EQUALITYEQUALITY); }
"tdef" { return symbol(sym.TDEF); }
"fdef" { return symbol(sym.FDEF); }
"while" { return symbol(sym.WHILE); }
"do" { return symbol(sym.DO); }
"od" { return symbol(sym.OD); }
"return" { return symbol(sym.RETURN); }
"read" { return symbol(sym.READ); }
"print" { return symbol(sym.PRINT); }
"if" { return symbol(sym.IF); }
"else" { return symbol(sym.ELSE); }
"forall" { return symbol(sym.FORALL); }
"fi" { return symbol(sym.FI); }
"in" { return symbol(sym.IN); }
"bool" { return symbol(sym.BOOL); }
"main" { return symbol(sym.MAIN); }
"seq" { return symbol(sym.SEQ); }
"dict" { return symbol(sym.DICT); }
"len" { return symbol(sym.LEN); }
"alias" { return symbol(sym.ALIAS); }
"then" { return symbol(sym.THEN); }
"top" { return symbol(sym.TOP); }
"char" { return symbol(sym.CHAR); }
"rat" { return symbol(sym.RAT); }
"float" { return symbol(sym.FLOAT); }
"int" { return symbol(sym.INT); }
{Char} { return symbol(sym.CHAR_CONSTANT, yytext().substring(1,2)); }
{String} { return symbol(sym.STRING_CONSTANT, yytext().substring(1, yytext().length()-1)); }
{Comment} {}
{WhiteSpace} {}
{Rat} {return symbol(sym.RAT_CONSTANT, new String(yytext())); }
{Float} {return symbol(sym.FLOAT_CONSTANT, new Float(yytext())); }
{Int} {return symbol(sym.INT_CONSTANT, new Integer(yytext())); }
{Bool} {return symbol(sym.BOOL_CONSTANT, new Boolean("T".equals(yytext()))); }

	

  /* identifiers */ 
  {Identifier}                   { return symbol(sym.IDENTIFIER, yytext()); }
}


 /* error fallback */
[^]                              { /*throw new Error("Illegal character<" +yytext()+ ">");*/ error("character " + yytext() + " not expected. "); }

