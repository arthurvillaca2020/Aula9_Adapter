package org.example;

public class Codigo {
    IAvaliacao avaliacao;
    CodigoAdapter codigoAdapter;

    public Codigo() {
        avaliacao = new AvaliacaoCodigo();
        codigoAdapter = new CodigoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setCodigo(conceito);
        codigoAdapter.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return codigoAdapter.recuperarCodigo();
    }

    public String getCodigo() {
        return codigoAdapter.getCodigo();
    }

}