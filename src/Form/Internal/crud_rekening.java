package Form.Internal;

import java.awt.Dimension;
import java.awt.Toolkit;
import koneksi.Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class crud_rekening extends javax.swing.JInternalFrame {
    
    Koneksi koneksi;
    private java.sql.Connection con;
    private java.sql.Statement stmt;
    private java.sql.ResultSet rs;
    private java.sql.PreparedStatement ps;
   
    public crud_rekening() {
        initComponents();
        makeCenter();
    }
    
    public void koneksi() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");//("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/pbmt_taawun", "sa", "0911500908");//("jdbc:mysql://localhost:3306/pbmt_taawun", "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Koneksi Gagal!", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }
    
    private void bersihdaftarubah() {
        
        txtdaftar_norek.setText("");
        txtnoteDFTR.setText("");
        txtnote_ubah.setText("");
        txtubah_rek.setText("");
        cekrek_ubah.setText("");
    }
    
    private void makeCenter() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdaftar_norek = new javax.swing.JTextField();
        cancelDFTR = new aerith.swing.AerithActionButton();
        Daftar = new aerith.swing.AerithActionButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnoteDFTR = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cekrek_ubah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtubah_rek = new javax.swing.JTextField();
        cancelUBAH = new aerith.swing.AerithActionButton();
        Ubah = new aerith.swing.AerithActionButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnote_ubah = new javax.swing.JTextArea();

        setClosable(true);
        setResizable(true);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NO.REKENING :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("KETERANGAN :");

        cancelDFTR.setText("CANCEL");
        cancelDFTR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelDFTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDFTRActionPerformed(evt);
            }
        });

        Daftar.setText("DAFTAR");
        Daftar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });

        txtnoteDFTR.setColumns(20);
        txtnoteDFTR.setRows(5);
        jScrollPane1.setViewportView(txtnoteDFTR);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelDFTR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdaftar_norek)
                    .addComponent(jScrollPane1))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdaftar_norek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelDFTR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Rekening", jPanel1);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("CEK REKENING :");

        cekrek_ubah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cekrek_ubahKeyPressed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("UBAH REKENING :");

        txtubah_rek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtubah_rekActionPerformed(evt);
            }
        });

        cancelUBAH.setText("CANCEL");
        cancelUBAH.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        Ubah.setText("UBAH");
        Ubah.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("KETERANGAN :");

        txtnote_ubah.setColumns(20);
        txtnote_ubah.setRows(5);
        jScrollPane2.setViewportView(txtnote_ubah);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtubah_rek, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekrek_ubah))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cekrek_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtubah_rek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelUBAH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Ubah Rekening", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtubah_rekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtubah_rekActionPerformed
        // TODO add your handling code here:
        // gak dipake event apa2
    }//GEN-LAST:event_txtubah_rekActionPerformed

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        // TODO add your handling code here:
        daftar();
    }//GEN-LAST:event_DaftarActionPerformed

    private void cekrek_ubahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekrek_ubahKeyPressed
        // TODO add your handling code here:
        //input norek > press enter > muncul data rekening yg akan diubah (hanya mengambil norek dan keterangan)
    }//GEN-LAST:event_cekrek_ubahKeyPressed

    private void cancelDFTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDFTRActionPerformed
        // TODO add your handling code here:
        bersihdaftarubah();
    }//GEN-LAST:event_cancelDFTRActionPerformed
    
     //insert data rekening
    private void daftar() {
        try {
            koneksi();
            String daftar
                    = "INSERT INTO [dbo].[buku_besar]"
                    + "([REKENING]"
                    + ",[KETERANGAN])VALUES(" + "?,?)";
            ps = con.prepareStatement(daftar);
            ps.setString(1, txtdaftar_norek.getText());
            ps.setString(2, txtnoteDFTR.getText());
           //ps.setString(3, txtSaldo.getText()); //> belum pasti ditambahkan
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Data Rekening Berhasil Disimpan",
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
                bersihdaftarubah();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //ubah data rekening (belum)
    private void ubah() {
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private aerith.swing.AerithActionButton Daftar;
    private aerith.swing.AerithActionButton Ubah;
    private aerith.swing.AerithActionButton cancelDFTR;
    private aerith.swing.AerithActionButton cancelUBAH;
    private javax.swing.JTextField cekrek_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtdaftar_norek;
    private javax.swing.JTextArea txtnoteDFTR;
    private javax.swing.JTextArea txtnote_ubah;
    private javax.swing.JTextField txtubah_rek;
    // End of variables declaration//GEN-END:variables
}
