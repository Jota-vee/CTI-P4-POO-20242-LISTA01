package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double salario = 1416.90;
		double grat = salario * 0.05;
		double imp = salario * 0.07;
		double salarioreceba = salario + grat - imp;
		System.out.print("Ele recebe " + salarioreceba);

	}

}
