package controllers;

import dao.Desconto;
import models.Compra;

public class DescontoFidelidade implements Desconto {
    @Override
    public double calculaDesconto(Compra compra) {
        if (compra.getValor() > 99){
            return compra.getValor() * 0.95;
        }else {
            if (compra.getValor()> 999){
                return compra.getValor() * 0.90;
            }
        }
        return compra.getValor();
    }
}
