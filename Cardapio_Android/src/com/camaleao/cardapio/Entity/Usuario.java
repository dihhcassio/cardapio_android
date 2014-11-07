package com.camaleao.cardapio.Entity;

import java.util.List;

/**
 * Created by Adriano on 28/10/2014.
 */
public class Usuario {

    private int id;

    private String nome;

    private String login;

    private String senha;

    private List<Contato> contatos;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
}
