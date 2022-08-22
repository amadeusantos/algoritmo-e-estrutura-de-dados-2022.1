package fila.estatica;

import TAD.ITAD;

public class Amadeu implements ITrabalho03 {
    private ITAD[] hangar;
    private int tamanho;
    private int proximo;
    private int ultimoEntrar;
    private int quantElem;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }
    @Override
    public ITAD[] criaLista(int tamanho) {
        hangar = new ITAD[tamanho];
        this.tamanho = tamanho;
        this.ultimoEntrar = -1;
        quantElem = 0;
        proximo = 0;
        return hangar;
    }
    @Override
    public int getQuantidade() {
        return quantElem;
    }
    @Override
    public void enqueue(ITAD tad) {
        if (quantElem >= tamanho) return;
        ultimoEntrar = (ultimoEntrar + 1) % tamanho; 
        hangar[ultimoEntrar] = tad;
        quantElem++;
    }
    @Override
    public ITAD dequeue() {
        if (quantElem == 0) return null;
        ITAD retorno = hangar[proximo];
        hangar[proximo] = null;
        proximo = (proximo + 1) % tamanho;
        quantElem--;
        return retorno;
    }
    @Override
    public ITAD consulta() {
        return hangar[proximo];
    }
    @Override
    public String print() {
        String txt = "[\n";
        for (int i = 0; i < tamanho; i++) {
            if (hangar[i] != null) {
                txt += hangar[i].print();
            } else {
                txt += "null";
            }
            txt += (i == tamanho - 1)? "\n]": "\n================================================================================\n";
        }
        return txt;
    }
}
