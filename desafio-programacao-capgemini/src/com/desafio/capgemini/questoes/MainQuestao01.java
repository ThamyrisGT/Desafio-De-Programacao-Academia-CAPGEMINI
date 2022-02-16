package com.desafio.capgemini.questoes;

import java.util.Scanner;

/**
 * Classe Main onde é executado a questão 01 do Desafio. O programa recebe um
 * inteiro n e imprime em formato de escada de * de acordo com o tamanho
 * passado.
 *
 * @author Thamyris G Thurler
 *
 */
public class MainQuestao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = leInformacaoInt("Por favor digite um número", scan);
		desenhaEscada(n);

	}

	/**
	 * Método que recebe a entrada do valor n e verifica se é mesmo um número.
	 * 
	 * @param String  msg - String que determina a mensagem para o usuário.
	 * @param Scanner scan - Para receber resposta do usuário.
	 * @return int - Inteiro que representa o valor do n.
	 */
	public static int leInformacaoInt(String msg, Scanner scan) {

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

	/**
	 * Método responsável pela execução do desenho.
	 * 
	 * @param int n - Inteiro que determina o tamanho e a base da escada.
	 * @return StringBuilder - String montada na forma de escada.
	 *
	 */
	public static StringBuilder desenhaEscada(int n) {
		StringBuilder escada = new StringBuilder();
		for (int i = 0; i < n; i++) {
			escada.append(" ".repeat(n - i - 1) + "*".repeat(i + 1) + "\n");
		}
		System.out.println(escada);
		return escada;
	}

}
