package controllers;

import dao.Desconto;
import dao.InformaQuantidade;
import models.Compra;

public class DescontoPromocao implements Desconto {
    @Override
    public double calculaDesconto(Compra compra) {
        double valor = 0;
        for (InformaQuantidade informa : compra.getInformaQuantidades() ){
            valor += informa.getProduto().getPreço();
        }
        return valor;
    }

    public void verificaProdutos(Compra compra){
        for (InformaQuantidade informa : compra.getInformaQuantidades() ){
            if (informa.getQuantidade() == 3){
                informa.getProduto().setPreço(informa.getProduto().getPreço() * 0.6);
            }
        }
    }
}
