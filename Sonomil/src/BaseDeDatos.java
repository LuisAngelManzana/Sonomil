/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Manzana
 */
public class BaseDeDatos {
    private Connection conexion;
    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/Sonomil", "root", "root");
            if (conexion != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void desconectar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public boolean guardarEquipo(Equipo mEquipo) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Equipo" + 
                        "(id_Equipo, Nombre_Equipo, Descripcion, Num_Existencia, Tipo)" +
                        "values ('" + mEquipo.getId_Equipo() + "'," +
                        "'" + mEquipo.getNombreE()+ "'," +
                        "'" + mEquipo.getDescripcion() + "'," +
                        "'" + mEquipo.getNumExist() + "'," +
                        mEquipo.getTipo() + ");");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean guardarCliente(Client mClient) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Cliente" + 
                        "(id_Cliente, Nombre, Domicilio, Telefono)" +
                        "values ('" + mClient.getIdC() + "'," +
                        "'" + mClient.getNombreC()+ "'," +
                        "'" + mClient.getDomicilioC() + "'," +
                        mClient.getTelefonoC() + ");");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean guardarContrato(Contrat mContrat) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Contrato" + 
                        "(id_Contrato, Fecha, Hora, Lugar, Duracion)" +
                        "values ('" + mContrat.getIdContrato() + "'," +
                        "'" + mContrat.getFecha()+ "'," +
                        "'" + mContrat.getHora() + "'," +
                        "'" + mContrat.getLugar() + "'," +
                        mContrat.getDuracion() + ");");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean modificarEquipo(Equipo aEquipo, Equipo nEquipo) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("update Cosmeticos set" + 
                        "Nombre_Equipo = '" + nEquipo.getNombreE() + "'," +
                        "Num_Existencia = '" + nEquipo.getNumExist() + "'," +
                        "where id_Equipo= '" + aEquipo.getId_Equipo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean eliminarEquipo(Equipo mEquipo) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from Equipo" + 
                        " where id_Equipo = '" + mEquipo.getId_Equipo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList consultarEquipo() {
        Equipo mEquipo = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList EquipoArray = new ArrayList();
        
        try {
            
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipo order by Nombre_Equipo");
            while (resultado.next()) {
                mEquipo = new Equipo();
                mEquipo.setId_Equipo(resultado.getString("id_Equipo"));
                mEquipo.setNombreE(resultado.getString("Nombre_Equipo"));
                mEquipo.setDescripcion("Descripcion");
                mEquipo.setNumExist(resultado.getInt("Num_Existencia"));
                mEquipo.setTipo(resultado.getString("Tipo"));
                EquipoArray.add(mEquipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return EquipoArray;        
    }
}
