package com.desafio.capgemini.questoes;

import java.util.Scanner;

/**
 * Classe Main onde é executado a questão 02 do Desafio. O programa recebe uma
 * string senha para verificar quantos caracteres faltam para atingir tamanho de
 * no mínimo 6. Também é verificado se atinge os requisitos de senha forte.
 *
 * @author Thamyris G Thurler
 *
 */
public class MainQuestao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String senha = leInformacao("Por favor digite sua senha para verificação ", scan);
		verificaSenha(senha);

	}

	/**
	 * Método que recebe a entrada do valor da string.
	 * 
	 * @param String  msg - String que determina a mensagem para o usuário.
	 * @param Scanner scan - Para receber resposta do usuário.
	 * @return String - String que representa a senha.
	 */

	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	/**
	 * Método para verificar a senha.
	 * 
	 * @param String senha - Representa a senha.
	 * @return int - Representa , se existir, quantidade de caracteres que faltam
	 *         para atingir tamanho mínimo de 6. Caso contrário retorna 0.
	 */
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
