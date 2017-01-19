package Form.Internal;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Administrator
 */
public class crud_anggota extends javax.swing.JInternalFrame {

    /**
     * Creates new form crud_anggota
     */
    public crud_anggota() {
        initComponents();
        makeCenter();
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

        tab_anggota = new javax.swing.JTabbedPane();
        pnl_anggota = new javax.swing.JPanel();
        aerithLabel1 = new aerith.swing.AerithLabel();
        aerithLabel2 = new aerith.swing.AerithLabel();
        aerithLabel14 = new aerith.swing.AerithLabel();
        aerithLabel15 = new aerith.swing.AerithLabel();
        aerithLabel16 = new aerith.swing.AerithLabel();
        txtno_ktp = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_templahir = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        aerithLabel17 = new aerith.swing.AerithLabel();
        aerithLabel18 = new aerith.swing.AerithLabel();
        aerithLabel19 = new aerith.swing.AerithLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        aerithActionButton1 = new aerith.swing.AerithActionButton();
        aerithActionButton2 = new aerith.swing.AerithActionButton();
        jPanel1 = new javax.swing.JPanel();
        pnl_anggota1 = new javax.swing.JPanel();
        aerithLabel3 = new aerith.swing.AerithLabel();
        aerithLabel4 = new aerith.swing.AerithLabel();
        aerithLabel20 = new aerith.swing.AerithLabel();
        aerithLabel21 = new aerith.swing.AerithLabel();
        aerithLabel22 = new aerith.swing.AerithLabel();
        txtno_ktp1 = new javax.swing.JTextField();
        txtnama1 = new javax.swing.JTextField();
        txt_alamat1 = new javax.swing.JTextField();
        txt_templahir1 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        aerithLabel23 = new aerith.swing.AerithLabel();
        aerithLabel24 = new aerith.swing.AerithLabel();
        aerithLabel25 = new aerith.swing.AerithLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        aerithActionButton3 = new aerith.swing.AerithActionButton();
        aerithActionButton4 = new aerith.swing.AerithActionButton();

        setClosable(true);

        tab_anggota.setBackground(new java.awt.Color(102, 102, 255));
        tab_anggota.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        pnl_anggota.setBackground(new java.awt.Color(102, 102, 255));

        aerithLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel1.setText("NO.KTP :");
        aerithLabel1.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel2.setText("NAMA :");
        aerithLabel2.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel14.setText("ALAMAT :");
        aerithLabel14.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel15.setText("TEMPAT LAHIR :");
        aerithLabel15.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel16.setText("TANGGAL LAHIR :");
        aerithLabel16.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        txtno_ktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtno_ktpActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("YYYY-MM-dd");
        jDateChooser1.setMaxSelectableDate(null);
        jDateChooser1.setMinSelectableDate(new java.util.Date(-631173512000L));

        aerithLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel17.setText("LOKASI USAHA :");
        aerithLabel17.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel18.setText("JENIS USAHA :");
        aerithLabel18.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel19.setText("NIK BMT :");
        aerithLabel19.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithActionButton1.setText("CANCEL");
        aerithActionButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        aerithActionButton2.setText("DAFTAR");
        aerithActionButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnl_anggotaLayout = new javax.swing.GroupLayout(pnl_anggota);
        pnl_anggota.setLayout(pnl_anggotaLayout);
        pnl_anggotaLayout.setHorizontalGroup(
            pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_anggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aerithLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(aerithLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aerithLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aerithLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtno_ktp)
                    .addComponent(txtnama)
                    .addComponent(txt_alamat)
                    .addComponent(txt_templahir)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_anggotaLayout.createSequentialGroup()
                        .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aerithLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aerithLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aerithLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(pnl_anggotaLayout.createSequentialGroup()
                        .addComponent(aerithActionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aerithActionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnl_anggotaLayout.setVerticalGroup(
            pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_anggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno_ktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aerithLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_anggotaLayout.createSequentialGroup()
                        .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aerithLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aerithActionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aerithActionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_templahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aerithLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tab_anggota.addTab("Daftar Anggota BMT", pnl_anggota);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        pnl_anggota1.setBackground(new java.awt.Color(102, 102, 255));

        aerithLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel3.setText("NO.KTP :");
        aerithLabel3.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel4.setText("NAMA :");
        aerithLabel4.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel20.setText("ALAMAT :");
        aerithLabel20.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel21.setText("TEMPAT LAHIR :");
        aerithLabel21.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel22.setText("TANGGAL LAHIR :");
        aerithLabel22.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        txtno_ktp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtno_ktp1ActionPerformed(evt);
            }
        });

        jDateChooser2.setDateFormatString("YYYY-MM-dd");
        jDateChooser2.setMaxSelectableDate(null);
        jDateChooser2.setMinSelectableDate(new java.util.Date(-631173512000L));

        aerithLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel23.setText("LOKASI USAHA :");
        aerithLabel23.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel24.setText("JENIS USAHA :");
        aerithLabel24.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aerithLabel25.setText("NIK BMT :");
        aerithLabel25.setFont(new java.awt.Font("Default", 1, 12)); // NOI18N

        aerithActionButton3.setText("CANCEL");
        aerithActionButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        aerithActionButton4.setText("SIMPAN");
        aerithActionButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout pnl_anggota1Layout = new javax.swing.GroupLayout(pnl_anggota1);
        pnl_anggota1.setLayout(pnl_anggota1Layout);
        pnl_anggota1Layout.setHorizontalGroup(
            pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_anggota1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aerithLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(aerithLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aerithLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aerithLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtno_ktp1)
                    .addComponent(txtnama1)
                    .addComponent(txt_alamat1)
                    .addComponent(txt_templahir1)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_anggota1Layout.createSequentialGroup()
                        .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aerithLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aerithLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aerithLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(pnl_anggota1Layout.createSequentialGroup()
                        .addComponent(aerithActionButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aerithActionButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnl_anggota1Layout.setVerticalGroup(
            pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_anggota1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtno_ktp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aerithLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aerithLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_alamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_anggota1Layout.createSequentialGroup()
                        .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aerithLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aerithActionButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aerithActionButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aerithLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_templahir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_anggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aerithLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_anggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_anggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_anggota.addTab("Ubah Anggota BMT", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_anggota)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_anggota)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtno_ktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtno_ktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtno_ktpActionPerformed

    private void txtno_ktp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtno_ktp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtno_ktp1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private aerith.swing.AerithActionButton aerithActionButton1;
    private aerith.swing.AerithActionButton aerithActionButton2;
    private aerith.swing.AerithActionButton aerithActionButton3;
    private aerith.swing.AerithActionButton aerithActionButton4;
    private aerith.swing.AerithLabel aerithLabel1;
    private aerith.swing.AerithLabel aerithLabel14;
    private aerith.swing.AerithLabel aerithLabel15;
    private aerith.swing.AerithLabel aerithLabel16;
    private aerith.swing.AerithLabel aerithLabel17;
    private aerith.swing.AerithLabel aerithLabel18;
    private aerith.swing.AerithLabel aerithLabel19;
    private aerith.swing.AerithLabel aerithLabel2;
    private aerith.swing.AerithLabel aerithLabel20;
    private aerith.swing.AerithLabel aerithLabel21;
    private aerith.swing.AerithLabel aerithLabel22;
    private aerith.swing.AerithLabel aerithLabel23;
    private aerith.swing.AerithLabel aerithLabel24;
    private aerith.swing.AerithLabel aerithLabel25;
    private aerith.swing.AerithLabel aerithLabel3;
    private aerith.swing.AerithLabel aerithLabel4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel pnl_anggota;
    private javax.swing.JPanel pnl_anggota1;
    private javax.swing.JTabbedPane tab_anggota;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_alamat1;
    private javax.swing.JTextField txt_templahir;
    private javax.swing.JTextField txt_templahir1;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnama1;
    private javax.swing.JTextField txtno_ktp;
    private javax.swing.JTextField txtno_ktp1;
    // End of variables declaration//GEN-END:variables
}
