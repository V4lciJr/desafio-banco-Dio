package models;

public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 1001;

    public ContaCorrente(){
        super.numero = SEQUENCIAL++;
    }

    public String toString(){
        return "Agência: " + super.agencia +
                "\nNúmero da Conta: " + super.numero +
                "\nSaldo: " + super.saldo + "\n";
    }
}
