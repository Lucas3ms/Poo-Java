package classes;

import classes.interfaces.MetodosObrigatorios;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Motor implements MetodosObrigatorios{
    Scanner t = new Scanner(System.in);
    private int rpm;
    private int rpmMaximo;
    private String marca;
    private String tipoCombustivel;
    
    //Setters
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public void setRpmMaximo(int rpmMaximo) {
        this.rpmMaximo = rpmMaximo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }    
    //Getters
    public int getRpm() {
        return rpm;
    }
    public int getRpmMaximo() {
        return rpmMaximo;
    }
    public String getMarca() {
        return marca;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    //Construtores

    public Motor() {
    }
    public Motor(int rpm) {
        this.rpm = rpm;
    }
    public Motor(String marca) {
        this.marca = marca;
    }
    public Motor(int rpm, int rpmMaximo) {
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
    }
    public Motor(int rpm, String marca) {
        this.rpm = rpm;
        this.marca = marca;
    }
    public Motor(String marca, String tipoCombustivel) {
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
    }
    public Motor(int rpm, int rpmMaximo, String marca) {
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
        this.marca = marca;
    }
    public Motor(int rpm, String marca, String tipoCombustivel) {
        this.rpm = rpm;
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
    }
    public Motor(int rpm, int rpmMaximo, String marca, String tipoCombustivel) {
        this.rpm = rpm;
        this.rpmMaximo = rpmMaximo;
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void cadastrar(int rpm, int rpmMaximo, String Marca, String tipoCombustivel){
        setRpm(rpm);
        setRpmMaximo(rpmMaximo);
        setMarca(Marca);
        setTipoCombustivel(tipoCombustivel);
    }
    @Override
    public void entradaDados() {     
        try{
            System.out.println("Digite a rotação por minuto (rpm): ");
            setRpm(Integer.parseInt(t.nextLine()));
            System.out.println("Digite a rotação por minuto máxima (rpm max): ");
            setRpmMaximo(Integer.parseInt(t.nextLine()));
            System.out.println("Digite a marca do motor: ");
            setMarca(t.nextLine());
            System.out.println("Digite o tipo de combustível: ");
            setMarca(t.nextLine()); 
        }catch(InputMismatchException e){
            System.out.println("Mensagem de erro: " + e.getMessage());
        }
    }
    
    @Override
    public void imprimir() {
        System.out.println("  Rotações por minuto: " + this.rpm);
        System.out.println("  Número máximo de rotações por minuto: " + this.rpmMaximo);
        System.out.println("  Marca do motor: " + this.marca);
        System.out.println("  Tipo de comsbustível compatível ao motor: " + this.tipoCombustivel);
    }   
}
