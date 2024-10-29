package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ano_nasci = 1945;
		int ano_atual = 2024;
		int idade = ano_atual - ano_nasci;
		int idade_50 = idade + (2050-ano_atual);
		System.out.println(idade);
		System.out.println(idade_50);
	}

}
