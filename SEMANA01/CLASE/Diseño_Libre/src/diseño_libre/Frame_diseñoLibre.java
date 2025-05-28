package diseño_libre;

public class Frame_diseñoLibre extends javax.swing.JFrame {

    public Frame_diseñoLibre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_nomb = new javax.swing.JTextField();
        TXT_edad = new javax.swing.JTextField();
        TXT_s = new javax.swing.JTextField();
        LBL_nomb = new javax.swing.JLabel();
        LBL_edad = new javax.swing.JLabel();
        LBL_s = new javax.swing.JLabel();
        BTN_guardar = new javax.swing.JButton();
        LBL_Titulo = new javax.swing.JLabel();
        TXT_direc = new javax.swing.JTextField();
        LBL_direc = new javax.swing.JLabel();
        BTN_guardar1 = new javax.swing.JButton();
        BTN_guardar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TXT_nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 20));
        getContentPane().add(TXT_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 20));

        TXT_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_sActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 100, 20));

        LBL_nomb.setText("Nombre");
        getContentPane().add(LBL_nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        LBL_edad.setText("Edad");
        getContentPane().add(LBL_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        LBL_s.setText("Sueldo");
        getContentPane().add(LBL_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        BTN_guardar.setText("ELIMINAR");
        getContentPane().add(BTN_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        LBL_Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LBL_Titulo.setText("DATOS");
        getContentPane().add(LBL_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 30));
        getContentPane().add(TXT_direc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, 20));

        LBL_direc.setText("Direccion");
        getContentPane().add(LBL_direc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        BTN_guardar1.setText("GUARDAR");
        getContentPane().add(BTN_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        BTN_guardar2.setText("NUEVO");
        BTN_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_guardar2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_sActionPerformed

    private void BTN_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_guardar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_diseñoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_diseñoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_diseñoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_diseñoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_diseñoLibre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_guardar;
    private javax.swing.JButton BTN_guardar1;
    private javax.swing.JButton BTN_guardar2;
    private javax.swing.JLabel LBL_Titulo;
    private javax.swing.JLabel LBL_direc;
    private javax.swing.JLabel LBL_edad;
    private javax.swing.JLabel LBL_nomb;
    private javax.swing.JLabel LBL_s;
    private javax.swing.JTextField TXT_direc;
    private javax.swing.JTextField TXT_edad;
    private javax.swing.JTextField TXT_nomb;
    private javax.swing.JTextField TXT_s;
    // End of variables declaration//GEN-END:variables
}
