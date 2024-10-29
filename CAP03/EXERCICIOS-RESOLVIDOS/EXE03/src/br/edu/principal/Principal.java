package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		float nota1 = 7;
		float nota2 = 7;
		float nota3 = 7;
		float peso1 = 2;
		float peso2 = 3;
		float peso3 = 4;
		float media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
		System.out.print("A média foi "+ media);
		

	}

}
