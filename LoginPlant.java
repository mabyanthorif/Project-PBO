/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebunku;

/**
 *
 * @author Neysaqilla Auldey
 */
public class LoginPlant extends javax.swing.JFrame {

    /**
     * Creates new form LoginPlant
     */
    public LoginPlant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGSatu = new javax.swing.JPanel();
        LognLabel = new javax.swing.JLabel();
        BGDua = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BGSatu.setBackground(new java.awt.Color(204, 204, 255));

        LognLabel.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        LognLabel.setText("LOGIN UGARDEN ");

        javax.swing.GroupLayout BGSatuLayout = new javax.swing.GroupLayout(BGSatu);
        BGSatu.setLayout(BGSatuLayout);
        BGSatuLayout.setHorizontalGroup(
            BGSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGSatuLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(LognLabel)
                .addGap(125, 125, 125))
        );
        BGSatuLayout.setVerticalGroup(
            BGSatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGSatuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LognLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(BGSatu);
        BGSatu.setBounds(12, 13, 480, 70);

        BGDua.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout BGDuaLayout = new javax.swing.GroupLayout(BGDua);
        BGDua.setLayout(BGDuaLayout);
        BGDuaLayout.setHorizontalGroup(
            BGDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        BGDuaLayout.setVerticalGroup(
            BGDuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(BGDua);
        BGDua.setBounds(12, 78, 480, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginPlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPlant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPlant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGDua;
    private javax.swing.JPanel BGSatu;
    private javax.swing.JLabel LognLabel;
    // End of variables declaration//GEN-END:variables
}
