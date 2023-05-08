package br.com.deafio.alura.classes;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldoCredito;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldoCredito = limite;
        this.compras = new ArrayList<>();

    }

    public boolean lancaCompra(Compra compra){
        if(this.saldoCredito >= compra.getValor()){
            this.saldoCredito -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else{
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
