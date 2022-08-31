package pessoas;

public class Homem extends Pessoa {

	private static final int VALOR_K = 4;
	
	public Homem(int codigo, String nome, int idade, double peso, double altura) {
		super(codigo, nome, idade, peso, altura);
	}

	public int getVALOR_K() {
		return VALOR_K;
	}

}
