package tokenizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenizer {

    private ArrayList<Token> tokensList;
    private int currTokenIndex;
    private int currFileCharIndex;
    private Scanner scanner;
    private String fileContent;

    public Tokenizer(String fileName) {
	tokensList = new ArrayList<Token>();
	currTokenIndex = 0;
	currFileCharIndex = 0;

	try {
	    // Reading entire file
	    this.scanner = new Scanner(new File(fileName));
	    this.fileContent = "";

	    while (scanner.hasNextLine()) {
		String line = scanner.nextLine();

		if (line.endsWith("...")) {
		    // Remove the ellipse so that lines are combined.
		    fileContent += line.substring(0, line.length() - 3) + " ";
		} else {
		    fileContent += line + "\n";
		}
	    }

	    // remove last newline
	    this.fileContent = this.fileContent.substring(0, this.fileContent.length() - 1);

	    // Storing
	    // fileLines = fileContent.split("/\r?\n/"); // Split file by line
	    // tokensList = createTokensList(this.fileContent);
	} catch (FileNotFoundException e) {
	    // TODO Error Handler
	    e.printStackTrace();
	}
    }

    public Token getNextToken() {

	try {
	    moveCurrCharIndexToNextChar();

	    // Create token
	    Token token;
	    Token.Type tokenType = Token.Type.UNKNOWN;
	    String content = "";

	    char curr = fileContent.charAt(currFileCharIndex);

	    // If first letter is alphabetic, then token will be: KEYWORD, IDENTIFIER, BOOL
	    if (Character.isAlphabetic(curr)) {

	    }
	    // If first letter is a quote, then it is a string (aka YARN)
	    else if (curr == '"') {

	    } else {

	    }

	    token = new Token(tokenType, content);

	    // For future use
	    tokensList.add(token);
	    currTokenIndex++;
	    return token;
	} catch (Exception E) {
	    return null;
	}

    }

    private void moveCurrCharIndexToNextChar() {
	// Move currFileCharIndex to next non-whitespace character.
	for (int i = 0; currFileCharIndex < fileContent.length(); currFileCharIndex++) {
	    if (!Character.isWhitespace(fileContent.charAt(currFileCharIndex))) {
		break;
	    }
	}
    }

    public void printFileContent() {
	System.out.print(this.fileContent);
    }
}
