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
    public Connection getConexion() {

        return this.conexion;

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
                        "(Nombre_Equipo, Descripcion, Num_Existencia, Tipo, Precio, ER)" +
                        "values ('" + mEquipo.getNombreE()+ "'," +
                        "'" + mEquipo.getDescripcion() + "'," +
                        "'" + mEquipo.getNumExist() + "'," +
                        "'" + mEquipo.getTipo() + "'," +
                        "'" + mEquipo.getNumExist() + "'," +
                        "'" + mEquipo.getER() +"');");
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
                        "(Nombre, Domicilio, Telefono)" +
                        "values (" +
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
                        "(Fecha, Hora, Lugar, Duracion, PrecioTotal)" +
                        "values ('" + mContrat.getFecha()+ "'," +
                        "'" + mContrat.getHora() + "'," +
                        "'" + mContrat.getLugar() + "'," +
                        "'" + mContrat.getDuracion() + "'," +
                        mContrat.getPrecioTotal() + ");");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean modificarER(Equipo mEquipo, Equipo nEquipo){
        Statement consulta;
        
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Equipo set " + 
                        "ER = " + nEquipo.getER() + "," +
                        "Num_Existencia = " + (mEquipo.getNumExist() - nEquipo.getER()) +
                        " where id_Equipo= '" + mEquipo.getId_Equipo() + "';");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean modificarEquipo(Equipo mEquipo, Equipo nEquipo) {
        Statement consulta;
        
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Equipo set " + 
                        "Nombre_Equipo = '" + nEquipo.getNombreE() + "'," +
                        "Num_Existencia = " + nEquipo.getNumExist() + "," +
                        "ER = " + nEquipo.getNumExist() + "," +
                        "Precio = " + nEquipo.getPrecio() +
                        " where id_Equipo= '" + mEquipo.getId_Equipo() + "';");
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
            resultado = consulta.executeQuery("select * from Equipo order by id_Equipo");
            while (resultado.next()) {
                mEquipo = new Equipo();
                mEquipo.setId_Equipo(resultado.getString("id_Equipo"));
                mEquipo.setNombreE(resultado.getString("Nombre_Equipo"));
                mEquipo.setDescripcion(resultado.getString("Descripcion"));
                mEquipo.setNumExist(resultado.getInt("Num_Existencia"));
                mEquipo.setTipo(resultado.getString("Tipo"));
                mEquipo.setPrecio(resultado.getInt("Precio"));
                EquipoArray.add(mEquipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return EquipoArray;        
    }
    
    public ArrayList consultarCliente() {
        Client mCliente = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList ClienteArray = new ArrayList();
        
        try {
            
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Cliente order by Nombre");
            while (resultado.next()) {
                mCliente = new Client();
                mCliente.setIdC(resultado.getString("id_Cliente"));
                mCliente.setNombreC(resultado.getString("Nombre"));
                mCliente.setTelefonoC(resultado.getString("Telefono"));
                ClienteArray.add(mCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        return ClienteArray;        
    }
}
