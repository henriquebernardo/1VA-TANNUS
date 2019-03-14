package atividade3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int num = scanner.nextInt();
        ContaCorrente conta = new ContaCorrente(num);
        boolean executar = true;
        while (executar) {
            System.out.println("Numero da conta:" + conta.getNum());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Selecione uma opção");
            System.out.println("1-Deposito");
            System.out.println("2-Saque");
            System.out.println("3-Sair");
            int op = scanner.nextInt();
            switch (op) {
                case 3:
                    executar = false;
                    break;
                case 1:
                    System.out.println("Digite o valor do deposito");
                    double valorID = scanner.nextDouble();
                    conta.deposito(valorID);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saqueID = scanner.nextDouble();
                    conta.saque(saqueID);
                    break;
                    default:
                        System.out.println("Opção Invalida");
                        break;
            }
        }
    }
}
