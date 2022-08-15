package errorHandlers;

public class MissingArgsException {
    
   public static class MissingRunnerFileException extends Exception {
       public MissingRunnerFileException() {
	   super("Missing runner file. Please include a *.lol file.");
       }
   }
}
