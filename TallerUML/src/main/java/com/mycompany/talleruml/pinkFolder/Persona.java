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
public class Persona {
    //Apartado de declaración de variables
    protected String usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    
    
    public Persona(String usuario,String clave, String nombre,String apellido,String cedula,String direccion, Date fechNac){
        //Constructor de Super Clase persona
        this.usuario =  usuario;
        this.clave =  clave;
        this.nombre =  nombre;
        this.apellido =  apellido;
        this.cedula =  cedula;
        this.direccion =  direccion;
        this.fechaNac =  fechaNac;
    }
    
    
    public boolean logIn(){
        return true;
    }
    
    public boolean logOut(){
        return false;
    }
}
