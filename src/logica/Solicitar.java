/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Ascensor;
import vista.Vista;

/**
 *
 * @author Jekse
 */
public class Solicitar implements Runnable{
    private Vista v;
    private Ascensor asc;
    public int llamado;
    
    
    public Solicitar(Vista v,Ascensor asc){
        this.v=v;
        this.asc=asc;
    }
    
    @Override
    public void run() {
        if(asc.getPisoActual()<llamado){
            for(int i=asc.getPisoActual();i<=llamado;i++){
                try{
                    Thread.sleep(300);
                }catch(InterruptedException exc){
                    System.out.println("que no we");
                }
                asc.setPisoActual(i);
                v.jpbAscensor.setValue(i);
            }
            
        }else{
            if(asc.getPisoActual()>llamado){
                for(int i=asc.getPisoActual();i>=llamado;i--){
                    try{
                        Thread.sleep(300);
                    }catch(InterruptedException exc){}
                    asc.setPisoActual(i);
                    v.jpbAscensor.setValue(i);
                }
                
            }else{
                
            }
        
        }   
    }
}
