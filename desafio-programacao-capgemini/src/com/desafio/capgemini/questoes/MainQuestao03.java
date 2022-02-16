package com.desafio.capgemini.questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainQuestao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String palavra = leInformacao("Por favor digite uma palavra ", scan);
		pegaQtdDeAnagramas(palavra);

	}

	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	public static void pegaQtdDeAnagramas(String palavra) {

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
		System.out.println("A palavra " + palavra + " contém " + contador + " substrings anagramas");
	}

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
