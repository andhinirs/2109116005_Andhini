package tiket;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Isi_pesan extends Method_Absrak {

    @Override
    public String pesan() {
        Component MyPopUp = null;
        JOptionPane.showMessageDialog(MyPopUp,"Selamat anda berhasil login!");
        return null;
    }

    @Override
    public String peringatantambah() {
        JOptionPane.showMessageDialog(null, "Tidak ada data yang di-tambahkan!", "Data masih kosong!", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

    @Override
    public String peringatanhapus() {
        JOptionPane.showMessageDialog(null, "Tidak ada data yang di-hapus!", "Data masih kosong!", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

    @Override
    public String peringatanupdate() {
        JOptionPane.showMessageDialog(null, "Tidak ada data yang di-update", "Data masih kosong!", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}
