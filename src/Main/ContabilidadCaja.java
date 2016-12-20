/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Conexion_BD.conexion;
import Inicio_Menu.InterfaceInicioPrograma;
import OperacionesContabilidad.Operaciones;
import java.sql.Connection;

/**
 *
 * @author luis
 */
public class ContabilidadCaja {   
    private conexion con;
    private Connection reg;
    private Operaciones opi;
    
    public ContabilidadCaja() {
        con = new conexion();        
        con.conexion();
        reg = con.getConexiones();
        opi = new Operaciones(reg);
    }

    public conexion getCon() {
        return con;
    }

    public void setCon(conexion con) {
        this.con = con;
    }

    public Operaciones getOpi() {
        return opi;
    }

    public void setOpi(Operaciones opi) {
        this.opi = opi;
    }

    public Connection getReg() {
        return reg;
    }

    public void setReg(Connection reg) {
        this.reg = reg;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContabilidadCaja cc = new ContabilidadCaja();
        InterfaceInicioPrograma iip = new InterfaceInicioPrograma(cc.getOpi(),cc.getReg());
        iip.setVisible(true);        
    }    
}
