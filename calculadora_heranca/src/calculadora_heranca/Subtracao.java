package calculadora_heranca;

public class Subtracao extends Calculadora{
	
	public Subtracao(double valor1, double valor2) {
		super(valor1, valor2);
	}

	public void subtracao() {
		super.subtracao();

		double resultado = valor1 - valor2;

		System.out.println("RESULTADO DA SUBTRACAO:" + resultado);
	}
}
