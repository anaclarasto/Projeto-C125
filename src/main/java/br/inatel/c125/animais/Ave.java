package br.inatel.c125.animais;

public class Ave extends Animal {
    private String especie;
    private String corDaPena;

    //Construtor
    public Ave(String nome, int idade, double peso, String sexo, String especie, String corDaPena) {
        super(nome, idade, peso, sexo);
        this.especie = especie;
        this.corDaPena = corDaPena;
    }
    
    public boolean voar() {
        System.out.println(this.getNome() + "está voando");
        return true;
    }
    
    //Getters
    public String getEspecie() {
        return this.especie;
    }

    public String getCorDaPena() {
    	return this.corDaPena;
    }
    
    
}
