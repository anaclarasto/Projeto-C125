package br.inatel.c125.animais;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected double peso;
    protected boolean sexo; //false = masculino, true = feminino
    
    //Construtor
    public Animal(String nome, int idade, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        if("Masculino".equals(sexo) || "masculino".equals(sexo)) {
            this.sexo = false;
        } else if ("Feminino".equals(sexo) || "feminino".equals(sexo) ) {
            this.sexo = true;
        }
    }
    
    public boolean dormir() { 
        System.out.println(this.nome + " está dormindo");
        return true;
    }

    public boolean comer() {
        System.out.println(this.nome + " está comendo");
        return true;
    }
    
    //Getters
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
    	return this.idade;
    }
    
    public double getPeso() {
    	return this.peso;
    }
    
    public String getSexo() {
    	if (this.sexo) {
            return "Feminino";
        } else {
            return "Masculino";
        }
    }
}
