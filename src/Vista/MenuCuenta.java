/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class MenuCuenta extends javax.swing.JFrame {

    public MenuCuenta() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        banco1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        banco3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        depositar = new javax.swing.JButton();
        consultaSaldo = new javax.swing.JButton();
        entradas = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SALIR1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-bancolombia.png"))); // NOI18N
        jPanel1.add(banco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 360, 118));

        Volver.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 90, 50));

        banco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mob-11 (2).png"))); // NOI18N
        jPanel1.add(banco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 420, 110));

        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setText(" ");
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 30, 30));

        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setText(" ");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 30, 30));

        depositar.setText("DEPOSITAR");
        depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarActionPerformed(evt);
            }
        });
        jPanel1.add(depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 190, 60));

        consultaSaldo.setText("CONSULTAR SALDO");
        consultaSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(consultaSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 190, 60));

        entradas.setLabel("COMPRAR \nENTRADAS");
        entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradasActionPerformed(evt);
            }
        });
        jPanel1.add(entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, 60));

        retirar.setText("RETIRAR");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });
        jPanel1.add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, 60));

        jButton2.setText("DEPOSITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, 60));

        SALIR1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        SALIR1.setText("Salir");
        SALIR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIR1ActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 90, 50));

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
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositarActionPerformed

    private void consultaSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaSaldoActionPerformed

    private void entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradasActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retirarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SALIR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIR1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SALIR1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR1;
    public javax.swing.JButton Volver;
    private javax.swing.JLabel banco1;
    private javax.swing.JLabel banco3;
    public javax.swing.JButton consultaSaldo;
    public javax.swing.JButton depositar;
    public javax.swing.JButton entradas;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton retirar;
    // End of variables declaration//GEN-END:variables
}
