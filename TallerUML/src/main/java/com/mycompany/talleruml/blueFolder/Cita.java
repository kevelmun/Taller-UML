/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.blueFolder;
import com.mycompany.talleruml.greenFolder.Pago;
import com.mycompany.talleruml.pinkFolder.Paciente;
import com.mycompany.talleruml.pinkFolder.Doctor;
import java.util.Date;

/**
 *
 * @author Lolo
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }

    public static void realizarPago(Pago p){
        System.out.println("Aqui va el codigo");
    }
    
}
