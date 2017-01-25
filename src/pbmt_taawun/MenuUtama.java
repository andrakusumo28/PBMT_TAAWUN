package pbmt_taawun;

import Form.Internal.ByrIuran;
import Form.Internal.DftrPeserta;
import Form.Internal.InfoDataBMT;
import Form.Internal.InfoPeserta;
import Form.Internal.InfoTagihan;
import Form.Internal.cetaklaporan;
//import Form.Internal.InputDataBMT;
import Form.Internal.UbahDataBMT;
import Form.Internal.crud_dataBMT;
import Form.Internal.crud_anggota;
import Form.Internal.crud_adm;
import Form.Internal.crud_rekening;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class MenuUtama extends javax.swing.JFrame {
    
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setTitle("Sistem Informasi Pembiayaan BMT Ta'awun");
        this.setExtendedState(MAXIMIZED_BOTH);
        CurrentDate();
        icon();
    }

  
        public void icon() {
        ImageIcon ico = new ImageIcon("src/image/pc.png");
        setIconImage(ico.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopBackground = new image.BackgroundMenu();
        jPanel1 = new javax.swing.JPanel();
        labelWaktu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuTransaksi = new javax.swing.JMenu();
        Daftar_BMT = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        aggt_bmt = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        DaftarPeserta = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        BayarIuran = new javax.swing.JMenuItem();
        MenuInformasi = new javax.swing.JMenu();
        InfoPeserta = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        InfoTagihan = new javax.swing.JMenuItem();
        mLaporan = new javax.swing.JMenu();
        cetaklaporan = new javax.swing.JMenuItem();
        MenuProperti = new javax.swing.JMenu();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        InfoDataBMT = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        crud_rekening = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        crud_anggota = new javax.swing.JMenuItem();
        MenuADM = new javax.swing.JMenu();
        crud_iuranADM = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        useradmin = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        LogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopBackgroundLayout = new javax.swing.GroupLayout(DesktopBackground);
        DesktopBackground.setLayout(DesktopBackgroundLayout);
        DesktopBackgroundLayout.setHorizontalGroup(
            DesktopBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        DesktopBackgroundLayout.setVerticalGroup(
            DesktopBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        labelWaktu.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelWaktu.setText("day, date month year hh:mm:ss");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/java-oracle.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelWaktu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        MenuTransaksi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/connect.png"))); // NOI18N
        MenuTransaksi.setText("Menu Transaksi");

        Daftar_BMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Medium 161.png"))); // NOI18N
        Daftar_BMT.setText("Daftar BMT");
        Daftar_BMT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Daftar_BMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Daftar_BMTActionPerformed(evt);
            }
        });
        MenuTransaksi.add(Daftar_BMT);
        MenuTransaksi.add(jSeparator1);

        aggt_bmt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/anggota.png"))); // NOI18N
        aggt_bmt.setText("Daftar Anggota BMT");
        aggt_bmt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aggt_bmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggt_bmtActionPerformed(evt);
            }
        });
        MenuTransaksi.add(aggt_bmt);
        MenuTransaksi.add(jSeparator2);

        DaftarPeserta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medium 130.png"))); // NOI18N
        DaftarPeserta.setText("Daftar Peserta BMT");
        DaftarPeserta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DaftarPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarPesertaActionPerformed(evt);
            }
        });
        MenuTransaksi.add(DaftarPeserta);
        MenuTransaksi.add(jSeparator11);

        BayarIuran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit toolbar.png"))); // NOI18N
        BayarIuran.setText("Pembayaran Iuran");
        BayarIuran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BayarIuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarIuranActionPerformed(evt);
            }
        });
        MenuTransaksi.add(BayarIuran);

        jMenuBar1.add(MenuTransaksi);

        MenuInformasi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuInformasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Medium 003.png"))); // NOI18N
        MenuInformasi.setText("Menu Informasi");

        InfoPeserta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Medium 044.png"))); // NOI18N
        InfoPeserta.setText("Info Peserta Taawun ");
        InfoPeserta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoPeserta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoPesertaActionPerformed(evt);
            }
        });
        MenuInformasi.add(InfoPeserta);
        MenuInformasi.add(jSeparator9);

        InfoTagihan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buku.png"))); // NOI18N
        InfoTagihan.setText("Info Tagihan");
        InfoTagihan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoTagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoTagihanActionPerformed(evt);
            }
        });
        MenuInformasi.add(InfoTagihan);

        jMenuBar1.add(MenuInformasi);

        mLaporan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/document-print.png"))); // NOI18N
        mLaporan.setText("Cetak Laporan");

        cetaklaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/document-print.png"))); // NOI18N
        cetaklaporan.setText("Laporan");
        cetaklaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetaklaporanActionPerformed(evt);
            }
        });
        mLaporan.add(cetaklaporan);

        jMenuBar1.add(mLaporan);

        MenuProperti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuProperti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Medium 020.png"))); // NOI18N
        MenuProperti.setText("Properti");
        MenuProperti.add(jSeparator8);

        InfoDataBMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Medium 044.png"))); // NOI18N
        InfoDataBMT.setText("Info Data BMT");
        InfoDataBMT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoDataBMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoDataBMTActionPerformed(evt);
            }
        });
        MenuProperti.add(InfoDataBMT);
        MenuProperti.add(jSeparator5);

        crud_rekening.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/input.png"))); // NOI18N
        crud_rekening.setText("Data Account");
        crud_rekening.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crud_rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crud_rekeningActionPerformed(evt);
            }
        });
        MenuProperti.add(crud_rekening);
        MenuProperti.add(jSeparator7);

        crud_anggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings (1).png"))); // NOI18N
        crud_anggota.setText("Data Anggota");
        crud_anggota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crud_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crud_anggotaActionPerformed(evt);
            }
        });
        MenuProperti.add(crud_anggota);

        jMenuBar1.add(MenuProperti);

        MenuADM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/utilities-system-monitor.png"))); // NOI18N
        MenuADM.setText("Administrasi");

        crud_iuranADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/single_paper.png"))); // NOI18N
        crud_iuranADM.setText("Data iuran");
        crud_iuranADM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crud_iuranADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crud_iuranADMActionPerformed(evt);
            }
        });
        MenuADM.add(crud_iuranADM);
        MenuADM.add(jSeparator4);

        useradmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_admin.png"))); // NOI18N
        useradmin.setText("UserAdmin");
        useradmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        useradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useradminActionPerformed(evt);
            }
        });
        MenuADM.add(useradmin);
        MenuADM.add(jSeparator10);

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/system-log-out.png"))); // NOI18N
        LogOut.setText("LogOut");
        LogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        MenuADM.add(LogOut);

        jMenuBar1.add(MenuADM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopBackground)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopBackground)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarPesertaActionPerformed
        // TODO add your handling code here:
        Form.Internal.DftrPeserta dftr_peserta = new DftrPeserta();
        DesktopBackground.add(dftr_peserta);
        dftr_peserta.setVisible(true);
        //dftr_peserta.setLocation(MAXIMIZED_BOTH);
    }//GEN-LAST:event_DaftarPesertaActionPerformed

    private void BayarIuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarIuranActionPerformed
        // TODO add your handling code here:
        Form.Internal.ByrIuran byr_iuran = new ByrIuran();
        DesktopBackground.add(byr_iuran);
        byr_iuran.setVisible(true);

    }//GEN-LAST:event_BayarIuranActionPerformed

    private void InfoPesertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoPesertaActionPerformed
        // TODO add your handling code here:
        Form.Internal.InfoPeserta inpes = new InfoPeserta();
        DesktopBackground.add(inpes);
        inpes.setVisible(true);
    }//GEN-LAST:event_InfoPesertaActionPerformed

    private void InfoTagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoTagihanActionPerformed
        // TODO add your handling code here:
        Form.Internal.InfoTagihan intag = new InfoTagihan();
        DesktopBackground.add(intag);
        intag.setVisible(true);
    }//GEN-LAST:event_InfoTagihanActionPerformed

    private void InfoDataBMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoDataBMTActionPerformed
        // TODO add your handling code here:
        Form.Internal.InfoDataBMT infdb = new InfoDataBMT();
        DesktopBackground.add(infdb);
        infdb.setVisible(true);
    }//GEN-LAST:event_InfoDataBMTActionPerformed

    private void crud_rekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crud_rekeningActionPerformed
        // TODO add your handling code here:
        Form.Internal.crud_rekening crudrek = new crud_rekening();
        DesktopBackground.add(crudrek);
        crudrek.setVisible(true);
    }//GEN-LAST:event_crud_rekeningActionPerformed

    private void crud_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crud_anggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crud_anggotaActionPerformed

    private void crud_iuranADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crud_iuranADMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crud_iuranADMActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_LogOutActionPerformed

    private void useradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useradminActionPerformed
        // TODO add your handling code here:
        UserAdmin user = new UserAdmin();
        DesktopBackground.add(user);
        user.setVisible(true);
    }//GEN-LAST:event_useradminActionPerformed

    private void aggt_bmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggt_bmtActionPerformed
        // TODO add your handling code here:
        crud_anggota crgt = new crud_anggota();
        DesktopBackground.add(crgt);
        crgt.setVisible(true);
        
    }//GEN-LAST:event_aggt_bmtActionPerformed

    private void cetaklaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetaklaporanActionPerformed
        // TODO add your handling code here:
        cetaklaporan cetak = new cetaklaporan();
        DesktopBackground.add(cetak);
        cetak.setVisible(true);
    }//GEN-LAST:event_cetaklaporanActionPerformed

    private void Daftar_BMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Daftar_BMTActionPerformed
        // TODO add your handling code here:
        Form.Internal.crud_dataBMT crudbmt = new crud_dataBMT();
        DesktopBackground.add(crudbmt);
        crudbmt.setVisible(true);
    }//GEN-LAST:event_Daftar_BMTActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuUtama().setVisible(true);
//            }
//        });
//    }
    
    public static void main (String args []){
    try {
        UIManager.setLookAndFeel("com.jtattoo.plaf.alumunium.AlumuniumLookAndFeel");
        SwingUtilities.updateComponentTreeUI(new MenuUtama());
    } catch (Exception e){
 
    }
    new MenuUtama().setVisible(true);
    }
    
    
//fungsi label waktu

    /**
     *
     */
    
    public void CurrentDate() {
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String[] hari = {"", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
                String[] bulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
                int tgl, bln, thn;

                Calendar kalender = Calendar.getInstance();
                tgl = kalender.get(Calendar.DATE);
                bln = kalender.get(Calendar.MONTH) + 1;
                thn = kalender.get(Calendar.YEAR);
                int hr = kalender.get(Calendar.DAY_OF_WEEK);
                labelWaktu.setText(hari[hr] + ", " + tgl + " " + bulan[bln] + " " + thn + "      "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        };
        ;new Timer(1000,action).start();
    }

    void logout() {
        int i = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Logout Dan Keluar?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BayarIuran;
    private javax.swing.JMenuItem DaftarPeserta;
    private javax.swing.JMenuItem Daftar_BMT;
    private javax.swing.JDesktopPane DesktopBackground;
    private javax.swing.JMenuItem InfoDataBMT;
    private javax.swing.JMenuItem InfoPeserta;
    private javax.swing.JMenuItem InfoTagihan;
    private javax.swing.JMenuItem LogOut;
    private javax.swing.JMenu MenuADM;
    private javax.swing.JMenu MenuInformasi;
    private javax.swing.JMenu MenuProperti;
    private javax.swing.JMenu MenuTransaksi;
    private javax.swing.JMenuItem aggt_bmt;
    private javax.swing.JMenuItem cetaklaporan;
    private javax.swing.JMenuItem crud_anggota;
    private javax.swing.JMenuItem crud_iuranADM;
    private javax.swing.JMenuItem crud_rekening;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JMenu mLaporan;
    private javax.swing.JMenuItem useradmin;
    // End of variables declaration//GEN-END:variables

    public void Assignmenu(String role)
    {
        if(role.equals("admin"))
        {
            Daftar_BMT.setVisible(false);
            aggt_bmt.setVisible(false);
        }
    }
}
