package fila.dinamica;

import TAD.*;

public interface ITrabalho04 {
	
	String getEstudante();

	Elemento getLista();
	int getQuantidade();
	
	void enqueue(ITAD tad);
	ITAD dequeue();
	ITAD consulta();
	
	String print();
	
}
