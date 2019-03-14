package atividade3;

public class ContaCorrente {
    private int num;
    private double saldo = 0;

    public ContaCorrente(int num) { this.num = num; }

    public double deposito(double valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    public double saque(double valor) {
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.printf("Saldo Insuficiente");
        }
        return this.saldo;
    }
    public int getNum (){ return num; }
    public double getSaldo() { return saldo; }
}