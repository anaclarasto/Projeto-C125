package br.inatel.c125.animais;

public class Mamifero extends Animal {
    private String corDoPelo;

    //Construtor
    public Mamifero(String nome, int idade, double peso, String sexo, String corDoPelo) {
        super(nome, idade, peso, sexo);
        this.corDoPelo = corDoPelo;
    }

    //Getter
    public String getCorDoPelo() {
        return this.corDoPelo;
    }
}