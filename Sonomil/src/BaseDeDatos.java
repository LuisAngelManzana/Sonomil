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
}
