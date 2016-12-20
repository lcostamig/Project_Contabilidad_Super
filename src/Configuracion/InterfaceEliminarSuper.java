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
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class InterfaceEliminarSuper extends javax.swing.JFrame {
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    private Operaciones op;
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 

    /**
     * Creates new form InterfaceConsultarUsuario
     */
    public InterfaceEliminarSuper() {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Eliminar Supermercado");
        op.obtenerDatosSupermercado(lstSupermercado);
        cerrar();
    }
    
    public InterfaceEliminarSuper(Operaciones op) {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        setResizable(false); // permite que la ventana no se pueda maximizar
        setTitle("Eliminar Supermercado");
        this.op = op;
        op.obtenerDatosSupermercado(lstSupermercado);
        cerrar();
    }
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
 
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSupermercado = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecciona Supermercado : ");

        lstSupermercado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(lstSupermercado);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnEliminar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ArrayList<Supermercado> supermarket = op.getSupermarket();
        String sql;
        if(lstSupermercado.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "No selecciono ningun supermercado");
        }else{
            sql = "DELETE FROM supermercado WHERE Indentificador_Super='" + 
                  supermarket.get(lstSupermercado.getSelectedIndex()).getId_Super()+ "'";
            op.eliminarSuper(sql);
            dispose();
            JOptionPane.showMessageDialog(null, "Eliminado el supermercado " + lstSupermercado.getSelectedValue().toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> lstSupermercado;
    // End of variables declaration//GEN-END:variables
}
