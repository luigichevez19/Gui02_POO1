/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.froms;

import com.sv.udb.clases.Ejercicio2;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class FrmEjercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form FrmEjercicio2
     */
    private boolean isCant;
    private Ejercicio2 objeEjer;
    private List<Ejercicio2> listEjer;
    public FrmEjercicio2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtngrese.setFocusable(true);
        this.isCant = true;
        this.listEjer = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        txtngrese = new javax.swing.JTextField();
        lblIngreso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setText("Cancelar");

        pnlPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        txtngrese.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtngrese.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtngreseKeyPressed(evt);
            }
        });

        lblIngreso.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lblIngreso.setText("Ingrese la cantidad");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngreso))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtngrese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtngreseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtngreseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String text = this.txtngrese.getText();
            if (text.trim().length() > 0)
            {
            if(this.isCant)
            {
            this.objeEjer = new Ejercicio2();
            this.objeEjer.setCant(Integer.parseInt(text));
            this.lblIngreso.setText("Ingrese la denominacion");
            this.txtngrese.setText("");
            }
            else
            {
            this.objeEjer.setDenoDine(Double.parseDouble(text));
            this.listEjer.add(this.objeEjer);
            this.lblIngreso.setText("Ingrese la Cantidad");
            this.txtngrese.setText("");
            }
            this.isCant= !this.isCant;
            }
            else 
            {
        JOptionPane.showMessageDialog(this, "Texto esta vacio");
            }
       }
        else if (evt.getKeyCode() == KeyEvent.VK_X)
        {
            double total=0;
            for (Ejercicio2 temp:this.listEjer)
            {
            total= total + (temp.getCant() * temp.getDenoDine());
            }
        JOptionPane.showMessageDialog(this, "La respuesta es: "+total);
        this.isCant =true;
        this.listEjer = new ArrayList<>();
        this.lblIngreso.setText("Ingrese la Cantidad");
        this.txtngrese.setText("");
        
        }
    }//GEN-LAST:event_txtngreseKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEjercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtngrese;
    // End of variables declaration//GEN-END:variables
}
