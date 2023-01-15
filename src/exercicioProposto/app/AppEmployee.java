package exercicioProposto.app;

import java.util.Locale;
import java.util.Scanner;

import exercicioProposto.classe.Employee;

public class AppEmployee {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();

		System.out.println(employee);
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee.name + ", $ " + employee);

		sc.close();
	}
}
