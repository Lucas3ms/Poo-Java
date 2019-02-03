package classes;

import classes.interfaces.MetodosObrigatorios;
import java.util.Scanner;

public abstract class Veiculos implements MetodosObrigatorios{
    Scanner t = new Scanner (System.in);
    private int numeroPassageiros;    
    private double preco;
    private Motor motor = new Motor();    
    private String marca;
    private String placa;
    private String proprietario;
  
    //Setters
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    protected void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    //Getters
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public double getPreco() {
        return preco;
    }
    public Motor getMotor() {
        return motor;
    }
    public String getMarca() {
        return marca;
    }
    public String getPlaca() {
        return placa;
    }
    public String getProprietario() {
        return proprietario;
    }
    //Construtores
    protected Veiculos(){}
    protected Veiculos(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    protected Veiculos(double preco) {
        this.preco = preco;
    }
    protected Veiculos(String marca) {
        this.marca = marca;
    }
    protected Veiculos(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }
    protected Veiculos(int numeroPassageiros, double preco) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }
    protected Veiculos(int numeroPassageiros, String marca) {
        this.numeroPassageiros = numeroPassageiros;
        this.marca = marca;
    }
    protected Veiculos(int numeroPassageiros, double preco, String marca) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.marca = marca;
    }
    protected Veiculos(int numeroPassageiros, double preco, String marca, String proprietario) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.marca = marca;
        this.proprietario = proprietario;
    }
    protected Veiculos(int numeroPassageiros, double preco, String marca, String placa, String proprietario) {
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
        this.marca = marca;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public void cadastrar(int numeroPassageiros,
                          double preco,
                          Motor motor,
                          String marca,
                          String placa,
                          String proprietario) {
        setNumeroPassageiros(numeroPassageiros);
        setPreco(preco);
        setMotor(motor);
        setMarca(marca);
        setPlaca(placa);
        setProprietario(proprietario);       
    }
    
    @Override
    public void entradaDados(){
        System.out.println("Digite a marca: ");
        setMarca(t.nextLine());
        System.out.println("Digite o proprietário: ");
        setProprietario(t.nextLine());
        System.out.println("Digite a placa: ");
        setPlaca(t.nextLine());
        System.out.println("Digite a preço: ");
        setPreco(Double.parseDouble(t.nextLine()));
        System.out.println("Digite o número de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(t.nextLine()));
        System.out.println("Insira o motor: ");
        motor.entradaDados();
    }
    @Override
    public void imprimir(){
        System.out.println("Marca do veículo: "+ this.marca);       
        System.out.println("Proprietário do veículo: " + this.proprietario);        
        System.out.println("Placa do veículo: " + this.placa);       
        System.out.println("Preço do veículo: " + this.preco);        
        System.out.println("Número máximo de passageiros: " + this.numeroPassageiros);        
        char condicao;
        while(true){
            System.out.println("Deseja imprimir as informações completas do motor? (y/n)");
            condicao = t.nextLine().charAt(0);
            switch (condicao) {
                case 'y':
                    System.out.println("Informações do motor:");
                    motor.imprimir();
                    break;
                case 'n':
                    System.out.println("Marca do motor: " + this.motor.getMarca());
                    break;
                default:
                    System.out.println("Você digitou uma resposta inválida! Tente de novo.");
                    continue;
            }
            break;
        }        
    }    
}
