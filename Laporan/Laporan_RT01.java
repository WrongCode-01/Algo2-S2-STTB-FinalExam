/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

import Database.Koneksi;
import java.io.File;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author MD
 */
public class Laporan_RT01 extends javax.swing.JInternalFrame {
 private Connection koneksi;
    /**
     * Creates new form Laporan_RT01
     */
    public Laporan_RT01() {
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

        PanelHeader_Kelompok2 = new javax.swing.JPanel();
        LabelLogo1_Kelompok2 = new javax.swing.JLabel();
        LabelLogo2_Kelompok2 = new javax.swing.JLabel();
        LabelJudul1_Kelompok2 = new javax.swing.JLabel();
        PanelHeader2_Kelompok2 = new javax.swing.JPanel();
        LabelHeader2_Kelompok2 = new javax.swing.JLabel();
        ButtonKKRT01_Kelompok2 = new javax.swing.JButton();
        ButtonRT01_Kelompok2 = new javax.swing.JButton();
        ButtonBRT01_Kelompok2 = new javax.swing.JButton();

        setClosable(true);

        PanelHeader_Kelompok2.setBackground(new java.awt.Color(0, 204, 204));

        LabelLogo1_Kelompok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot_20220716-102029_1 - Copy.jpg"))); // NOI18N

        LabelLogo2_Kelompok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Screenshot_20220716-102029_1 - Copy.jpg"))); // NOI18N

        LabelJudul1_Kelompok2.setBackground(new java.awt.Color(0, 102, 102));
        LabelJudul1_Kelompok2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelJudul1_Kelompok2.setForeground(new java.awt.Color(255, 255, 255));
        LabelJudul1_Kelompok2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelJudul1_Kelompok2.setText("<html>\nDesa Sekekuda\n<br><center>RW07</center></br>\n</html> ");

        javax.swing.GroupLayout PanelHeader_Kelompok2Layout = new javax.swing.GroupLayout(PanelHeader_Kelompok2);
        PanelHeader_Kelompok2.setLayout(PanelHeader_Kelompok2Layout);
        PanelHeader_Kelompok2Layout.setHorizontalGroup(
            PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelJudul1_Kelompok2)
            .addGroup(PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHeader_Kelompok2Layout.createSequentialGroup()
                    .addComponent(LabelLogo1_Kelompok2)
                    .addGap(0, 334, Short.MAX_VALUE)))
            .addGroup(PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHeader_Kelompok2Layout.createSequentialGroup()
                    .addGap(0, 334, Short.MAX_VALUE)
                    .addComponent(LabelLogo2_Kelompok2)))
        );
        PanelHeader_Kelompok2Layout.setVerticalGroup(
            PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeader_Kelompok2Layout.createSequentialGroup()
                .addComponent(LabelJudul1_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHeader_Kelompok2Layout.createSequentialGroup()
                    .addComponent(LabelLogo1_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(PanelHeader_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelHeader_Kelompok2Layout.createSequentialGroup()
                    .addComponent(LabelLogo2_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        PanelHeader2_Kelompok2.setBackground(new java.awt.Color(0, 153, 153));

        LabelHeader2_Kelompok2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelHeader2_Kelompok2.setForeground(new java.awt.Color(255, 255, 255));
        LabelHeader2_Kelompok2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelHeader2_Kelompok2.setText("LAPORAN DATA RT 01");

        javax.swing.GroupLayout PanelHeader2_Kelompok2Layout = new javax.swing.GroupLayout(PanelHeader2_Kelompok2);
        PanelHeader2_Kelompok2.setLayout(PanelHeader2_Kelompok2Layout);
        PanelHeader2_Kelompok2Layout.setHorizontalGroup(
            PanelHeader2_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelHeader2_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelHeader2_Kelompok2Layout.setVerticalGroup(
            PanelHeader2_Kelompok2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelHeader2_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        ButtonKKRT01_Kelompok2.setBackground(new java.awt.Color(0, 51, 51));
        ButtonKKRT01_Kelompok2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonKKRT01_Kelompok2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonKKRT01_Kelompok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/family (1).png"))); // NOI18N
        ButtonKKRT01_Kelompok2.setText("KK RT-01");
        ButtonKKRT01_Kelompok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKKRT01_Kelompok2ActionPerformed(evt);
            }
        });

        ButtonRT01_Kelompok2.setBackground(new java.awt.Color(0, 51, 51));
        ButtonRT01_Kelompok2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonRT01_Kelompok2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRT01_Kelompok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/user.png"))); // NOI18N
        ButtonRT01_Kelompok2.setText("RT 01");
        ButtonRT01_Kelompok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRT01_Kelompok2ActionPerformed(evt);
            }
        });

        ButtonBRT01_Kelompok2.setBackground(new java.awt.Color(0, 51, 51));
        ButtonBRT01_Kelompok2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonBRT01_Kelompok2.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBRT01_Kelompok2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/checklist.png"))); // NOI18N
        ButtonBRT01_Kelompok2.setText("Bantuan RT-01");
        ButtonBRT01_Kelompok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBRT01_Kelompok2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHeader_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelHeader2_Kelompok2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonRT01_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonKKRT01_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonBRT01_Kelompok2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelHeader_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelHeader2_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonKKRT01_Kelompok2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBRT01_Kelompok2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRT01_Kelompok2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKKRT01_Kelompok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKKRT01_Kelompok2ActionPerformed
        try {
           HashMap parameter = new HashMap();
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql:"+"///desa_sekekuda","root","");
           File file = new File("src/Laporan/Keluarga_RT01.jasper");
           JasperReport jr = (JasperReport) JRLoader.loadObject(file);
           JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con);
           JasperViewer.viewReport(jp, false);
           JasperViewer.setDefaultLookAndFeelDecorated(true);
       }catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog(null,
                   "Data Error, Tidak Dapat Dicetak!!!"+"\n"+e.getMessage(),"Cetak",
                   javax.swing.JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_ButtonKKRT01_Kelompok2ActionPerformed

    private void ButtonRT01_Kelompok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRT01_Kelompok2ActionPerformed
       try {
           HashMap parameter = new HashMap();
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql:"+"///desa_sekekuda","root","");
           File file = new File("src/Laporan/Warga_RT01.jasper");
           JasperReport jr = (JasperReport) JRLoader.loadObject(file);
           JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con);
           JasperViewer.viewReport(jp, false);
           JasperViewer.setDefaultLookAndFeelDecorated(true);
       }catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog(null,
                   "Data Error, Tidak Dapat Dicetak!!!"+"\n"+e.getMessage(),"Cetak",
                   javax.swing.JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_ButtonRT01_Kelompok2ActionPerformed

    private void ButtonBRT01_Kelompok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBRT01_Kelompok2ActionPerformed
         try {
           HashMap parameter = new HashMap();
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql:"+"///desa_sekekuda","root","");
           File file = new File("src/Laporan/Bantuan_RT01.jasper");
           JasperReport jr = (JasperReport) JRLoader.loadObject(file);
           JasperPrint jp = JasperFillManager.fillReport(jr, parameter, con);
           JasperViewer.viewReport(jp, false);
           JasperViewer.setDefaultLookAndFeelDecorated(true);
       }catch(Exception e){
           javax.swing.JOptionPane.showMessageDialog(null,
                   "Data Error, Tidak Dapat Dicetak!!!"+"\n"+e.getMessage(),"Cetak",
                   javax.swing.JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_ButtonBRT01_Kelompok2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonBRT01_Kelompok2;
    public javax.swing.JButton ButtonKKRT01_Kelompok2;
    public javax.swing.JButton ButtonRT01_Kelompok2;
    private javax.swing.JLabel LabelHeader2_Kelompok2;
    private javax.swing.JLabel LabelJudul1_Kelompok2;
    private javax.swing.JLabel LabelLogo1_Kelompok2;
    private javax.swing.JLabel LabelLogo2_Kelompok2;
    private javax.swing.JPanel PanelHeader2_Kelompok2;
    private javax.swing.JPanel PanelHeader_Kelompok2;
    // End of variables declaration//GEN-END:variables
}
