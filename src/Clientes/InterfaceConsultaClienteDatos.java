/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import OperacionesContabilidad.Operaciones;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class InterfaceConsultaClienteDatos extends javax.swing.JFrame {
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    private Operaciones op;
    

    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    /**
     * Creates new form InterfaceConsultarUsuarioDatos
     */
    public InterfaceConsultaClienteDatos() {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Consultar Cliente");
        llenarDatosCliente();
        cerrar();
    }
    
    public InterfaceConsultaClienteDatos(Operaciones op) {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Consultar Cliente");
        this.op = op;
        llenarDatosCliente();
        cerrar();
    }
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    
    public void llenarDatosCliente (){
        ArrayList<Cliente> clientes = op.getClientes();
        Integer indice = op.getIndiceCliente();
        txtNombre_Cliente.setText(clientes.get(indice).getNombre_Cliente());
        txtApellidos_Cliente.setText(clientes.get(indice).getApellido_Cliente());
        txtApodo_Cliente.setText(clientes.get(indice).getApodo_Cliente());
        txtTelefono_Cliente.setText(clientes.get(indice).getNumTel_Cliente().toString());
        txtSuper_Cliente.setText(op.obtenerNombreSuper(clientes.get(indice).getId_Super()));
        txtEmail_Cliente.setText(clientes.get(indice).getEmail_Cliente());      
    }
    
         /* Metodo para salir de una ventana */
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent e){
                  //confirmarSalida();
                  dispose();
              }
            });
            //this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail_Cliente = new javax.swing.JTextField();
        txtSuper_Cliente = new javax.swing.JTextField();
        txtTelefono_Cliente = new javax.swing.JTextField();
        txtApodo_Cliente = new javax.swing.JTextField();
        txtApellidos_Cliente = new javax.swing.JTextField();
        txtNombre_Cliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre : ");

        jLabel3.setText("Apellidos : ");

        jLabel4.setText("Apodo : ");

        jLabel5.setText("Telefono :");

        jLabel9.setText("Email : ");

        jLabel10.setText("Supermercado : ");

        txtEmail_Cliente.setEditable(false);

        txtSuper_Cliente.setEditable(false);

        txtTelefono_Cliente.setEditable(false);

        txtApodo_Cliente.setEditable(false);

        txtApellidos_Cliente.setEditable(false);

        txtNombre_Cliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuper_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtEmail_Cliente)
                    .addComponent(txtTelefono_Cliente)
                    .addComponent(txtApodo_Cliente)
                    .addComponent(txtApellidos_Cliente)
                    .addComponent(txtNombre_Cliente))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApodo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuper_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos_Cliente;
    private javax.swing.JTextField txtApodo_Cliente;
    private javax.swing.JTextField txtEmail_Cliente;
    private javax.swing.JTextField txtNombre_Cliente;
    private javax.swing.JTextField txtSuper_Cliente;
    private javax.swing.JTextField txtTelefono_Cliente;
    // End of variables declaration//GEN-END:variables
}
