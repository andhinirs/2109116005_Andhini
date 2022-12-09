package tiket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Admin_3 extends javax.swing.JFrame {
    
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
    public Admin_3() {    
        koneksi();
        initComponents();
       
    }
    private void koneksi(){
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/bioskop", "root", "");
    stat=con.createStatement();
    } catch(ClassNotFoundException | SQLException e){
                System.out.println("Error loading driver : "+e.getMessage());
}   
}
    
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JButton();
        tombolkembali = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(96, 65, 43));
        jButton1.setFont(new java.awt.Font("Calisto MT", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(null);

        username.setCaretColor(new java.awt.Color(102, 102, 102));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(410, 160, 350, 30);

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 100, 0);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(410, 220, 350, 30);

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 220, 79, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Admin_3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 480);

        LOGIN.setBackground(new java.awt.Color(153, 255, 204));
        LOGIN.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(0, 204, 102));
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN);
        LOGIN.setBounds(430, 280, 100, 40);

        tombolkembali.setBackground(new java.awt.Color(153, 255, 204));
        tombolkembali.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tombolkembali.setForeground(new java.awt.Color(0, 204, 102));
        tombolkembali.setText("KEMBALI");
        tombolkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(tombolkembali);
        tombolkembali.setBounds(910, 10, 70, 40);

        setSize(new java.awt.Dimension(994, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
      
    }//GEN-LAST:event_pwActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed

         try {
            res=stat.executeQuery("SELECT * FROM admin WHERE Id_user='"+username.getText()+"' AND Password='"+pw.getText()+"'");
            
            if(res.next()){
                if(username.getText().equals(res.getString("Id_user")) && pw.getText().equals(res.getString("Password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    CRUD_4 kelola = new CRUD_4();
                    kelola.setVisible(true);
                    dispose();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         
    }//GEN-LAST:event_LOGINActionPerformed

    private void tombolkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkembaliActionPerformed
        dispose();
        //objek
        Beranda_1 home = new Beranda_1();
        home.setVisible(true);
    }//GEN-LAST:event_tombolkembaliActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton tombolkembali;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}



