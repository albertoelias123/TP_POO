/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class Cliente {
    private int cod;
    private String cpf; // -> Unique na Lista
    private String nome;
    private String email; // -> Unique na Lista
    private String senha;
    private ArrayList<Endereco> enderecos; // A lista dde Enderecos é cadastrada depois de cadastrar o Cliente, por meio de metodo especifico

    public Cliente(int cod, String cpf, String nome, String email, String senha) {
        this.cod = cod;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.enderecos = new ArrayList();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) throws Exception {
        if(cod > 0)
            this.cod = cod;
        else
            throw new Exception("Codigo Inválido! O Codigo deve ser maior que 0.", new Throwable(String.valueOf(cod)));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if((cpf.length() == 14) && (cpf.charAt(3) == '.') && (cpf.charAt(7) == '.') && (cpf.charAt(11) == '-'))
            this.cpf = cpf;
        else
            throw new Exception("CPF Inválido! O CPF deve seguir o seguinte formato \"XXX.XXX.XXX-XX\" .", new Throwable(cpf));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() > 5 && nome.length() < 100)
            this.nome = nome;
        else
            throw new Exception("Nome Inválido! O Nome deve possuir mais de 5 caracteres e menos de 100", new Throwable(nome));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email.length() > 5 && email.contains("@"))
            this.email = email;
        else
            throw new Exception("Email Inválido! O email deve possuir mais de 5 caracteres e deve possuir @", new Throwable(email));
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha.length() > 8){
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();
            this.senha = senha;
        }else
            throw new Exception("Senha Inválida! A senha deve possuir mais de 8 caracteres", new Throwable(senha));
    }

    public ArrayList<Endereco> getEnderecos() { // Implementar To String para o Array
        return enderecos;
    }

    public void setEnderecos(Endereco endereco) {
        this.enderecos.add(endereco);
    }
    
}
