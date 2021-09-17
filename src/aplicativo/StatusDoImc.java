package aplicativo;

import java.util.Scanner;

import calculos.Imc;

public class StatusDoImc {

	public static void main(String[] args) {
		
		
		int humanoPeso;
		int humanoAltura;
		
		Imc status = new Imc();
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Calculadora Imc");
		
		System.out.println("Insira o seu peso: ");
		humanoPeso = leitor.nextInt();
		
		System.out.println("Insira a sua altura: ");
		humanoAltura = leitor.nextInt();
		
		status.peso = humanoPeso;
		status.altura = humanoAltura;
		status.calcularImc();
		
		
		
		
	}

}
