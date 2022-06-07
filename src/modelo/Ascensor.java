/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jekse
 */
public class Ascensor {
    private final int PISOMAXIMO=6;
    private final int PISOMINIMO=1;
    private final int PESOMAXIMO=600;
    private int pisoActual=1;
    private int estado=0;        

    public Ascensor() {
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public int getPisoMaximo(){
        return PISOMAXIMO;
    }
    
    public int getPisoMinimo(){
        return PISOMINIMO;
    }
    
    public int getPesoMaximo(){
        return PESOMAXIMO;
    }

    
}
