/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiodiocontajava;

/**
 *
 * @author note
 */
public class Banco{
        public static void main(String[] args) {
        Conta cc = new ContaCorrente(1,1,1111);
        cc.saldo();
        cc.depositar(1, 5000);
        cc.saldo();
        
        Conta cc2 = new ContaCorrente(2,2,0);
        cc2.depositar(2, 4444);
        cc2.saldo();
            
       
       
    }
}
