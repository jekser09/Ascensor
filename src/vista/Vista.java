/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JProgressBar;
import logica.ControlAscensor;

/**
 *
 * @author Jekse
 */
public class Vista extends javax.swing.JFrame {
    private ControlAscensor asCtrl;
    
    /**
     * Creates new form NewJFrame
     */
    public Vista() {        
        initComponents();
        asCtrl=new ControlAscensor(this);       
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpbAscensor = new javax.swing.JProgressBar(JProgressBar.VERTICAL);
        btnBajar6 = new javax.swing.JButton();
        btnSubir1 = new javax.swing.JButton();
        btnSubir2 = new javax.swing.JButton();
        btnSubir3 = new javax.swing.JButton();
        btnSubir4 = new javax.swing.JButton();
        btnSubir5 = new javax.swing.JButton();
        btnBajar5 = new javax.swing.JButton();
        btnBajar4 = new javax.swing.JButton();
        btnBajar3 = new javax.swing.JButton();
        btnBajar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(671, 479));
        setResizable(false);

        jpbAscensor.setMaximum(7);
        jpbAscensor.setToolTipText("");

        btnBajar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abajo.png"))); // NOI18N
        btnBajar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajar6ActionPerformed(evt);
            }
        });

        btnSubir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arriba.png"))); // NOI18N
        btnSubir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir1ActionPerformed(evt);
            }
        });

        btnSubir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arriba.png"))); // NOI18N
        btnSubir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir2ActionPerformed(evt);
            }
        });

        btnSubir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arriba.png"))); // NOI18N
        btnSubir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir3ActionPerformed(evt);
            }
        });

        btnSubir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arriba.png"))); // NOI18N
        btnSubir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir4ActionPerformed(evt);
            }
        });

        btnSubir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arriba.png"))); // NOI18N
        btnSubir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubir5ActionPerformed(evt);
            }
        });

        btnBajar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abajo.png"))); // NOI18N
        btnBajar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajar5ActionPerformed(evt);
            }
        });

        btnBajar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abajo.png"))); // NOI18N
        btnBajar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajar4ActionPerformed(evt);
            }
        });

        btnBajar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abajo.png"))); // NOI18N
        btnBajar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajar3ActionPerformed(evt);
            }
        });

        btnBajar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abajo.png"))); // NOI18N
        btnBajar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpbAscensor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnSubir5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBajar5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnBajar6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(539, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSubir3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBajar3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSubir2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBajar2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSubir4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBajar4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnSubir1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpbAscensor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnBajar6)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSubir5)
                                    .addComponent(btnBajar5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(btnSubir4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBajar4)))
                        .addGap(53, 53, 53)
                        .addComponent(btnSubir3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBajar3)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubir2)
                    .addComponent(btnBajar2))
                .addGap(30, 30, 30)
                .addComponent(btnSubir1)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajar6ActionPerformed
        asCtrl.llamarAscensor(6);
    }//GEN-LAST:event_btnBajar6ActionPerformed

    private void btnSubir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir1ActionPerformed
       asCtrl.llamarAscensor(1);
    }//GEN-LAST:event_btnSubir1ActionPerformed

    private void btnSubir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir2ActionPerformed
        asCtrl.llamarAscensor(2);
    }//GEN-LAST:event_btnSubir2ActionPerformed

    private void btnSubir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir3ActionPerformed
        asCtrl.llamarAscensor(3);
    }//GEN-LAST:event_btnSubir3ActionPerformed

    private void btnSubir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir4ActionPerformed
        asCtrl.llamarAscensor(4);
    }//GEN-LAST:event_btnSubir4ActionPerformed

    private void btnSubir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubir5ActionPerformed
        asCtrl.llamarAscensor(5);
    }//GEN-LAST:event_btnSubir5ActionPerformed

    private void btnBajar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajar5ActionPerformed
        asCtrl.llamarAscensor(5);
    }//GEN-LAST:event_btnBajar5ActionPerformed

    private void btnBajar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajar4ActionPerformed
        asCtrl.llamarAscensor(4);
    }//GEN-LAST:event_btnBajar4ActionPerformed

    private void btnBajar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajar3ActionPerformed
        asCtrl.llamarAscensor(3);
    }//GEN-LAST:event_btnBajar3ActionPerformed

    private void btnBajar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajar2ActionPerformed
        asCtrl.llamarAscensor(2);
    }//GEN-LAST:event_btnBajar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajar2;
    private javax.swing.JButton btnBajar3;
    private javax.swing.JButton btnBajar4;
    private javax.swing.JButton btnBajar5;
    private javax.swing.JButton btnBajar6;
    private javax.swing.JButton btnSubir1;
    private javax.swing.JButton btnSubir2;
    private javax.swing.JButton btnSubir3;
    private javax.swing.JButton btnSubir4;
    private javax.swing.JButton btnSubir5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JProgressBar jpbAscensor;
    // End of variables declaration//GEN-END:variables
}
