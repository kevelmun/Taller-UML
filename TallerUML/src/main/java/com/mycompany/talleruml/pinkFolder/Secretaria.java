/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.pinkFolder;


//Imports
import java.util.Date;

/**
 *
 * @author erisi
 */
public class Secretaria extends Persona{
    
    public Secretaria(String usuario,String clave, String nombre,String apellido,String cedula,String direccion, Date fechNac){
        //Creacion del constructor
        super(usuario,clave, nombre,apellido,cedula,direccion,fechNac);
    }
    
    public void verificarCita(){
    }
    
    public void agendarCita(){
    }
}
