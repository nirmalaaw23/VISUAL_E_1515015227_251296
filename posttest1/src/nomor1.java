/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nirmala
 */
public class nomor1 extends javax.swing.JFrame {

    /**
     * Creates new form nomor1
     */
    public nomor1() {
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

        group1 = new javax.swing.ButtonGroup();
        panelPink1 = new widget.PanelPink();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBil1 = new javax.swing.JTextField();
        jBil2 = new javax.swing.JTextField();
        bTambah = new javax.swing.JRadioButton();
        bKurang = new javax.swing.JRadioButton();
        bKali = new javax.swing.JRadioButton();
        bBagi = new javax.swing.JRadioButton();
        jHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jHasil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nilai X");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nilai Y");

        group1.add(bTambah);
        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        group1.add(bKurang);
        bKurang.setText("Kurang");
        bKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKurangActionPerformed(evt);
            }
        });

        group1.add(bKali);
        bKali.setText("Kali");
        bKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKaliActionPerformed(evt);
            }
        });

        group1.add(bBagi);
        bBagi.setText("Bagi");
        bBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBagiActionPerformed(evt);
            }
        });

        jHitung.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jHitung.setText("HITUNG");
        jHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHitungActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hasil");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KALKULATOR NIRMALA");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPink1Layout = new javax.swing.GroupLayout(panelPink1);
        panelPink1.setLayout(panelPink1Layout);
        panelPink1Layout.setHorizontalGroup(
            panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPink1Layout.createSequentialGroup()
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPink1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPink1Layout.createSequentialGroup()
                                .addComponent(bTambah)
                                .addGap(18, 18, 18)
                                .addComponent(bKurang)
                                .addGap(18, 18, 18)
                                .addComponent(bKali)
                                .addGap(18, 18, 18)
                                .addComponent(bBagi))
                            .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelPink1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBil2))
                                .addGroup(panelPink1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBil1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addGroup(panelPink1Layout.createSequentialGroup()
                                .addComponent(jHitung)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))))
                    .addGroup(panelPink1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel4))
                    .addGroup(panelPink1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        panelPink1Layout.setVerticalGroup(
            panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPink1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bKurang)
                    .addComponent(bKali)
                    .addComponent(bBagi))
                .addGap(18, 18, 18)
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPink1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPink1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bTambahActionPerformed

    private void bKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKurangActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bKurangActionPerformed

    private void bKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKaliActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_bKaliActionPerformed

    private void bBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBagiActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bBagiActionPerformed

    private void jHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHitungActionPerformed
        // TODO add your handling code here:
        float nilai1,nilai2,hitung;
        nilai1 = Float.parseFloat(jBil1.getText());
        nilai2 = Float.parseFloat(jBil2.getText());
        
        if(bTambah.isSelected()){
        hitung = nilai1 + nilai2;
        jHasil.setText(String.valueOf(hitung));
        }
        
        else if(bKurang.isSelected()){
        hitung = nilai1 - nilai2;
        jHasil.setText(String.valueOf(hitung));
        }
        
        else if(bBagi.isSelected()){
        hitung = nilai1 % nilai2;
        jHasil.setText(String.valueOf(hitung));
        }
        
        else if(bKali.isSelected()){
        hitung = nilai1 * nilai2;
        jHasil.setText(String.valueOf(hitung));
        }
    }//GEN-LAST:event_jHitungActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jBil1.setText("");
        jBil2.setText("");
        jHasil.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nomor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nomor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bBagi;
    private javax.swing.JRadioButton bKali;
    private javax.swing.JRadioButton bKurang;
    private javax.swing.JRadioButton bTambah;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JTextField jBil1;
    private javax.swing.JTextField jBil2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jHasil;
    private javax.swing.JButton jHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private widget.PanelPink panelPink1;
    // End of variables declaration//GEN-END:variables
}
