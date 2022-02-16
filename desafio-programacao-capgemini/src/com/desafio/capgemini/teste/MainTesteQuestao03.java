package com.desafio.capgemini.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.desafio.capgemini.questoes.MainQuestao03;

public class MainTesteQuestao03 {

	@Test
	@DisplayName("Verifica quantidade de anagramas de substrings")
	void precisaRetornarQuantidadeDeAnagramasDeSubstrings() {
		assertEquals(MainQuestao03.pegaQtdDeAnagramas("ovo"), 2);
	}

	@Test
	@DisplayName("Retorna uma lista com todas as substrings possíveis")
	void precisaRetornarTodasSubstringsDaPalavra() {
		ArrayList<String> listaSubstrings = new ArrayList<>();
		listaSubstrings.add("o");
		listaSubstrings.add("ov");
		listaSubstrings.add("ovo");
		listaSubstrings.add("v");
		listaSubstrings.add("vo");
		listaSubstrings.add("o");

		assertEquals(MainQuestao03.identificaTodasSubstrings("ovo"), listaSubstrings);
	}
}
