package br.inatel.c125.animais;

public class Gato extends Mamifero {

    public Gato(String nome, int idade, double peso, String sexo, String corDoPelo) {
        super(nome, idade, peso, sexo, corDoPelo);
    }

    public boolean miar() {
        System.out.println("Miau");
        return true;
    }
}
