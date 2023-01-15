package vetores_parte1;

import java.util.Locale;
import java.util.Scanner;

public class VetoresParte1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro N ea altura de N pessoas.
		// Armazenar as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		// pessoas.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de entrada:");
		int n = sc.nextInt();
		double[] vect = new double[n];

		
		for (int i = 0; i < n; i++) {
			System.out.print("\nDigite um número: ");
			vect[i] = sc.nextDouble();
		}
		

		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);

		sc.close();

	}

}
