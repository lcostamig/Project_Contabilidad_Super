/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import OperacionesContabilidad.Operaciones;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class InterfaceModificarSuperDatos extends javax.swing.JFrame {
    
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
    public InterfaceModificarSuperDatos() {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Modificar Usuario");
        llenarDatosSuper();
        cerrar();
    }
    
    public InterfaceModificarSuperDatos(Operaciones op) {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Modificar Usuario");
        this.op = op;
        llenarDatosSuper();
        cerrar();
    }
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    
    public void llenarDatosSuper (){
        ArrayList<Supermercado> supermarket = op.getSupermarket();
        Integer indice = op.getIndiceSuper();
        txtNombre_Super.setText(supermarket.get(indice).getNombre_Super());
        txtDireccion_Super.setText(supermarket.get(indice).getDireccion_Super());
        txtLocalidad_Super.setText(supermarket.get(indice).getLocalidad_Super());
        txtProvincia_Super.setText(supermarket.get(indice).getProvincia_Super());
        txtEmail_Super.setText(supermarket.get(indice).getEmail_Super());
        txtTelefono_Super.setText(supermarket.get(indice).getTelefono_Super().toString());         
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
        txtTelefono_Super = new javax.swing.JTextField();
        txtEmail_Super = new javax.swing.JTextField();
        txtProvincia_Super = new javax.swing.JTextField();
        txtLocalidad_Super = new javax.swing.JTextField();
        txtDireccion_Super = new javax.swing.JTextField();
        txtNombre_Super = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre : ");

        jLabel3.setText("Direccion : ");

        jLabel4.setText("Localidad :");

        jLabel5.setText("Provincia : ");

        jLabel9.setText("Telefono : ");

        jLabel10.setText("Direccion de correo : ");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail_Super, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addComponent(txtTelefono_Super)
                        .addComponent(txtProvincia_Super)
                        .addComponent(txtLocalidad_Super)
                        .addComponent(txtDireccion_Super)
                        .addComponent(txtNombre_Super)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocalidad_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail_Super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addComponent(btnModificar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ArrayList<Supermercado> supermarket = op.getSupermarket();
        Integer indice = op.getIndiceSuper();
        String sql; 
        sql = "UPDATE supermercado SET Nombre_Super='" + txtNombre_Super.getText() + 
              "',Direccion_Super='" + txtDireccion_Super.getText() + 
              "',Localidad_Super='" + txtLocalidad_Super.getText() + 
              "',Provincia_Super='" + txtProvincia_Super.getText() +  
              "',Telefono_Super='" + txtTelefono_Super.getText() + 
              "',Email_Super='" + txtEmail_Super.getText() + 
              "' WHERE Indentificador_Super='" + supermarket.get(indice).getId_Super()+ "'";
        op.modificarSuper(sql);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDireccion_Super;
    private javax.swing.JTextField txtEmail_Super;
    private javax.swing.JTextField txtLocalidad_Super;
    private javax.swing.JTextField txtNombre_Super;
    private javax.swing.JTextField txtProvincia_Super;
    private javax.swing.JTextField txtTelefono_Super;
    // End of variables declaration//GEN-END:variables
}