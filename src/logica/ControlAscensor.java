/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ascensor;
import modelo.Interrupcion;
import vista.Vista;

/**
 *
 * @author Jekse
 * 
 */
public final class ControlAscensor{
    private Ascensor ascensor=new Ascensor();    
    private Vista v;
    private final Solicitar sol;
    
    Thread hilo1;
    Thread hilo2;
    Thread hilo3;
    Thread hilo4;    
    
    /**
    *@param v
    */
    
    public ControlAscensor(Vista v) {
        this.v=v;
        this.v.jpbAscensor.setValue(ascensor.getPisoActual());
        sol=new Solicitar(v,ascensor);
        hilo1=new Thread(sol);
        /*hilo2=new Thread(sol);
        hilo3=new Thread(sol);
        hilo4=new Thread(sol);*/
    }    
    
    
    public Ascensor getAscensor(){
       return ascensor;
    }
    
    public void llamarAscensor(int piso){
        try{
            if(!hilo1.isAlive()){
                hilo1=new Thread(sol);            
                sol.llamado=piso;            
                hilo1.start();
            }else{
                int diferencia=piso-ascensor.getPisoActual();
                if(diferencia<0) diferencia=diferencia*-1;
                sol.llamado=piso;
                try {
                    
                    hilo2.join(diferencia*300);
                    hilo2.start();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ControlAscensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("oki");
            }
        }catch(IllegalThreadStateException exc){
            System.out.println("Calma we");
        }
    }    
}
