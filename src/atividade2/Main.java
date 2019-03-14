package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x[] = {"A","B","C","D","E","F","G","H","I","J"};
        Pessoa pessoa = new Pessoa("Henrique", 20, "M", x);
        boolean executar = true;
        while (executar){
            System.out.println("Selecione a opção");
            System.out.println("1-Visualizar elemento de x");
            System.out.println("2-Visualizar todos elementos de x");
            System.out.println("3-Sair da atividade");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 3:
                    executar = false;
                    break;
                case 1:
                System.out.println("Digite a posição do elemento desejado de 1 a 10: ");
                    int element= scanner.nextInt();
                    if (element > 10 || element < 1) {
                    System.out.println("Invalido");
                }       else {
                    pessoa.ElementoX(element);
                }
                    break;
                case 2:
                    pessoa.AllElementoX();
                    break;
                    default:
                        System.out.println("Opção Invalida");
                        break;
            }
        }
    }
}
