package classes;

// Fazer um programa para ler um número inteiro N e os dados
// (nome e preço) N produtos. Armazene os N produtos em um veotr. em
// seguida, mostrar o preço médio dos produtos.

public class VetorClass {
	private String name;
	private double preco;

	public VetorClass(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
