
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;
import java.util.logging.Logger;
import javax.swing.Icon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alp Eren Yilmaz
 */
public class OkulKayit extends javax.swing.JFrame {

    /**
     * Creates new form KayitOtomasyonu
     */
    public OkulKayit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpnlKayit = new javax.swing.JTabbedPane();
        pnlEsaslar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEsaslar = new javax.swing.JTextArea();
        btEsaslarKayitEkle = new javax.swing.JButton();
        pnlKayitEkle = new javax.swing.JPanel();
        lbOgIsım = new javax.swing.JLabel();
        tfOgNo = new javax.swing.JTextField();
        lbOgBolum = new javax.swing.JLabel();
        lbSiIsım = new javax.swing.JLabel();
        tfOgIsım = new javax.swing.JTextField();
        btKaydet = new javax.swing.JButton();
        lbBolum = new javax.swing.JLabel();
        tfOgSoyisim = new javax.swing.JTextField();
        lbOgSoyisim = new javax.swing.JLabel();
        lbSiralama = new javax.swing.JLabel();
        tfOgPuan = new javax.swing.JTextField();
        lbnumara = new javax.swing.JLabel();
        tfSiralama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSiFakulte = new javax.swing.JTextField();
        tfOgBolum = new javax.swing.JTextField();
        tfKimlikNo = new javax.swing.JTextField();
        Guncelle = new javax.swing.JButton();
        pnlKayitOnay = new javax.swing.JPanel();
        btKayitOnayCikis = new javax.swing.JButton();
        btYapilanlariGor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaKayitOnay = new javax.swing.JTextArea();
        btKaydiiEkle = new javax.swing.JButton();
        pnlKayitBilgileri = new javax.swing.JPanel();
        btKayitBilgileriCikis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaKayitBilgileri = new javax.swing.JTextArea();
        sil = new javax.swing.JButton();
        tfSil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaEsaslar.setEditable(false);
        txtAreaEsaslar.setColumns(20);
        txtAreaEsaslar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaEsaslar.setForeground(new java.awt.Color(102, 102, 255));
        txtAreaEsaslar.setRows(5);
        txtAreaEsaslar.setText("\t\t\t  \n\t\t\n\t\t\t\t\n \t\t\t      KURALLAR\n\n\n\n          *Her öğrencinin okula kaydolması için bütün bilgileri\n         doğru ve eksiksiz doldurulmalıdır.\n\n          *Öğrencinin sıralaması 20000'den düşük olursa kayıt\n         gerçekleşmez.\n          \n          *Öğrencinin aldığı puan 300'den düşük olmamalıdır. Aksi\n         taktirde kayıt gerçekleşmez. \n          \n\n                     ");
        txtAreaEsaslar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtAreaEsaslar);

        btEsaslarKayitEkle.setForeground(new java.awt.Color(102, 102, 255));
        btEsaslarKayitEkle.setText("KAYIT EKLE");
        btEsaslarKayitEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEsaslarKayitEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEsaslarLayout = new javax.swing.GroupLayout(pnlEsaslar);
        pnlEsaslar.setLayout(pnlEsaslarLayout);
        pnlEsaslarLayout.setHorizontalGroup(
            pnlEsaslarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEsaslarLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btEsaslarKayitEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlEsaslarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlEsaslarLayout.setVerticalGroup(
            pnlEsaslarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEsaslarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btEsaslarKayitEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tabpnlKayit.addTab("KAYIT ESASLARI", pnlEsaslar);

        pnlKayitEkle.setForeground(new java.awt.Color(153, 0, 0));
        pnlKayitEkle.setPreferredSize(new java.awt.Dimension(659, 652));

        lbOgIsım.setForeground(new java.awt.Color(102, 102, 255));
        lbOgIsım.setText("İSİM");

        lbOgBolum.setForeground(new java.awt.Color(102, 102, 255));
        lbOgBolum.setText("PUAN");

        lbSiIsım.setForeground(new java.awt.Color(102, 102, 255));
        lbSiIsım.setText("FAKÜLTE");

        tfOgIsım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOgIsımActionPerformed(evt);
            }
        });

        btKaydet.setForeground(new java.awt.Color(102, 102, 255));
        btKaydet.setText("KAYDET VE ONAY DURUMUNU GÖR");
        btKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKaydetActionPerformed(evt);
            }
        });

        lbBolum.setForeground(new java.awt.Color(102, 102, 255));
        lbBolum.setText("BÖLÜM");

        lbOgSoyisim.setForeground(new java.awt.Color(102, 102, 255));
        lbOgSoyisim.setText("SOYİSİM");

        lbSiralama.setForeground(new java.awt.Color(102, 102, 255));
        lbSiralama.setText("SIRALAMA");

        lbnumara.setForeground(new java.awt.Color(102, 102, 255));
        lbnumara.setText("ÖĞRENCİ NUMARASI");

        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("KİMLİK NUMARASI");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/391692094602.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("İSTANBUL TEKNİK ÜNİVERSİTESİ ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("ÖĞRENCİ KAYIT PROGRAMI ");

        Guncelle.setForeground(new java.awt.Color(102, 102, 255));
        Guncelle.setText("YENİ KAYIT");
        Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKayitEkleLayout = new javax.swing.GroupLayout(pnlKayitEkle);
        pnlKayitEkle.setLayout(pnlKayitEkleLayout);
        pnlKayitEkleLayout.setHorizontalGroup(
            pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4))
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbnumara, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfOgNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfOgBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(lbSiIsım, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSiFakulte, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(lbSiralama, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSiralama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(lbOgBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOgPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(lbOgSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOgSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(lbOgIsım, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfOgIsım, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addComponent(btKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        pnlKayitEkleLayout.setVerticalGroup(
            pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKayitEkleLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKayitEkleLayout.createSequentialGroup()
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOgIsım)
                            .addComponent(tfOgIsım, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOgSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOgSoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOgBolum, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOgPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSiralama)
                            .addComponent(tfSiralama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSiIsım, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSiFakulte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBolum)
                    .addComponent(tfOgBolum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnumara)
                    .addComponent(tfOgNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pnlKayitEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        tabpnlKayit.addTab("Kayıt Ekle", pnlKayitEkle);

        btKayitOnayCikis.setBackground(new java.awt.Color(153, 0, 0));
        btKayitOnayCikis.setForeground(new java.awt.Color(255, 255, 255));
        btKayitOnayCikis.setText("ÇIKIŞ");
        btKayitOnayCikis.setRequestFocusEnabled(false);
        btKayitOnayCikis.setSelected(true);
        btKayitOnayCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKayitOnayCikisActionPerformed(evt);
            }
        });

        btYapilanlariGor.setBackground(new java.awt.Color(204, 255, 255));
        btYapilanlariGor.setText("KAYITLARI GÖR");
        btYapilanlariGor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btYapilanlariGorActionPerformed(evt);
            }
        });

        txtAreaKayitOnay.setEditable(false);
        txtAreaKayitOnay.setColumns(20);
        txtAreaKayitOnay.setRows(5);
        jScrollPane4.setViewportView(txtAreaKayitOnay);

        btKaydiiEkle.setText("KAYDI EKLE");
        btKaydiiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKaydiiEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKayitOnayLayout = new javax.swing.GroupLayout(pnlKayitOnay);
        pnlKayitOnay.setLayout(pnlKayitOnayLayout);
        pnlKayitOnayLayout.setHorizontalGroup(
            pnlKayitOnayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitOnayLayout.createSequentialGroup()
                .addGroup(pnlKayitOnayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKayitOnayLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(pnlKayitOnayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKayitOnayLayout.createSequentialGroup()
                                .addComponent(btKaydiiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)
                                .addComponent(btKayitOnayCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlKayitOnayLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btYapilanlariGor, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        pnlKayitOnayLayout.setVerticalGroup(
            pnlKayitOnayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitOnayLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(pnlKayitOnayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKayitOnayCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btKaydiiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btYapilanlariGor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        tabpnlKayit.addTab("Kayıt Onay", pnlKayitOnay);

        btKayitBilgileriCikis.setBackground(new java.awt.Color(153, 0, 0));
        btKayitBilgileriCikis.setForeground(new java.awt.Color(255, 255, 255));
        btKayitBilgileriCikis.setText("ÇIKIŞ");
        btKayitBilgileriCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKayitBilgileriCikisActionPerformed(evt);
            }
        });

        txtAreaKayitBilgileri.setEditable(false);
        txtAreaKayitBilgileri.setColumns(20);
        txtAreaKayitBilgileri.setRows(5);
        jScrollPane2.setViewportView(txtAreaKayitBilgileri);

        sil.setBackground(new java.awt.Color(255, 51, 51));
        sil.setForeground(new java.awt.Color(255, 255, 255));
        sil.setText("KAYIT SİL");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKayitBilgileriLayout = new javax.swing.GroupLayout(pnlKayitBilgileri);
        pnlKayitBilgileri.setLayout(pnlKayitBilgileriLayout);
        pnlKayitBilgileriLayout.setHorizontalGroup(
            pnlKayitBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitBilgileriLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlKayitBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlKayitBilgileriLayout.createSequentialGroup()
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(tfSil, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btKayitBilgileriCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlKayitBilgileriLayout.setVerticalGroup(
            pnlKayitBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKayitBilgileriLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(pnlKayitBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btKayitBilgileriCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        tabpnlKayit.addTab("Öğrenci Kayıt Bilgileri", pnlKayitBilgileri);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpnlKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabpnlKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKayitBilgileriCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKayitBilgileriCikisActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btKayitBilgileriCikisActionPerformed

    private void btKayitOnayCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKayitOnayCikisActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btKayitOnayCikisActionPerformed

    private void btYapilanlariGorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btYapilanlariGorActionPerformed
            tabpnlKayit.setSelectedComponent(pnlKayitBilgileri);
            
    }//GEN-LAST:event_btYapilanlariGorActionPerformed

    private void btEsaslarKayitEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEsaslarKayitEkleActionPerformed
            tabpnlKayit.setSelectedComponent(pnlKayitEkle);
    }//GEN-LAST:event_btEsaslarKayitEkleActionPerformed

    private void btKaydiiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKaydiiEkleActionPerformed
            String filepath = "C:\\Kayitlar";
            File kayitklasoru = new File(filepath);
            if (!kayitklasoru.exists()) {
                kayitklasoru.mkdir();
            }
            
            File kayitlar = new File(filepath+"\\"+ tfKimlikNo.getText()+".txt");
            
            if(!kayitlar.exists())
            {
                try
                {
                    kayitlar.createNewFile();
                }
                catch(IOException ex)
                {
                   Logger.getLogger(DonemOdeviGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try
            {
                 FileWriter icineyaz = new FileWriter(kayitlar, true);
                 PrintWriter bufyaz = new PrintWriter(icineyaz);
                 bufyaz.println(txtAreaKayitOnay.getText());
                 bufyaz.close();
                 icineyaz.close();
                 showMessage1("Kayıt başarıyla gerçekleşti!");                
            }
            catch(IOException ex)
            {
                 Logger.getLogger(DonemOdeviGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try
            {
            FileReader fr = new FileReader(kayitlar);
            BufferedReader bfr = new BufferedReader(fr);
            
            String satir;
            String metin = "";
            while((satir = bfr.readLine()) != null){
             metin += satir + "\n";
             }
            txtAreaKayitBilgileri.insert(metin, txtAreaKayitBilgileri.getDocument().getLength());
            txtAreaKayitBilgileri.insert("\n", txtAreaKayitBilgileri.getDocument().getLength());
            
            }
            catch(IOException ex)
                    {
                         Logger.getLogger(DonemOdeviGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
    }//GEN-LAST:event_btKaydiiEkleActionPerformed

    private void btKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKaydetActionPerformed
        if(isProperData(tfOgIsım)||
            isProperData(tfOgSoyisim)||
            isProperData(tfOgPuan)||
            isProperData(tfOgNo)||
            isProperData(tfOgBolum)||
            isProperData(tfSiFakulte)
        )
        {
            showMessage("Tüm öğrenci bilgileri doldurulmalıdır!");
        }
        else
        {
            String ogrenciBilgi;
            ogrenciBilgi = "Öğrenci Bilgileri:\n"+"\tKimlik No: "+ tfKimlikNo.getText()+ "\n\tAdı: " +tfOgIsım.getText()  + "\n\tSoyadı: " +
            tfOgSoyisim.getText()
            + "\n\tPuan: " + tfOgPuan.getText() + "\n\tSıralama: " + tfSiralama.getText()
            + "\n\tFakülte: "+ tfSiFakulte.getText()+
            "\n\tBölüm: "+ tfOgBolum.getText() + "\n\tÖğrenci Numarası: "+ tfOgNo.getText();

            

            if(Integer.parseInt(tfSiralama.getText())<20000 && Integer.parseInt(tfSiralama.getText())>0
                && Integer.parseInt(tfOgPuan.getText())>300)
            {
                String sonuc = ogrenciBilgi +"\n\n\n\n\t"+ "KAYIT UYGUNDUR";
                txtAreaKayitOnay.setText(sonuc);
                showMessage1("Kaydınız başarıyla gerçekleşti");
                showMessage1("Kayit Olusturuldu");
            }
            
            else
            {
                String sonucOlumsuz = ogrenciBilgi +"\n\n\n\n\t"+ "KAYIT UYGUN DEĞİLDİR";
                txtAreaKayitOnay.setText(sonucOlumsuz);
                showMessage1("Kayit gerçekleşemedi");
                
            }
            tabpnlKayit.setSelectedComponent(pnlKayitOnay);
        }

    }//GEN-LAST:event_btKaydetActionPerformed

    private void tfOgIsımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOgIsımActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOgIsımActionPerformed

    private void GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleActionPerformed
        // TODO add your handling code here:
        
        tfKimlikNo.setText("");
        tfOgIsım.setText("");
        tfOgSoyisim.setText("");
        tfOgPuan.setText("");
        tfSiralama.setText("");
        tfSiFakulte.setText("");
        tfOgBolum.setText("");
        tfOgNo.setText("");
        
    }//GEN-LAST:event_GuncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        // TODO add your handling code here:
        String filepath = "C:\\Kayitlar";
        
        
        
        File kayitsil = new File(filepath+"\\"+ tfSil.getText()+".txt");
        
        if(tfSil.getText() == ""){
            showmessage1("Lutfen silmek istediğiniz kaydın "
                    + " kimlik numarasını giriniz");
        }
        kayitsil.delete();
        
        
    }//GEN-LAST:event_silActionPerformed
    public boolean isProperData(JTextComponent c)
    {
       if(c.getText().length() == 0)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonemOdeviGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OkulKayit().setVisible(true);
            }
        });
    }
     private void showMessage(String message) {
         JOptionPane.showMessageDialog(null,message, "Inproper Entry",
                JOptionPane.WARNING_MESSAGE); //To change body of generated methods, choose Tools | Templates.
    }
    private void showMessage1(String message)
    {
        JOptionPane.showMessageDialog(null,message,"Sonuç",JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guncelle;
    private javax.swing.JButton btEsaslarKayitEkle;
    private javax.swing.JButton btKaydet;
    private javax.swing.JButton btKaydiiEkle;
    private javax.swing.JButton btKayitBilgileriCikis;
    private javax.swing.JButton btKayitOnayCikis;
    private javax.swing.JButton btYapilanlariGor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbBolum;
    private javax.swing.JLabel lbOgBolum;
    private javax.swing.JLabel lbOgIsım;
    private javax.swing.JLabel lbOgSoyisim;
    private javax.swing.JLabel lbSiIsım;
    private javax.swing.JLabel lbSiralama;
    private javax.swing.JLabel lbnumara;
    private javax.swing.JPanel pnlEsaslar;
    private javax.swing.JPanel pnlKayitBilgileri;
    private javax.swing.JPanel pnlKayitEkle;
    private javax.swing.JPanel pnlKayitOnay;
    private javax.swing.JButton sil;
    private javax.swing.JTabbedPane tabpnlKayit;
    private javax.swing.JTextField tfKimlikNo;
    private javax.swing.JTextField tfOgBolum;
    private javax.swing.JTextField tfOgIsım;
    private javax.swing.JTextField tfOgNo;
    private javax.swing.JTextField tfOgPuan;
    private javax.swing.JTextField tfOgSoyisim;
    private javax.swing.JTextField tfSiFakulte;
    private javax.swing.JTextField tfSil;
    private javax.swing.JTextField tfSiralama;
    private javax.swing.JTextArea txtAreaEsaslar;
    private javax.swing.JTextArea txtAreaKayitBilgileri;
    private javax.swing.JTextArea txtAreaKayitOnay;
    // End of variables declaration//GEN-END:variables

    private void showmessage1(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
