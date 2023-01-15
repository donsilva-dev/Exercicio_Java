package exercicioProposto.classe;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return "Name: " + name + 
				"\n" + "Gross salary: " + String.format("%.2f%n", grossSalary) + 
				"Tax: " + String.format("%.2f%n", tax) +
				"\n" + "Employee: " + name + ", $ " + String.format("%.2f%n", netSalary()); 
		
	}

}
