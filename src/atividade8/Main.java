package atividade8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean exec = true;
        double real = 0;
        double imaginaria = 0;
        NumeroComplexo numero = new NumeroComplexo();
        while (exec) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inicializar número");
            System.out.println("2 - Somar número");
            System.out.println("3 - Subtrair número");
            System.out.println("4 - Multiplicar número");
            System.out.println("5 - Dividir número");
            System.out.println("6 - Visualizar número");
            System.out.println("7 - Visualizar igualdade");
            System.out.println("0 - Sair");
            switch (ler.nextInt()) {
                case 1:
                    System.out.printf("Digite a parte real: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária: ");
                    imaginaria = ler.nextDouble();
                    numero.inicializaNumero(real, imaginaria);
                    System.out.println("Número inicializado com sucesso!");
                    break;
                case 2:
                    System.out.printf("Digite a parte real do numero a ser somado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser somado: ");
                    imaginaria = ler.nextDouble();
                    numero.somar(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número somado com sucesso!");
                    break;
                case 3:
                    System.out.printf("Digite a parte real do numero a ser subtraido: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser subtraido: ");
                    imaginaria = ler.nextDouble();
                    numero.subtrair(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número subtraido com sucesso!");
                    break;
                case 4:
                    System.out.printf("Digite a parte real do numero a ser multiplicado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser multiplicado: ");
                    imaginaria = ler.nextDouble();
                    numero.multiplica(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número multiplicado com sucesso!");
                    break;
                case 5:
                    System.out.printf("Digite a parte real do numero a ser dividido: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser dividido: ");
                    imaginaria = ler.nextDouble();
                    numero.dividir(new NumeroComplexo(real, imaginaria));
                    System.out.println("Número dividido com sucesso!");
                    break;
                case 6:
                    numero.imprimeNumero();
                    break;
                case 7:
                    System.out.printf("Digite a parte real do numero a verificado: ");
                    real = ler.nextDouble();
                    System.out.printf("Digite a parte imaginária do numero a ser verificado: ");
                    imaginaria = ler.nextDouble();
                    if (numero.eIgual(new NumeroComplexo(real, imaginaria))) {
                        System.out.println("Os dois números complexos são iguais!");
                    } else {
                        System.out.println("Os dois números complexos não são iguais!");
                    }
                    break;
                case 0:
                    exec = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
    }

