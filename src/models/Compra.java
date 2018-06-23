package models;

import dao.InformaQuantidade;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<Produto> produtoList;
    private List<InformaQuantidade> informaQuantidades = new ArrayList<>();
    private double valor;
    private double taxaFrete;

    public Compra(Cliente cliente, List<Produto> produtoList) {
        this.cliente = cliente;
        this.produtoList = produtoList;
        setValores();
    }

    private void setValores(){
        for(Produto produto : produtoList){
            informaQuantidades.add(new InformaQuantidade(produto,3));
        }
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public List<InformaQuantidade> getInformaQuantidades() {
        return informaQuantidades;
    }
}
