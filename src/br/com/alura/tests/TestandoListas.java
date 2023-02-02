package br.com.alura.tests;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
	String curso1 = "java com orientação a objetos";
	String curso2 = "collections";
	String curso3 = "testes unitários";
	
	ArrayList<String> cursos = new ArrayList<>();
	
	cursos.add(curso1);
	cursos.add(curso2);
	cursos.add(curso3);
	
	System.out.println(cursos);
	
	for (String curso : cursos) {
		
		System.out.println(curso);
	}
	
	cursos.remove(1);
	
	System.out.println(cursos);
	
	System.out.println("o primeiro curso da lista é: " + cursos.get(0));
		
	for(int i=0; i< cursos.size();i++) {
		System.out.println(cursos.get(i));
	}
	System.out.println("------------------------");
	cursos.add(curso2);
	
	for(int i=0; i< cursos.size();i++) {
		
		System.out.println(cursos.get(i));
	}
	
	Collections.sort(cursos);
	
	
	
	for(int i=0; i< cursos.size();i++) {
		
		System.out.println(cursos.get(i));
	}
	
	}

}
