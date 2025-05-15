/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class MenuSaldo extends javax.swing.JFrame {

    public MenuSaldo() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        banco1 = new javax.swing.JLabel();
        Volverr = new javax.swing.JButton();
        banco3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-bancolombia.png"))); // NOI18N
        jPanel1.add(banco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 360, 118));

        Volverr.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Volverr.setText("Volver  ");
        Volverr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverrActionPerformed(evt);
            }
        });
        jPanel1.add(Volverr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 90, 50));

        banco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mob-11 (2).png"))); // NOI18N
        jPanel1.add(banco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 420, 110));

        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setText(" ");
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 30, 30));

        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setText(" ");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Su saldo es:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        saldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo.setText(" ");
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 270, 60));

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

    private void VolverrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverrActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_VolverrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Volverr;
    private javax.swing.JLabel banco1;
    private javax.swing.JLabel banco3;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}
