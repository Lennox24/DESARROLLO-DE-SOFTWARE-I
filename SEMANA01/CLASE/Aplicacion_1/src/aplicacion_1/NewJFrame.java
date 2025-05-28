package aplicacion_1;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL_n1 = new javax.swing.JLabel();
        BTN_calcular = new javax.swing.JButton();
        BTN_nuevo = new javax.swing.JButton();
        LBL_n2 = new javax.swing.JLabel();
        LBL_r = new javax.swing.JLabel();
        TXT_n1 = new javax.swing.JTextField();
        TXT_n2 = new javax.swing.JTextField();
        TXT_r = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_n1.setText("NUMERO 1");
        LBL_n1.setName("n1"); // NOI18N
        getContentPane().add(LBL_n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        BTN_calcular.setText("CALCULAR");
        BTN_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        BTN_nuevo.setText("NUEVO");
        BTN_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, -1));

        LBL_n2.setText("NUMERO 2");
        getContentPane().add(LBL_n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        LBL_r.setText("RESULTADO");
        getContentPane().add(LBL_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        TXT_n1.setName(""); // NOI18N
        TXT_n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_n1ActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, -1));
        getContentPane().add(TXT_n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, -1));
        getContentPane().add(TXT_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("OPERACIONES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_n1ActionPerformed
        
    }//GEN-LAST:event_TXT_n1ActionPerformed


      /*

  █████╗ ██╗   ██╗ ██████╗ ██╗██╗     ███████╗███╗   ███╗██████╗ ██╗███████╗███████╗
 ██╔══██╗██║   ██║██╔═══██╗██║██║     ██╔════╝████╗ ████║██╔══██╗██║██╔════╝██╔════╝
 ███████║██║   ██║██║   ██║██║██║     █████╗  ██╔████╔██║██████╔╝██║█████╗  ███████╗
 ██╔══██║██║   ██║██║   ██║██║██║     ██╔══╝  ██║╚██╔╝██║██╔═══╝ ██║██╔══╝  ╚════██║
 ██║  ██║╚██████╔╝╚██████╔╝██║███████╗███████╗██║ ╚═╝ ██║██║     ██║███████╗███████║
 ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝╚══════╝╚══════╝╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚══════╝

                                >> AQUI EMPIEZA <<

    
    */

    private void BTN_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_calcularActionPerformed
        
        
        // Declarar Variables:
        int n1 = 0;
        double n2 = 0, r = 0;
        
        // Pasar los valores a las cajas de Texto:
        n1 = Integer.parseInt(TXT_n1.getText());
        n2 = Double.parseDouble(TXT_n2.getText());

        // Proceso:
        r = n1 + n2;
        
        // Mostrar Resultado
        TXT_r.setText(String.valueOf(r));
        
    }//GEN-LAST:event_BTN_calcularActionPerformed

    private void BTN_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_nuevoActionPerformed
        
        TXT_n1.setText("");
        TXT_n2.setText("");
        TXT_r.setText("");
        TXT_n1.requestFocus();
        
    }//GEN-LAST:event_BTN_nuevoActionPerformed


    /*
  █████╗  ██████╗ ██╗   ██╗██╗████████╗███████╗██████╗ ███╗   ███╗██╗███╗   ██╗ █████╗ 
 ██╔══██╗██╔═══██╗██║   ██║██║╚══██╔══╝██╔════╝██╔══██╗████╗ ████║██║████╗  ██║██╔══██╗
 ███████║██║   ██║██║   ██║██║   ██║   █████╗  ██████╔╝██╔████╔██║██║██╔██╗ ██║███████║
 ██╔══██║██║   ██║██║   ██║██║   ██║   ██╔══╝  ██╔══██╗██║╚██╔╝██║██║██║╚██╗██║██╔══██║
 ██║  ██║╚██████╔╝╚██████╔╝██║   ██║   ███████╗██║  ██║██║ ╚═╝ ██║██║██║ ╚████║██║  ██║
 ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝

                                << AQUI TERMINA >>

*/

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_calcular;
    private javax.swing.JButton BTN_nuevo;
    private javax.swing.JLabel LBL_n1;
    private javax.swing.JLabel LBL_n2;
    private javax.swing.JLabel LBL_r;
    private javax.swing.JTextField TXT_n1;
    private javax.swing.JTextField TXT_n2;
    private javax.swing.JTextField TXT_r;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
