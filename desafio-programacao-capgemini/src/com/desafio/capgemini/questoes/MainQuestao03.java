package com.desafio.capgemini.questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe Main onde é executado a questão 03 do Desafio. O programa recebe uma
 * string para verificar quantos anagramas de substrings da palavra inserida
 * existe em pares.
 *
 * @author Thamyris G Thurler
 *
 */
public class MainQuestao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String palavra = leInformacao("Por favor digite uma palavra ", scan);
		pegaQtdDeAnagramas(palavra);

	}

	/**
	 * Método que recebe a entrada do valor da string.
	 * 
	 * @param String  msg - String que determina a mensagem para o usuário.
	 * @param Scanner scan - Para receber resposta do usuário.
	 * @return String - String que representa a palavra.
	 */
	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	/**
	 * Método para verificar a quantidade de anagramas.
	 * 
	 * @param String palavra - Representa a palavra.
	 * @return int - Representa , se existir, quantidade de pares de anagramas que é
	 *         possível formar pela palavra inserida.
	 */
	public static int pegaQtdDeAnagramas(String palavra) {

		ArrayList<String> listaSubstrings = identificaTodasSubstrings(palavra);

		int contador = 0;
		for (int i = 0; i < listaSubstrings.size() - 1; i++) {
			for (int j = i + 1; j < listaSubstrings.size(); j++) {
				char[] c1 = listaSubstrings.get(i).toCharArray();
				char[] c2 = listaSubstrings.get(j).toCharArray();

				Arrays.sort(c1);
				Arrays.sort(c2);

				if (Arrays.equals(c1, c2)) {
					contador++;
				}
			}
		}
		System.out.println("A palavra " + palavra + " contém " + contador + " pares de substrings que são anagramas.");
		return contador;
	}

	/**
	 * Método para identificar todas as substrings.
	 * 
	 * @param String palavra - Representa a palavra.
	 * @return ArrayList<String> - Retorna a lista de todas as substrings da
	 *         palavra.
	 * 
	 */
	public static ArrayList<String> identificaTodasSubstrings(String palavra) {
		ArrayList<String> listaSubstrings = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i + 1; j <= palavra.length(); j++) {
				listaSubstrings.add(palavra.substring(i, j));
			}
		}
		return listaSubstrings;
	}

}
