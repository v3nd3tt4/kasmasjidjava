/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kasmas.frames;

import com.mycompany.kasmas.db.Basisdata;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vendetta
 */
public class PemasukanAddFrame extends javax.swing.JFrame {

    /**
     * Creates new form PemasukanAddFrame
     */
    public PemasukanAddFrame() {
        initComponents();
    }
    
    public PemasukanAddFrame(int id) {
        initComponents();
        try {
            Connection koneksi = Basisdata.getConnection();
            String findSQL = "SELECT * FROM tb_pemasukan WHERE id_pemasukan="+id;
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(findSQL);
            while(resultSet.next()){
                idPemasukanTextField.setText(resultSet.getString("id_pemasukan"));
                asalPemasukanTextField.setText(resultSet.getString("asal_pemasukan"));
                nominalPemasukanTextField.setText(resultSet.getString("nominal_pemasukan"));
                tanggalPemasukanTextField.setText(resultSet.getString("tanggal_pemasukan"));
                keteranganPemasukanTextField.setText(resultSet.getString("keterangan_pemasukan"));
            }
            koneksi.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idPemasukanTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        asalPemasukanTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nominalPemasukanTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tanggalPemasukanTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        keteranganPemasukanTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judulLabel.setText("Tambah Data Pemasukan");

        jLabel1.setText("ID");

        jLabel2.setText("Sumber Dana");

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Nominal Pemasukan");

        jLabel4.setText("Tanggal Pemasukan");

        jLabel5.setText("Keterangan");

        keteranganPemasukanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keteranganPemasukanTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(judulLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(batalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(asalPemasukanTextField)
                                    .addComponent(idPemasukanTextField)
                                    .addComponent(nominalPemasukanTextField)
                                    .addComponent(tanggalPemasukanTextField)
                                    .addComponent(keteranganPemasukanTextField))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idPemasukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(asalPemasukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nominalPemasukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPemasukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(keteranganPemasukanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(batalButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        if(idPemasukanTextField.getText().equals("")){
            try {
                Connection koneksi = Basisdata.getConnection();
                String insertSQL = "INSERT INTO tb_pemasukan SET " +
                "asal_pemasukan = '" + asalPemasukanTextField.getText() +"'," +
                "nominal_pemasukan = '" + nominalPemasukanTextField.getText() +"'," +
                "tanggal_pemasukan = '" + tanggalPemasukanTextField.getText() +"',"+
                "keterangan_pemasukan = '" + keteranganPemasukanTextField.getText() +"'" ;
                System.out.println(insertSQL);
                Statement statement = koneksi.createStatement();
                statement.executeUpdate(insertSQL);
                koneksi.close();
                dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            try {
                Connection koneksi = Basisdata.getConnection();
                String updateSQL = "UPDATE tb_pemasukan SET " +
                "asal_pemasukan = '" + asalPemasukanTextField.getText() +"'," +
                "nominal_pemasukan = '" + nominalPemasukanTextField.getText() +"'," +
                "tanggal_pemasukan = '" + tanggalPemasukanTextField.getText() +"',"+
                "keterangan_pemasukan = '" + keteranganPemasukanTextField.getText() +"'" +
                " WHERE id_pemasukan=" + idPemasukanTextField.getText();
                System.out.println(updateSQL);
                Statement statement = koneksi.createStatement();
                statement.executeUpdate(updateSQL);
                koneksi.close();
                dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        dispose();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void keteranganPemasukanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keteranganPemasukanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keteranganPemasukanTextFieldActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PemasukanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemasukanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemasukanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemasukanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemasukanAddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asalPemasukanTextField;
    private javax.swing.JButton batalButton;
    private javax.swing.JTextField idPemasukanTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField keteranganPemasukanTextField;
    private javax.swing.JTextField nominalPemasukanTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JTextField tanggalPemasukanTextField;
    // End of variables declaration//GEN-END:variables
}