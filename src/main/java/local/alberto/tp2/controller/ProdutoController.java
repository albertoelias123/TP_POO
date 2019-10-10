/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.controller;

import java.util.ArrayList;
import local.alberto.tp2.model.Produto;

/**
 *
 * @author alber
 */
public class ProdutoController {
    
    private static ArrayList<Produto> produtosVendidos;
            
    public static void inicializa(){
        produtosVendidos = new ArrayList();
    }
    
    public static void cadastrarProduto(int id, String descricao, int qtdEstoque, String categoria, double preco, String nome) throws Exception{
        Produto produtoAdd = new Produto(id, descricao, qtdEstoque, categoria, preco, nome);
        produtosVendidos.add(produtoAdd);
    }
    
    public static ArrayList<Produto> getAllProduto()throws Exception{
        return produtosVendidos;
    }
    
}
