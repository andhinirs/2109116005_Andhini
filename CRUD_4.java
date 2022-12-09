package tiket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUD_4 extends javax.swing.JFrame implements Method_CRUD {
 
    Connection con = null;
    final String dburl = "jdbc:mysql://localhost:3306/bioskop";
    final String username = "root";
    final String password = "";
    DefaultTableModel model;
    private Statement stat;
    private ResultSet res;
    // method abstrak
    Isi_pesan isiabstrak = new Isi_pesan();

    public CRUD_4() {
        initComponents();
        String[] bioskop = {"Id_film","Judul","Jadwal","Durasi","Harga","Keterangan"};
        model = new DefaultTableModel (bioskop, 0);
        tabel_lihat.setModel (model);
        tampil();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kolomjudul = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kolomjadwal = new javax.swing.JTextField();
        kolomketerangan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pencethapus = new javax.swing.JButton();
        kolomdurasi = new javax.swing.JTextField();
        kembali = new javax.swing.JLabel();
        pencetupdate = new javax.swing.JButton();
        pencettambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_lihat = new javax.swing.JTable();
        kolomharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pencetreset = new javax.swing.JButton();
        kolomid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pencetbalik = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 100, 54, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 150, 51, 0);

        kolomjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomjudulActionPerformed(evt);
            }
        });
        getContentPane().add(kolomjudul);
        kolomjudul.setBounds(400, 120, 179, 31);

        jLabel27.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel27);
        jLabel27.setBounds(158, 98, 0, 0);

        kolomjadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomjadwalActionPerformed(evt);
            }
        });
        getContentPane().add(kolomjadwal);
        kolomjadwal.setBounds(600, 120, 179, 32);

        kolomketerangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomketeranganActionPerformed(evt);
            }
        });
        getContentPane().add(kolomketerangan);
        kolomketerangan.setBounds(600, 190, 179, 32);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 50, 44, 0);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 50, 53, 0);

        pencethapus.setBackground(new java.awt.Color(51, 51, 51));
        pencethapus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencethapus.setForeground(new java.awt.Color(255, 255, 255));
        pencethapus.setText("Hapus");
        pencethapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencethapusActionPerformed(evt);
            }
        });
        getContentPane().add(pencethapus);
        pencethapus.setBounds(850, 320, 100, 40);

        kolomdurasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomdurasiActionPerformed(evt);
            }
        });
        getContentPane().add(kolomdurasi);
        kolomdurasi.setBounds(200, 190, 179, 31);

        kembali.setBackground(new java.awt.Color(51, 255, 204));
        kembali.setFont(new java.awt.Font("OCR A Extended", 0, 10)); // NOI18N
        kembali.setForeground(new java.awt.Color(0, 0, 153));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        getContentPane().add(kembali);
        kembali.setBounds(918, 429, 0, 15);

        pencetupdate.setBackground(new java.awt.Color(51, 51, 51));
        pencetupdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencetupdate.setForeground(new java.awt.Color(255, 255, 255));
        pencetupdate.setText("Update");
        pencetupdate.setMaximumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setMinimumSize(new java.awt.Dimension(81, 28));
        pencetupdate.setPreferredSize(new java.awt.Dimension(81, 28));
        pencetupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetupdateActionPerformed(evt);
            }
        });
        getContentPane().add(pencetupdate);
        pencetupdate.setBounds(850, 250, 100, 40);

        pencettambah.setBackground(new java.awt.Color(51, 51, 51));
        pencettambah.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencettambah.setForeground(new java.awt.Color(255, 255, 255));
        pencettambah.setText("Tambah");
        pencettambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencettambahActionPerformed(evt);
            }
        });
        getContentPane().add(pencettambah);
        pencettambah.setBounds(850, 180, 100, 40);

        tabel_lihat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id_film", "Judul", "Jadwal", "Durasi", "Harga", "Keterangan"
            }
        ));
        tabel_lihat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_lihatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_lihat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 230, 680, 240);

        kolomharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomhargaActionPerformed(evt);
            }
        });
        getContentPane().add(kolomharga);
        kolomharga.setBounds(400, 190, 179, 31);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(179, 124, 87));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 100, 76, 0);

        pencetreset.setBackground(new java.awt.Color(51, 51, 51));
        pencetreset.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pencetreset.setForeground(new java.awt.Color(255, 255, 255));
        pencetreset.setText("Reset");
        pencetreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetresetActionPerformed(evt);
            }
        });
        getContentPane().add(pencetreset);
        pencetreset.setBounds(850, 390, 100, 40);

        kolomid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomidActionPerformed(evt);
            }
        });
        getContentPane().add(kolomid);
        kolomid.setBounds(200, 120, 179, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/CRUD_4.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 480);

        pencetbalik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencetbalikActionPerformed(evt);
            }
        });
        getContentPane().add(pencetbalik);
        pencetbalik.setBounds(910, 10, 70, 50);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(179, 124, 87));
        jLabel9.setText("Harga");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 150, 53, 21);

        setSize(new java.awt.Dimension(994, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kolomjadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomjadwalActionPerformed
        
    }//GEN-LAST:event_kolomjadwalActionPerformed

    private void kolomdurasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomdurasiActionPerformed
        
    }//GEN-LAST:event_kolomdurasiActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        new Admin_3().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliMouseClicked

    private void tabel_lihatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_lihatMouseClicked
        int i = tabel_lihat.getSelectedRow();
        if (i >-1){
            kolomid.setText(model.getValueAt(i, 0).toString());
            kolomjudul.setText(model.getValueAt(i, 1).toString());
            kolomjadwal.setText(model.getValueAt(i, 2).toString());
            kolomdurasi.setText(model.getValueAt(i, 3).toString());
            kolomharga.setText(model.getValueAt(i, 4).toString());
            kolomketerangan.setText(model.getValueAt(i, 5).toString());     
            kolomid.setEditable(false);
    }//GEN-LAST:event_tabel_lihatMouseClicked
    
       }     
    private void pencethapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencethapusActionPerformed
        hapus();
    }//GEN-LAST:event_pencethapusActionPerformed

    private void pencettambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencettambahActionPerformed
        tambah(); 
    }//GEN-LAST:event_pencettambahActionPerformed

    private void pencetupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetupdateActionPerformed
        update();
    }//GEN-LAST:event_pencetupdateActionPerformed

    private void kolomketeranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomketeranganActionPerformed

    }//GEN-LAST:event_kolomketeranganActionPerformed

    private void kolomhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomhargaActionPerformed

    private void kolomidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomidActionPerformed

    private void pencetresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetresetActionPerformed
        kolomid.setText("");
        kolomjudul.setText("");
        kolomjadwal.setText("");
        kolomdurasi.setText("");
        kolomharga.setText("");
        kolomketerangan.setText("");
        kolomid.setEditable(true);
    }//GEN-LAST:event_pencetresetActionPerformed

    private void pencetbalikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencetbalikActionPerformed
       dispose();
            Admin_3 admin = new Admin_3();
            admin.setVisible(true);
    }//GEN-LAST:event_pencetbalikActionPerformed

    private void kolomjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomjudulActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_4().setVisible(true);
            }
        });
    }
    //method
    @Override
    public void tambah() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (kolomid.getText().equals("")||
                        kolomjudul.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdurasi.getText().equals("")||
                        kolomharga.getText().equals("")||
                        kolomketerangan.getText().equals("")){
                  isiabstrak.peringatantambah();
                return;
                }  
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `data_film` WHERE Judul = '" + kolomid.getText() + "'");
                if (rs.next()){
                JOptionPane.showMessageDialog(null, "Id_film sudah tersedia!");  
                } else {
                con.createStatement().executeUpdate("INSERT INTO `data_film` VALUES"+"('"+kolomid.getText()+"','"+kolomjudul.getText()+"','"+kolomjadwal.getText()+"','"+kolomdurasi.getText()+"','"+kolomharga.getText()+"','"+kolomketerangan.getText()+"')"); 
                JOptionPane.showMessageDialog(null, "Data berhasil di-tambahkan!");
                tampil();} 
                     {
        }
                }catch (SQLException se) {
            System.out.println(se);
            } 
    }
    
    @Override
    public void hapus() {
         try {
             con = DriverManager.getConnection(dburl, username, password);
                if (kolomid.getText().equals("")||
                        kolomjudul.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdurasi.getText().equals("")||
                        kolomharga.getText().equals("")||
                        kolomketerangan.getText().equals("")){
                  isiabstrak.peringatanhapus();
                return;
                }
             
             
             else {
            con.createStatement().executeUpdate("DELETE FROM `data_film` WHERE Id_film = '"+kolomid.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data berhasil di-hapus!");
            tampil();}
        }       catch(SQLException se){
                System.out.println(se);
        }
    }
    
    @Override
    public void update() {
        try {
            con = DriverManager.getConnection(dburl, username, password);
                if (kolomid.getText().equals("")||
                        kolomjudul.getText().equals("")||
                        kolomjadwal.getText().equals("")||
                        kolomdurasi.getText().equals("")||
                        kolomharga.getText().equals("")||
                        kolomketerangan.getText().equals("")){
                  isiabstrak.peringatanupdate();
                return;
                }   
                else{
            con.createStatement().executeUpdate("UPDATE `data_film` SET `Id_film`='"+kolomid.getText()+"',`Judul`='"+kolomjudul.getText()+"',`Jadwal`='"+kolomjadwal.getText()+"',`Durasi`='"+kolomdurasi.getText()+"',`Harga`='"+kolomharga.getText()+"',`Keterangan`='"+kolomketerangan.getText()+"' WHERE Id_film = '" + kolomid.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data berhasil di-update!");
            tampil();}
        }       catch(SQLException se){           
                System.out.println(se);
        }
    }
    
     private void tampil() {
       int row = tabel_lihat.getRowCount();
       for (int i = 0;i<row;i++){
           model.removeRow(0);
       }   
      try {
         con = DriverManager.getConnection(dburl, username, password);
         ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `data_film`");
         while(rs.next()){
             String[] data = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
             model.addRow(data);
         }
         if (con != null) {
         }
      } catch (SQLException se) {
          System.out.println(se);
      }
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField kolomdurasi;
    private javax.swing.JTextField kolomharga;
    private javax.swing.JTextField kolomid;
    private javax.swing.JTextField kolomjadwal;
    private javax.swing.JTextField kolomjudul;
    private javax.swing.JTextField kolomketerangan;
    private javax.swing.JButton pencetbalik;
    private javax.swing.JButton pencethapus;
    private javax.swing.JButton pencetreset;
    private javax.swing.JButton pencettambah;
    private javax.swing.JButton pencetupdate;
    private javax.swing.JTable tabel_lihat;
    // End of variables declaration//GEN-END:variables
}

