package br.inatel.c125.pessoas;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String endereco;

    //Construtor
    public Pessoa(String nome, String telefone, String cpf, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
