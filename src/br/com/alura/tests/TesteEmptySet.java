package br.com.alura.tests;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();// representa um conjunto vazio
        nomes.add("Paulo");// retorna UnsupportedOperationException

	}

}
