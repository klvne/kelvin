/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Admin
 */
public class kalku extends javax.swing.JFrame {

    /**
     * Creates new form kalku
     */
    public kalku() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        operasi = new javax.swing.JComboBox();
        hitung = new javax.swing.JButton();
        bil1 = new javax.swing.JTextField();
        bil2 = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 11, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Bilangan 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 61, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Bilangan 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 101, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Operasi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 143, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 189, -1, -1));

        operasi.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        operasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "penambahan", "pengurangan", "perkalian", "pembagian" }));
        operasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiActionPerformed(evt);
            }
        });
        getContentPane().add(operasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 144, -1, 26));

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 143, 87, 27));
        getContentPane().add(bil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 58, 97, -1));
        getContentPane().add(bil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 98, 97, -1));
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 188, 98, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operasiActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
    if(operasi.getSelectedItem().toString().equalsIgnoreCase("penambahan"))
    {
        int a= Integer.parseInt(bil1.getText());
         int b= Integer.parseInt(bil2.getText());
         int jumlah = a+b;
         hasil.setText(Integer.toString(jumlah));
    }
    if(operasi.getSelectedItem().toString().equalsIgnoreCase("pengurangan"))
    {
        int a= Integer.parseInt(bil1.getText());
         int b= Integer.parseInt(bil2.getText());
         int jumlah = a-b;
         hasil.setText(Integer.toString(jumlah));
    }
    if(operasi.getSelectedItem().toString().equalsIgnoreCase("perkalian"))
    {
        int a= Integer.parseInt(bil1.getText());
         int b= Integer.parseInt(bil2.getText());
         int jumlah = a*b;
         hasil.setText(Integer.toString(jumlah));
    }
    if(operasi.getSelectedItem().toString().equalsIgnoreCase("pembagian"))
    {
        int a= Integer.parseInt(bil1.getText());
         int b= Integer.parseInt(bil2.getText());
         int jumlah = a/b;
         hasil.setText(Integer.toString(jumlah));
    }
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox operasi;
    // End of variables declaration//GEN-END:variables
}
