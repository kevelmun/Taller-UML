/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blueFolder;

/**
 *
 * @author Lolo
 */
public class Cita {
    protected Datetime fecha;
    protected boolean pagada;
    protected String registradoPor;

    public Cita(Datetime fecha, boolean pagada, String registradoPor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
    }

    public Datetime getFecha() {
        return fecha;
    }

    public void setFecha(Datetime fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public static void realizarPago(Pago p){
    
    } 
    
    
    @Override
    public String toString() {
        return "Cita{" + "fecha=" + fecha + ", pagada=" + pagada + ", registradoPor=" + registradoPor + '}';
    }
    
    
}
