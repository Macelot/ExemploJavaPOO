package br.com.empresa.exemploraissa001_poo;


public class Produto {
    String nome;
    Float preco;

    public Produto(){
        System.out.println("Produto Criado");
        this.nome = "item";
        this.preco = 0.01f;
    }


    public Produto(String nome, Float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return this.preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Produto nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Produto preco(Float preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString(){
        String resultado="";
        resultado += " nome='" + getNome() + "'";
        resultado += " preço='" + getPreco() + "'";
        return resultado;

    }


  
    



}