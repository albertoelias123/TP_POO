/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alber
 */
public class Venda {
    private Cliente cliente;
    private int enderecoCliente;
    private Date dataCompra;
    private String status; // RN -> Set só aceita -> (Pendente, Andamento, Entregue)
    private ArrayList<Produto> produtosVendidos;
    
    
}
