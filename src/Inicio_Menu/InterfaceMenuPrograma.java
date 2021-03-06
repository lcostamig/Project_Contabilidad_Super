/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio_Menu;

import ArqueoCaja.InterfaceArqueoCaja;
import Clientes.InterfaceClienteMenu;
import Configuracion.InterfaceConfiguracionMenu;
import OperacionesContabilidad.Operaciones;
import Proveedores.InterfaceProveedorMenu;
import contabilidadcaja.InterfaceCajaMenu;

/**
 *
 * @author luis
 */
public class InterfaceMenuPrograma extends javax.swing.JFrame {
    
    private Operaciones op;
    
    //**************************************************************************************************************
    //**************************************************************************************************************
    //**************************************************************************************************************
    /**
     * Creates new form InterfaceMenuPrograma
     */
    public InterfaceMenuPrograma() {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
    }
    
    public InterfaceMenuPrograma(Operaciones op) {
        initComponents();
        setLocationRelativeTo(null);//permite que la ventana aparezca centrada
        this.op = op;
        op.obtenerNombreUsuarioActivo(lblUsuario);
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

        lblImagenIcono = new javax.swing.JLabel();
        btnHacerCaja = new javax.swing.JButton();
        btnArqueo = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnInformes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Homepage_Consulado-Geral_em_Frankfurt.png"))); // NOI18N
        getContentPane().add(lblImagenIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 260, 250));

        btnHacerCaja.setBackground(new java.awt.Color(0, 102, 153));
        btnHacerCaja.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHacerCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnHacerCaja.setText("Hacer Caja");
        btnHacerCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerCajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHacerCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 50));

        btnArqueo.setBackground(new java.awt.Color(0, 102, 153));
        btnArqueo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnArqueo.setForeground(new java.awt.Color(255, 255, 255));
        btnArqueo.setText("Arqueo");
        btnArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArqueoActionPerformed(evt);
            }
        });
        getContentPane().add(btnArqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, 50));

        btnClientes.setBackground(new java.awt.Color(0, 102, 153));
        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 50));

        btnProveedores.setBackground(new java.awt.Color(0, 102, 153));
        btnProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 130, 50));

        btnConfiguracion.setBackground(new java.awt.Color(0, 102, 153));
        btnConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("Configuracion");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 50));

        btnInformes.setBackground(new java.awt.Color(0, 102, 153));
        btnInformes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInformes.setForeground(new java.awt.Color(255, 255, 255));
        btnInformes.setText("Informes");
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 130, 50));

        btnSalir.setBackground(new java.awt.Color(0, 102, 153));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 240, -1));

        lblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/317990.jpg"))); // NOI18N
        getContentPane().add(lblImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnHacerCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerCajaActionPerformed
        // TODO add your handling code here:
        InterfaceCajaMenu icm = new InterfaceCajaMenu();
        icm.setVisible(true);
    }//GEN-LAST:event_btnHacerCajaActionPerformed

    private void btnArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArqueoActionPerformed
        // TODO add your handling code here:
        InterfaceArqueoCaja iac = new InterfaceArqueoCaja(op);
        iac.setVisible(true);
    }//GEN-LAST:event_btnArqueoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        InterfaceClienteMenu icm = new InterfaceClienteMenu(op);
        icm.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
        InterfaceProveedorMenu ipm = new InterfaceProveedorMenu(op);
        ipm.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
        InterfaceConfiguracionMenu iconm = new InterfaceConfiguracionMenu(op);
        iconm.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArqueo;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnHacerCaja;
    private javax.swing.JButton btnInformes;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImagenFondo;
    private javax.swing.JLabel lblImagenIcono;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
