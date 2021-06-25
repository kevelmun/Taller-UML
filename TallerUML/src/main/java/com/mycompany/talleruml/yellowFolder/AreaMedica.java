/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.yellowFolder;

import com.mycompany.talleruml.pinkFolder.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Elix
 */
public class AreaMedica {
    protected String especialidad;
    protected float costo;
    protected ArrayList<Doctor> doctores;
    
    public AreaMedica(String especialidad, float costo){
        this.especialidad=especialidad;
        this.costo=costo;
        doctores = new ArrayList<>();
    }
}
