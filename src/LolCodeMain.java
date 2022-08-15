import errorHandlers.MissingArgsException;
import errorHandlers.MissingArgsException.MissingRunnerFileException;
import tokenizer.Tokenizer;

public class LolCodeMain {
    public static void main(String[] args) throws MissingRunnerFileException {
	String runnerFile;
	
	if (args.length > 0) {
	     runnerFile = args[0];
	}
	else {
	    throw new MissingArgsException.MissingRunnerFileException();
	}
	
	CodeManager codeManager = new CodeManager(CodeManager.getFileContentFrom(runnerFile));
	
	Tokenizer tokenizer = new Tokenizer(args[0]); // args[0] is currently file name
	
	tokenizer.printFileContent();
    }
}