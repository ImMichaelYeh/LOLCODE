package tokenizer;

public class Token {

    public static enum Type { UNKNOWN, KEYWORD, IDENTIFIER, NUMBER, FLOAT, BOOL, OPERATOR, COMMA} 
    
    private final Type type;
    private final String content;
    
    public Token (Type type, String content) {
	this.type = type;
	this.content = content;
    }
    
    public Type getType() {
	return this.type;
    }
    
    public String getContent() {
	return this.content;
    }
    
    public String toString() {
	return "[Type: " + type.name() + ", Content: " + content + "]";
    }
}
