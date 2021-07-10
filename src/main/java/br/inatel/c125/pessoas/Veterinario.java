package br.inatel.c125.pessoas;

import br.inatel.c125.animais.Animal;

public class Veterinario extends Pessoa{
    private String especialidade;

    //Construtor
    public Veterinario(String nome, String telefone, String cpf, String endereco, String especialidade) {
        super(nome, telefone, cpf, endereco);
        this.especialidade = especialidade;
    }

    //Getters
    public String getEspecialidade() {
        return especialidade;
    }
    
    public boolean atende(Animal animal) {
        
        System.out.println(animal.getNome() + " está se consultando com " + this.getNome());
        return true;
    }

    public boolean fazCirurgia(Animal animal) {
        
        System.out.println(this.getNome() + " está fazendo uma cirurgia em " + animal.getNome());
        return true;
    }
}