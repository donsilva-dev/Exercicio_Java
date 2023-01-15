package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	/*
	 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
	 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
	 * Mostrar tamb�m a posi��o do maior elemento, considerando a primeira posi��o
	 * como 0 (zero).
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		double maiorValor = vetor[0];
		int posicao = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
		sc.close();
	}

}
