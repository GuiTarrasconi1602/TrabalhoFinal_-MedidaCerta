package calculos;

import pessoas.Pessoa;

public class CalculosCorpo {

	public double calculaIMC(Pessoa pessoa) {
		double imc = 0;
		double altura = pessoa.getAltura();
		double peso = pessoa.getPeso();
		
		imc = (peso/(Math.pow(altura, 2)));
		
		return imc;
	}
	public void calculaPesoIdeal() {
		
	}
	public void calculaTaxaDeGorduraCorporal() {}
}
