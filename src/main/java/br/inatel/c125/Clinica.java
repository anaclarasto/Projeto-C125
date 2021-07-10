package br.inatel.c125;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.inatel.c125.animais.*;
import br.inatel.c125.pessoas.*;

public class Clinica {

    static ArrayList<Cliente> clientes = new ArrayList();
    static ArrayList<Veterinario> vets = new ArrayList();

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int op = -1;

        while (op != 0) {
            while (op < 0 || op > 5) {
                System.out.println("\n\n**************************************");
                System.out.println("\tMenu da Clinica:");
                System.out.println("0 - Sair do sistema");
                System.out.println("1 - Adicionar veterinario");
                System.out.println("2 - Adicionar cliente");
                System.out.println("3 - Adicionar animal de cliente");
                System.out.println("4 - Iniciar cirurgia");
                System.out.println("5 - Mostrar dados");
                System.out.println("**************************************\n");

                op = leitor.nextInt();

                switch (op) {
                	case 0:
                		System.out.println("\nEncerrando ações do sistema");
                		System.out.println("**************************************\n");
                		System.exit(0);
                    case 1:
                        vets.add(Clinica.addVet());
                        break;
                    case 2:
                        clientes.add(Clinica.addCliente());
                        break;
                    case 3:
                        Clinica.addAnimalToCliente();
                        break;
                    case 4:
                        Clinica.iniciarCirurgia();
                        break;
                    
                    case 5:
                        Clinica.showDataBase();
                        break;
                    default:
                        break;
                }

                System.out.println("\nAção executada. Voltando ao menu.");
                if (op != 0) {
                    op = -1;
                }
            }

        }

    }

    public static Veterinario addVet() {

        String nome, telefone, cpf, endereco, especialidade;

        System.out.println("\n\n\n\n**************************************");
        System.out.println("\tAdicionar Veterinario:");
        System.out.println("Preecha os campos abaixo");
        System.out.print("Nome: ");
        leitor.nextLine();
        nome = leitor.nextLine();
        System.out.print("Telefone: ");
        telefone = leitor.nextLine();
        System.out.print("CPF: ");
        cpf = leitor.nextLine();
        System.out.print("Endereco: ");
        endereco = leitor.nextLine();
        System.out.print("Especialidade: ");
        especialidade = leitor.nextLine();
        
        System.out.println("\nVeterinario "+nome+" cadastrado com sucesso!");
        return new Veterinario(nome, telefone, cpf, endereco, especialidade);
    }

    public static Cliente addCliente() {
        String nome, telefone, cpf, endereco;

        System.out.println("\n\n\n\n**************************************");
        System.out.println("\tAdicionar Cliente:");
        System.out.println("Preecha os campos abaixo");
        System.out.print("Nome: ");
        leitor.nextLine();
        nome = leitor.nextLine();
        System.out.print("Telefone: ");
        telefone = leitor.nextLine();
        System.out.print("CPF: ");
        cpf = leitor.nextLine();
        System.out.print("Endereco: ");
        endereco = leitor.nextLine();

        System.out.println("\nCliente "+nome+" cadastrado com sucesso!");
        return new Cliente(nome, telefone, cpf, endereco);
    }

    public static int getIndexOfCliente(String nome) {

        for (Cliente cli : clientes) {
            if (cli.getNome().equals(nome)) {
                return clientes.indexOf(cli);
            }
        }

        return -1;
    }

    public static int addAnimalToCliente() {

        String nomecli;
        int indexCli;
        int op = -1;

        String nome, sexo, corDoPelo, raca, corDaPena, especie;
        int idade;
        double peso;

        System.out.println("\n\n\n\n**************************************");
        System.out.println("\tAdicionar Animal:");
        System.out.println("Preecha os campos abaixo");
        System.out.println("Nome do Cliente: ");
        leitor.nextLine();
        nomecli = leitor.nextLine();

        indexCli = getIndexOfCliente(nomecli);

        if (indexCli < 0) {
            System.out.println("Cliente não existe. Reiniciando");
            return 0;
        }

        while (op < 1 || op > 3) {
            System.out.println("Qual tipo de animal:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Ave");

            op = leitor.nextInt();

            switch (op) {
                case 1:
                    
                    System.out.println("Preecha infos do cachorro:");          
                    leitor.nextLine();
                    System.out.print("Peso: ");
                    peso = Double.parseDouble(leitor.nextLine());   
                    System.out.print("Nome: ");
                    nome = leitor.nextLine();
                    System.out.print("Sexo: ");
                    sexo = leitor.nextLine();
                    System.out.print("Cor do Pelo: ");
                    corDoPelo = leitor.nextLine();
                    System.out.print("Raca: ");
                    raca = leitor.nextLine();
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();

                    clientes.get(indexCli).addAnimal(new Cachorro(nome, idade, peso, sexo, corDoPelo, raca));
                    System.out.println("\nCachorro "+nome+ " cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Preecha infos do gato:");
                    
                    leitor.nextLine();
                    System.out.print("Peso: ");
                    peso = Double.parseDouble(leitor.nextLine());
                    System.out.print("Nome: ");
                    nome = leitor.nextLine();
                    System.out.print("Sexo: ");
                    sexo = leitor.nextLine();
                    System.out.print("Cor do Pelo: ");
                    corDoPelo = leitor.nextLine();
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();

                    clientes.get(indexCli).addAnimal(new Gato(nome, idade, peso, sexo, corDoPelo));
                    System.out.println("\nGato "+nome+ " cadastrado com sucesso!");
                    
                    break;
                case 3:
                    System.out.println("Preecha infos do passaro:");
                    
                    leitor.nextLine();
                    System.out.print("Peso: ");
                    peso = Double.parseDouble(leitor.nextLine());
                    System.out.print("Nome: ");
                    nome = leitor.nextLine();
                    System.out.print("Sexo: ");
                    sexo = leitor.nextLine();
                    System.out.print("Cor da pena: ");
                    corDaPena = leitor.nextLine();
                    System.out.print("Especie: ");
                    especie = leitor.nextLine();
                    System.out.print("Idade: ");
                    idade = leitor.nextInt();

                    clientes.get(indexCli).addAnimal(new Ave(nome, idade, peso, sexo, especie, corDaPena));
                    System.out.println("\nPassaro "+nome+" cadastrado com sucesso!");
                    
                    break;
                default:
                    break;
            }
        }

        return 0;
    }
    
    public static int getIndexOfVeterinario(String nome) {
        
        for (Veterinario vet: vets) {
            if (vet.getNome().equals(nome)) {
                return vets.indexOf(vet);
            }
        }
        
        return -1;
    }

    public static int getIndexOfAnimal(String nome, int indexOfCli) {
        
        for (Animal anim: clientes.get(indexOfCli).getAnimais()) {
            if (anim.getNome().equals(nome)) {
                return clientes.get(indexOfCli).getAnimais().indexOf(anim);
            }
        }
        
        return -1;
    }
        
    public static int iniciarCirurgia() {
        
        int indexVet, indexCli, indexAnimal;
        String nomeVet, nomeCli, nomeAnimal;
        
        System.out.println("\n\n\n\n**************************************");
        System.out.println("\tDados da cirurgia:");
        System.out.println("Preecha os campos abaixo");
        leitor.nextLine();
        System.out.print("Nome do veterinario: ");
        nomeVet = leitor.nextLine();
        
        indexVet = getIndexOfVeterinario(nomeVet);

        if (indexVet < 0) {
            System.out.println("Veterinario não existe. Reiniciando");
            return 0;
        }
        
        System.out.println("Nome do Cliente: ");
        nomeCli = leitor.nextLine();
        
        indexCli = getIndexOfCliente(nomeCli);

        if (indexCli < 0) {
            System.out.println("Cliente não existe. Reiniciando");
            return 0;
        }
        
        System.out.println("Nome do Animal: ");
        nomeAnimal = leitor.nextLine();
        
        indexAnimal = getIndexOfAnimal(nomeAnimal, indexCli);
        
        if (indexAnimal < 0) {
            System.out.println("Animal não existe. Reiniciando");
            return 0;
        }
        
        
        if(vets.get(indexVet).fazCirurgia(clientes.get(indexCli).getAnimais().get(indexAnimal))){
            System.out.println("Deu tudo certo");
        }
        
        return 0;
    }
    
    public static void showDataBase() {
        
        System.out.println("\n\n\n\n**************************************");
        System.out.println("\tVeterinarios:");
        
        vets.forEach(vet -> {
            System.out.println(vet.getNome() + " -- especialista em " + vet.getEspecialidade());
        });
        
        System.out.println("\n**************************************");
        System.out.println("\tClientes e seus pets:");
        
        clientes.forEach(cli -> {
            System.out.print(cli.getNome());
            
            cli.getAnimais().forEach(anim -> {
                System.out.println(" --> " + anim.getNome());
            });
            
        });
        
    }
}