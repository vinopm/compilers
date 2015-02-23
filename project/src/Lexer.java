/* The following code was generated by JFlex 1.6.0 */

/* JFlex example: part of Java language lexer 
specification */
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */

class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int IN_SINGLE_QUOTE = 4;
  public static final int EXPECT_SINGLE_QUOTE = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\57\1\2\1\0\1\61\1\1\22\0\1\57\1\14\1\13"+
    "\1\4\1\5\1\0\1\15\1\56\1\24\1\25\1\20\1\17\1\35"+
    "\1\16\1\12\1\3\1\10\11\6\1\26\1\32\1\27\1\31\1\30"+
    "\2\0\32\7\1\22\1\60\1\23\1\21\1\7\1\0\1\52\1\7"+
    "\1\55\1\37\1\40\1\41\1\7\1\43\1\44\2\7\1\45\1\7"+
    "\1\51\1\46\1\53\1\7\1\47\1\54\1\36\1\50\1\7\1\42"+
    "\3\7\1\33\1\11\1\34\44\0\4\5\4\0\1\5\12\0\1\5"+
    "\4\0\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5"+
    "\16\0\5\5\7\0\1\5\1\0\1\5\201\0\5\5\1\0\2\5"+
    "\2\0\4\5\10\0\1\5\1\0\3\5\1\0\1\5\1\0\24\5"+
    "\1\0\123\5\1\0\213\5\10\0\236\5\11\0\46\5\2\0\1\5"+
    "\7\0\47\5\110\0\33\5\5\0\3\5\30\0\1\5\24\0\53\5"+
    "\43\0\2\5\1\0\143\5\1\0\1\5\17\0\2\5\7\0\2\5"+
    "\12\0\3\5\2\0\1\5\20\0\1\5\1\0\36\5\35\0\131\5"+
    "\13\0\1\5\30\0\41\5\11\0\2\5\4\0\1\5\5\0\26\5"+
    "\4\0\1\5\11\0\1\5\3\0\1\5\27\0\31\5\253\0\66\5"+
    "\3\0\1\5\22\0\1\5\7\0\12\5\17\0\7\5\1\0\7\5"+
    "\5\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0\1\5"+
    "\3\0\4\5\3\0\1\5\20\0\1\5\15\0\2\5\1\0\3\5"+
    "\16\0\4\5\7\0\1\5\11\0\6\5\4\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\2\5\1\0\2\5\37\0\4\5"+
    "\1\0\1\5\23\0\3\5\20\0\11\5\1\0\3\5\1\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\22\0\1\5"+
    "\17\0\2\5\17\0\1\5\23\0\10\5\2\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\36\0\2\5"+
    "\1\0\3\5\17\0\1\5\21\0\1\5\1\0\6\5\3\0\3\5"+
    "\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5\3\0\2\5"+
    "\3\0\3\5\3\0\14\5\26\0\1\5\50\0\1\5\13\0\10\5"+
    "\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5\3\0\1\5"+
    "\32\0\2\5\6\0\2\5\43\0\10\5\1\0\3\5\1\0\27\5"+
    "\1\0\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5"+
    "\17\0\2\5\22\0\10\5\1\0\3\5\1\0\51\5\2\0\1\5"+
    "\20\0\1\5\21\0\2\5\30\0\6\5\5\0\22\5\3\0\30\5"+
    "\1\0\11\5\1\0\1\5\2\0\7\5\72\0\60\5\1\0\2\5"+
    "\13\0\10\5\72\0\2\5\1\0\1\5\2\0\2\5\1\0\1\5"+
    "\2\0\1\5\6\0\4\5\1\0\7\5\1\0\3\5\1\0\1\5"+
    "\1\0\1\5\2\0\2\5\1\0\4\5\1\0\2\5\11\0\1\5"+
    "\2\0\5\5\1\0\1\5\25\0\2\5\42\0\1\5\77\0\10\5"+
    "\1\0\44\5\33\0\5\5\163\0\53\5\24\0\1\5\20\0\6\5"+
    "\4\0\4\5\3\0\1\5\3\0\2\5\7\0\3\5\4\0\15\5"+
    "\14\0\1\5\21\0\46\5\12\0\53\5\1\0\1\5\3\0\u0149\5"+
    "\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5\2\0\51\5"+
    "\1\0\4\5\2\0\41\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\17\5\1\0\71\5\1\0\4\5\2\0\103\5"+
    "\45\0\20\5\20\0\125\5\14\0\u026c\5\2\0\21\5\1\0\32\5"+
    "\5\0\113\5\3\0\3\5\17\0\15\5\1\0\4\5\16\0\22\5"+
    "\16\0\22\5\16\0\15\5\1\0\3\5\17\0\64\5\43\0\1\5"+
    "\3\0\2\5\103\0\130\5\10\0\51\5\1\0\1\5\5\0\106\5"+
    "\12\0\35\5\63\0\36\5\2\0\5\5\13\0\54\5\25\0\7\5"+
    "\70\0\27\5\11\0\65\5\122\0\1\5\135\0\57\5\21\0\7\5"+
    "\67\0\36\5\15\0\2\5\20\0\46\5\32\0\44\5\51\0\3\5"+
    "\12\0\44\5\153\0\4\5\1\0\4\5\16\0\300\5\100\0\u0116\5"+
    "\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0\7\5"+
    "\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0\6\5"+
    "\4\0\15\5\5\0\3\5\1\0\7\5\102\0\2\5\23\0\1\5"+
    "\34\0\1\5\15\0\1\5\20\0\15\5\3\0\32\5\110\0\1\5"+
    "\4\0\1\5\2\0\12\5\1\0\1\5\3\0\5\5\6\0\1\5"+
    "\1\0\1\5\1\0\1\5\1\0\4\5\1\0\13\5\2\0\4\5"+
    "\5\0\5\5\4\0\1\5\21\0\51\5\u0a77\0\57\5\1\0\57\5"+
    "\1\0\205\5\6\0\4\5\21\0\46\5\12\0\66\5\11\0\1\5"+
    "\20\0\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\120\0\1\5"+
    "\u01d5\0\3\5\31\0\11\5\7\0\5\5\2\0\5\5\4\0\126\5"+
    "\6\0\3\5\1\0\132\5\1\0\4\5\5\0\51\5\3\0\136\5"+
    "\21\0\33\5\65\0\20\5\u0200\0\u19b6\5\112\0\u51cc\5\64\0\u048d\5"+
    "\103\0\56\5\2\0\u010d\5\3\0\20\5\12\0\2\5\24\0\57\5"+
    "\20\0\31\5\10\0\120\5\47\0\11\5\2\0\147\5\2\0\4\5"+
    "\1\0\2\5\16\0\12\5\120\0\10\5\1\0\3\5\1\0\4\5"+
    "\1\0\27\5\25\0\1\5\7\0\64\5\16\0\62\5\76\0\6\5"+
    "\3\0\1\5\16\0\34\5\12\0\27\5\31\0\35\5\7\0\57\5"+
    "\34\0\1\5\60\0\51\5\27\0\3\5\1\0\10\5\24\0\27\5"+
    "\3\0\1\5\5\0\60\5\1\0\1\5\3\0\2\5\2\0\5\5"+
    "\2\0\1\5\1\0\1\5\30\0\3\5\43\0\6\5\2\0\6\5"+
    "\2\0\6\5\11\0\7\5\1\0\7\5\221\0\43\5\35\0\u2ba4\5"+
    "\14\0\27\5\4\0\61\5\u2104\0\u012e\5\2\0\76\5\2\0\152\5"+
    "\46\0\7\5\14\0\5\5\5\0\1\5\1\0\12\5\1\0\15\5"+
    "\1\0\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0\154\5"+
    "\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0\15\5\66\0\2\5"+
    "\30\0\3\5\31\0\1\5\6\0\5\5\1\0\207\5\7\0\1\5"+
    "\34\0\32\5\4\0\1\5\1\0\32\5\13\0\131\5\3\0\6\5"+
    "\2\0\6\5\2\0\6\5\2\0\3\5\3\0\2\5\3\0\2\5"+
    "\31\0\14\5\1\0\32\5\1\0\23\5\1\0\2\5\1\0\17\5"+
    "\2\0\16\5\42\0\173\5\105\0\65\5\u010b\0\35\5\3\0\61\5"+
    "\57\0\37\5\21\0\33\5\65\0\36\5\2\0\44\5\4\0\10\5"+
    "\1\0\5\5\52\0\236\5\u0362\0\6\5\2\0\1\5\1\0\54\5"+
    "\1\0\2\5\3\0\1\5\2\0\27\5\252\0\26\5\12\0\32\5"+
    "\306\0\1\5\17\0\4\5\1\0\3\5\1\0\33\5\54\0\35\5"+
    "\203\0\66\5\12\0\26\5\12\0\23\5\215\0\111\5\u03ba\0\65\5"+
    "\113\0\55\5\u0f50\0\u036f\5\221\0\143\5\u0b9d\0\u042f\5\u33d1\0\u0239\5"+
    "\u45c7\0\2\5\u23fe\0\125\5\1\0\107\5\1\0\2\5\2\0\1\5"+
    "\2\0\2\5\2\0\4\5\1\0\14\5\1\0\1\5\1\0\7\5"+
    "\1\0\101\5\1\0\4\5\2\0\10\5\1\0\7\5\1\0\34\5"+
    "\1\0\4\5\1\0\5\5\1\0\1\5\3\0\7\5\1\0\u0154\5"+
    "\2\0\31\5\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5"+
    "\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0\31\5"+
    "\1\0\10\5\u2834\0\ua6d7\5\51\0\u1035\5\13\0\336\5\u3fe2\0\u021e\5"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05f0\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\1\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\1\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\11\4\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\36\1\41\1\42"+
    "\2\0\2\43\4\0\1\5\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\2\4\1\53\2\4\1\54\3\4"+
    "\1\55\1\56\1\57\2\4\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\66\1\67\1\70\2\0\1\71\2\0"+
    "\1\72\12\4\1\0\1\71\1\73\1\74\1\75\1\76"+
    "\4\4\1\77\2\4\1\100\1\101\1\4\1\102\1\4"+
    "\1\103\1\104";

  private static int [] zzUnpackAction() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\310\0\310\0\u0226\0\u0258\0\u028a"+
    "\0\310\0\310\0\310\0\310\0\310\0\310\0\310\0\u02bc"+
    "\0\u02ee\0\310\0\u0320\0\310\0\310\0\310\0\310\0\u0352"+
    "\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2"+
    "\0\310\0\u0514\0\310\0\310\0\u0546\0\310\0\310\0\310"+
    "\0\u0578\0\310\0\310\0\u05aa\0\u015e\0\u05dc\0\310\0\u060e"+
    "\0\u0640\0\u0672\0\u06a4\0\u06d6\0\310\0\310\0\310\0\310"+
    "\0\310\0\310\0\310\0\u0708\0\u073a\0\u0190\0\u076c\0\u079e"+
    "\0\u0190\0\u07d0\0\u0802\0\u0834\0\u0190\0\u0190\0\u0190\0\u0866"+
    "\0\u0898\0\310\0\310\0\310\0\310\0\310\0\310\0\310"+
    "\0\310\0\310\0\u08ca\0\u08fc\0\u060e\0\u092e\0\u0960\0\u06a4"+
    "\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0"+
    "\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0190\0\u0190\0\u0190\0\u0190"+
    "\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\u0190\0\u0cb2\0\u0ce4\0\u0190"+
    "\0\u0190\0\u0d16\0\u0190\0\u0d48\0\u0190\0\u0190";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\2\6\1\7\1\10\1\11\1\5\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\11\1\45\1\11\1\46\1\47\3\11"+
    "\1\50\2\11\1\51\1\6\1\5\1\6\1\52\2\53"+
    "\10\52\1\54\44\52\1\55\1\52\1\56\2\57\53\56"+
    "\1\60\1\56\1\61\1\57\56\62\1\63\3\62\63\0"+
    "\2\6\54\0\1\6\1\0\1\6\4\0\1\64\55\0"+
    "\1\65\1\66\1\67\57\65\6\0\3\11\25\0\20\11"+
    "\7\0\1\70\4\0\1\71\1\72\1\73\3\0\1\72"+
    "\51\0\1\74\2\0\1\75\101\0\1\76\45\0\1\77"+
    "\52\0\1\74\101\0\1\100\2\0\1\101\61\0\1\102"+
    "\60\0\1\103\37\0\3\11\25\0\1\11\1\104\7\11"+
    "\1\105\6\11\12\0\3\11\25\0\10\11\1\106\7\11"+
    "\12\0\3\11\25\0\7\11\1\107\10\11\12\0\3\11"+
    "\25\0\1\11\1\110\4\11\1\111\1\11\1\112\3\11"+
    "\1\113\3\11\12\0\3\11\25\0\5\11\1\114\12\11"+
    "\12\0\3\11\25\0\3\11\1\115\7\11\1\116\4\11"+
    "\12\0\3\11\25\0\1\11\1\117\16\11\12\0\3\11"+
    "\25\0\2\11\1\120\15\11\12\0\3\11\25\0\11\11"+
    "\1\121\6\11\4\0\1\52\2\0\10\52\1\0\44\52"+
    "\1\0\1\52\13\0\1\122\22\0\1\123\10\0\1\124"+
    "\1\0\1\125\46\0\1\126\10\0\1\127\1\0\1\130"+
    "\4\0\1\131\1\0\1\132\1\0\4\133\1\134\55\133"+
    "\2\0\1\67\67\0\1\135\1\136\4\0\1\136\46\0"+
    "\1\70\4\0\1\71\1\72\4\0\1\72\51\0\1\137"+
    "\61\0\1\140\1\0\1\140\54\0\1\70\2\0\1\74"+
    "\1\0\1\74\1\72\1\73\3\0\1\72\51\0\3\11"+
    "\25\0\2\11\1\141\15\11\12\0\3\11\25\0\12\11"+
    "\1\142\5\11\12\0\3\11\25\0\16\11\1\143\1\11"+
    "\12\0\3\11\25\0\2\11\1\144\15\11\12\0\3\11"+
    "\25\0\11\11\1\145\6\11\12\0\3\11\25\0\7\11"+
    "\1\146\10\11\12\0\3\11\25\0\6\11\1\147\11\11"+
    "\12\0\3\11\25\0\1\150\13\11\1\151\3\11\12\0"+
    "\3\11\25\0\6\11\1\152\11\11\4\0\4\133\1\153"+
    "\55\133\3\0\1\67\1\134\63\0\1\154\56\0\1\70"+
    "\2\0\1\137\1\0\1\137\1\72\4\0\1\72\51\0"+
    "\3\11\25\0\3\11\1\155\14\11\12\0\3\11\25\0"+
    "\2\11\1\156\15\11\12\0\3\11\25\0\2\11\1\157"+
    "\15\11\12\0\3\11\25\0\3\11\1\160\14\11\12\0"+
    "\3\11\25\0\2\11\1\161\15\11\12\0\3\11\25\0"+
    "\16\11\1\162\1\11\12\0\3\11\25\0\7\11\1\163"+
    "\10\11\12\0\3\11\25\0\12\11\1\164\5\11\12\0"+
    "\3\11\25\0\1\11\1\165\16\11\12\0\3\11\25\0"+
    "\13\11\1\166\4\11\4\0\3\133\1\67\1\153\55\133"+
    "\6\0\1\154\1\0\1\154\1\136\4\0\1\136\51\0"+
    "\3\11\25\0\14\11\1\167\3\11\12\0\3\11\25\0"+
    "\2\11\1\170\15\11\12\0\3\11\25\0\2\11\1\171"+
    "\15\11\12\0\3\11\25\0\11\11\1\172\6\11\12\0"+
    "\3\11\25\0\1\173\17\11\12\0\3\11\25\0\17\11"+
    "\1\174\12\0\3\11\25\0\13\11\1\175\4\11\12\0"+
    "\3\11\25\0\5\11\1\176\12\11\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3450];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\6\1\2\11\3\1\7\11\2\1\1\11"+
    "\1\1\4\11\11\1\1\11\1\1\2\11\1\1\3\11"+
    "\1\1\2\11\2\0\1\1\1\11\4\0\1\1\7\11"+
    "\16\1\11\11\2\0\1\1\2\0\13\1\1\0\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[126];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1970) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { /*throw new Error("Illegal character<" +yytext()+ ">");*/ error("character " + yytext() + " not expected. ");
          }
        case 69: break;
        case 2: 
          { 
          }
        case 70: break;
        case 3: 
          { return symbol(sym.FSLASH);
          }
        case 71: break;
        case 4: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 72: break;
        case 5: 
          { return symbol(sym.INTEGER_LITERAL, yytext());
          }
        case 73: break;
        case 6: 
          { return symbol(sym.DOT);
          }
        case 74: break;
        case 7: 
          { string.setLength(0); yybegin(STRING);
          }
        case 75: break;
        case 8: 
          { return symbol(sym.EXCLAMATION);
          }
        case 76: break;
        case 9: 
          { return symbol(sym.MINUS);
          }
        case 77: break;
        case 10: 
          { return symbol(sym.PLUS);
          }
        case 78: break;
        case 11: 
          { return symbol(sym.ASTERISK);
          }
        case 79: break;
        case 12: 
          { return symbol(sym.CARAT);
          }
        case 80: break;
        case 13: 
          { return symbol(sym.LSQUAREBRACKET);
          }
        case 81: break;
        case 14: 
          { return symbol(sym.RSQUAREBRACKET);
          }
        case 82: break;
        case 15: 
          { return symbol(sym.LBRACKET);
          }
        case 83: break;
        case 16: 
          { return symbol(sym.RBRACKET);
          }
        case 84: break;
        case 17: 
          { return symbol(sym.COLON);
          }
        case 85: break;
        case 18: 
          { return symbol(sym.LTHAN);
          }
        case 86: break;
        case 19: 
          { return symbol(sym.MTHAN);
          }
        case 87: break;
        case 20: 
          { return symbol(sym.EQUALITYEQUALITY);
          }
        case 88: break;
        case 21: 
          { return symbol(sym.SEMICOLON);
          }
        case 89: break;
        case 22: 
          { return symbol(sym.LBRACE);
          }
        case 90: break;
        case 23: 
          { return symbol(sym.RBRACE);
          }
        case 91: break;
        case 24: 
          { return symbol(sym.COMMA);
          }
        case 92: break;
        case 25: 
          { yybegin(IN_SINGLE_QUOTE);
          }
        case 93: break;
        case 26: 
          { string.append( yytext() );
          }
        case 94: break;
        case 27: 
          { error("Line break inside string literal.");
          }
        case 95: break;
        case 28: 
          { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString());
          }
        case 96: break;
        case 29: 
          { string.append('\\');
          }
        case 97: break;
        case 30: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, yytext());
          }
        case 98: break;
        case 31: 
          { error("Line break inside character literal.");
          }
        case 99: break;
        case 32: 
          { error("No character between single quotes.");
          }
        case 100: break;
        case 33: 
          { error("character " + yytext() + " not expected. " + "The character that's in front of the single quote is not directly followed by an end quote.");
          }
        case 101: break;
        case 34: 
          { yybegin(YYINITIAL);
          }
        case 102: break;
        case 35: 
          { /* ignore */
          }
        case 103: break;
        case 36: 
          { return symbol(sym.PIPEPIPE);
          }
        case 104: break;
        case 37: 
          { return symbol(sym.EXCLAMATIONEQUALITY);
          }
        case 105: break;
        case 38: 
          { return symbol(sym.AMPERSANDAMPERSAND);
          }
        case 106: break;
        case 39: 
          { return symbol(sym.COLONCOLON);
          }
        case 107: break;
        case 40: 
          { return symbol(sym.EQUALITY);
          }
        case 108: break;
        case 41: 
          { return symbol(sym.LTHANEQUALITY);
          }
        case 109: break;
        case 42: 
          { return symbol(sym.IMPLICATION);
          }
        case 110: break;
        case 43: 
          { return symbol(sym.DO);
          }
        case 111: break;
        case 44: 
          { return symbol(sym.FI);
          }
        case 112: break;
        case 45: 
          { return symbol(sym.IF);
          }
        case 113: break;
        case 46: 
          { return symbol(sym.IN);
          }
        case 114: break;
        case 47: 
          { return symbol(sym.OD);
          }
        case 115: break;
        case 48: 
          { string.append('\"');
          }
        case 116: break;
        case 49: 
          { string.append('\t');
          }
        case 117: break;
        case 50: 
          { string.append('\r');
          }
        case 118: break;
        case 51: 
          { string.append('\n');
          }
        case 119: break;
        case 52: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\t");
          }
        case 120: break;
        case 53: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\r");
          }
        case 121: break;
        case 54: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\n");
          }
        case 122: break;
        case 55: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "'");
          }
        case 123: break;
        case 56: 
          { yybegin(EXPECT_SINGLE_QUOTE); return symbol(sym.CHAR_LITERAL, "\\");
          }
        case 124: break;
        case 57: 
          { return symbol(sym.RAT_LITERAL, yytext());
          }
        case 125: break;
        case 58: 
          { return symbol(sym.FLOAT_LITERAL, yytext());
          }
        case 126: break;
        case 59: 
          { return symbol(sym.TDEF);
          }
        case 127: break;
        case 60: 
          { return symbol(BOOL_LITERAL, Boolean.TRUE);
          }
        case 128: break;
        case 61: 
          { return symbol(sym.ELSE);
          }
        case 129: break;
        case 62: 
          { return symbol(sym.FDEF);
          }
        case 130: break;
        case 63: 
          { return symbol(sym.READ);
          }
        case 131: break;
        case 64: 
          { return symbol(BOOL_LITERAL, Boolean.FALSE);
          }
        case 132: break;
        case 65: 
          { return symbol(sym.WHILE);
          }
        case 133: break;
        case 66: 
          { return symbol(sym.PRINT);
          }
        case 134: break;
        case 67: 
          { return symbol(sym.RETURN);
          }
        case 135: break;
        case 68: 
          { return symbol(sym.FOREACH);
          }
        case 136: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
