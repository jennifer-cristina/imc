package calculos;

public class Imc {

	public int peso;
	public double altura;
	public double resultado;
	public String Status;

	public void calcularImc() {
		resultado = peso / (altura * altura);
		System.out.println(resultado);
	}

	public void obterStatus() {
		if ( resultado < 18.5 ) {
			System.out.println("Você está abaixo do peso.");
			
		} else if ( resultado < 18.5 && resultado < 24.9) {
			System.out.println("Você está no seu peso normal.");

		} else if ( resultado < 25 && resultado < 29.9) {
			System.out.println("Você está com sobrepeso.");
			
		} else if ( resultado < 30 && resultado < 34.9) {
			System.out.println("Você está com Obesidade Grau 1");
			
		} else if (resultado < 35 && resultado < 39.9) {
			System.out.println("Você está com Obesidade Grau 2");
			
		} else if ( resultado >= 40 ) {
			System.out.println("Você está com Obesidade Grau 3 ou Mórbida.");
		}
	}
}
