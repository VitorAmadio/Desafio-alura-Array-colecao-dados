package br.com.deafio.alura.classes;

public class Compra {
    private String produto;
    private double valor;

    public Compra(String descicao, double valor) {
        this.produto = descicao;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  "Produto: " + produto + ", valor: R$ " + valor;
    }
}
