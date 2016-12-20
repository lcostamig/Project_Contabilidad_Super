/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion_BD;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class conexion {
    Connection con = null;
    
    public Connection conexion (){
        try {
            //cargamos nuestro driver
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_contabilidad","root","");
            System.out.println("Conexion establecida");
            JOptionPane.showMessageDialog(null, "Conexion establecida correctamente");
        } catch (ClassNotFoundException | SQLException | HeadlessException e) {
            System.out.println("Error de conexion");
            JOptionPane.showMessageDialog(null, "Conexion no establecida " + e);
        }
        return con;
    }

    public Connection getConexiones(){
        return con;
    }    

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
