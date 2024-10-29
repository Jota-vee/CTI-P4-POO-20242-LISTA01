package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double salario = 1416.90;
		double grat = 50;
		double imp = salario * 0.1;
		double novo_salario = salario + grat - imp;
		System.out.print("O salario dele é " + novo_salario);

	}

}
