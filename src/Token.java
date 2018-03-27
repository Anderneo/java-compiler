
public class Token{
	private TokenType tokenType;
	private String lexema;
	private int lin;
	private int col;
	
	public Token(TokenType tp, String lexema, int lin, int col){
		this.tokenType = tp;
		this.lexema = lexema;
		this.lin = lin;
		this.col = col;
	}

	public void setLin(int lin) {
		this.lin = lin;
	}

	public void setCol(int col) {
		this.col = col;
	}
}
