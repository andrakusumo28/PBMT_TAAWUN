package pbmt_taawun;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import java.sql.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author Administrator
 */
public class UserAdmin extends javax.swing.JInternalFrame implements
        java.awt.event.KeyListener {

    Koneksi koneksi;
    private java.sql.Connection con;
    private java.sql.Statement stmt;
    private java.sql.ResultSet rs;
    private java.sql.PreparedStatement ps;

    /**
     *
     */
    public UserAdmin() {
        initComponents();
        //UserAdmin.setLocationRelativeTo(this); 
        makeCenter();
        bersih();
        kupingTombol();
        ubah();
        txtPassLama.requestFocusInWindow();
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

    public void kupingTombol() {
        txtPassBaru.addKeyListener(this);
        txtKonfirmPass.addKeyListener(this);
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

    private void user() {
        try {
            koneksi();
            String sql = "select NAMA FROM [dbo].[user]";
            rs = con.createStatement().executeQuery(sql);
            if (rs.next()) {
                txtUser.setText(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bersih() {
        user();
        txtPassLama.setText("");
        txtPassBaru.setText("");
        txtKonfirmPass.setText("");
        txtnama.setText("");
        txtnomor.setText("");
        txtrole.setText("");
        txtnotes.setText("");
        txtPassLama.requestFocus();
    }

    //ubah data user/admin (belum sukses)
    private void ubah() {

        //validasi 
        if (txtPassLama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Password Lama Wajib Diisi</b></font></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtPassLama.requestFocus();
            return;
        }

        if (txtPassBaru.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Password Baru Wajib Diisi</b></font></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtPassBaru.requestFocus();
            return;
        }

        if (txtKonfirmPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Konfirmasi Password Baru Wajib Diisi</b</font></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtKonfirmPass.requestFocus();
            return;
        }

        if (txtPassLama.getText().length() < 5 || txtPassLama.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Minimal 5 Karakter & Maksimal 10 karakter</font></b></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtPassLama.selectAll();
            txtPassLama.requestFocus();
            return;
        }

        if (txtPassBaru.getText().length() < 5 || txtPassBaru.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Minimal 5 Karakter & Maksimal 10 karakter</font></b></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtPassBaru.selectAll();
            txtPassBaru.requestFocus();
            return;
        }

        if (txtKonfirmPass.getText().length() < 5 || txtKonfirmPass.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "<html><font color='RED'><b>Minimal 5 Karakter & Maksimal 10 karakter</font>/<b></html>",
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            txtKonfirmPass.selectAll();
            txtKonfirmPass.requestFocus();
            return;
        } else {
            try {
                String oldPass = "";
                koneksi();
                String sql = "select * FROM [dbo].[user]";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    oldPass = rs.getString(1);
                    if (oldPass.equals(txtPassLama.getText())) {
                        if (txtPassBaru.getText().equals(txtKonfirmPass.getText())) {
                            int reply = javax.swing.JOptionPane.showConfirmDialog(null, "Yakin Akan Diubah?",
                                    "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
                            if (reply == javax.swing.JOptionPane.YES_OPTION) {
                                String ubahPass = "update [dbo].[user] set NOMOR=?, NAMA=?, PASSWORD=?, PASSLAMA=?, KONFIRMPASS=? ROLE=? KETERANGAN=? where NAMA=''";
                                ps = con.prepareStatement(ubahPass);
                                //ps.setString(1, txtUser.getText());
                                ps.setString(1, txtnomor.getText());
                                ps.setString(2, txtnama.getText());
                                ps.setString(3, txtPassBaru.getText());
                                ps.setString(4, txtPassLama.getText());
                                ps.setString(5, txtKonfirmPass.getText());
                                ps.setString(6, txtrole.getText());
                                ps.setString(7, txtnotes.getText());
                                if (ps.executeUpdate() > 0) {
                                    JOptionPane.showMessageDialog(null, "Password Berhasil Diubah",
                                            "Informasi", JOptionPane.INFORMATION_MESSAGE);
                                    bersih();
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "<html><font color='RED'>Password Tidak Sesuai</font></html>",
                                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
                            txtPassBaru.setText("");
                            txtKonfirmPass.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><font color='RED'>Password Tidak Sesuai</font></html>",
                                "Kesalahan", JOptionPane.ERROR_MESSAGE);
                        txtPassLama.setText("");
                        txtPassBaru.setText("");
                        txtKonfirmPass.setText("");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    //insert data user/admin   
    private void save() {

        try {
            koneksi();
            String save
                    = "INSERT INTO [dbo].[user]"
                    + "([NOMOR]"
                    + ",[NAMA]"
                    + ",[PASSWORD]"
                    + ",[PASSLAMA]"
                    + ",[KONFIRMPASS]"
                    + ",[ROLE]"
                    + ",[KETERANGAN])VALUES ("
                    + "?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(save);
            //ps.setString(1, txtUser.getText());
            ps.setString(1, txtnomor.getText());
            ps.setString(2, txtnama.getText());
            ps.setString(3, txtPassBaru.getText());
            ps.setString(4, txtPassLama.getText());
            ps.setString(5, txtKonfirmPass.getText());
            ps.setString(6, txtrole.getText());
            ps.setString(7, txtnotes.getText());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Data User Berhasil Disimpan",
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
                bersih();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btSimpan = new javax.swing.JButton();
        btBersih = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtPassLama = new javax.swing.JPasswordField();
        txtPassBaru = new javax.swing.JPasswordField();
        txtKonfirmPass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnomor = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtrole = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnotes = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 0));
        setClosable(true);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  USERNAME    :");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/simpan.png"))); // NOI18N
        btSimpan.setText("UBAH");
        btSimpan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btBersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bersih2.png"))); // NOI18N
        btBersih.setText("Bersih");
        btBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBersihActionPerformed(evt);
            }
        });

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ok.png"))); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSimpan)
                .addGap(67, 67, 67)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBersih)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBersih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSimpan))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Ubah Password"));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PASSWORD LAMA :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PASSWORD BARU :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("KONFIRM PASSWORD :");

        jTextField1.setText("jTextField1");

        txtPassLama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("NOMOR :");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("NAMA :");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("KEWENANGAN :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("KETERANGAN :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPassBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtPassLama, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtKonfirmPass))
                            .addComponent(txtrole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnotes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKonfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/formadmin.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("USER SETTING");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setBounds(500, 90, 447, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        ubah();
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBersihActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btBersihActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

        // TODO add your handling code here:}//GEN-LAST:event_txtUserActionPerformed
    }

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_btn_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            //@Override
            public void run() {
                new UserAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBersih;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtKonfirmPass;
    private javax.swing.JPasswordField txtPassBaru;
    private javax.swing.JPasswordField txtPassLama;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnomor;
    private javax.swing.JTextField txtnotes;
    private javax.swing.JTextField txtrole;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        /*
         * validasi inputan pada textfield
         */
        if (e.getSource() == txtPassBaru) {
            char c = e.getKeyChar();
            if (!((Character.isLetterOrDigit(c) || (c == KeyEvent.VK_BACK_SPACE)))) {
                getToolkit().beep();
                e.consume();
            }
        }

        if (e.getSource() == txtKonfirmPass) {
            char c = e.getKeyChar();
            if (!((Character.isLetterOrDigit(c) || (c == KeyEvent.VK_BACK_SPACE)))) {
                getToolkit().beep();
                e.consume();
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
