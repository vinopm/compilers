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
 LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} 

TraditionalComment   = "/#" [^#] ~"#/" | "/#" "#"+ "/"
EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [A-Za-z0-9_]*

int = 0 | ["-"|""] [1-9][0-9]*
rat = {int}+ "/" {int}+
float = {int} "." [0-9]+ 

%state STRING IN_SINGLE_QUOTE EXPECT_SINGLE_QUOTE

%%
<YYINITIAL> {
  /* literals */
  \"                             { string.setLength(0); yybegin(STRING); }
  {int}            { return symbol(sym.INTEGER_LITERAL, yytext()); }
  {float}		 { return symbol(sym.FLOAT_LITERAL, yytext()); }
  {rat}			{ return symbol(sym.RAT_LITERAL, yytext()); }

  /* comments */
  {Comment}                      { /* ignore */ }

  /* operators */
	/*Part of this was automatically generated by tokenizer_auxiliary.py*/
	"!" 	 { return symbol(sym.EXCLAMATION); }
	"&&" 	 { return symbol(sym.AMPERSANDAMPERSAND); }
	"-" 	 { return symbol(sym.MINUS); }
	"+" 	 { return symbol(sym.PLUS); }
	"*" 	 { return symbol(sym.ASTERISK); }
	"/" 	 { return symbol(sym.FSLASH); }
	"^" 	 { return symbol(sym.CARAT); }
	"[" 	 { return symbol(sym.LSQUAREBRACKET); }
	"]" 	 { return symbol(sym.RSQUAREBRACKET); }
	"(" 	 { return symbol(sym.LBRACKET); }
	")" 	 { return symbol(sym.RBRACKET); }
	"::" 	 { return symbol(sym.COLONCOLON); }
	":" 	 { return symbol(sym.COLON); }
	"<" 	 { return symbol(sym.LTHAN); }
	">" 	 { return symbol(sym.MTHAN); }
	"||" 	 { return symbol(sym.PIPEPIPE); }
	"<=" 	 { return symbol(sym.LTHANEQUALITY); }
	"=>" 	 { return symbol(sym.IMPLICATION); }
	"!=" 	 { return symbol(sym.EXCLAMATIONEQUALITY); }
	";" 	 { return symbol(sym.SEMICOLON); }
	"{" 	 { return symbol(sym.LBRACE); }
	"}" 	 { return symbol(sym.RBRACE); }
	"." 	 { return symbol(sym.DOT); }
	"," 	 { return symbol(sym.COMMA); }
	":=" 	 { return symbol(sym.EQUALITY); }
	"=" 	 { return symbol(sym.EQUALITYEQUALITY); }
	"tdef" 	 { return symbol(sym.TDEF); }
	"fdef" 	 { return symbol(sym.FDEF); }
	"while"  { return symbol(sym.WHILE); }
	"do" 	 { return symbol(sym.DO); }
	"od"	 { return symbol(sym.OD); }
	"return" { return symbol(sym.RETURN); }
	"read" 	 { return symbol(sym.READ); }
	"print"  { return symbol(sym.PRINT); }
	"if" 	 { return symbol(sym.IF); }
	"else" 	 { return symbol(sym.ELSE); }
	"foreach" { return symbol(sym.FOREACH); }
	"fi" 	 { return symbol(sym.FI); }
	"in" 	 { return symbol(sym.IN); }
	"true"	 {return symbol(BOOL_LITERAL, Boolean.TRUE);}
	"false"	 {return symbol(BOOL_LITERAL, Boolean.FALSE);}
	"'"	 { yybegin(IN_SINGLE_QUOTE); }

	[ \t\r\n\f]+ 	 {}

  /* identifiers */ 
  {Identifier}                   { return symbol(sym.IDENTIFIER, yytext()); }
}

<STRING> {
  \"                             { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); 
}
  [^]			 { error("Line break inside string literal.");}
}

<IN_SINGLE_QUOTE> {
  "'"				 { error("No character between single quotes.");}
  [^'\r\n\f]			 { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, yytext()); }
  \\t                            { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\t"); }
  \\n                            { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\n"); }

  \\r                            { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\r"); }
  \\\'                           { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "'"); }
  \\\\                           { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\\"); }

  [\r\n\f]			 { error("Line break inside character literal.");}
}

<EXPECT_SINGLE_QUOTE> {
 "'" { yybegin(YYINITIAL); }
 [^] { error("character " + yytext() + " not expected. " + "The character that's in front of the single quote is not directly followed by an end quote.");}
}

 /* error fallback */
[^]                              { /*throw new Error("Illegal character<" +yytext()+ ">");*/ error("character " + yytext() + " not expected. "); }

