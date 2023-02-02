package br.com.alura.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.models.Aula;

public class TestandoListasDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		extracted(aulas);
		
		System.out.println(aulas);
		
		
		
	}

	private static void extracted(ArrayList<Aula> aulas) {
		Collections.sort(aulas);
	}

}
