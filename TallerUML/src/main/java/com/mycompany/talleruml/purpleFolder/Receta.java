/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.purpleFolder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import com.mycompany.talleruml.pinkFolder.Paciente;
import com.mycompany.talleruml.pinkFolder.Doctor;
/**
 *
 * @author NewPc
 */
public class Receta {
    protected Paciente paciente;
    protected ArrayList<Medicamento> litaMedicamentos;
    protected LocalDateTime fecha;

    public Receta(Paciente paciente, LocalDateTime fecha) {
        this.paciente = paciente;
        this.litaMedicamentos = new ArrayList<>();
        this.fecha = fecha;
    }

    public ArrayList<Medicamento> getLitaMedicamentos() {
        return litaMedicamentos;
    }
    
    
}
