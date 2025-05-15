/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class MenuDepositar extends javax.swing.JFrame {

    public MenuDepositar() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        banco1 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        banco3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Valor = new javax.swing.JTextField();
        exitoso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        banco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-bancolombia.png"))); // NOI18N
        jPanel1.add(banco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 360, 118));

        aceptar.setText("Aceptar");
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 50));

        Volver.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Volver.setText("Volver ");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 90, 50));

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
        jLabel1.setText("Digite el valor del monto a depositar: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        jPanel1.add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 190, 50));

        exitoso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitoso.setForeground(new java.awt.Color(51, 255, 51));
        exitoso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitoso.setText(" ");
        jPanel1.add(exitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 370, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Valor;
    public javax.swing.JButton Volver;
    public javax.swing.JButton aceptar;
    private javax.swing.JLabel banco1;
    private javax.swing.JLabel banco3;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    public javax.swing.JLabel exitoso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
