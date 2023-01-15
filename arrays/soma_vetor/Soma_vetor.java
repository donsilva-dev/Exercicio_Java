package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
	/*
	 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
	 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
	 * m�dia dos elementos do vetor
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

	
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		System.out.print("VALORES = ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();
	}

}
