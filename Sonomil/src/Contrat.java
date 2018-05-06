/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manzana
 */
public class Contrat {
    String IdContrato, Hora, Lugar, Duracion, Fecha;
    int PrecioTotal;

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public Contrat() {
        IdContrato = "";
        Hora = "";
        Lugar = "";
        Duracion = "";
        Fecha = "";
        PrecioTotal = 0;
    }

    public String getIdContrato() {
        return IdContrato;
    }

    public void setIdContrato(String IdContrato) {
        this.IdContrato = IdContrato;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
