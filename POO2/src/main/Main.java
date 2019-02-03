package main;

import classes.Menus;
import classes.Motor;
import classes.subclasses.Carro;
import classes.subclasses.Moto;
import classes.subclasses.Onibus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        char resposta;
        int opcao, opcaoClasse, opcaoAtributo, opcaoComando, indice, valorInt, valorIntNull = 0;      
        double valorDouble, valorDoubleNull = 0.0;
        String valorString, valorStringNull = null;
        
        Menus menu = new Menus();
        
        //Vetor de Carros
        Carro objetoCarro[] = new Carro[10]; //Polimorfismo
        for(int i = 0; i < objetoCarro.length; i++){
            objetoCarro[i] = new Carro();            
        }
        //Vetor de Motos
        Moto objetoMoto[] = new Moto[10];
        for(int i = 0; i < objetoCarro.length; i++){
            objetoMoto[i] = new Moto();
        }
        //Vetor de Onibus
        Onibus objetoOnibus[] = new Onibus[10];
        for(int i = 0; i < objetoOnibus.length; i++){
            objetoOnibus[i] = new Onibus();
        }
        
        Motor objetoMotor[] = new Motor[10];
        for(int i = 0; i < objetoOnibus.length; i++){
            objetoMotor[i] = new Motor();
        }
        
        System.out.println("Bem vindo a aplicação de veiculos!");
        System.out.println("Autores: Diogo Alexandria e Lucas Moura");
        System.out.println("\nVocê pode manipular 30 objetos das classes Carro, Moto e Onibus.");
        System.out.println("Foram instanciados 10 objetos de cada classe! ");
        
        while(true){            
            System.out.println("\nMenu:");
            System.out.println("  1 - Inserir dados\n"
                             + "  2 - Imprimir dados\n"
                             + "  3 - Alterar dados\n"
                             + "  4 - Apagar dados\n"
                             + "  5 - Cadastrar\n"
                             + "  6 - Controlar veículo\n"
                             + "  7 - Sair");
            System.out.println("Digite a opção: ");
            opcao = Integer.parseInt(t.nextLine());
            switch(opcao){
                case 1:                    
                    opcaoClasse = menu.menuClasse("inserir dados");
                    switch(opcaoClasse){
                        case 1:
                            indice = menu.mensagemResultado("Carro", "inserir dados");
                            objetoCarro[indice].entradaDados();
                            continue;
                        case 2:
                            indice = menu.mensagemResultado("Moto", "inserir dados");
                            objetoMoto[indice].entradaDados();
                            continue;
                        case 3:
                            indice = menu.mensagemResultado("Onibus", "inserir dados");
                            objetoOnibus[indice].entradaDados();
                            continue;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Você digitou uma opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    opcaoClasse = menu.menuClasse("imprimir dados");
                    switch(opcaoClasse){
                        case 1:
                            indice = menu.mensagemResultado("Carro", "imprimir dados");
                            objetoCarro[indice].imprimir();
                            continue;
                        case 2:
                            indice = menu.mensagemResultado("Moto", "imprimir dados");
                            objetoMoto[indice].imprimir();
                            continue;
                        case 3:
                            indice = menu.mensagemResultado("Onibus", "imprimir dados");
                            objetoOnibus[indice].imprimir();
                            continue;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Você digitou uma opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    opcaoClasse = menu.menuClasse("alterar dados");
                    switch(opcaoClasse){
                        case 1:
                            opcaoAtributo = menu.menuAtributo("Carro");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual o novo valor do número de passageiros: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoCarro[indice].setNumeroPassageiros(valorInt);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getNumeroPassageiros());
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual o novo valor do preço do veículo: ");
                                    valorDouble = Integer.parseInt(t.nextLine());
                                    objetoCarro[indice].setPreco(valorDouble);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getPreco());
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual novo valor da marca do veículo: ");
                                    valorString = t.nextLine();
                                    objetoCarro[indice].setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getMarca());
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual novo valor da placa do veículo: ");
                                    valorString = t.nextLine();
                                    objetoCarro[indice].setPlaca(valorString);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getPlaca());
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual novo valor do proprietário do veículo: ");
                                    valorString = t.nextLine();
                                    objetoCarro[indice].setProprietario(valorString);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getProprietario());
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual o novo valor do volume da mala: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoCarro[indice].setVolumeMala(valorInt);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getVolumeMala());
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual novo valor do rpm máximo do motor: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoCarro[indice].getMotor().setRpmMaximo(valorInt);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getMotor().getRpmMaximo());
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual nova marca do motor: ");
                                    valorString = t.nextLine();
                                    objetoCarro[indice].getMotor().setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getMotor().getMarca());
                                    continue;
                                case 9:
                                    indice = menu.mensagemResultado("Carro", "alterar dado");
                                    System.out.println("Qual nova tipo de combustível do motor: ");
                                    valorString = t.nextLine();
                                    objetoCarro[indice].getMotor().setTipoCombustivel(valorString);
                                    System.out.println("Novo valor: " + objetoCarro[indice].getMotor().getTipoCombustivel());
                                    continue;
                                case 10:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                            break;
                        case 2:
                            opcaoAtributo = menu.menuAtributo("Moto");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual o novo valor do número de passageiros: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoMoto[indice].setNumeroPassageiros(valorInt);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getNumeroPassageiros());
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual o novo valor do preço do veículo: ");
                                    valorDouble = Double.parseDouble(t.nextLine());
                                    objetoMoto[indice].setPreco(valorDouble);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getPreco());
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual novo valor da marca do veículo: ");
                                    valorString = t.nextLine();
                                    objetoMoto[indice].setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getMarca());
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual novo valor da placa do veículo: ");
                                    valorString = t.nextLine();
                                    objetoMoto[indice].setPlaca(valorString);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getPlaca());
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual novo valor do proprietário do veículo: ");
                                    valorString = t.nextLine();
                                    objetoMoto[indice].setProprietario(valorString);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getProprietario());
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual o novo valor do volume do bagageiro: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoMoto[indice].setVolumeBagageiro(valorInt);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getVolumeBagageiro());
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual novo valor do rpm máximo do motor: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoMoto[indice].getMotor().setRpmMaximo(valorInt);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getMotor().getRpmMaximo());
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual nova marca do motor: ");
                                    valorString = t.nextLine();
                                    objetoMoto[indice].getMotor().setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getMotor().getMarca());
                                    continue;
                                case 9:
                                    indice = menu.mensagemResultado("Moto", "alterar dado");
                                    System.out.println("Qual nova tipo de combustível do motor: ");
                                    valorString = t.nextLine();
                                    objetoMoto[indice].getMotor().setTipoCombustivel(valorString);
                                    System.out.println("Novo valor: " + objetoMoto[indice].getMotor().getTipoCombustivel());
                                    continue;
                                case 10:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                            break;
                        case 3:
                            opcaoAtributo = menu.menuAtributo("Onibus");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual o novo valor do número de passageiros: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoOnibus[indice].setNumeroPassageiros(valorInt);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getNumeroPassageiros());
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual o novo valor do preço do veículo: ");
                                    valorDouble = Integer.parseInt(t.nextLine());
                                    objetoOnibus[indice].setPreco(valorDouble);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getPreco());
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual novo valor da marca do veículo: ");
                                    valorString = t.nextLine();
                                    objetoOnibus[indice].setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getMarca());
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual novo valor da placa do veículo: ");
                                    valorString = t.nextLine();
                                    objetoOnibus[indice].setPlaca(valorString);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getPlaca());
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual novo valor do proprietário do veículo: ");
                                    valorString = t.nextLine();
                                    objetoOnibus[indice].setProprietario(valorString);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getProprietario());
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual novo valor do rpm máximo do motor: ");
                                    valorInt = Integer.parseInt(t.nextLine());
                                    objetoOnibus[indice].getMotor().setRpmMaximo(valorInt);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getMotor().getRpmMaximo());
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual nova marca do motor: ");
                                    valorString = t.nextLine();
                                    objetoOnibus[indice].getMotor().setMarca(valorString);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getMotor().getMarca());
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Onibus", "alterar dado");
                                    System.out.println("Qual nova tipo de combustível do motor: ");
                                    valorString = t.nextLine();
                                    objetoOnibus[indice].getMotor().setTipoCombustivel(valorString);
                                    System.out.println("Novo valor: " + objetoOnibus[indice].getMotor().getTipoCombustivel());
                                    continue;
                                case 9:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Você digitou uma opção inválida!");
                            break;
                    }
                    break;
                case 4:
                    opcaoClasse = menu.menuClasse("apagar dados");
                    switch(opcaoClasse){
                        case 1:
                            opcaoAtributo = menu.menuAtributo("Carro");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].setNumeroPassageiros(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].setPreco(valorDoubleNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].setPlaca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].setProprietario(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoCarro[indice].setVolumeMala(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].getMotor().setRpmMaximo(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].getMotor().setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 9:
                                    indice = menu.mensagemResultado("Carro", "apagar dado");
                                    objetoCarro[indice].getMotor().setTipoCombustivel(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 10:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                            break;
                        case 2:
                            opcaoAtributo = menu.menuAtributo("Moto");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setNumeroPassageiros(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setPreco(valorDoubleNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setPlaca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setProprietario(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].setVolumeBagageiro(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].getMotor().setRpmMaximo(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].getMotor().setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 9:
                                    indice = menu.mensagemResultado("Moto", "apagar dado");
                                    objetoMoto[indice].getMotor().setTipoCombustivel(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 10:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                            break;
                        case 3:
                            opcaoAtributo = menu.menuAtributo("Onibus");
                            switch(opcaoAtributo){
                                case 1:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].setNumeroPassageiros(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].setPreco(valorDoubleNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 4:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].setPlaca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 5:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].setProprietario(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 6:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].getMotor().setRpmMaximo(valorIntNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 7:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].getMotor().setMarca(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 8:
                                    indice = menu.mensagemResultado("Onibus", "apagar dado");
                                    objetoOnibus[indice].getMotor().setTipoCombustivel(valorStringNull);
                                    System.out.println("Valor apagado!");
                                    continue;
                                case 9:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;
                            }
                        }
                            break;
                        case 5:
                            opcaoClasse = menu.menuClasse("cadastrar");
                            switch(opcaoClasse){
                                case 1:
                                    while(true){
                                        indice = menu.mensagemResultado("Carro", "cadastrar");
                                        System.out.println("Cadastre a marca: ");                                    
                                        String marca = t.nextLine();
                                        System.out.println("Cadastre o proprietário: ");
                                        String proprietario = t.nextLine();
                                        System.out.println("Cadastre a placa: ");
                                        String placa = t.nextLine();
                                        System.out.println("Cadastre a preçoo: ");
                                        double preco = Double.parseDouble(t.nextLine());
                                        System.out.println("Cadastre o número de passageiros: ");
                                        int numeroPassageiros = Integer.parseInt(t.nextLine());
                                        System.out.println("Cadastre o motor: ");
                                        Motor motor = new Motor();
                                        motor.entradaDados();
                                        System.out.println("Cadastre o volume da mala: ");
                                        int volumeMala = Integer.parseInt(t.nextLine());
                                        System.out.println("Esses são os valores inseridos:"
                                                + "\n  - Número de passageiros: " + numeroPassageiros 
                                                + "\n  - Preço: " + preco
                                                + "\n  - Motor:"
                                                + "\n      - Rpm: " + motor.getRpm()
                                                + "\n      - Rpm Máximo: " + motor.getRpmMaximo()
                                                + "\n      - Marca: " + motor.getMarca()
                                                + "\n      - Tipo de combustível: " + motor.getTipoCombustivel()
                                                + "\n  - Marca: " + marca
                                                + "\n  - Placa: " + placa
                                                + "\n  - Proprietário: " + proprietario
                                                + "\n  - Volume da mala: " + volumeMala
                                        );
                                        System.out.println("Deseja confirmar o cadastramento? (y/n)");
                                        resposta = t.nextLine().charAt(0);
                                        if(resposta == 'y'){
                                            objetoCarro[indice].cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario, volumeMala);
                                            break;
                                        } else if(resposta == 'n'){
                                            System.out.println("Deseja fazer de novo? (y/n)");
                                            resposta = t.nextLine().charAt(0);
                                             if(resposta == 'y'){
                                             }
                                             else if(resposta == 'n'){
                                                 break;
                                             } else {
                                                 System.out.println("Você digitou uma opção inválida!");
                                             }                                             
                                        } else {
                                            System.out.println("Você digitou uma opção inválida!");
                                        }                  
                                    }                                    
                                    continue;
                                case 2:
                                    while(true){
                                        indice = menu.mensagemResultado("Moto", "cadastrar");
                                        System.out.println("Cadastre a marca: ");                                    
                                        String marca = t.nextLine();
                                        System.out.println("Cadsatre o proprietário: ");
                                        String proprietario = t.nextLine();
                                        System.out.println("Cadastre a placa: ");
                                        String placa = t.nextLine();
                                        System.out.println("Cadastre a preço: ");
                                        double preco = Double.parseDouble(t.nextLine());
                                        System.out.println("Cadastre o número de passageiros: ");
                                        int numeroPassageiros = Integer.parseInt(t.nextLine());
                                        System.out.println("Cadastre o motor: ");
                                        Motor motor = new Motor();
                                        motor.entradaDados();
                                        System.out.println("Cadastre o volume da mala: ");
                                        int volumeBagageiro = Integer.parseInt(t.nextLine());
                                        System.out.println("Esses são os valores inseridos:"
                                                + "\n  - Número de passageiros: " + numeroPassageiros 
                                                + "\n  - Preço: " + preco
                                                + "\n  - Motor:"
                                                + "\n      - Rpm: " + motor.getRpm()
                                                + "\n      - Rpm Máximo: " + motor.getRpmMaximo()
                                                + "\n      - Marca: " + motor.getMarca()
                                                + "\n      - Tipo de combustível: " + motor.getTipoCombustivel()
                                                + "\n  - Marca: " + marca
                                                + "\n  - Placa: " + placa
                                                + "\n  - Proprietário: " + proprietario
                                                + "\n  - Volume da mala: " + volumeBagageiro
                                        );
                                        System.out.println("Deseja confirmar o cadastramento? (y/n)");
                                        resposta = t.nextLine().charAt(0);
                                        if(resposta == 'y'){
                                            objetoMoto[indice].cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario, volumeBagageiro);
                                            break;
                                        } else if(resposta == 'n'){
                                            System.out.println("Deseja fazer de novo? (y/n)");
                                            resposta = t.nextLine().charAt(0);
                                             if(resposta == 'y'){
                                             }
                                             else if(resposta == 'n'){
                                                 break;
                                             } else {
                                                 System.out.println("Você digitou uma opção inválida!");
                                             }                                             
                                        } else {
                                            System.out.println("Você digitou uma opção inválida!");
                                        }                  
                                    }                                    
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Onibus", "cadastrar");
                                    System.out.println("Cadastre a marca: ");                                    
                                    String marca = t.nextLine();
                                    System.out.println("Cadsatre o proprietário: ");
                                    String proprietario = t.nextLine();
                                    System.out.println("Cadastre a placa: ");
                                    String placa = t.nextLine();
                                    System.out.println("Cadastre a preço: ");
                                    double preco = Double.parseDouble(t.nextLine());
                                    System.out.println("Cadastre o número de passageiros: ");
                                    int numeroPassageiros = Integer.parseInt(t.nextLine());
                                    System.out.println("Cadastre o motor: ");
                                    Motor motor = new Motor();
                                    motor.entradaDados();
                                    System.out.println("Cadastre o volume da mala: ");
                                    int volumeBagageiro = Integer.parseInt(t.nextLine());
                                    System.out.println("Esses são os valores inseridos:"
                                                + "\n  - Número de passageiros: " + numeroPassageiros 
                                                + "\n  - Preço: " + preco
                                                + "\n  - Motor:"
                                                + "\n      - Rpm: " + motor.getRpm()
                                                + "\n      - Rpm Máximo: " + motor.getRpmMaximo()
                                                + "\n      - Marca: " + motor.getMarca()
                                                + "\n      - Tipo de combustível: " + motor.getTipoCombustivel()
                                                + "\n  - Marca: " + marca
                                                + "\n  - Placa: " + placa
                                                + "\n  - Proprietário: " + proprietario
                                                + "\n  - Volume da mala: " + volumeBagageiro
                                                );
                                    System.out.println("Deseja confirmar o cadastramento? (y/n)");
                                    resposta = t.nextLine().charAt(0);
                                    if(resposta == 'y'){
                                        objetoOnibus[indice].cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario);
                                        break;
                                    } else if(resposta == 'n'){
                                        System.out.println("Deseja fazer de novo? (y/n)");
                                        resposta = t.nextLine().charAt(0);
                                        if(resposta == 'y'){
                                        } else if(resposta == 'n'){
                                            break;
                                        } else {
                                            System.out.println("Você digitou uma opção inválida!");
                                        }                                             
                                    } else {
                                        System.out.println("Você digitou uma opção inválida!");
                                    }
                                continue;
                                case 4:
                                    indice = menu.mensagemResultado("Motor", "cadastrar");
                                    System.out.println("Digite a rotação por minuto (rpm): ");
                                    int rpm = Integer.parseInt(t.nextLine());
                                    System.out.println("Digite a rotação por minuto máxima (rpm max): ");
                                    int rpmMaximo = Integer.parseInt(t.nextLine());
                                    System.out.println("Digite a marca do motor: ");
                                    String marcaMotor = t.nextLine();
                                    System.out.println("Digite o tipo de combustivel: ");
                                    String tipoCombustivel = t.nextLine();
                                    System.out.println("Esses são os valores inseridos:"
                                                + "\n  - Rpm: " + rpm
                                                + "\n  - Rpm Máximo: " + rpmMaximo
                                                + "\n  - Marca do motor: " + marcaMotor
                                                + "\n  - Tipo de combustível compatível: " + tipoCombustivel
                                                );
                                    System.out.println("Deseja confirmar o cadastramento? (y/n)");
                                    resposta = t.nextLine().charAt(0);
                                    if(resposta == 'y'){
                                        objetoMotor[indice].cadastrar(rpm, rpmMaximo, marcaMotor, tipoCombustivel);
                                        break;
                                    } else if(resposta == 'n'){
                                        System.out.println("Deseja fazer de novo? (y/n)");
                                        resposta = t.nextLine().charAt(0);
                                        if(resposta == 'y'){
                                        } else if(resposta == 'n'){
                                            break;
                                        } else {
                                            System.out.println("Você digitou uma opção inválida!");
                                        }                                             
                                    } else {
                                        System.out.println("Você digitou uma opção inválida!");
                                    }
                                continue;
                                case 5:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Você digitou uma opção inválida!");
                                    break;                                  
                               }                                    
                               break;
                        case 6:
                            opcaoClasse = menu.menuClasse("controlar veículo");
                            switch(opcaoClasse){
                                case 1:
                                    indice = menu.mensagemResultado("Carro", "controlar veículo");
                                    while(true){
                                        opcaoComando = menu.menuControle("Carro");
                                        switch(opcaoComando){
                                            case 1:
                                                objetoCarro[indice].acelerar(indice);
                                                continue;
                                            case 2:
                                                objetoCarro[indice].desacelerar(indice);
                                                continue;
                                            case 3:
                                                objetoCarro[indice].frear(indice);
                                                continue;
                                            case 4: 
                                                objetoCarro[indice].virarDireita(indice);
                                                continue;
                                            case 5:
                                                objetoCarro[indice].virarEsquerda(indice);
                                                continue;
                                            case 6: 
                                                System.out.println("Saindo...");
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    continue;
                                case 2:
                                    indice = menu.mensagemResultado("Moto", "controlar veículo");
                                    while(true){
                                        opcaoComando = menu.menuControle("Moto");
                                        switch(opcaoComando){
                                            case 1:
                                                objetoMoto[indice].acelerar(indice);
                                                continue;
                                            case 2:
                                                objetoMoto[indice].desacelerar(indice);
                                                continue;
                                            case 3:
                                                objetoMoto[indice].frear(indice);
                                                continue;
                                            case 4: 
                                                objetoMoto[indice].virarDireita(indice);
                                                continue;
                                            case 5:
                                                objetoMoto[indice].virarEsquerda(indice);
                                                continue;
                                            case 6: 
                                                System.out.println("Saindo...");
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    continue;
                                case 3:
                                    indice = menu.mensagemResultado("Onibus", "controlar veículo");
                                    while(true){
                                        opcaoComando = menu.menuControle("Onibus");
                                        switch(opcaoComando){
                                            case 1:
                                                objetoOnibus[indice].acelerar(indice);
                                                continue;
                                            case 2:
                                                objetoOnibus[indice].desacelerar(indice);
                                                continue;
                                            case 3:
                                                objetoOnibus[indice].frear(indice);
                                                continue;
                                            case 4: 
                                                objetoOnibus[indice].virarDireita(indice);
                                                continue;
                                            case 5:
                                                objetoOnibus[indice].virarEsquerda(indice);
                                                continue;
                                            case 6: 
                                                System.out.println("Saindo...");
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    continue;
                                case 4:
                                    System.out.println("Saindo...");
                                    break;
                            }
                            break;
                        case 7:
                            System.out.println("Até mais! Obrigado!");
                            break;
            }
            break;                       
        }
    }        
}

