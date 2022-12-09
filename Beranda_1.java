package tiket;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Beranda_1 extends javax.swing.JFrame {

    public Beranda_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pencetuser = new javax.swing.JButton();
        pencetadmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pencetuser.setBackground(new java.awt.Color(102, 102, 102));
        pencetuser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencetuser.setForeground(new java.awt.Color(255, 255, 255));
        pencetuser.setText("USER");
        pencetuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetuserActionPerformed(evt);
            }
        });
        getContentPane().add(pencetuser);
        pencetuser.setBounds(290, 210, 160, 50);

        pencetadmin.setBackground(new java.awt.Color(102, 102, 102));
        pencetadmin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencetadmin.setForeground(new java.awt.Color(255, 255, 255));
        pencetadmin.setText("ADMIN");
        pencetadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetadminActionPerformed(evt);
            }
        });
        getContentPane().add(pencetadmin);
        pencetadmin.setBounds(580, 210, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Beranda_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 480);

        exitbutton.setBackground(new java.awt.Color(255, 204, 0));
        exitbutton.setFont(new java.awt.Font("Cooper Black", 0, 8)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(exitbutton);
        exitbutton.setBounds(910, 10, 60, 50);

        setSize(new java.awt.Dimension(994, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pencetuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetuserActionPerformed
      dispose();
       // objek
       User_2 mulai = new User_2 ();
       mulai.setVisible(true);
//       User_2.pack();
//        User_2.setLocationRelativeTo(null);
    }//GEN-LAST:event_pencetuserActionPerformed

    private void pencetadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetadminActionPerformed
      dispose();
        // objek
        Admin_3 login = new Admin_3 ();
        login.setVisible(true);
    }//GEN-LAST:event_pencetadminActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        JFrame MyPopUp = new JFrame();
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin keluar?","Konfirmasi",JOptionPane.YES_NO_OPTION);
          
        switch(ok){
            case JOptionPane.YES_OPTION:
             JOptionPane.showMessageDialog(MyPopUp,"Anda berhasil keluar!");
             dispose();
             break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(MyPopUp,"Anda kembali ke program!");
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pencetadmin;
    private javax.swing.JButton pencetuser;
    // End of variables declaration//GEN-END:variables
}
