package pilha.estatica;

import TAD.ITAD;

public class Amadeu implements ITrabalho05 {

    private ITAD[] hangar;
    private int tamanho;
    private int ultimoEntrar;

    @Override
    public String getEstudante() {
        return "Amadeu";
    }

    @Override
    public ITAD[] criaLista(int tamanho) {
        hangar = new ITAD[tamanho];
        this.tamanho = tamanho;
        ultimoEntrar = -1;
        return hangar;
    }

    @Override
    public int getQuantidade() {
        return ultimoEntrar + 1;
    }

    @Override
    public void push(ITAD tad) {
        if (ultimoEntrar +1 >= tamanho) return;
        ultimoEntrar++;
        hangar[ultimoEntrar] = tad;
    }

    @Override
    public ITAD pop() {
        if (ultimoEntrar < 0) return null;
        ITAD retorno = hangar[ultimoEntrar];
        hangar[ultimoEntrar] = null;
        ultimoEntrar--;
        return retorno;
    }

    @Override
    public ITAD consulta() {
        return hangar[ultimoEntrar];
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
