package TAD;

import java.util.Random;

class Aeronave implements ITAD {
    private int id;
    private String modelo;
    private float velocidade;
    private boolean ativa;

    public Aeronave() {
        Random gerador = new Random();
        String[] modelos = {"F-39 GRIPEN E/F", "F-5M TIGER", "A-1 AMX", "A-29 SUPER TUCANO", "P-3AM ORION", "P-95 BANDEIRULHA"};
        String[] fabricantes = {"Aermachi", "Alenia", "Embraer", "SAAB", "Northrop Grumman Corporation", "Lockheed Martin"};
        id = gerador.nextInt(100000);
        modelo =String.format("%s /%s", modelos[gerador.nextInt(modelos.length)], fabricantes[gerador.nextInt(fabricantes.length)]);
        velocidade = (float) (500.00 + gerador.nextInt(1499) + gerador.nextFloat());
        ativa = gerador.nextBoolean();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
        
    }

    @Override
    public String getCampo01() {
        return this.modelo;
    }

    @Override
    public void setCampo01(String campo01) {
        this.modelo = campo01;
    }

    @Override
    public float getCampo02() {
        return this.velocidade;
    }

    @Override
    public void setCampo02(float campo02) {
        this.velocidade = campo02;      
    }

    @Override
    public boolean isCampo03() {
        return this.ativa;
    }

    @Override
    public void setCampo03(boolean campo03) {
        this.ativa = campo03;
    }

    @Override
    public String print() {
        return String.format("id: %d; \nmodelo da aeronave: %s; \nvelocidade maxima: %.2f; \nativa: %b", getId(), getCampo01(), getCampo02(), isCampo03());
    }

    @Override
    public ITAD getTAD() {
        return this;
    }

}
