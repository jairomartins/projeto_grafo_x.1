package modelo;

import java.util.ArrayList;

public class Grafo {

	private ArrayList<Vertice> vertices;
	
	public Grafo (){
		vertices = new ArrayList<Vertice>();
	}

	
	//Verifica se um vertice existe
	 public Vertice buscarVertice(String nomeVertice){
	        for(int i = 0;i < vertices.size(); i++){
	            if(((String)nomeVertice).equals((String)vertices.get(i).getNome())){
	                return vertices.get(i);
	            }
	        }
	        return null;
	  }
	 
	 public void criaAresta(Vertice verticeInicial, Vertice verticeDestino){
		 verticeInicial.addAdjacentes(verticeDestino); 
	 }
	 
	
	public ArrayList<Vertice> getVertices() {
		return vertices;
	}

	public void addVertices(Vertice vertices) {
		this.vertices.add(vertices);
	}
	
	
	
	
	
	
}
