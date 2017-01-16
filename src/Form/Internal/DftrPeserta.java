package Form.Internal;


import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author Administrator
 */
public class DftrPeserta extends javax.swing.JInternalFrame {

    /**
     * Creates new form DftrPeserta
     */
    Connection conn = null;
    ResultSet sqlResultSet = null;
    ResultSet sqlResultSet1 = null;
    Statement sqlStatement = null;
    Statement sqlStatement1 = null;
    koneksi.Koneksi konek = new Koneksi();
    private static final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    public DftrPeserta() {
        initComponents();
        this.setLocation(300, 145);
        makeCenter();
        iuran_jiwa.setEnabled(false);
        iuran_kebakaran.setEnabled(false);
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

        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rekening = new javax.swing.JTextField();
        no_ktp = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        tmpt_lahir = new javax.swing.JTextField();
        lokasi_usaha = new javax.swing.JTextField();
        jns_usaha = new javax.swing.JTextField();
        no_bmt = new javax.swing.JTextField();
        jml_pembiayaan = new javax.swing.JTextField();
        jangka_waktu = new javax.swing.JTextField();
        iuran_jiwa = new javax.swing.JTextField();
        iuran_kebakaran = new javax.swing.JTextField();
        jml_iuran = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        daftar = new javax.swing.JButton();
        tglakad = new com.toedter.calendar.JDateChooser();
        tgllahir = new com.toedter.calendar.JDateChooser();
        tgltempo = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 255));
        setClosable(true);

        jLabel20.setText("STATUS");

        jLabel19.setText("JUMLAH IURAN");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENDAFTARAN PESERTA BMT");

        rekening.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rekeningKeyTyped(evt);
            }
        });

        no_ktp.setName(""); // NOI18N
        no_ktp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_ktpKeyPressed(evt);
            }
        });

        no_bmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_bmtKeyTyped(evt);
            }
        });

        jml_pembiayaan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jml_pembiayaanKeyTyped(evt);
            }
        });

        jangka_waktu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jangka_waktuKeyTyped(evt);
            }
        });

        jLabel16.setText("TANGGAL JATUH TEMPO");

        jLabel15.setText("JANGKA WAKTU");

        jLabel14.setText("TANGGAL AKAD");

        jLabel13.setText("JUMLAH PEMBIAYAAN");

        jLabel12.setText("REKENING");

        jLabel11.setText("NO.INDUK BMT");

        jLabel10.setText("JENIS USAHA");

        jLabel9.setText("LOKASI USAHA");

        jLabel8.setText("TANGGAL LAHIR");

        jLabel7.setText("TEMPAT LAHIR");

        jLabel6.setText("ALAMAT");

        jLabel5.setText("NAMA");

        jLabel4.setText("Cek No KTP");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove_32.png"))); // NOI18N
        cancel.setText("BATAL");

        daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/simpan.png"))); // NOI18N
        daftar.setText("DAFTAR");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(daftar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tglakad.setDateFormatString("yyyy-MM-dd");
        tglakad.setMaxSelectableDate(null);
        tglakad.setMinSelectableDate(new java.util.Date(-631173512000L));

        tgllahir.setDateFormatString("yyyy-MM-dd");
        tgllahir.setMaxSelectableDate(null);
        tgllahir.setMinSelectableDate(new java.util.Date(-631173512000L));

        tgltempo.setDateFormatString("yyyy-MM-dd");
        tgltempo.setMaxSelectableDate(null);
        tgltempo.setMinSelectableDate(new java.util.Date(-631173512000L));

        jLabel21.setText("Bulan");

        jCheckBox1.setBackground(new java.awt.Color(102, 102, 255));
        jCheckBox1.setText("Iuran Jiwa");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(102, 102, 255));
        jCheckBox2.setText("Kebakaran");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Bayar", "Bayar" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tmpt_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lokasi_usaha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jns_usaha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_ktp, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgllahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(7, 7, 7))
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jangka_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21))
                                .addComponent(tglakad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jml_pembiayaan, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(tgltempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jml_iuran, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(iuran_kebakaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(iuran_jiwa, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no_bmt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rekening, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(no_bmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jml_pembiayaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(tglakad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jangka_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(tgltempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iuran_jiwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iuran_kebakaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(no_ktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tmpt_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lokasi_usaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jns_usaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jml_iuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void no_ktpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_ktpKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

            conn = konek.bukaKoneksi();
            sqlStatement = conn.createStatement();
            sqlStatement1 = conn.createStatement();
    //        conn.commit();

            String ktp = no_ktp.getText().trim();
            StringBuffer buff = new StringBuffer();
            buff.append("SELECT * FROM data_peserta WHERE NO_KTP ='").append(ktp).append("'");
            sqlResultSet = sqlStatement.executeQuery(buff.toString());
            if(sqlResultSet.next()){
                 
                no_ktp.setEnabled(false);
                no_ktp.setText(sqlResultSet.getString(1).toString()); 
                nama.setText(sqlResultSet.getString(3).toString());
                alamat.setText(sqlResultSet.getString(4).toString());
                tmpt_lahir.setText(sqlResultSet.getString(5).toString());
                tgllahir.setDate(sqlResultSet.getDate(6));
                lokasi_usaha.setText(sqlResultSet.getString(7).toString());
                jns_usaha.setText(sqlResultSet.getString(8).toString());
                no_bmt.setText(sqlResultSet.getString(9).toString());
                rekening.setText(sqlResultSet.getString(10).toString());
                jml_pembiayaan.setText(sqlResultSet.getString(11).toString());
                tglakad.setDate(sqlResultSet.getDate(12));
                tgltempo.setDate(sqlResultSet.getDate(13));
                jangka_waktu.setText(sqlResultSet.getString(14).toString());
                iuran_jiwa.setText(sqlResultSet.getString(15).toString());
                iuran_kebakaran.setText(sqlResultSet.getString(16).toString());
                jml_iuran.setText(sqlResultSet.getString(17).toString());
            }else{

                nama.isFocusable();
            }
            } catch (Exception es) {
                JOptionPane.showMessageDialog(null, es.getMessage(), "Information", JOptionPane.ERROR);
                es.printStackTrace();
            }
        } 
    }//GEN-LAST:event_no_ktpKeyPressed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        // TODO add your handling code here:
        if(no_ktp.getText() == null || no_bmt.getText() == null)
        {
            JOptionPane.showMessageDialog(null, "Please..fill the box complete", "Information", JOptionPane.PLAIN_MESSAGE);
        }else
        {
            try {
                
                conn = konek.bukaKoneksi();
                sqlStatement = conn.createStatement();
                sqlStatement1 = conn.createStatement();
//                conn.commit();
                String ktp = no_ktp.getText().trim();
                StringBuffer buff = new StringBuffer();
                buff.append("SELECT * FROM data_peserta WHERE NO_KTP ='").append(ktp).append("'");
                sqlResultSet = sqlStatement.executeQuery(buff.toString());
                buff = new StringBuffer();
                
                if(sqlResultSet.next() == true)
                {
                    buff.append("UPDATE data_peserta SET TANGGAL = '").append(sdf.format(date)).append("',")
                        .append("NAMA='").append(nama.getText()).append("',ALAMAT ='").append(alamat.getText())
                        .append("',TEMPAT_LAHIR='").append(tmpt_lahir.getText()).append("',TANGGAL_LAHIR='")
                        .append(sdf.format(tgllahir.getDate())).append("',LKS_USAHA='").append(lokasi_usaha.getText())
                        .append("',JENIS_USAHA='").append(jns_usaha.getText()).append("',NIK_BMT='").append(no_bmt.getText())
                        .append("',REKENING='").append(rekening.getText()).append("',PEMBIAYAAN='").append(Integer.valueOf(jml_pembiayaan.getText()))
                        .append("',TGL_AKAD='").append(sdf.format(tglakad.getDate())).append("',JTH_TEMPO='").append(sdf.format(tgltempo.getDate()))
                        .append("',JGK_WAKTU='").append(Integer.valueOf(jangka_waktu.getText()))
                        .append("',IURAN_JIWA='").append(Integer.valueOf(iuran_jiwa.getText()))
                        .append("',IURAN_KEBAKARAN='").append(Integer.valueOf(iuran_kebakaran.getText()))
                        .append("',JML_IURAN='").append(Integer.valueOf(jml_iuran.getText()));
                    System.out.println(buff.toString());
                    sqlStatement1.executeUpdate(buff.toString());
                    JOptionPane.showMessageDialog(null, "Update Data Success..", "Information", JOptionPane.INFORMATION_MESSAGE);
                }else
                {
                    buff.append("INSERT INTO data_peserta VALUES('").append(no_ktp.getText()).append("','").append(sdf.format(date))
                        .append("','").append(nama.getText()).append("','").append(alamat.getText()).append("','").append(tmpt_lahir.getText())
                        .append("','").append(sdf.format(tgllahir.getDate())).append("','").append(lokasi_usaha.getText())
                        .append("','").append(jns_usaha.getText()).append("','").append(no_bmt.getText())
                        .append("','").append(rekening.getText()).append("','").append(Integer.valueOf(jml_pembiayaan.getText()))
                        .append("','").append(sdf.format(tglakad.getDate())).append("','").append(sdf.format(tgltempo.getDate()))
                        .append("','").append(Integer.valueOf(jangka_waktu.getText())).append("','").append(Integer.valueOf(iuran_jiwa.getText()))
                        .append("','").append(Integer.valueOf(iuran_kebakaran.getText())).append("','").append(Integer.valueOf(jml_iuran.getText()))
                        .append("')");
                    System.out.println(buff.toString());
                    sqlStatement1.executeUpdate(buff.toString());
                    JOptionPane.showMessageDialog(null, "Insert Data Success", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Information", JOptionPane.PLAIN_MESSAGE);
                e.printStackTrace();
            }finally{
                
                try {
                    if(sqlResultSet1 != null)
                    {
                        sqlResultSet1.close();
                    }
                    if(sqlStatement1 != null)
                    {
                        sqlStatement1.close();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Information", JOptionPane.PLAIN_MESSAGE);
                }
            
            }
        }
    }//GEN-LAST:event_daftarActionPerformed

    private void no_bmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_bmtKeyTyped
        // TODO add your handling code here:
        boolean cond=true;String i = "";
	while(cond){

	 
            i=String.valueOf(evt.getKeyChar());
            for(int y=0;y<i.length();++y)if(!Character.isDigit(i.charAt(y)))evt.consume();;
            cond=false;
        }
    }//GEN-LAST:event_no_bmtKeyTyped

    private void rekeningKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rekeningKeyTyped
        // TODO add your handling code here:
         boolean cond=true;String i = "";
	while(cond){

	 
            i=String.valueOf(evt.getKeyChar());
            for(int y=0;y<i.length();++y)if(!Character.isDigit(i.charAt(y)))evt.consume();;
            cond=false;
        }
    }//GEN-LAST:event_rekeningKeyTyped

    private void jml_pembiayaanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jml_pembiayaanKeyTyped
        // TODO add your handling code here:
         boolean cond=true;String i = "";
	while(cond){

	 
            i=String.valueOf(evt.getKeyChar());
            for(int y=0;y<i.length();++y)if(!Character.isDigit(i.charAt(y)))evt.consume();;
            cond=false;
        }
    }//GEN-LAST:event_jml_pembiayaanKeyTyped

    private void jangka_waktuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jangka_waktuKeyTyped
        // TODO add your handling code here:
        if(jangka_waktu.getText().length()==3) 
         {
             evt.consume();
         }
         boolean cond=true;String i = "";
	while(cond){

	 
             i=String.valueOf(evt.getKeyChar());
            for(int y=0;y<i.length();++y)if(!Character.isDigit(i.charAt(y)))evt.consume();;
            cond=false;
            
        }
    }//GEN-LAST:event_jangka_waktuKeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            iuran_jiwa.setEnabled(true);
            iuran_jiwa.setEditable(false);
            if(jml_pembiayaan.getText() != null)
            {
                int b = (Integer.valueOf(jml_pembiayaan.getText()) / 100)*3;
                iuran_jiwa.setText(String.valueOf(b));
            }else
            {
                JOptionPane.showMessageDialog(null, "Please..fill pembiayaan textbox", "Information", JOptionPane.ERROR);
                
            }
        }else
        {
            iuran_jiwa.setEnabled(false);
            iuran_jiwa.setText("0");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected())
        {
            iuran_kebakaran.setEnabled(true);
            iuran_kebakaran.setEditable(false);
            if(jml_pembiayaan.getText() != null)
            {
                int b = (Integer.valueOf(jml_pembiayaan.getText()) / 100)*3;
                iuran_kebakaran.setText(String.valueOf(b));
            }else
            {
                JOptionPane.showMessageDialog(null, "Please..fill pembiayaan textbox", "Information", JOptionPane.ERROR);
                
            }
            
        }else
        {
            iuran_kebakaran.setEnabled(false);
            iuran_kebakaran.setText("0");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cancel;
    private javax.swing.JButton daftar;
    private javax.swing.JTextField iuran_jiwa;
    private javax.swing.JTextField iuran_kebakaran;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jangka_waktu;
    private javax.swing.JTextField jml_iuran;
    private javax.swing.JTextField jml_pembiayaan;
    private javax.swing.JTextField jns_usaha;
    private javax.swing.JTextField lokasi_usaha;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_bmt;
    private javax.swing.JTextField no_ktp;
    private javax.swing.JTextField rekening;
    private com.toedter.calendar.JDateChooser tglakad;
    private com.toedter.calendar.JDateChooser tgllahir;
    private com.toedter.calendar.JDateChooser tgltempo;
    private javax.swing.JTextField tmpt_lahir;
    // End of variables declaration//GEN-END:variables
}
