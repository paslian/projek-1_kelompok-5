/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Project.Boy;
import Project.Girl;
import Project.IdealOld;

/**
 *
 * @author hp
 */
public class frameapp extends javax.swing.JFrame {
    IdealOld orang = new IdealOld();
    Boy orangB = new Boy();
    Girl orangG = new Girl();
    /**
    /**
     * Creates new form frameapp
     */
    public frameapp() {
        initComponents();
    }

    private void setLable () {
    String info = this.orang.getInfo();
    label_result.setText(info);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_bb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_tb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_boy = new javax.swing.JButton();
        btn_girl = new javax.swing.JButton();
        tf_umur = new javax.swing.JTextField();
        btn_cek = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_reset1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label_result = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setText("IDEAL WEIGHT CALCULATOR");

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel6.setText("Masukkan Berat Badan dan Tinggi anda");

        tf_bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel4.setText("KG");

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel5.setText("CM");

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel7.setText("Masukkan Umur anda");

        btn_boy.setText("Boy");
        btn_boy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_boyMouseClicked(evt);
            }
        });

        btn_girl.setText("Girl");
        btn_girl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_girlMouseClicked(evt);
            }
        });

        btn_cek.setBackground(new java.awt.Color(255, 255, 255));
        btn_cek.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cek.setText("Cek");
        btn_cek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cekMouseClicked(evt);
            }
        });
        btn_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cekActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        jLabel8.setText("Pilih Jenis Kelamin untuk melihat hasil");

        btn_reset.setBackground(new java.awt.Color(255, 255, 255));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
        });
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_reset1.setText("Reset");
        btn_reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reset1MouseClicked(evt);
            }
        });
        btn_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Hasil:");

        label_result.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        label_result.setText("...");

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel9.setText("Untuk 1 - 12 Tahun");

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel10.setText("Untuk 13 Tahun keatas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_bb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(tf_umur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_boy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_girl)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cek, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_bb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tf_tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_reset)
                            .addComponent(btn_cek))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_result)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_boy)
                    .addComponent(btn_girl)
                    .addComponent(btn_reset1))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setLableB () {
    String info = this.orangB.getInfo();
    label_result.setText(info);
}

    private void setLableG () {
    String info = this.orangG.getInfo();
    label_result.setText(info);
}
    private void tf_bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bbActionPerformed

    private void btn_boyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_boyMouseClicked
        // TODO add your handling code here:
        orangB.setUmur(Integer.parseInt(tf_umur.getText()));
        orangB.hasilinfo();
        this.orangB.getInfo();
        this.setLableB();
    }//GEN-LAST:event_btn_boyMouseClicked

    private void btn_girlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girlMouseClicked
        // TODO add your handling code here:
        orangG.setUmur(Integer.parseInt(tf_umur.getText()));
        orangG.hasilinfo();
        this.orangG.getInfo();
        this.setLableG();
    }//GEN-LAST:event_btn_girlMouseClicked

    private void btn_cekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cekMouseClicked
        // TODO add your handling code here:
        orang.setBb(Double.parseDouble(tf_bb.getText()));
        orang.setTb(Double.parseDouble(tf_tb.getText()));
        orang.hasilinfo();
        this.orang.getInfo();
        this.setLable();
    }//GEN-LAST:event_btn_cekMouseClicked

    private void btn_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cekActionPerformed

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        // TODO add your handling code here:
        tf_bb.setText(" ");
        tf_tb.setText(" ");
        label_result.setText ("...");
    }//GEN-LAST:event_btn_resetMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reset1MouseClicked
        // TODO add your handling code here:
        tf_umur.setText(" ");
        label_result.setText ("...");
    }//GEN-LAST:event_btn_reset1MouseClicked

    private void btn_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reset1ActionPerformed

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
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_boy;
    private javax.swing.JButton btn_cek;
    private javax.swing.JButton btn_girl;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_reset1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_result;
    private javax.swing.JTextField tf_bb;
    private javax.swing.JTextField tf_tb;
    private javax.swing.JTextField tf_umur;
    // End of variables declaration//GEN-END:variables

}