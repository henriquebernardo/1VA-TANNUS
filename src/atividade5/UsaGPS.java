package atividade5;

import java.util.Scanner;

public class UsaGPS {
    public void main (Scanner teste) {
        boolean executar = true;
        Gps GPS;
        System.out.println("Deseja iniciar com idioma e rota definida?");
        System.out.println("1-Sim");
        System.out.println("2-Nao");
        if(teste.nextInt() == 1) {
            System.out.println("Escolha o idioma ");
            String idioma = teste.next();
            System.out.println("Escolha a rota");
            String rota = teste.next();
            GPS = new Gps(idioma,rota);
        } else {
            GPS = new Gps();
        }
        while (executar){
            System.out.println("Selecione uma opção");
            System.out.println("1-Escolha o idioma");
            System.out.println("2- Escolha a rota");
            System.out.println("3- Informaçõse atual do GPS");
            System.out.println("4 -Sair");
            switch (teste.nextInt()) {
                case 1:
                    System.out.println("1-Digite o idioma");
                    GPS.setIdioma(teste.next());
                    break;
                case 2:
                    System.out.println("2_Escolha a rota");
                    GPS.setRota(teste.next());
                    break;
                case 3:
                    GPS.mostrar();
                    break;
                case 4:
                    executar = false;
                    break;
            }
        }
    }
}
