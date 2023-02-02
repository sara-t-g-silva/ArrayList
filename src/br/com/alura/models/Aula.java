package br.com.alura.models;

public class Aula implements Comparable{
	
	String titulo;
	int tempo;
	
	public Aula(String titulo, int tempo) {
		
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Aula: " + this.titulo + ", Tempo: " + this.tempo;
	}

	@Override
	public int compareTo(Object outraAula) {
		return this.titulo.compareTo(((Aula) outraAula).getTitulo());
	}
	
	

}
