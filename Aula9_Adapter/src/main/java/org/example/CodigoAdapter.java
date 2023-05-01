package org.example;

public class CodigoAdapter extends AvaliacaoCodigo {

    private IAvaliacao avaliacaoCodigo;

    public CodigoAdapter(IAvaliacao avaliacaoCodigo) {
        this.avaliacaoCodigo = avaliacaoCodigo;
    }

    public String recuperarCodigo() {
        if (this.getCodigo() == ".-")
            avaliacaoCodigo.setCodigo("A");
        else
        if (this.getCodigo() == "-...")
            avaliacaoCodigo.setCodigo("B");
        else
        if (this.getCodigo() == "-.-.")
            avaliacaoCodigo.setCodigo("C");
        else
        if (this.getCodigo() == "-..")
            avaliacaoCodigo.setCodigo("D");
        return avaliacaoCodigo.getCodigo();
    }

    public void salvarAvaliacao() {
        if (avaliacaoCodigo.getCodigo().equals("A"))
            this.setCodigo(".-");
        else
        if (avaliacaoCodigo.getCodigo().equals("B"))
            this.setCodigo("-...");
        else
        if (avaliacaoCodigo.getCodigo().equals("C"))
            this.setCodigo("-.-.");
        else
            this.setCodigo("-..");
    }
}