package classes.subclasses;

import classes.Motor;
import classes.Veiculos;
import classes.interfaces.Interface;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Moto extends Veiculos implements Interface{
    Scanner t = new Scanner(System.in);
    private int volumeBagageiro;
    
    //Set
    public void setVolumeBagageiro(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }
    //Get
    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }
    //Construtores
    public Moto() {
    }
    public Moto(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, int numeroPassageiros) {
        super(numeroPassageiros);
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, double preco) {
        super(preco);
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, String marca) {
        super(marca);
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, String marca, String placa) {
        super(marca, placa);
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, int numeroPassageiros, double preco) {
        super(numeroPassageiros, preco);
        this.volumeBagageiro = volumeBagageiro;
    }
    public Moto(int volumeBagageiro, int numeroPassageiros, double preco, String marca) {
        super(numeroPassageiros, preco, marca);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int volumeBagageiro, int numeroPassageiros, double preco, String marca, String proprietario) {
        super(numeroPassageiros, preco, marca, proprietario);
        this.volumeBagageiro = volumeBagageiro;
    }

    public Moto(int numeroPassageiros, double preco, String marca, String placa, String proprietario) {
        super(numeroPassageiros, preco, marca, placa, proprietario);
    }
    
    public void cadastrar(int numeroPassageiros,
                          double preco,
                          Motor motor,
                          String marca,
                          String placa,
                          String proprietario,
                          int volumeBagageiro) {
        super.cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario);
        setVolumeBagageiro(volumeBagageiro);
    }

    @Override
    public void entradaDados() {
        for(;;) {
            try{
                super.entradaDados();
                System.out.println("Digite o volume da Mala: ");
                setVolumeBagageiro(Integer.parseInt(t.nextLine()));
                break;
            }catch(NumberFormatException e){
                System.out.println("Messagem de erro: " + e.getMessage());
            }
        }
    }

    @Override
    public void imprimir() {
        this.getIDADEMINIMA();
        this.getTEMPOMAXUSO();
        super.imprimir();
        System.out.println("Volume da Mala: " + this.volumeBagageiro); 
    }
    
    @Override    
    public void acelerar(int indice) {
        int rpm = this.getMotor().getRpm();
        int rpmMax = this.getMotor().getRpmMaximo();        
        if(rpm + 200 > rpmMax){
            this.getMotor().setRpm(rpm + 200);
            System.out.println("O motor foi acelerado!");
            System.out.println("Rpm anterior: " + rpm);
            System.out.println("Rpm atual: " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor da moto " + indice + " não consegue mais acelerar!");
        }        
    }
    @Override
    public void desacelerar(int indice) {
        int rpm = this.getMotor().getRpm();
        int rpmMax = this.getMotor().getRpmMaximo();    
        if(rpm - 100 <= 0){
            this.getMotor().setRpm(rpm - 100);
            System.out.println("O motor foi acelerado!");
            System.out.println("Rpm anterior: " + rpm);
            System.out.println("Rpm atual: " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor da moto " + indice + " não consegue mais desacelerar!");
        }
    }

    @Override
    public void frear(int indice) {
        System.out.println("Moto " + indice + " freando!");
    }

    @Override
    public void virarDireita(int indice) {
        System.out.println("Moto " + indice + " virando a direita.");
    }

    @Override
    public void virarEsquerda(int indice) {
        System.out.println("Moto " + indice + " virando a esquerda.");
    }

    @Override
    public void getIDADEMINIMA() {
        System.out.println("Idade mínima: " + IDADEMINIMA + " anos");
    }

    @Override
    public void getTEMPOMAXUSO() {
        System.out.println("Tempo max de uso: " + TEMPOMAXUSO + " minutos");
    }
    
}
