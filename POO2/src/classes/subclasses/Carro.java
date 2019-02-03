package classes.subclasses;

import classes.Motor;
import classes.Veiculos;
import classes.interfaces.Interface;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Carro extends Veiculos implements Interface{
    Scanner t = new Scanner (System.in);
    private int volumeMala;    
    //Get
    public int getVolumeMala() {
        return volumeMala;
    }
    //Set
    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }
    //Construtores
    public Carro(){}
    public Carro(int volumeMala) {
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros) {
        super(numeroPassageiros);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, double preco) {
        super(preco);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, String marca, String placa) {
        super(marca, placa);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros, double preco) {
        super(numeroPassageiros, preco);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros, String marca) {
        super(numeroPassageiros, marca);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros, double preco, String marca) {
        super(numeroPassageiros, preco, marca);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros, double preco, String marca, String proprietario) {
        super(numeroPassageiros, preco, marca, proprietario);
        this.volumeMala = volumeMala;
    }
    public Carro(int volumeMala, int numeroPassageiros, double preco, String marca, String placa, String proprietario) {
        super(numeroPassageiros, preco, marca, placa, proprietario);
        this.volumeMala = volumeMala;
    }
        
    public void cadastrar(int numeroPassageiros,
                          double preco,
                          Motor motor,
                          String marca,
                          String placa,
                          String proprietario,
                          int volumeMala) {
        super.cadastrar(numeroPassageiros, preco, motor, marca, placa, proprietario);
        setVolumeMala(volumeMala);
    }

    @Override
    public void entradaDados() {
        for(;;){
            try{
                super.entradaDados();
                System.out.println("Digite o volume da mala: ");
                setVolumeMala(Integer.parseInt(t.nextLine())); 
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
        System.out.println("Volume da mala: " + this.volumeMala);
        
    }

    @Override
    public void acelerar(int indice) {
        int rpm = this.getMotor().getRpm();
        int rpmMax = this.getMotor().getRpmMaximo();

        if((rpm + 100) > rpmMax){
            this.getMotor().setRpm(rpm + 100);
            System.out.println("Carro acelerou para : " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor do carro " + indice + " não consegue mais acelerar!");
        }        
    }

    @Override
    public void desacelerar(int indice) {
        int rpm = this.getMotor().getRpm();
        int rpmMax = this.getMotor().getRpmMaximo();
        if(rpm - 100 <= 0){
            this.getMotor().setRpm(rpm - 100);
            System.out.println("Carro desacelerou para : " + this.getMotor().getRpm());
        } else {
            System.out.println("O motor do carro " + indice + " não consegue mais desacelerar!");
        }
    }

    @Override
    public void frear(int indice) {
        System.out.println("Carro " + indice + " freando");
    }

    @Override
    public void virarDireita(int indice) {
        System.out.println("Carro " + indice + " virando a direita");
    }

    @Override
    public void virarEsquerda(int indice) {
        System.out.println("Carro " + indice + " virando a esquerda");
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
