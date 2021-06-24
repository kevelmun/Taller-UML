/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.pinkFolder;

//imports
import java.util.Date;

/**
 *
 * @author erisi
 */
public class Administrador extends Persona{
    public Administrador(String usuario,String clave, String nombre,String apellido,String cedula,String direccion, Date fechNac){
        //creacion del constructor
        super(usuario,clave, nombre,apellido,cedula,direccion,fechNac);
    }
    
    public void registrarUsuario(){
    }
    
    public void asignarRol(Persona asignado){
    }
    
}
