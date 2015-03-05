/* The following code was generated by JFlex 1.6.0 */

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>src/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\1\1\0\2\2\22\0\1\20\1\21\1\13\1\4"+
    "\2\17\1\22\1\16\1\30\1\31\1\24\1\23\1\42\1\14\1\15"+
    "\1\3\1\11\11\12\1\32\1\37\1\33\1\36\1\34\2\17\5\6"+
    "\1\5\15\6\1\5\6\6\1\26\1\17\1\27\1\25\1\10\1\17"+
    "\1\57\1\62\1\65\1\44\1\45\1\46\1\6\1\50\1\51\2\6"+
    "\1\52\1\63\1\56\1\53\1\60\1\64\1\54\1\61\1\43\1\55"+
    "\1\7\1\47\3\6\1\40\1\35\1\41\1\17\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\2"+
    "\2\6\1\1\1\7\1\10\1\1\1\11\1\1\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\1\1\24\1\25\1\26\1\27\1\30\17\5"+
    "\5\0\1\31\1\0\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\4\5\1\41\2\5\1\42\3\5\1\43"+
    "\1\44\1\5\1\45\10\5\3\0\1\46\1\47\2\5"+
    "\1\50\6\5\1\51\1\52\2\5\1\53\2\5\1\54"+
    "\3\5\1\0\1\55\1\56\1\57\1\60\1\61\4\5"+
    "\1\62\2\5\1\63\1\64\1\65\2\66\1\67\1\5"+
    "\1\70\1\5\1\71\1\72\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
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
    "\0\0\0\66\0\66\0\154\0\242\0\330\0\330\0\330"+
    "\0\u010e\0\u0144\0\u017a\0\66\0\66\0\u01b0\0\u01e6\0\u021c"+
    "\0\66\0\66\0\66\0\66\0\66\0\66\0\66\0\u0252"+
    "\0\u0288\0\66\0\u02be\0\u02f4\0\66\0\66\0\66\0\66"+
    "\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4"+
    "\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654"+
    "\0\242\0\u068a\0\u06c0\0\u017a\0\66\0\u06f6\0\66\0\66"+
    "\0\66\0\66\0\66\0\66\0\66\0\u072c\0\u0762\0\u0798"+
    "\0\u07ce\0\330\0\u0804\0\u083a\0\330\0\u0870\0\u08a6\0\u08dc"+
    "\0\330\0\u0912\0\u0948\0\330\0\u097e\0\u09b4\0\u09ea\0\u0a20"+
    "\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u0b64\0\u0b9a\0\u06c0"+
    "\0\66\0\u0bd0\0\u0c06\0\330\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde"+
    "\0\u0d14\0\u0d4a\0\330\0\330\0\u0d80\0\u0db6\0\330\0\u0dec"+
    "\0\u0e22\0\330\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\330\0\330"+
    "\0\330\0\330\0\330\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\330"+
    "\0\u1008\0\u103e\0\330\0\330\0\330\0\66\0\u1074\0\330"+
    "\0\u10aa\0\330\0\u10e0\0\330\0\330\0\330\0\330";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\7"+
    "\1\46\1\47\1\50\1\51\2\7\1\52\1\53\1\54"+
    "\1\55\1\56\1\7\1\57\72\0\1\60\61\0\1\61"+
    "\1\3\64\61\5\0\6\7\30\0\23\7\10\0\1\62"+
    "\4\0\1\63\60\0\1\62\2\12\2\0\1\63\50\0"+
    "\13\64\1\65\52\64\3\0\63\66\36\0\1\67\51\0"+
    "\1\70\75\0\1\71\3\0\1\72\65\0\1\73\64\0"+
    "\1\74\64\0\1\75\36\0\6\7\30\0\1\7\1\76"+
    "\3\7\1\77\2\7\1\100\12\7\5\0\6\7\30\0"+
    "\6\7\1\101\1\7\1\102\12\7\5\0\6\7\30\0"+
    "\7\7\1\103\13\7\5\0\6\7\30\0\1\7\1\104"+
    "\4\7\1\105\1\106\1\107\12\7\5\0\6\7\30\0"+
    "\5\7\1\110\15\7\5\0\6\7\30\0\3\7\1\111"+
    "\7\7\1\112\7\7\5\0\6\7\30\0\2\7\1\113"+
    "\20\7\5\0\6\7\30\0\1\7\1\114\21\7\5\0"+
    "\6\7\30\0\2\7\1\115\11\7\1\116\6\7\5\0"+
    "\6\7\30\0\7\7\1\117\13\7\5\0\6\7\30\0"+
    "\11\7\1\120\11\7\5\0\6\7\30\0\2\7\1\121"+
    "\20\7\5\0\6\7\30\0\10\7\1\122\12\7\5\0"+
    "\6\7\30\0\14\7\1\123\6\7\5\0\6\7\30\0"+
    "\5\7\1\124\15\7\4\60\1\125\61\60\11\0\1\126"+
    "\1\127\1\0\1\62\62\0\2\130\71\0\1\131\54\0"+
    "\6\7\30\0\2\7\1\132\20\7\5\0\6\7\30\0"+
    "\2\7\1\133\20\7\5\0\6\7\30\0\15\7\1\134"+
    "\5\7\5\0\6\7\30\0\22\7\1\135\5\0\6\7"+
    "\30\0\16\7\1\136\4\7\5\0\6\7\30\0\2\7"+
    "\1\137\20\7\5\0\6\7\30\0\10\7\1\140\12\7"+
    "\5\0\6\7\30\0\11\7\1\141\11\7\5\0\6\7"+
    "\30\0\6\7\1\142\14\7\5\0\6\7\30\0\1\143"+
    "\22\7\5\0\6\7\30\0\13\7\1\144\7\7\5\0"+
    "\6\7\30\0\1\145\13\7\1\146\6\7\5\0\6\7"+
    "\30\0\1\147\22\7\5\0\6\7\30\0\6\7\1\150"+
    "\14\7\5\0\6\7\30\0\6\7\1\151\14\7\5\0"+
    "\6\7\30\0\21\7\1\152\1\7\5\0\6\7\30\0"+
    "\10\7\1\153\12\7\5\0\6\7\30\0\6\7\1\154"+
    "\14\7\5\0\6\7\30\0\14\7\1\155\6\7\3\60"+
    "\1\3\1\125\61\60\3\0\1\156\65\0\1\156\5\0"+
    "\2\127\60\0\6\7\30\0\3\7\1\157\17\7\5\0"+
    "\6\7\30\0\13\7\1\160\7\7\5\0\6\7\30\0"+
    "\1\161\22\7\5\0\6\7\30\0\2\7\1\162\20\7"+
    "\5\0\6\7\30\0\3\7\1\163\17\7\5\0\6\7"+
    "\30\0\14\7\1\164\6\7\5\0\6\7\30\0\14\7"+
    "\1\165\6\7\5\0\6\7\30\0\7\7\1\166\13\7"+
    "\5\0\6\7\30\0\12\7\1\167\10\7\5\0\6\7"+
    "\30\0\1\7\1\170\21\7\5\0\6\7\30\0\14\7"+
    "\1\171\6\7\5\0\6\7\30\0\13\7\1\172\7\7"+
    "\5\0\6\7\30\0\7\7\1\173\13\7\5\0\6\7"+
    "\30\0\13\7\1\174\7\7\5\0\6\7\30\0\11\7"+
    "\1\175\11\7\11\0\1\176\1\177\1\0\1\156\56\0"+
    "\6\7\30\0\1\200\22\7\5\0\6\7\30\0\7\7"+
    "\1\201\13\7\5\0\6\7\30\0\2\7\1\202\20\7"+
    "\5\0\6\7\30\0\11\7\1\203\11\7\5\0\6\7"+
    "\30\0\16\7\1\204\4\7\5\0\6\7\30\0\1\205"+
    "\22\7\11\0\2\177\60\0\6\7\30\0\7\7\1\206"+
    "\13\7\5\0\6\7\30\0\13\7\1\207\7\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4374];
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
    "\1\0\2\11\10\1\2\11\3\1\7\11\2\1\1\11"+
    "\2\1\4\11\17\1\5\0\1\11\1\0\7\11\27\1"+
    "\3\0\1\1\1\11\24\1\1\0\17\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
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
    while (i < 168) {
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
          { error("character " + yytext() + " not expected. ");
          }
        case 61: break;
        case 2: 
          { 
          }
        case 62: break;
        case 3: 
          { return symbol(sym.FSLASH);
          }
        case 63: break;
        case 4: 
          { return symbol(sym.BOOL_CONSTANT, new Boolean("T".equals(yytext())));
          }
        case 64: break;
        case 5: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 65: break;
        case 6: 
          { return symbol(sym.INT_CONSTANT, new Integer(yytext()));
          }
        case 66: break;
        case 7: 
          { return symbol(sym.MINUS);
          }
        case 67: break;
        case 8: 
          { return symbol(sym.DOT);
          }
        case 68: break;
        case 9: 
          { return symbol(sym.EXCLAMATION);
          }
        case 69: break;
        case 10: 
          { return symbol(sym.PLUS);
          }
        case 70: break;
        case 11: 
          { return symbol(sym.ASTERISK);
          }
        case 71: break;
        case 12: 
          { return symbol(sym.CARAT);
          }
        case 72: break;
        case 13: 
          { return symbol(sym.LSQUAREBRACKET);
          }
        case 73: break;
        case 14: 
          { return symbol(sym.RSQUAREBRACKET);
          }
        case 74: break;
        case 15: 
          { return symbol(sym.LBRACKET);
          }
        case 75: break;
        case 16: 
          { return symbol(sym.RBRACKET);
          }
        case 76: break;
        case 17: 
          { return symbol(sym.COLON);
          }
        case 77: break;
        case 18: 
          { return symbol(sym.LTHAN);
          }
        case 78: break;
        case 19: 
          { return symbol(sym.MTHAN);
          }
        case 79: break;
        case 20: 
          { return symbol(sym.EQUALITYEQUALITY);
          }
        case 80: break;
        case 21: 
          { return symbol(sym.SEMICOLON);
          }
        case 81: break;
        case 22: 
          { return symbol(sym.LBRACE);
          }
        case 82: break;
        case 23: 
          { return symbol(sym.RBRACE);
          }
        case 83: break;
        case 24: 
          { return symbol(sym.COMMA);
          }
        case 84: break;
        case 25: 
          { return symbol(sym.STRING_CONSTANT, yytext().substring(1, yytext().length()-1));
          }
        case 85: break;
        case 26: 
          { return symbol(sym.EXCLAMATIONEQUALITY);
          }
        case 86: break;
        case 27: 
          { return symbol(sym.AMPERSANDAMPERSAND);
          }
        case 87: break;
        case 28: 
          { return symbol(sym.COLONCOLON);
          }
        case 88: break;
        case 29: 
          { return symbol(sym.EQUALITY);
          }
        case 89: break;
        case 30: 
          { return symbol(sym.LTHANEQUALITY);
          }
        case 90: break;
        case 31: 
          { return symbol(sym.PIPEPIPE);
          }
        case 91: break;
        case 32: 
          { return symbol(sym.IMPLICATION);
          }
        case 92: break;
        case 33: 
          { return symbol(sym.DO);
          }
        case 93: break;
        case 34: 
          { return symbol(sym.FI);
          }
        case 94: break;
        case 35: 
          { return symbol(sym.IF);
          }
        case 95: break;
        case 36: 
          { return symbol(sym.IN);
          }
        case 96: break;
        case 37: 
          { return symbol(sym.OD);
          }
        case 97: break;
        case 38: 
          { return symbol(sym.FLOAT_CONSTANT, new Float(yytext()));
          }
        case 98: break;
        case 39: 
          { return symbol(sym.CHAR_CONSTANT, yytext().substring(1,2));
          }
        case 99: break;
        case 40: 
          { return symbol(sym.TOP);
          }
        case 100: break;
        case 41: 
          { return symbol(sym.INT);
          }
        case 101: break;
        case 42: 
          { return symbol(sym.LEN);
          }
        case 102: break;
        case 43: 
          { return symbol(sym.RAT);
          }
        case 103: break;
        case 44: 
          { return symbol(sym.SEQ);
          }
        case 104: break;
        case 45: 
          { return symbol(sym.TDEF);
          }
        case 105: break;
        case 46: 
          { return symbol(sym.THEN);
          }
        case 106: break;
        case 47: 
          { return symbol(sym.DICT);
          }
        case 107: break;
        case 48: 
          { return symbol(sym.ELSE);
          }
        case 108: break;
        case 49: 
          { return symbol(sym.FDEF);
          }
        case 109: break;
        case 50: 
          { return symbol(sym.READ);
          }
        case 110: break;
        case 51: 
          { return symbol(sym.BOOL);
          }
        case 111: break;
        case 52: 
          { return symbol(sym.MAIN);
          }
        case 112: break;
        case 53: 
          { return symbol(sym.CHAR);
          }
        case 113: break;
        case 54: 
          { return symbol(sym.RAT_CONSTANT, new String(yytext()));
          }
        case 114: break;
        case 55: 
          { return symbol(sym.FLOAT);
          }
        case 115: break;
        case 56: 
          { return symbol(sym.WHILE);
          }
        case 116: break;
        case 57: 
          { return symbol(sym.ALIAS);
          }
        case 117: break;
        case 58: 
          { return symbol(sym.PRINT);
          }
        case 118: break;
        case 59: 
          { return symbol(sym.FORALL);
          }
        case 119: break;
        case 60: 
          { return symbol(sym.RETURN);
          }
        case 120: break;
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
