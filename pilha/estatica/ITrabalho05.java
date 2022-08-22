package pilha.estatica;

import TAD.ITAD;

public interface ITrabalho05 {
	
	String getEstudante();

	ITAD[] criaLista(int tamanho);
	int getQuantidade();
	
	void push(ITAD tad);
	ITAD pop();
	ITAD consulta();
	
	String print();
	
}
