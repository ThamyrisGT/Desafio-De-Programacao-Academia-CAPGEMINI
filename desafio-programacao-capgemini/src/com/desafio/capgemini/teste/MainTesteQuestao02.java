package com.desafio.capgemini.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.desafio.capgemini.questoes.MainQuestao02;

public class MainTesteQuestao02 {

	@Test
	@DisplayName("Retorna quantidade de caracteres que faltam para atingir o tamanho mínimo da senha")
	void precisaRetornarQtdCaracteresFaltando() {
		assertEquals(MainQuestao02.verificaSenha("Ya3"), 3);
	}
	
	@Test
	@DisplayName("Retorna nenhuma quantidade de caracteres. Tamanho mínimo de senha atingido")
	void precisaRetornarNenhumaQtd() {
		assertEquals(MainQuestao02.verificaSenha("Ya3&ab"), 0);
	}
}
