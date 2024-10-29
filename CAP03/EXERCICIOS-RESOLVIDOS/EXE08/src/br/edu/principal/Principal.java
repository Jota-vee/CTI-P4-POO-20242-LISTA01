package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double dep = 1416.90;
		double taxa = 0.01;
		double red = dep * taxa;
		System.out.println("O rendimento é " + red);
		System.out.print("E o total é " + (red + dep));
		
		

	}

}
