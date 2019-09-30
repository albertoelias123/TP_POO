/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.model;

/**
 *
 * @author alber
 */
public class Produto {
    private int id;
    private String descricao;
    private int qtdEstoque;
    private String categoria;
    private double preco;
    private String nome; // (Tipo)

    public Produto(int id, String descricao, int qtdEstoque, String categoria, double preco, String nome) throws Exception {
        this.setId(id);
        this.setDescricao(descricao);
        this.setQtdEstoque(qtdEstoque);
        this.setCategoria(categoria);
        this.setPreco(preco);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id>=1)
            this.id = id;
        else
            throw new Exception("ID Inválido! O ID deve ser maior ou igual a 1.", new Throwable(String.valueOf(id)));
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws Exception{
        if(descricao.length() >= 5)
            this.descricao = descricao;
        else
            throw new Exception("Descrição Inválida! A Descrição deve possui no minimo 5 caracteres.", new Throwable(descricao));
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) throws Exception {
        if(qtdEstoque >= 0)
            this.qtdEstoque = qtdEstoque;
        else
            throw new Exception("Quantidade em Estoque Inválida! A quantidade em estoque deve ser maior ou igual a 0.", new Throwable(String.valueOf(qtdEstoque)));
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws Exception {
        if(categoria.length() >= 5)
            this.categoria = categoria;
        else
            throw new Exception("Categoria Inválida! A Categoria deve possui no minímo 5 caracteres.", new Throwable(categoria));
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        if(preco > 0)
            this.preco = preco;
        else
            throw new Exception("Preço Inválido! O Preço deve ser maior que 0.", new Throwable(String.valueOf(preco)));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() >= 5)
            this.nome = nome;
        else
            throw new Exception("Nome Inválido! O nome deve possuir 5 ou mais caracteres no minímo.", new Throwable(nome));
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", qtdEstoque=" + qtdEstoque + ", categoria=" + categoria + ", preco=" + preco + ", nome=" + nome + '}';
    }
    
    
}
