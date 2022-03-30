package controle;

import modelo.Fila;
import modelo.Grafo;
import modelo.Vertice;

public class Busca {

	Fila fila;

	public Busca() {

		fila = new Fila();
	}

	public void buscaEmLargura(Grafo g, Vertice verticeInicial) {
		fila.add(verticeInicial);
		while (fila.size() > 0) {
			Vertice verticeVisitada = fila.getVertice();
			for (Vertice v : verticeVisitada.getAdjacentes()) {
				if (!v.isVisitado()) {
					verticeVisitada.setVisitado(true);
					System.out.print(verticeVisitada.getNome());
					System.out.println(v.getNome());
					v.setVisitado(true);
					fila.add(v);
				} else if (fila.contains(v)) {
					v.setVisitado(true);
				}
			}
			fila.remove(verticeVisitada);
		}

	}

}
