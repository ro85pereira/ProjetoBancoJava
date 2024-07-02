/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiocontajava;

/**
 *
 * @author note
 */
public interface OperacoesContas {
    void sacar(double valor);
    void saldo();
    void depositar(int conta,double valor);
    void transferir(double valor, int contaDestino);
}
