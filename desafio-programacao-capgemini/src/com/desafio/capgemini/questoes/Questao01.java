package com.desafio.capgemini.questoes;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = leInformacaoInt("Por favor digite um número", scan);
		desenhaEscada(n);

	}

	protected static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente um número");
			}
		}

		scan.close();
		return num;
	}

	protected static void desenhaEscada(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(" ".repeat(n - i - 1) + "*".repeat(i + 1));
	    }
	}

}
