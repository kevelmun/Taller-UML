/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.pinkFolder;

import com.mycompany.talleruml.yellowFolder.AreaMedica;
import java.util.Date;

/**
 *
 * @author erisi
 */
public class Doctor extends Persona{
    //declaracion de variables de la clase
    protected String especialidad;
    protected int regDoctor;
    protected AreaMedica area;
    protected Secretaria secretaria;
    public Doctor(String usuario,String clave, String nombre,String apellido,String cedula,String direccion, Date fechNac, int regDoctor,String especialidad){
        //Creacion del constructor
        super(usuario,clave, nombre,apellido,cedula,direccion,fechNac);
        this.especialidad=especialidad;
        this.regDoctor=regDoctor;
    }
    
    public void recetar(){
    }
    
    public void agendarPlanNut(){
        //Agregar plan nutricional
    }
    public void imprimirReceta(){
    }
    public void registraSecretaria(){
    }
}
