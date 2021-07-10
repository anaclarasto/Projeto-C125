package br.inatel.c125.animais;

public class Cachorro extends Mamifero {
    private String raca;

    //Construtores
    public Cachorro(String nome, int idade, double peso, String sexo, String corDoPelo, String raca) {
        super(nome, idade, peso, sexo, corDoPelo);
        this.raca = raca;
    }

    //Getter
    public String getRaca() {
        return this.raca;
    }

    public boolean latir() {
        System.out.println(this.nome + " está latindo");
        return true;
    }

}