import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java_cup.runtime.Symbol;

public class SC {
	private static boolean lexicalOnly = false;
	private static InputStream input = System.in;
	
	private static Lexer lexer;
	private static Parser pccParser;	

	public static void main(String[] args) {
		
		
		try {
			processArgs(args);
			lexer = new Lexer(input);
			pccParser = new Parser(lexer);
			if (lexicalOnly) {
				lexicalAnalysisOnly();
			} else {
				pccParser.parse();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}
	
	/**
	 * Processes command line arguments of the main method.
	 * Checks for --lex flag. If flag found, sets lexicalOnly to true
	 * If file name is specified in args, lexer will read from that file, instead of the default System.in
	 * @param args args to process
	 * @throws FileNotFoundException if input file specified in args is not found
	 */
	private static void processArgs(String[] args)
			throws FileNotFoundException {
		for (String arg : args) {
			if (arg.equalsIgnoreCase("--lex")) {
				lexicalOnly = true;
			} else {
				input = new FileInputStream(arg);
			}
		}
	}
	
	/**
	 * Prints the int value of tokens created by the lexer object and values
	 * within the token object (if any)
	 * 
	 * @throws IOException
	 */
	private static void lexicalAnalysisOnly() throws IOException {
		Symbol token;
		while ((token = lexer.next_token()).sym != 0) {
			// first print the string representation of the token. This will display token id
			System.out.print(token.toString());
			
			// if token has value, display that value between parentheses
			if (token.value != null) {
				System.out.println(String.format("(%s)", token.value.toString()));
			}			
		}
	}
}
