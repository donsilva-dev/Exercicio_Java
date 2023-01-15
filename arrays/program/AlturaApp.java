package program;

import java.util.Locale;
import java.util.Scanner;

import classes.Alturas;

public class AlturaApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Alturas[] vetor = new Alturas[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Alturas(nome, idade, altura);
		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getAltura();
		}

		double media = soma / n;

		System.out.println();
		System.out.printf("Altura media: %.2f%n ", media);

		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				cont++;
			}
		}

		double percent = cont * 100.0 / n;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}

			sc.close();

		}

	}
}
