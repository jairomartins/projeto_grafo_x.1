package controle;
import modelo.Grafo;
import modelo.Vertice;
public class Gerenciador {
	

	
	public static void main(String []args){ 
		Grafo g;
		g = new Grafo();
		//Cria vertices do grafo
		g.addVertices(new Vertice("A")); //        [A]
		g.addVertices(new Vertice("B")); //     [B]/  \[C]
		g.addVertices(new Vertice("C")); //        [D]/   \[E]
		g.addVertices(new Vertice("D")); //           \[F]/  \[G]
		g.addVertices(new Vertice("E")); //
		g.addVertices(new Vertice("F"));
		g.addVertices(new Vertice("G"));
		
		g.criaAresta(g.buscarVertice("A"),g.buscarVertice("B"));
		g.criaAresta(g.buscarVertice("B"),g.buscarVertice("A"));
		
		
		g.criaAresta(g.buscarVertice("A"),g.buscarVertice("C"));
		g.criaAresta(g.buscarVertice("C"),g.buscarVertice("A"));
		
		g.criaAresta(g.buscarVertice("C"),g.buscarVertice("D"));
		g.criaAresta(g.buscarVertice("D"),g.buscarVertice("C"));
		
		g.criaAresta(g.buscarVertice("C"),g.buscarVertice("E"));
		g.criaAresta(g.buscarVertice("E"),g.buscarVertice("C"));
		
		g.criaAresta(g.buscarVertice("E"),g.buscarVertice("F"));
		g.criaAresta(g.buscarVertice("F"),g.buscarVertice("E"));
		
		g.criaAresta(g.buscarVertice("D"),g.buscarVertice("F"));
		g.criaAresta(g.buscarVertice("F"),g.buscarVertice("D"));
		
		
		g.criaAresta(g.buscarVertice("E"),g.buscarVertice("G"));
		g.criaAresta(g.buscarVertice("G"),g.buscarVertice("E"));
		
		
		
		Busca b = new Busca();
		//System.out.println("AA");
		System.out.println("Grau Do Grafo >> "+g.getVertices().size());
		b.buscaEmLargura(g, g.buscarVertice("G"));
		
	}
	
	
}
