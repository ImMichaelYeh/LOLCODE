import tokenizer.Tokenizer;

public class LolCodeMain {
    public static void main(String[] args) {
	Tokenizer tokenizer = new Tokenizer(args[0]);
	
	tokenizer.printFileContent();
    }
}