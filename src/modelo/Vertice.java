package modelo;

import java.util.ArrayList;

public class Vertice {
	
	private ArrayList<Vertice> adjacentes;
	private String nome;
	private boolean visitado;
	
	public Vertice(){
	
	}
	
	public Vertice(String nome){
		this.nome = nome;
		this.adjacentes = new ArrayList<Vertice>();
	}
	
	public ArrayList<Vertice> getAdjacentes() {
		return adjacentes;
	}
	public void addAdjacentes(Vertice VerticeAdjacente) {
		this.adjacentes.add(VerticeAdjacente);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	
	
	
	
	
}
