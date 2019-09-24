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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TVTCL objTVTCL = new TVTCL(60);
        
        objTVTCL.ligar();
        System.out.print("TVTCL - modelo"+objTVTCL.MODELO+"esta ");
        
        System.out.println(objTVTCL.isLigada() ? "ligada " : " desligada ");
        
        
        System.out.println("Desligando TV modelo"+objTVTCL.MODELO);
        objTVTCL.desligar();
        
        
        
    }
    
}
