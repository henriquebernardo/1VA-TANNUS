package atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaDaAgua bomba = new BombaDaAgua();
        boolean executar = true;
        while (executar) {
            System.out.println("Digite uma opção");
            System.out.println("1-Ligar bomba");
            System.out.println("2-Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o tempo para bomba ligar(EM SEGUNDOS)");
                    int segundo = scanner.nextInt();
                    bomba.liga(segundo);
                    break;
                case 2:
                    executar = false;
                    break;
                    default:
                        System.out.println("Invalido");
                    break;
            }
        }
    }
}
