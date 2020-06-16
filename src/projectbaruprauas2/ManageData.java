
package projectbaruprauas2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageData extends javax.swing.JFrame {

    public ManageData() {
        initComponents();
        tampilKelurahan();
        tampilKecamatan();
        tampilKabupaten();
        tampilKasus();
        getDataOrang();
    }
    
    public void getDataOrang() {
        DefaultTableModel isiTabel = new DefaultTableModel();
        isiTabel.addColumn("Id");
        isiTabel.addColumn("Jenis Kasus");
        isiTabel.addColumn("Kelurahan");
        isiTabel.addColumn("Kecamatan");
        isiTabel.addColumn("Kabupaten");
        isiTabel.addColumn("Jumlah Penderita");
        
        try {
                    Connection conn = (Connection)Koneksi.koneksiDB();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM orang_baru");
                    
                    while (rs.next()) {				
                            isiTabel.addRow(new Object[]{
                                rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5),
                                rs.getString(6)
                            });
                    }
                    tabel.setModel(isiTabel);

            } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Tidak bisa load data dari tabel orang");
            }
    }
    
    private void tampilKabupaten()
	{
            try {
                    Connection conn = (Connection)Koneksi.koneksiDB();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM kabupaten");
                    kabupaten.addItem("------Pilih Kabupaten------");

                    while (rs.next()) {
                        kabupaten.addItem(rs.getString("kabupaten_nama"));
                    }
                    rs.close();
                    st.close();
            } catch (SQLException e) {
                    System.out.println(e.getMessage());
            }
	}
	
	private void tampilKecamatan()
	{
            try {
                    Connection conn = (Connection)Koneksi.koneksiDB();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM kecamatan");
                    kecamatan.addItem("------Pilih Kecamatan------");

                    while (rs.next()) {
                        kecamatan.addItem(rs.getString("kecamatan_nama"));
                    }
                    rs.close();
                    st.close();
            } catch (SQLException e) {
                    System.out.println(e.getMessage());
            }
	}
	
	private void tampilKelurahan()
	{
            try {
                    Connection conn = (Connection)Koneksi.koneksiDB();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM kelurahan");
                    kelurahan.addItem("------Pilih Kelurahan------");
                    
                    while (rs.next()) {
                        kelurahan.addItem(rs.getString("kelurahan_nama"));
                    }
                    rs.close();
                    st.close();
            } catch (SQLException e) {
                    System.out.println(e.getMessage());
            }
	}
        
        private void tampilKasus() {
            try {
                Connection conn = (Connection)Koneksi.koneksiDB();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM kasus");
                kasus.addItem("------Pilih Kasus------");
                
                while (rs.next()) {                    
                    kasus.addItem(rs.getString("nama"));
                }
                rs.close();
                st.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        kelurahan = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kecamatan = new javax.swing.JComboBox();
        kabupaten = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        kasus = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelola Data");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jLabel1.setText("Kelurahan");

        jLabel2.setText("Kecamatan");

        jLabel3.setText("Kabupaten");

        jLabel4.setText("Kasus");

        jLabel5.setText("Jumlah");

        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Ubah");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel6.setText("Kelola Data Covid-19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kasus, 0, 175, Short.MAX_VALUE)
                                    .addComponent(jumlah)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(121, 121, 121)
                                        .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(114, 114, 114)
                                        .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(56, 56, 56)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(66, 66, 66)
                                .addComponent(btnReset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kasus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
                int id = 0;
                Connection koneksi = (Connection)Koneksi.koneksiDB();
                String sql = "INSERT INTO orang_baru VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = koneksi.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setInt(2, kasus.getSelectedIndex());
                ps.setString(3, kelurahan.getSelectedItem().toString());
                ps.setString(4, kecamatan.getSelectedItem().toString());
                ps.setString(5, kabupaten.getSelectedItem().toString());
                ps.setString(6, jumlah.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil menambahkan");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal menambah data baru");
        }
        getDataOrang();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String kode = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
        try {
                String sql = "DELETE FROM orang_baru WHERE id=?";
                Connection koneksi = (Connection)Koneksi.koneksiDB();
                PreparedStatement ps = koneksi.prepareStatement(sql);
                ps.setString(1, kode);
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(null, "Berhasil menghapus");
                System.out.println(kode);
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus");
        }
        getDataOrang();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.rowAtPoint(evt.getPoint());
        int kasus = Integer.parseInt( tabel.getValueAt(baris, 1).toString() );
        this.kasus.setSelectedIndex(kasus);
        String kelurahan = tabel.getValueAt(baris, 2).toString();
        this.kelurahan.setSelectedItem(kelurahan);
        String kecamatan = tabel.getValueAt(baris, 3).toString();
        this.kecamatan.setSelectedItem(kecamatan);
        String kabupaten = tabel.getValueAt(baris, 4).toString();
        this.kabupaten.setSelectedItem(kabupaten);
        String jumlah = tabel.getValueAt(baris, 5).toString();
        this.jumlah.setText(jumlah);
    }//GEN-LAST:event_tabelMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String kode = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
        try {
                String sql = "UPDATE orang_baru SET kasus_id=?, kelurahan=?, kecamatan=?, kabupaten=?, jumlah=? WHERE id=?";
                Connection koneksi = (Connection)Koneksi.koneksiDB();
                PreparedStatement ps = koneksi.prepareStatement(sql);

                ps.setInt(1, kasus.getSelectedIndex());
                ps.setString(2, kelurahan.getSelectedItem().toString());
                ps.setString(3, kecamatan.getSelectedItem().toString());
                ps.setString(4, kabupaten.getSelectedItem().toString());
                ps.setString(5, jumlah.getText());
                ps.setString(6, kode);
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(null, "Berhasil mengubah");
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal mengubah");
        }
        getDataOrang();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        kelurahan.setSelectedIndex(0);
        kecamatan.setSelectedIndex(0);
        kabupaten.setSelectedIndex(0);
        kasus.setSelectedIndex(0);
        jumlah.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JComboBox kabupaten;
    private javax.swing.JComboBox kasus;
    private javax.swing.JComboBox kecamatan;
    private javax.swing.JComboBox kelurahan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
