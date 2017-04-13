package com.example.labdesenvolvimento.chamadocondominio;

/**
 * Created by Lab. Desenvolvimento on 13/04/2017.
 */

public class Condominio {

    private long ID;
    private String morador;
    private String apartamento;
    private int bloco;

    public Condominio() {
    }

    public Condominio(long ID, String morador, String apartamento, int bloco) {
        this.ID = ID;
        this.morador = morador;
        this.apartamento = apartamento;
        this.bloco = bloco;
    }

    public String getMorador() {
        return morador;
    }

    public void setMorador(String morador) {
        this.morador = morador;
    }


    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }
}
