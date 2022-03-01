package models;

public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL = 20001;

    public ContaPoupanca(){
        super.numero = SEQUENCIAL++;
    }

    public String toString(){
        return "Agência: " + super.agencia +
                "\nNúmero da Conta: " + super.numero +
                "\nSaldo: " + super.saldo + "\n";
    }
}
