package modelo;

import java.util.ArrayList;

public class Fila  extends ArrayList{

	
	public void adicionarVertice(Vertice v){
		this.add(v);
	}
	
	//Busca a ultima vertice visitada e elimina da fila
	public Vertice getVertice(){
		Vertice verticeTemp = null;
		if(!this.isEmpty()&&this !=null){
			verticeTemp = (Vertice)this.get(0);
			//this.remove(this.size()-1);
		}
		return verticeTemp;
	}
	
	
	public void exibirConteudo(){
		System.out.println("[");
		while(this.listIterator().hasNext()){
			System.out.println(((Vertice)this.listIterator().next()).getNome()+" ");
		}
		System.out.println("]");
	}
	
	
	
	
}
