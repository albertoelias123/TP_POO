/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.alberto.tp2.model;

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

    
    
    
}
