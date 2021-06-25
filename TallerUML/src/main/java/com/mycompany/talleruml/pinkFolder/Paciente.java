/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.pinkFolder;

//Imports
import java.util.Date;
import com.mycompany.talleruml.blueFolder.Cita;
import java.util.ArrayList;
/**
 *
 * @author erisi
 */
public class Paciente extends Persona{
    protected String email;
    protected ArrayList<Cita> citas;
    public Paciente(String usuario,String clave, String nombre,String apellido,String cedula,String direccion, Date fechNac,String email){
        //Creacion del constructor
        super(usuario,clave, nombre,apellido,cedula,direccion,fechNac);
        this.email=email;
        this.citas=new ArrayList<>();
    }
    
    public boolean solicitarCita(){
        return true;
    }
}
