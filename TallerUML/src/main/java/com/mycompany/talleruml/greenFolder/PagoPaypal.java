/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.greenFolder;



/**
 *
 * @author Elix
 */
public class PagoPaypal implements Pago {
    protected float monto;
    protected String email;
    @Override
    public boolean realizarPago(float monto) {
       return true;
    }
    
}
