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

	public static int verificaSenha(String senha) {

		int x = 0;
		String regex = "(?=.*[!@#$%^&*()-+])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,}";

		if (senha.length() < 6) {
			x = 6 - senha.length();
			System.out.println("Adicione pelo menos mais " + x + " caracteres");
			return x;
		} else {
			if (senha.matches(regex) && !senha.contains(" ")) {
				System.out.println("Sua senha contém ao menos 6 caracteres e é forte");
			} else {
				System.out.println("Sua senha contém ao menos 6 caracteres, porém ela é fraca");
			}
		}
		return 0;
	}

}
