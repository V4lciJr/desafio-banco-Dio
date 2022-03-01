package models;

public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 100;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.saldo = 0.0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
           this.saldo -= valor;
        }else{
            System.out.println("Você não possui saldo suficiente para saque.\nSaldo: " + this.saldo);
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso!!\nSaldo Atual: " + this.saldo);
        }
        else{
            System.out.println("Você digitou um valor inválido, por favor digite uma quantia maior que 0.");
        }
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
