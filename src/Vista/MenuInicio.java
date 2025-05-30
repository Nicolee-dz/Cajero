/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class MenuInicio extends javax.swing.JFrame {

    private int num=1;
    public MenuInicio() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public boolean Comprobar(){
        boolean com= true;
        if(IDCUENTA.getText().equalsIgnoreCase("")){
            com = false;
            error1.setText("*");
        }if(CLAVECUENTA.getText().equalsIgnoreCase("")){
            com=false;
            error2.setText("*");
        }
        return com;
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
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        banco1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        INGRESAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        banco3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CLAVECUENTA = new javax.swing.JPasswordField();
        IDCUENTA = new javax.swing.JTextField();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setText(" ");
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 60, 30));

        error2.setForeground(new java.awt.Color(255, 0, 0));
        error2.setText(" ");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 60, 30));

        banco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-bancolombia.png"))); // NOI18N
        jPanel1.add(banco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 360, 118));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setText("Digite el número de cuenta: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 209, 233, -1));

        INGRESAR.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        INGRESAR.setText("Ingresar");
        INGRESAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INGRESARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                INGRESARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                INGRESARMouseExited(evt);
            }
        });
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        jPanel1.add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 100, 50));

        SALIR.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        SALIR.setText("Salir");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 90, 50));

        uno.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 58, 38));

        dos.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 58, 38));

        tres.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 58, 38));

        cuatro.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel1.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 58, 38));

        cinco.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel1.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 58, 38));

        seis.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel1.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 58, 38));

        siete.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel1.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 58, 38));

        ocho.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel1.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 58, 38));

        nueve.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel1.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 58, 38));

        cero.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel1.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 58, 38));

        banco3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mob-11 (2).png"))); // NOI18N
        jPanel1.add(banco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 420, 110));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setText("Digite la contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 233, -1));

        CLAVECUENTA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CLAVECUENTA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CLAVECUENTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLAVECUENTAMouseClicked(evt);
            }
        });
        CLAVECUENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAVECUENTAActionPerformed(evt);
            }
        });
        CLAVECUENTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CLAVECUENTAKeyTyped(evt);
            }
        });
        jPanel1.add(CLAVECUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 250, -1));

        IDCUENTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDCUENTAMouseClicked(evt);
            }
        });
        IDCUENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDCUENTAActionPerformed(evt);
            }
        });
        jPanel1.add(IDCUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, 40));

        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 150, 570, 30));

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

    private void INGRESARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INGRESARMouseClicked
    
    }//GEN-LAST:event_INGRESARMouseClicked

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed

    }//GEN-LAST:event_INGRESARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"1");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"1");
       
        }
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"2");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"2");
       
        }
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"3");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"3");
       
        }
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"4");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"4");
       
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"5");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"5");
       
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"6");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"6");
       
        }
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"7");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"7");
       
        }
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"8");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"8");
       
        }
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"9");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"9");
       
        }
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        if (num==1) {
        this.IDCUENTA.setText(this.IDCUENTA.getText()+"0");
                    }else{
        this.CLAVECUENTA.setText(this.CLAVECUENTA.getText()+"0");
       
        }
    }//GEN-LAST:event_ceroActionPerformed

    private void CLAVECUENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAVECUENTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLAVECUENTAActionPerformed

    private void CLAVECUENTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLAVECUENTAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CLAVECUENTAKeyTyped

    private void INGRESARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INGRESARMouseEntered
        if(!Comprobar()){
            INGRESAR.setEnabled(false);
        }
    }//GEN-LAST:event_INGRESARMouseEntered

    private void INGRESARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INGRESARMouseExited
       INGRESAR.setEnabled(true);
       error1.setText("");
       error2.setText("");
       info.setText("");
    }//GEN-LAST:event_INGRESARMouseExited

    private void CLAVECUENTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLAVECUENTAMouseClicked
        num=2;
    }//GEN-LAST:event_CLAVECUENTAMouseClicked

    private void IDCUENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDCUENTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCUENTAActionPerformed

    private void IDCUENTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDCUENTAMouseClicked
        
        num = 1;
    }//GEN-LAST:event_IDCUENTAMouseClicked

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField CLAVECUENTA;
    public javax.swing.JTextField IDCUENTA;
    public javax.swing.JButton INGRESAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel banco1;
    private javax.swing.JLabel banco3;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dos;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    public javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
