package dao;

import models.Produto;

public class InformaQuantidade {
    private Produto produto;
    private int quantidade;

    public InformaQuantidade(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
