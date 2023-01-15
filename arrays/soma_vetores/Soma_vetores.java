package soma_vetores;

import java.util.Scanner;

public class Soma_vetores {

	/*
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
	 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
	 * elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vetorA = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		int[] vetorB = new int[n];

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		int[] vetorC = new int[n];

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorB[i] + vetorA[i];
		}

		System.out.println("VETOR RESULTANTE: ");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}

		sc.close();

	}

}
