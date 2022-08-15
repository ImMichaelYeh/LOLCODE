import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *	
 * The purpose of this class is to store the code in memory. 
 * 
 * This includes functions and variables
 * 
 */
public class CodeManager {
    private String runnerCode;
    boolean preprocessed;
    
    public CodeManager(String fileName) {
	setRunnerCode(getFileContentFrom(fileName));
	preprocessed = false;
    }
    
    public void preprocess() {
	if (!preprocessed) {
	    // Remove comments
	    // Combine lines that end in ...
	    // Store Strings, replace with identifier
	    // Store functions
	    // Execute code
	}
    }
    
    public void setRunnerCode (String runnerCode) {
	this.runnerCode = runnerCode;
    }
    
    public String getRunnerCode() {
	return this.runnerCode;
    }
    
    public static String getFileContentFrom(String fileName) {
	String fileContent = "";
	try {
	    Scanner scanner = new Scanner(new File(fileName));
	    
	    while (scanner.hasNextLine()) {
		fileContent += scanner.nextLine() + "\n";
	    }
	    
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return fileContent;
    }
}
