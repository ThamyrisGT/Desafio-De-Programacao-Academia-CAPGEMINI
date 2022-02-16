package com.desafio.capgemini.questoes;

import java.util.Scanner;

/**
 * Classe Main onde � executado a quest�o 01 do Desafio. O programa recebe um
 * inteiro n e imprimi em formato de escada de * de acordo com o tamanho
 * passado.
 *
 * @author Thamyris G Thurler
 *
 */
public class MainQuestao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = leInformacaoInt("Por favor digite um n�mero", scan);
		desenhaEscada(n);

	}

	/**
	 * M�todo que recebe a entrada do valor n e verifica se � mesmo um n�mero.
	 * 
	 * @param String  msg - String que determina a mensagem para o usu�rio.
	 * @param Scanner scan - Para receber resposta do usu�rio.
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
				System.out.println("Entrada inv�lida, digite novamente um n�mero");
			}
		}

		scan.close();
		return num;
	}

	/**
	 * M�todo respons�vel pela execu��o do desenho.
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
