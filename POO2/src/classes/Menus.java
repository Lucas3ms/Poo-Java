package classes;

import java.util.Scanner;

public class Menus {
    Scanner t = new Scanner(System.in);
    public int menuClasse(String opcao){
        if("cadastrar".equals(opcao)){
            System.out.println("\nOpção " + opcao + " ecolhida!");
        System.out.println("  1 - Carro\n"
                         + "  2 - Moto\n"
                         + "  3 - Onibus\n"
                         + "  4 - Motor\n"
                         + "  4 - Sair");
        System.out.println("Qual classe?");
        }
        System.out.println("\nOpção " + opcao + " ecolhida!");
        System.out.println("  1 - Carro\n"
                         + "  2 - Moto\n"
                         + "  3 - Onibus\n"
                         + "  4 - Sair");
        System.out.println("Qual classe?");
        return Integer.parseInt(t.nextLine());
    }
    
    public int menuAtributo(String tipo){
        if("Carro".equals(tipo)){
            System.out.println("\nClasse " + tipo + " ecolhida!");
            System.out.println("  1 - Número de passageiros\n"
                             + "  2 - Preço do veículo\n"
                             + "  3 - Marca do veícculo\n"
                             + "  4 - Placa do veículo\n"
                             + "  5 - Proprietário do veículo\n"
                             + "  6 - Volume da mala\n"
                             + "  7 - Rpm máximo do motor\n"
                             + "  8 - Marca do motor\n"
                             + "  9 - Tipo do combustível compatível pelo motor\n"
                             + "  10 - Sair");
            System.out.println("Qual atributo?");
        } else if("Moto".equals(tipo)) {
            System.out.println("\nClasse " + tipo + " ecolhida!");
            System.out.println("  1 - Número de passageiros\n"
                             + "  2 - Preço do veículo\n"
                             + "  3 - Marca do veícculo\n"
                             + "  4 - Placa do veículo\n"
                             + "  5 - Proprietário do veículo\n"
                             + "  6 - Volume da mala\n"
                             + "  7 - Rpm máximo do motor\n"
                             + "  8 - Marca do motor\n"
                             + "  9 - Tipo do combustível compatível pelo motor\n"
                             + "  10 - Sair");
            System.out.println("Qual atributo?");
        } else {
            System.out.println("\nClasse " + tipo + " ecolhida!");
            System.out.println("  1 - Número de passageiros\n"
                             + "  2 - Preço do veículo\n"
                             + "  3 - Marca do veícculo\n"
                             + "  4 - Placa do veículo\n"
                             + "  5 - Proprietário do veículo\n"
                             + "  6 - Rpm máximo do motor\n"
                             + "  7 - Marca do motor\n"
                             + "  8 - Tipo do combustível compatível pelo motor\n"
                             + "  9 - Sair");
            System.out.println("Qual atributo?");
        }
        
        return Integer.parseInt(t.nextLine());
    }
    
    public int menuControle(String tipo){
        System.out.println("\nClasse " + tipo + " ecolhida!");
            System.out.println("  1 - Acelerar\n"
                             + "  2 - Desacelerar\n"
                             + "  3 - Frear\n"
                             + "  4 - Virar a direita\n"
                             + "  5 - Virar a esquerda\n"
                             + "  6 - Sair");
            System.out.println("Qual comando?");
        return Integer.parseInt(t.nextLine()); 
    }
    
    public int mensagemResultado(String tipo, String metodo){
        int indice;
        System.out.println("Lembre-se que os arrays começa com 0!");
        for(;;){
            try{
                System.out.println("Qual objeto da classe " + tipo + " você deseja " + metodo +"? ");                           
                indice = Integer.parseInt(t.nextLine());
                break;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Mensagem de erro: " + e.getMessage());
            }
        }
        System.out.println("Ok! Vamos " + metodo + " do objeto " + indice);
        return indice;
    }
    
    
    
    
    
    
}
