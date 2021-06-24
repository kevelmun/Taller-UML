/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.blueFolder;
import com.mycompany.talleruml.greenFolder.Pago;
import java.util.Date;

/**
 *
 * @author Lolo
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public static void realizarPago(Pago p){
        System.out.println("Aqui va el codigo");
    } 
    
    
    @Override
    public String toString() {
        return "Cita{" + "fecha=" + fecha + ", pagada=" + pagada + ", registradoPor=" + registradoPor + '}';
    }
    
    
}
