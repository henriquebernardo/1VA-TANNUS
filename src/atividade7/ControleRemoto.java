package atividade7;

import java.util.Scanner;

public class ControleRemoto {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        Televisao tv = new Televisao();
        boolean executar = true;
        while (executar) {
            System.out.println("Menu");
            System.out.println("1-Volume + ");
            System.out.println("2- Volume - ");
            System.out.println("3-Mudar canal +");
            System.out.println("4-Mudar canal -");
            System.out.println("5-Escolher canal");
            System.out.println("6-Mostrar canal e volume");
            System.out.println("7-Sair");
            switch (scanner.nextInt()) {
                case 1:
                    this.AumentaVolume(tv);
                    break;
                case 2:
                    this.DiminuiVolume(tv);
                    break;
                case 3:
                    this.Canalmais(tv);
                    break;
                case 4:
                    this.Canalmenos(tv);
                    break;
                case 5:
                    System.out.println("Digite numero do canal desejado");
                    this.MudarCanal(tv, scanner.nextInt());
                    break;
                case 6:
                    this.DescricaoTv(tv);
                    break;
                case 7:
                    executar = false;
                    break;
            }
        }
    }
    private void AumentaVolume(Televisao tv) {
        if (tv.volume < 50)
            tv.volume = tv.volume + 1;
    }
    private void DiminuiVolume(Televisao tv) {
        if (tv.volume > 0)
            tv.volume = tv.volume - 1;
    }
    private void Canalmenos(Televisao tv) {
        tv.canal = tv.canal - 1 ;
    }

    private void Canalmais(Televisao tv) {
        tv.canal = tv.canal + 1 ;
    }

    private void MudarCanal(Televisao tv, int CanalNovo) {
        tv.canal = CanalNovo ;
    }

    private void DescricaoTv(Televisao tv) {
        System.out.println("Canal: " + tv.canal);
        System.out.println("Volume: " + tv.volume);
    }
}
