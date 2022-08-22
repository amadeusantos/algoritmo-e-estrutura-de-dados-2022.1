package fila.dinamica;

import TAD.*;

public class Amadeu implements ITrabalho04 {

    private Elemento primeiro;
    private int quantElem;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }

    @Override
    public Elemento getLista() {
        return primeiro;
    }

    @Override
    public int getQuantidade() {
        return quantElem;
    }

    @Override
    public void enqueue(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            Elemento atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        quantElem++;
    }

    @Override
    public ITAD dequeue() {
        if (primeiro == null) return null;
        ITAD retorno = primeiro.getTad();
        primeiro = primeiro.getProximo();
        quantElem--;
        return retorno;
    }

    @Override
    public ITAD consulta() {
        return primeiro.getTad();
    }

    @Override
    public String print() {
        String txt = "[\n";
        Elemento atual = primeiro;
        while (atual != null) {
            txt += atual.getTad().print();
            if (atual.getProximo() != null) {
                txt += "\n================================================================================\n";
            }
            atual = atual.getProximo();
        }
        txt += "\n]";
        return txt;
    }
    
}
