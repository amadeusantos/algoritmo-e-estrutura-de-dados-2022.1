package lista.dinamica;

import TAD.ITAD;

public interface Trabalho02 {
	
	String getEstudante();

	Object getLista();
	ITAD get(int index);
	int getQuantidade();
	
	void inserirNoInicio(ITAD tad);
	void inserirNoFim(ITAD tad);
	void inserirNoMeio(ITAD tad, int posicao);
	ITAD removerNoInicio();
	ITAD removerNoFim();
	ITAD removerNoMeio(int posicao);
	
	String print();
	
}
