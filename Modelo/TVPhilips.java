package Modelo;


import Modelo.IControleRemoto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class TVPhilips extends TV implements IControleRemoto
{
    public final String MODELO = "PHILIPS";
    //construtor da classe
    public TVPhilips(int tamanho)
    {
        super(tamanho);
    }

    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentarVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void diminuirVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ligar() {
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean desligar() {
        super.setLigada(false);
        return false;
    }
    
}
