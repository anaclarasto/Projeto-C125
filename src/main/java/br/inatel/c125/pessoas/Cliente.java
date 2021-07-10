package br.inatel.c125.pessoas;

import java.util.ArrayList;

import br.inatel.c125.animais.Animal;

public class Cliente extends Pessoa{
    
    ArrayList<Animal> animais = new ArrayList();
    
    public Cliente(String nome, String telefone, String cpf, String endereco) {
        super(nome, telefone, cpf, endereco);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }
    
}