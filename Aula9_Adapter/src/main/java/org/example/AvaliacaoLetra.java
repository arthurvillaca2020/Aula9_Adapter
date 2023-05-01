package org.example;

public class AvaliacaoLetra implements IAvaliacao {
    private String letra;

    @Override
    public String getCodigo() {
        return this.letra;
    }

    @Override
    public void setCodigo(String letra) {
        this.letra = letra;
    }
}