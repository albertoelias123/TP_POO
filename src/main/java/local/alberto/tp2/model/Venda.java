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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(int enderecoCliente) throws Exception {
        if(enderecoCliente < cliente.getEnderecos().size())
            this.enderecoCliente = enderecoCliente;
        else
            throw new Exception("Endereço Inválido! O Endereço solicitado não existe no Cliente.", new Throwable(String.valueOf(enderecoCliente)));
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws Exception {
        if(status.equals("Pendente") || status.equals("Andamento") || status.equals("Entregue"))
            this.status = status;
        else
            throw new Exception("Status Inválido! O Status deve ser 'Pendente' ou 'Andamento' ou 'Entregue'.", new Throwable(String.valueOf(status)));
    }

    public ArrayList<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(Produto produtosVendidos) {
        this.produtosVendidos.add(produtosVendidos);
    }

    public Venda(Cliente cliente, int enderecoCliente, Date dataCompra, String status, ArrayList<Produto> produtosVendidos) throws Exception {
        this.setCliente(cliente);
        this.setEnderecoCliente(enderecoCliente);
        this.setDataCompra(dataCompra);
        this.setStatus(status);
        this.produtosVendidos = new ArrayList();
    }
    
    
    
    
    
    
}
