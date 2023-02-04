package br.com.alura.tests;

import br.com.alura.models.Aluno;
import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

public class TesteMatriculaAlunos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Aprendendo sobre arrys","Paulo Siqueira");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno alunos1 = new Aluno("paulo",12344);
		Aluno alunos2 = new Aluno("joao",12345);
		Aluno alunos3 = new Aluno("aline",12346);
		 
		javaColecoes.matricularAluno(alunos1);
		javaColecoes.matricularAluno(alunos2);
		javaColecoes.matricularAluno(alunos3);
		
		javaColecoes.getAluno().forEach(aluno ->{
			System.out.println(aluno);
		});

	}
	
}
