package pilha.dinamica;

import TAD.*;

public class Amadeu implements ITrabalho06 {

    private Elemento ultimo;
    private int quantElem;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }

    @Override
    public Elemento getLista() {
        return ultimo;
    }

    @Override
    public int getQuantidade() {
        return quantElem;
    }

    @Override
    public void push(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        novo.setProximo(ultimo);
        ultimo = novo;
        quantElem++;
    }

    @Override
    public ITAD pop() {
        if (ultimo == null) return null;
        ITAD retorno = ultimo.getTad();
        ultimo = ultimo.getProximo();
        quantElem--;
        return retorno;
    }

    @Override
    public ITAD consulta() {
        return ultimo.getTad();
    }

    @Override
    public String print() {
        String txt = "[\n";
        Elemento atual = ultimo;
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
