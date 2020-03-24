package com.example.poo2aula09032020.model;

/**
 * Produto
 */
public class Produto {

    private int id;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(int id, String nome, double valor, int estoque) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getid() + "'" +
            ", nome='" + getNome() + "'" +
            ", valor='" + getValor() + "'" +
            ", estoque='" + getEstoque() + "'" +
            "}";
    }
    
}
    
