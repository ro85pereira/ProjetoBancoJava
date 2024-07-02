/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiocontajava;

/**
 *
 * @author note
 */
public class Conta implements OperacoesContas{
    
    public int agencia;
    public int conta;
    double saldo;
    
    
    @Override
    public void sacar(double valor) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.saldo = saldo - valor;
        System.out.println("O valor sacado foi de:  " + valor);
    }

    @Override
    public void depositar(int conta, double valor) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       saldo = saldo + valor; 
       System.out.println("O valor depositado foi  de " + valor + " na conta " + conta);
    }

    @Override
    public void saldo() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Seu saldo é " + saldo);
        System.out.println("Sua conta é " + conta);
        System.out.println("Sua agencia é " + agencia);
    }

    @Override
    public void transferir(double valor, int contaDestino) {
       this.sacar(valor);
       this.depositar(contaDestino, valor);
    }
    }


