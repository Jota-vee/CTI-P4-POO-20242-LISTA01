package br.edu.principal;

public class Principal {
			
	public static void main(String[] args) {
		double salario = 1416.90;
		double per = 0.5;
		double aumento = salario*per;
		System.out.println("O valor de aumento é "+aumento);
		System.out.print("O novo sálario é " + (salario+aumento));
		

	}

}
