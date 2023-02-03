package br.com.alura.tests;

import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

public class TesteCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Aprendendo sobre arrys","Paulo Siqueira");
		
		System.out.println(javaColecoes.getAulas());
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));// para de funcionar pelo metodo que foi criado na class curso
		
		System.out.println(javaColecoes.getAulas());
	
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        System.out.println(javaColecoes.getAulas());
	
	}
	

}
