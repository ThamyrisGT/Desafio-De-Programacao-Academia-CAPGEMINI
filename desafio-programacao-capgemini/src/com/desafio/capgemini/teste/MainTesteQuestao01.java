package com.desafio.capgemini.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.desafio.capgemini.questoes.MainQuestao01;

public class MainTesteQuestao01 {


    @Test
    @DisplayName("Verifica se o desenho da escada está de acordo com tamanho n passado")
    void precisaRetornarDesenhoDaEscadaComTamanhoN() {
        assertEquals(String.valueOf(MainQuestao01.desenhaEscada(6)),
        		         "\s\s\s\s\s*\n"
                		+ "\s\s\s\s**\n"
                		+ "\s\s\s***\n"
                		+ "\s\s****\n"
                		+ "\s*****\n"
                		+ "******\n");
    }
}
