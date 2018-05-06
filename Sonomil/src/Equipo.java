/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manzana
 */
public class Equipo {
    String Id_Equipo, NombreE, Descripcion, Tipo;
    int NumExist, Precio, NumS;

    public Equipo() {
        Id_Equipo = "";
        NombreE = "";
        Descripcion = "";
        Tipo = "";
        NumExist = 0;
        Precio = 0;
        NumS = 0;
    }

    public int getNumS() {
        return NumS;
    }

    public void setNumS(int NumS) {
        this.NumS = NumS;
    }

    public String getId_Equipo() {
        return Id_Equipo;
    }

    public void setId_Equipo(String Id_Equipo) {
        this.Id_Equipo = Id_Equipo;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getNumExist() {
        return NumExist;
    }

    public void setNumExist(int NumExist) {
        this.NumExist = NumExist;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
}
