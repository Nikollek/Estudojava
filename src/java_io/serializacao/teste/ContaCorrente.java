package src.java_io.serializacao.teste;

import src.java_io.Cliente;

import java.io.Serializable;

public class ContaCorrente implements Serializable {

    private int agencia;
    private int numero;
    private double saldo;
    private transient Cliente titular;


    public ContaCorrente(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double deposita(double saldo){
        double total = this.saldo + saldo;
        return this.saldo = total;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
}
