package classes.subclasses;

import classes.*;
import classes.interfaces.Interface;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Onibus extends Veiculos implements Interface{
    Scanner sc = new Scanner (System.in);
    private String motorista;
    
    //Set
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }
    //Get
    public String getMotorista() {
        return motorista;
    }
    //Construtores    
    public Onibus(){}
    public Onibus(String motorista) {
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros) {
        super(numeroPassageiros);
        this.motorista = motorista;
    }
    public Onibus(String motorista, double preco) {
        super(preco);
        this.motorista = motorista;
    }
    public Onibus(String motorista, String marca, String placa) {
        super(marca, placa);
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros, double preco) {
        super(numeroPassageiros, preco);
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros, String marca) {
        super(numeroPassageiros, marca);
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros, double preco, String marca) {
        super(numeroPassageiros, preco, marca);
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros, double preco, String marca, String proprietario) {
        super(numeroPassageiros, preco, marca, proprietario);
        this.motorista = motorista;
    }
    public Onibus(String motorista, int numeroPassageiros, double preco, String marca, String placa, String proprietario) {
        super(numeroPassageiros, preco, marca, placa, proprietario);
        this.motorista = motorista;
    }
    
    
    @Override
    public void cadastrar(int numeroPassageiros, double preco, Motor motor, String marca, String placa, String proprietario) {
        super.cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario);
        setMotorista(motorista);
    }

    @Override
    public void entradaDados() {
        for(;;){
            try{
                super.entradaDados();
                System.out.println("Digite o nome do motorista: ");
                setMotorista(sc.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Mensagem de erro: " + e.getMessage());
            }
        }
    }

    @Override
    public void imprimir() {
        this.getIDADEMINIMA();
        this.getTEMPOMAXUSO();
        super.imprimir();
        System.out.println("Motorista: " + getMotorista()); 
        
    }
    
    @Override
    public void getIDADEMINIMA() {
        System.out.println("Idade mínima: " + IDADEMINIMA + " anos");
    }

    @Override
    public void getTEMPOMAXUSO() {
        System.out.println("Tempo max de uso: " + TEMPOMAXUSO + " minutos"); 
    }
    
    @Override
    public void acelerar(int indice) {
        if(this.getMotor().getRpm() + 50 > this.getMotor().getRpmMaximo()){
            this.getMotor().setRpm(this.getMotor().getRpm() + 50);
            System.out.println("Onibus acelerou para : " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor do ônibus " + indice + " não consegue mais acelerar!");
        }        
    }

    @Override
    public void desacelerar(int indice) {
        if(this.getMotor().getRpm() - 50 <= 0){
            this.getMotor().setRpm(this.getMotor().getRpm() - 50);
            System.out.println("Onibus desacelerou para : " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor do ônibus " + indice + " não consegue mais desacelerar!");
        }
    }

    @Override
    public void frear(int indice) {
        System.out.println("Ônibus " + indice + " freando!");
    }

    @Override
    public void virarDireita(int indice) {
        System.out.println("Ônibus " + indice + " virando a direita.");
    }

    @Override
    public void virarEsquerda(int indice) {
        System.out.println("Ônibus " + indice + " virando a esquerda.");
    }
}
