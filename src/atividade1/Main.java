package atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = {0, 0, 0, 0};
        System.out.printf("Digite o nome do Aluno: ");
        String nome = scanner.next();
        System.out.printf("Digite a sala do Aluno: ");
        String sala = scanner.next();
        System.out.printf("Digite a 1 nota do Aluno: ");
        notas[0] = scanner.nextDouble();
        System.out.printf("Digite a 2 nota do Aluno: ");
        notas[1] = scanner.nextDouble();
        System.out.printf("Digite a 3 nota do Aluno: ");
        notas[2] = scanner.nextDouble();
        System.out.printf("Digite a 4 nota do Aluno: ");
        notas[3] = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, notas, sala);

        System.out.println("---------------------");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sala: " + aluno.getSala());
        System.out.println("Média: " + aluno.getMedia());
    }
}
