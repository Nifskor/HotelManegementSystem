/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dong.hotel.manegement;

import dong.hotel.mainmenu.MainMenu;
import dong.hotel.manegement.CertainPeriod;
import dong.hotel.manegement.CreateNewId;
import dong.hotel.manegement.DesignatedPeriodShare;
import dong.hotel.manegement.ExceptionReport;
import dong.hotel.manegement.HotelServiceCertainPeriod;
import dong.hotel.manegement.EtcEdit;
/**
 *
 * @author nifskorea
 */
public class ManegementMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form ManegementMainMenu
     */
    public ManegementMainMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        DesignatedPeriod_BUTT = new javax.swing.JButton();
        Income_BUTT = new javax.swing.JButton();
        Create_BUTT = new javax.swing.JButton();
        Reprot_BUTT = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Edit_BUTT = new javax.swing.JButton();
        CertainPeriod_BUTT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("관리 및 보고서");

        DesignatedPeriod_BUTT.setText("지정기간 점유율");
        DesignatedPeriod_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignatedPeriod_BUTTActionPerformed(evt);
            }
        });

        Income_BUTT.setText("객실 수입");
        Income_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Income_BUTTActionPerformed(evt);
            }
        });

        Create_BUTT.setText("ID 생성");
        Create_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_BUTTActionPerformed(evt);
            }
        });

        Reprot_BUTT.setText("예외보고서");
        Reprot_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reprot_BUTTActionPerformed(evt);
            }
        });

        jButton7.setText("이전");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Edit_BUTT.setText("정보수정");
        Edit_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_BUTTActionPerformed(evt);
            }
        });

        CertainPeriod_BUTT.setText("예상 점유율");
        CertainPeriod_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CertainPeriod_BUTTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DesignatedPeriod_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Edit_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Income_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CertainPeriod_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(Reprot_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Create_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesignatedPeriod_BUTT)
                    .addComponent(CertainPeriod_BUTT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reprot_BUTT)
                    .addComponent(Income_BUTT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit_BUTT)
                    .addComponent(Create_BUTT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MainMenu back = new MainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void DesignatedPeriod_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignatedPeriod_BUTTActionPerformed
        HotelServiceCertainPeriod next = new HotelServiceCertainPeriod();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_DesignatedPeriod_BUTTActionPerformed

    private void CertainPeriod_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CertainPeriod_BUTTActionPerformed
       CertainPeriod next = new CertainPeriod();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CertainPeriod_BUTTActionPerformed

    private void Income_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Income_BUTTActionPerformed
     DesignatedPeriodShare next = new DesignatedPeriodShare();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Income_BUTTActionPerformed

    private void Reprot_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reprot_BUTTActionPerformed
        ExceptionReport next = new ExceptionReport();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Reprot_BUTTActionPerformed

    private void Edit_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_BUTTActionPerformed
        EtcEdit next = new EtcEdit();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_BUTTActionPerformed

    private void Create_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_BUTTActionPerformed
        CreateNewId next = new CreateNewId();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Create_BUTTActionPerformed

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
            java.util.logging.Logger.getLogger(ManegementMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManegementMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManegementMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManegementMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManegementMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CertainPeriod_BUTT;
    private javax.swing.JButton Create_BUTT;
    private javax.swing.JButton DesignatedPeriod_BUTT;
    private javax.swing.JButton Edit_BUTT;
    private javax.swing.JButton Income_BUTT;
    private javax.swing.JButton Reprot_BUTT;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
