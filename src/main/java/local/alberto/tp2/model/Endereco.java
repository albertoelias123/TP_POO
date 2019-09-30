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
public class Endereco {
    private String rua;
    private int num;
    private String bairro;
    private String cidade;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if(rua.length() > 5 && rua.length() < 100)
            this.rua = rua;
        else
            throw new Exception("Rua Inválida! A rua deve possuir mais de 5 caracteres e menos que 100.", new Throwable(rua));
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) throws Exception {
        if(num > 0 && num <10000)
           this.num = num;
        else
            throw new Exception("Número Inválido! O Número deve ser maior que 0 e menos que 10.000 .", new Throwable(String.valueOf(num)));
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if(bairro.length() > 5 && bairro.length() < 100)
            this.bairro = bairro;
        else
            throw new Exception("Bairro Inválido! O Bairro deve possuir mais de 5 caracteres e menos de 100.", new Throwable(bairro));
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if(cidade.length() > 5 && cidade.length() < 100)
            this.cidade = cidade;
        else
            throw new Exception("Cidade Inválida! A Cidade deve possuir mais de 5 caracteres e menos de 100.", new Throwable(cidade));
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if(estado.length() == 2)
            this.estado = estado;
        else
            throw new Exception("Estado Inválido! O Estado deve possuir 2 Caracteres (SIGLA).", new Throwable(estado));
    }
    
}
