package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, che1, che2, cpmf1, cpmf2, saldo;
		sal = 1416.90;
		che1 = 400;
		che2 = 120;
		cpmf1 = che1 * 0.38/100;
		cpmf2 = che2 * 0.38/100;
		saldo = sal - che1 - che2 - cpmf1 - cpmf2;
		System.out.println(saldo);
		
		
		
		
		
		

	}

}
