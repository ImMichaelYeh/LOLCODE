package tokenizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenizer {
    private String fileContent;
    private Scanner scanner;
    private ArrayList<Token> tokensList;
    
    public Tokenizer (String fileName) {
	try {
	    this.scanner = new Scanner(new File(fileName));
	    
	    this.fileContent = "";
	    while (scanner.hasNextLine()) {
		fileContent = scanner.nextLine() + "\n";
	    }
	} catch (FileNotFoundException e) {
	    // TODO Error Handler
	    e.printStackTrace();
	}
    }
    
    public Token getNextToken() {
	return null;
    }
    
    public void printFileContent() {
	System.out.print(this.fileContent);
    }
}
