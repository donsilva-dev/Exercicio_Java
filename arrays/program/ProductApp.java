package program;

import java.util.Locale;
import java.util.Scanner;

import classes.VetorClass;



public class ProductApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		VetorClass[] vect = new VetorClass[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new VetorClass(name, preco);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERGE PRICE = %.2f", avg);
		
		sc.close();

	}

}
