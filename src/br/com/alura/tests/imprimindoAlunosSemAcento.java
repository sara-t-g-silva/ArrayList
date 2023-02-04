package br.com.alura.tests;

import java.util.HashSet;
import java.util.Set;

public class imprimindoAlunosSemAcento {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();// não permite elementos duplicados!
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		
		
		boolean adiciona = alunos.add("Nico");
		System.out.println("o aluno foi adicionado? "+adiciona);
		
		System.out.println(alunos.size());

	}

}
