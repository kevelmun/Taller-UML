/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talleruml.blueFolder;

import java.util.ArrayList;

/**
 *
 * @author Lolo
 */
public class HistoriaClinica {
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;

    public HistoriaClinica(int nro, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }

}
