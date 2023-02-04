package br.com.alura.models;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, String instrutor) {
		
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal =0;
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		
		return tempoTotal;
		
		//utilizando o java8
		//return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricularAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno>getAluno(){
		return Collections.unmodifiableSet(alunos);
	}
	
	
	@Override
	public String toString() {
		
		return "[Curso: " + this.nome + ", tempo total: " + getTempoTotal() + " Aulas deste curso: " + this.getAulas();
	}

	
	
	
	

}
