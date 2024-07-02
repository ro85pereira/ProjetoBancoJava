/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiocontajava;

/**
 *
 * @author note
 */
public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia,int conta,double saldo){
        super.agencia = agencia;
        super.conta= conta;
        super.saldo= saldo;
        System.out.println(this.agencia + this.conta+ this.saldo);
    }
   
    
    
}
