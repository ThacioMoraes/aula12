package com.company.models;

public class Empresa {

    private String nome;
    private String cnpj;
    private Funcionario[] quadroFuncionario;

    public Empresa(String nome, String cnpj, Funcionario[] quadroFuncionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.quadroFuncionario = quadroFuncionario;
    }
}
