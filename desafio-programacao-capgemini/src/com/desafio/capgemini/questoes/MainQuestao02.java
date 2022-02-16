package com.desafio.capgemini.questoes;

import java.util.Scanner;

public class MainQuestao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String senha = leInformacao("Por favor digite sua senha para verificação ", scan);
		verificaSenha(senha);

	}

	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	public static void verificaSenha(String senha) {

		String regex = "(?=.*[!@#$%^&*()-+])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}";

		if (senha.length() < 6) {
			int x = 6 - senha.length();
			System.out.println("Adicione pelo menos mais " + x + " caracteres");
		} else {
			if (senha.matches(regex) && !senha.contains(" ")) {
				System.out.println("Sua senha é forte");
			} else {
				System.out.println("Sua senha é fraca");
			}

		}
	}

}
