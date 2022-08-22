package lista.estatica;

import TAD.ITAD;

public class Amadeu implements Trabalho01 {

    private ITAD[] hangar;
    private int ultimoIndex;
    private int tamanho;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }

    @Override
    public void criaLista(int tamanho) {
        this.ultimoIndex = -1;
        this.tamanho = tamanho;
        hangar = new ITAD[tamanho];
    }

    @Override
    public ITAD[] getLista() {
        return hangar;
    }

    @Override
    public ITAD get(int index) {
        if (index < 0 || ultimoIndex < index) return null;
        return hangar[index];
    }

    @Override
    public int getQuantidade() {
        return this.ultimoIndex + 1;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        inserirNoMeio(tad, 0);
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        inserirNoMeio(tad, ultimoIndex + 1);
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (ultimoIndex + 1 < tamanho && posicao > -1 && posicao <= ultimoIndex + 1) {
            for (int i = ultimoIndex; i >= posicao; i--) {
                hangar[i + 1] = hangar[i];
            }
            hangar[posicao] = tad;
            ultimoIndex++;
        }
        
    }

    @Override
    public ITAD removerNoInicio() {
        return removerNoMeio(0);
    }

    @Override
    public ITAD removerNoFim() {
       return removerNoMeio(ultimoIndex);
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
       if (posicao < 0 || posicao > ultimoIndex) return null;
       ITAD tad = hangar[posicao];
        for (int i = posicao; i < ultimoIndex; i++){
            hangar[i] = hangar[i+1];
        }
        hangar[ultimoIndex] = null;
        ultimoIndex--;
        return tad;
    }

    @Override
        public String print()  {
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

