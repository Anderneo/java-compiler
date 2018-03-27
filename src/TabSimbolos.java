
import java.util.HashMap;
import java.util.Map;

public class TabSimbolos {
	private static TabSimbolos instace = new TabSimbolos();
	private static Map<String, Token> tabela = new HashMap<String, Token>();
	
	private TabSimbolos(){
		//precarrega Plavras Reservadas
		tabela.put("verdadeiro", new Token(TokenType.LOGIC_VAL, "verdadeiro", 0, 0));
		tabela.put("falso", new Token(TokenType.LOGIC_VAL, "falso", 0, 0));
		tabela.put("nao", new Token(TokenType.LOGIC_OP, "nao", 0, 0));
		tabela.put("sim", new Token(TokenType.LOGIC_OP, "sim", 0, 0));
		tabela.put("logico", new Token(TokenType.TYPE, "logico", 0, 0));
		tabela.put("texto", new Token(TokenType.TYPE, "texto", 0, 0));
		tabela.put("num", new Token(TokenType.TYPE, "num", 0, 0));
		tabela.put("programa", new Token(TokenType.PROGRAM, "programa", 0, 0));
		tabela.put("fimprog", new Token(TokenType.END_PROG, "fimprog", 0, 0));
		tabela.put("inicio", new Token(TokenType.BEGIN, "inicio", 0, 0));
		tabela.put("fim", new Token(TokenType.END, "fim", 0, 0));
		tabela.put("se", new Token(TokenType.IF, "se", 0, 0));
		tabela.put("entao", new Token(TokenType.THEN, "entao", 0, 0));
		tabela.put("senao", new Token(TokenType.ELSE, "senao", 0, 0));
		tabela.put("para", new Token(TokenType.FOR, "para", 0, 0));
		tabela.put("enquanto", new Token(TokenType.WHILE, "enquanto", 0, 0));
		tabela.put("declare", new Token(TokenType.DECLARE, "declare", 0, 0));
		tabela.put("ate", new Token(TokenType.TO, "ate", 0, 0));

	}
	
	
	public static void getInstance(){
		
	}
	
	public static Token instalaToken(String lexema, int lin, int col){
		
		Token tk = tabela.get(lexema);
		if(tk == null){
			tk = new Token(TokenType.ID, lexema, lin, col);
			tabela.put(lexema, tk);
		}else{
			tk.setLin(lin);
			tk.setCol(col);
		}
		return tk;
	}
}


