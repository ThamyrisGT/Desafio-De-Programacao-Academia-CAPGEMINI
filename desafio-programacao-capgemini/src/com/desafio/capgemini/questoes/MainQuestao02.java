package com.desafio.capgemini.questoes;

import java.util.Scanner;

/**
 * Classe Main onde � executado a quest�o 02 do Desafio. O programa recebe uma
 * string senha para verificar quantos caracteres faltam para atingir tamanho de
 * no m�nimo 6. Tamb�m � verificado se atinge os requisitos de senha forte.
 *
 * @author Thamyris G Thurler
 *
 */
public class MainQuestao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String senha = leInformacao("Por favor digite sua senha para verifica��o ", scan);
		verificaSenha(senha);

	}

	/**
	 * M�todo que recebe a entrada do valor da string.
	 * 
	 * @param String  msg - String que determina a mensagem para o usu�rio.
	 * @param Scanner scan - Para receber resposta do usu�rio.
	 * @return String - String que representa a senha.
	 */

	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	/**
	 * M�todo para verificar a senha.
	 * 
	 * @param String senha - Representa a senha.
	 * @return int - Representa , se existir, quantidade de caracteres que faltam
	 *         para atingir tamanho m�nimo de 6. Caso contr�rio retorna 0.
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
				System.out.println("Sua senha cont�m ao menos 6 caracteres e � forte");
			} else {
				System.out.println("Sua senha cont�m ao menos 6 caracteres, por�m ela � fraca");
			}
		}
		return 0;
	}

}
