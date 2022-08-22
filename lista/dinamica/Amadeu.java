package lista.dinamica;

import TAD.*;

public class Amadeu implements Trabalho02 {

    private Elemento primeiro;
    private int quantElem = 0;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }

    @Override
    public Object getLista() {
        return this;
    }

    @Override
    public ITAD get(int index) {
        if (index < -1 || index > quantElem) return null;
        Elemento retorno = primeiro;
        for (int i = 0; i < index; i++) {
            retorno = retorno.getProximo();
        }
        return retorno.getTad();
    }

    @Override
    public int getQuantidade() {
        return quantElem;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
           Elemento novo = new Elemento();
           novo.setTad(tad);
           novo.setProximo(primeiro);
           primeiro = novo;
           quantElem++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
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
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantElem) return;
        Elemento novo = new Elemento();
        novo.setTad(tad);
        Elemento proximo = primeiro;
        Elemento anterior = primeiro;
        for (int i = 0; i < posicao; i++) {
            anterior = proximo;
            proximo = proximo.getProximo();
        }
        novo.setProximo(proximo);
        if (anterior != null) anterior.setProximo(novo);
        quantElem++;
    }

    @Override
    public ITAD removerNoInicio() {
        if (primeiro == null) return null;
        Elemento removido = primeiro;
        primeiro = primeiro.getProximo();
        quantElem--;
        return removido.getTad();
    }

    @Override
    public ITAD removerNoFim() {
        if (primeiro == null) return null;
       Elemento removido = primeiro;
       Elemento anterior = null;    
       for (int i = 0; i < quantElem - 1; i++) {
        anterior = removido;
        removido = removido.getProximo();
       }
       if (anterior == null) {
        primeiro = null;
       } else {
        anterior.setProximo(null);
       }
       quantElem--;
        return removido.getTad();
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (primeiro == null || posicao < 0 || posicao > quantElem) return null;
        Elemento anterior = primeiro;
        Elemento removido = primeiro;
        for (int i = 0; i < posicao; i++) {
            anterior = removido;
            removido = removido.getProximo();
        }
        if (anterior == removido) {
            primeiro = null;
        } else {
            anterior.setProximo(removido.getProximo());
        }

        quantElem--;
         return removido.getTad();
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


