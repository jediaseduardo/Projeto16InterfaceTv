/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aluno
 */
public interface IControleRemoto {
    // interface possui apenas a assinatura (declaração) dos 
    //metdodos e a implementação dos metodos estara
    //nas classes que assinarem contrato com a minha interface
    //obrigariatoriamente todos os metodos declarados na interface
    //deveram ser implementados nas classes que assinaram os 
    //metodos
    
    
    //metodos 
    
    public void mudarCanal(int canal);
    public void aumentarVolume(int volume);
    public void diminuirVolume(int volume);
    public boolean ligar();
    public boolean desligar();
    
}
