/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesContabilidad;

import Clientes.Cliente;
import Clientes.InterfaceCrearCliente;
import Configuracion.InterfaceConsultarUsuario;
import Configuracion.InterfaceCrearUsuario;
import Configuracion.InterfaceEliminarUsuario;
import Configuracion.Supermercado;
import Configuracion.Usuario;
import Proveedores.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author luis
 */
public class Operaciones {
    
    Connection reg;
    
    ArrayList<Usuario> usuarios = new ArrayList<>();
    Integer indiceUsuario;
    Integer indiceUsuarioActivo;
    Integer primeroUsuario = 0;
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    Integer indiceCliente;
    Integer primeroCliente = 0;
    
    ArrayList<Proveedor> proveedores = new ArrayList<>();
    Integer indiceProveedor;
    Integer primeroproveedor = 0;
    
    ArrayList<Supermercado> Supermarket = new ArrayList<>();
    Integer primeroSuper = 0;
    Integer indiceSuper;
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************

    public Integer getIndiceUsuarioActivo() {
        return indiceUsuarioActivo;
    }

    public void setIndiceUsuarioActivo(Integer indiceUsuarioActivo) {
        this.indiceUsuarioActivo = indiceUsuarioActivo;
    }
    
    public Operaciones(Connection reg) {
        this.reg = reg;
    }
    
    public Connection getReg() {
        return reg;
    }

    public void setReg(Connection reg) {
        this.reg = reg;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Integer getIndiceUsuario() {
        return indiceUsuario;
    }

    public void setIndiceUsuario(Integer indiceUsuario) {
        this.indiceUsuario = indiceUsuario;
    }

    public Integer getPrimeroUsuario() {
        return primeroUsuario;
    }

    public void setPrimeroUsuario(Integer primeroUsuario) {
        this.primeroUsuario = primeroUsuario;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Integer getIndiceCliente() {
        return indiceCliente;
    }

    public void setIndiceCliente(Integer indiceCliente) {
        this.indiceCliente = indiceCliente;
    }

    public Integer getPrimeroCliente() {
        return primeroCliente;
    }

    public void setPrimeroCliente(Integer primeroCliente) {
        this.primeroCliente = primeroCliente;
    }

    public ArrayList<Supermercado> getSupermarket() {
        return Supermarket;
    }

    public void setSupermarket(ArrayList<Supermercado> Supermarket) {
        this.Supermarket = Supermarket;
    }

    public Integer getPrimeroSuper() {
        return primeroSuper;
    }

    public void setPrimeroSuper(Integer primeroSuper) {
        this.primeroSuper = primeroSuper;
    }

    public Integer getIndiceSuper() {
        return indiceSuper;
    }

    public void setIndiceSuper(Integer indiceSuper) {
        this.indiceSuper = indiceSuper;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Integer getIndiceProveedor() {
        return indiceProveedor;
    }

    public void setIndiceProveedor(Integer indiceProveedor) {
        this.indiceProveedor = indiceProveedor;
    }

    public Integer getPrimeroproveedor() {
        return primeroproveedor;
    }

    public void setPrimeroproveedor(Integer primeroproveedor) {
        this.primeroproveedor = primeroproveedor;
    }
    
    //**************************************************************************************************************
    //***************************************  USUARIOS  ***********************************************************
    //**************************************************************************************************************
       
    public void crearUsuario(Usuario user){        
        String sql = "INSERT into usuarios (Nombre,Apellido,Direccion,Poblacion,Provincia,CodigoPostal,Pais,Fecha_Nacimiento,Telefono,Email,Contraseña,Cargo)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, user.getNombre());
            pst.setString(2, user.getApellidos());
            pst.setString(3, user.getDireccion());
            pst.setString(4, user.getPoblacion());
            pst.setString(5, user.getProvincia());
            pst.setInt(6, user.getCodPostal());
            pst.setString(7, user.getPais());
            pst.setString(8, user.getFechaNac());
            pst.setInt(9, user.getNumTel());
            pst.setString(10, user.getEmail());
            pst.setString(11, user.getContrasena());
            pst.setString(12, user.getCargo());
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Creado nuevo usuario con exito");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroUsuario = 0;
        usuarios.clear();
    }
    
    public void obtenerUsuarios() {
        if (primeroUsuario == 0) {
            try {
                Statement st = reg.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
                while (rs.next()) {
                    Usuario user = new Usuario();
                    user.setIndentificador(rs.getInt(1));
                    user.setNombre(rs.getString(2));
                    user.setApellidos(rs.getString(3));
                    user.setDireccion(rs.getString(4));
                    user.setPoblacion(rs.getString(5));
                    user.setProvincia(rs.getString(6));
                    user.setCodPostal(rs.getInt(7));
                    user.setPais(rs.getString(8));
                    user.setFechaNac(rs.getString(9));
                    user.setNumTel(rs.getInt(10));
                    user.setEmail(rs.getString(11));
                    user.setContrasena(rs.getString(12));
                    user.setCargo(rs.getString(13));
                    usuarios.add(user);
                }
                primeroUsuario = 1;
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void llenarComboUsuarios(JComboBox<String> comboUsuario) {        
        String usuario;
        for (int i = 0; i < usuarios.size(); i++) {
            usuario = usuarios.get(i).getNombre() + " " +usuarios.get(i).getApellidos();
            comboUsuario.addItem(usuario);
        }
    }

    public void obtenerDatosUsuariosCombo(JComboBox<String> comboUsuario) {
        obtenerUsuarios();
        llenarComboUsuarios(comboUsuario);
    }
    
    public void obtenerDatosUsuariosLista(JList<String> lstUsuarios) {
        obtenerUsuarios();
        llenarListaUsuarios(lstUsuarios);
    }
    
    public void llenarListaUsuarios(JList<String> lstUsuarios) {
        DefaultListModel lm = new DefaultListModel();
        String usuario;
        for (int i = 0; i < usuarios.size(); i++) {
            usuario = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellidos();
            lm.addElement(usuario);
        }
        lstUsuarios.setModel(lm);
    }
    
    public boolean esCorrectoUsuario (String user, String password){
        boolean correcto = false;
        for(int i=0; i<usuarios.size() ; i++){
            String usuario = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellidos();
            if(usuario.equals(user)){
                if(usuarios.get(i).getContrasena().equals(password)){
                    correcto = true;
                    indiceUsuarioActivo = i;
                }
            }
        }
        return correcto;
    }
    
    public void obtenerNombreUsuarioActivo (JLabel lblUsuario){
        String nombre = usuarios.get(indiceUsuarioActivo).getNombre() + " " + usuarios.get(indiceUsuarioActivo).getApellidos();
        lblUsuario.setText(nombre);
    }
    
    public void eliminarUsuario(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        primeroUsuario = 0;
        usuarios.clear();
    } 
    
    public void modificarUsuario(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizada con exito");
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroUsuario = 0;
        usuarios.clear();
    }
    
    //**************************************************************************************************************
    //**************************************  CLIENTES  ************************************************************
    //**************************************************************************************************************
    
    public void crearCliente(Cliente client){        
        String sql = "INSERT into cliente (Nombre_Cliente,Apellido_Cliente,Id_Super,Apodo_Cliente,"
                +    "Telefono_Cliente,Email_Cliente)VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, client.getNombre_Cliente());
            pst.setString(2, client.getApellido_Cliente());  
            Integer id = obtenerIdSuper(client.getSuper_Cliente());
            pst.setInt(3, id);
            pst.setString(4, client.getApodo_Cliente());
            pst.setInt(5, client.getNumTel_Cliente());
            pst.setString(6, client.getEmail_Cliente());
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Creado nuevo cliente con exito");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroCliente = 0;
        clientes.clear();
    }
    
    public void obtenerDatosClientesLista(JList<String> cliente) {
        obtenerClientes();
        llenarListaClientes(cliente);
    }
    
    public void obtenerClientes() {
        if (primeroCliente == 0) {
            try {
                Statement st = reg.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM cliente");
                while (rs.next()) {
                    Cliente client = new Cliente();
                    client.setId_Cliente(rs.getInt(1));
                    client.setNombre_Cliente(rs.getString(2));
                    client.setApellido_Cliente(rs.getString(3));
                    client.setId_Super(rs.getInt(4));
                    client.setApodo_Cliente(rs.getString(5));
                    client.setNumTel_Cliente(rs.getInt(6));
                    client.setEmail_Cliente(rs.getString(7));
                    client.setSuper_Cliente(obtenerNombreSuper(client.getId_Super()));
                    clientes.add(client);
                }
                primeroCliente = 1;
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void llenarListaClientes(JList<String> lstClientes) {
        DefaultListModel lm = new DefaultListModel();
        String cliente;
        for (int i = 0; i < clientes.size(); i++) {
            cliente = clientes.get(i).getApodo_Cliente();
            lm.addElement(cliente);
        }
        lstClientes.setModel(lm);
    }
    
    public void modificarCliente(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizada con exito");
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroCliente = 0;
        clientes.clear();
    }
    
    public void eliminarCliente(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(InterfaceEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        primeroCliente = 0;
        clientes.clear();
    }

    
    //**************************************************************************************************************
    //**************************************  SUPERMERCADO  ********************************************************
    //**************************************************************************************************************
  
    public void crearSuper(Supermercado supermercado){        
        String sql = "INSERT into supermercado (Nombre_Super,Direccion_Super,Provincia_Super,Localidad_Super,"
                +    "Telefono_Super,Email_Super)VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, supermercado.getNombre_Super());
            pst.setString(2, supermercado.getDireccion_Super());            
            pst.setString(3, supermercado.getProvincia_Super());
            pst.setString(4, supermercado.getLocalidad_Super());
            pst.setInt(5, supermercado.getTelefono_Super());
            pst.setString(6, supermercado.getEmail_Super());
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Creado nuevo supermercado con exito");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroSuper = 0;
        Supermarket.clear();
    }
    
    public void eliminarSuper(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        primeroSuper = 0;
        Supermarket.clear();
    }  
    
    public void obtenerDatosSupermercadoCombo(JComboBox<String> supermarket) {
        obtenerSupermercados();
        llenarComboSupermercado(supermarket);
    }
    
    public void obtenerSupermercados() {
        if (primeroSuper == 0) {
            try {
                Statement st = reg.createStatement();
                ResultSet rs = st.executeQuery("SELECT Indentificador_Super,Nombre_Super FROM supermercado");
                while (rs.next()) {
                    Supermercado supermarket = new Supermercado();
                    supermarket.setId_Super(rs.getInt(1));
                    supermarket.setNombre_Super(rs.getString(2));
                    Supermarket.add(supermarket);
                }
                primeroSuper = 1;
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void llenarComboSupermercado(JComboBox<String>  supermarket) {
        String supermercado;
        for (int i = 0; i < Supermarket.size(); i++) {
            supermercado = Supermarket.get(i).getNombre_Super();
            supermarket.addItem(supermercado);
        }
    }
    
    public String ObtenerSuperElegido(JComboBox<String> supermarket) {
        if (supermarket.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "No selecciono ningun supermercado");
            return null;
        } else {
            Integer i = supermarket.getSelectedIndex();
            JOptionPane.showMessageDialog(null, "Seleccionado el supermercado  " + supermarket.getItemAt(i).toString());
            String smarket = supermarket.getItemAt(i).toString();
            return smarket;
        }
    }
    
    public int obtenerIdSuper(String superm) {
        Statement st;
        try {
            Integer id = 0;
            st = reg.createStatement();
            ResultSet rs = st.executeQuery("SELECT Indentificador_Super FROM supermercado WHERE Nombre_Super = '" + superm + "'");
            while (rs.next()) {
                id = rs.getInt(1);
            }
            return id;

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public String obtenerNombreSuper(Integer id_super) {
        Statement st;
        try {
            String nombre = null;
            st = reg.createStatement();
            ResultSet rs = st.executeQuery("SELECT Nombre_Super FROM supermercado WHERE Indentificador_Super = '" + id_super + "'");
            while (rs.next()) {
                nombre = rs.getString(1);
            }
            return nombre;

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    
    public void obtenerDatosSupermercado(JList<String> lstSupermercado) {
        obtenerSupermercados();
        llenarListaSupermercado(lstSupermercado);
    }
    
    public void llenarListaSupermercado(JList<String> lstSupermercado) {
        DefaultListModel lm = new DefaultListModel();
        String supermercado;
        for (int i = 0; i < Supermarket.size(); i++) {
            supermercado = Supermarket.get(i).getNombre_Super();
            lm.addElement(supermercado);
        }
        lstSupermercado.setModel(lm);
    }
    
    public void modificarSuper(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizada con exito");
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroSuper = 0;
        Supermarket.clear();
    }
    
    //**************************************************************************************************************
    //**************************************  PROVEEDOR  ***********************************************************
    //**************************************************************************************************************
  
    public void crearProveedor(Proveedor prov){        
        String sql = "INSERT into proveedor (Nombre_Proveedor,Domicilio_Proveedor,Localidad_Proveedor,Provincia_Proveedor,"
                +    "Nif_Proveedor,Telefono_Proveedor,Email_Proveedor,Id_Super)VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, prov.getNombre_Proveedor());
            pst.setString(2, prov.getDomicilio_Proveedor()); 
            pst.setString(3, prov.getLocalidad_Proveedor());
            pst.setString(4, prov.getProvincia_Proveedor());
            pst.setString(5, prov.getNif_Proveedor());
            pst.setInt(6, prov.getTelefono_Proveedor());
            pst.setString(7, prov.getEmail_Proveedor());
            Integer id = obtenerIdSuper(prov.getNombreSuper_Proveedor());
            pst.setInt(8, id);
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Creado nuevo proveedor con exito");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroproveedor = 0;
        proveedores.clear();
    }
    
    public void obtenerDatosProveedorLista(JList<String> proveedor) {
        obtenerProveedores();
        llenarListaProveedores(proveedor);
    }
    
    public void obtenerProveedores() {
        if (primeroproveedor == 0) {
            try {
                Statement st = reg.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM proveedor");
                while (rs.next()) {
                    Proveedor prov = new Proveedor();
                    prov.setId_Proveedor(rs.getInt(1));
                    prov.setNombre_Proveedor(rs.getString(2));
                    prov.setDomicilio_Proveedor(rs.getString(3));
                    prov.setLocalidad_Proveedor(rs.getString(4));
                    prov.setProvincia_Proveedor(rs.getString(5));
                    prov.setNif_Proveedor(rs.getString(6));
                    prov.setTelefono_Proveedor(rs.getInt(7));
                    prov.setEmail_Proveedor(rs.getString(8));
                    prov.setId_Super_Proveedor(rs.getInt(9));
                    prov.setNombreSuper_Proveedor(obtenerNombreSuper(prov.getId_Super_Proveedor()));
                    proveedores.add(prov);
                }
                primeroproveedor = 1;
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceConsultarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void llenarListaProveedores(JList<String> lstProveedores) {
        DefaultListModel lm = new DefaultListModel();
        String proveedor;
        for (int i = 0; i < proveedores.size(); i++) {
            proveedor = proveedores.get(i).getNombre_Proveedor();
            lm.addElement(proveedor);
        }
        lstProveedores.setModel(lm);
    }

    public void modificarProveedor(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizada con exito");
        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        primeroproveedor = 0;
        proveedores.clear();
    }
    
    public void eliminarProveedor(String sql) {
        try {
            PreparedStatement pst = reg.prepareStatement(sql);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        primeroproveedor = 0;
        proveedores.clear();
    }
    
    //**************************************************************************************************************
    //**************************************  OPERACIONES CONTABILIDAD  ********************************************
    //**************************************************************************************************************
 
    public void onlyNum(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }
    
    public void llenarTotalNum (JTextField txtNum, JTextField txtTotal, double numMul){
        String numero =  txtNum.getText();
        if(numero.equals("") == false && numero.matches("[0-9]*")){
            Integer num = Integer.parseInt(numero);
            double total = num * numMul;
            total = redondear(total);
            txtTotal.setText( total + "");
        }else{
            txtTotal.setText("");
        }
    }
    
    public Double obtenerTotalTxT(JTextField txt) {
        String num = txt.getText();
        Double total = 0.0;
        if (num.equals("") == false) {
            total = Double.parseDouble(num);
        }
        return total;
    }
    
    public Double redondear (Double num){
        return Math.rint(num*100)/100;
    }
            
}
