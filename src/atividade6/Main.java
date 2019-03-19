package atividade6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        CentraDeControle central = new CentraDeControle();
        central.menu(ler);
    }
}
