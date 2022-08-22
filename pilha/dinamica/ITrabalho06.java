package pilha.dinamica;

import TAD.*;

public interface ITrabalho06 {
	
	String getEstudante();

	Elemento getLista();
	int getQuantidade();
	
	void push(ITAD tad);
	ITAD pop();
	ITAD consulta();
	
	String print();
	
}
