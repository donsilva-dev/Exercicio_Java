package exercicioProposto.app;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class AppCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be boughts? ");
		CurrencyConverter.valueDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.calculator());
		
		sc.close();

	}

}
