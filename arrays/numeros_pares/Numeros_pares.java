package numeros_pares;

import java.util.Scanner;

public class Numeros_pares {

	/*
	 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela todos os n�meros pares, e tamb�m a quantidade de
	 * n�meros pares.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES: ");

		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				cont++;
			}
		}

		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + cont);

		sc.close();

	}

}
