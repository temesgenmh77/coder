
package myfamproject;

/**
 *
 * @author temesgen
 */
public class Users extends javax.swing.JFrame {
    String empid;
    public Users(String loginId) {
        empid = loginId;
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitbtn = new javax.swing.JButton();
        register = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        AddAccount = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        UpdateUserAcc = new javax.swing.JButton();
        View_All_Users = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(165, 194, 32));

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        register.setText("Register user");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        changePassword.setText("Change password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        AddAccount.setText("Update User");
        AddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountActionPerformed(evt);
            }
        });

        viewProfile.setText("View my profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        UpdateUserAcc.setText("Update login detail");
        UpdateUserAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserAccActionPerformed(evt);
            }
        });

        View_All_Users.setText("View All user");
        View_All_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_All_UsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpdateUserAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(View_All_Users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(register)
                .addGap(18, 18, 18)
                .addComponent(AddAccount)
                .addGap(26, 26, 26)
                .addComponent(changePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(viewProfile)
                .addGap(18, 18, 18)
                .addComponent(UpdateUserAcc)
                .addGap(18, 18, 18)
                .addComponent(View_All_Users)
                .addGap(18, 18, 18)
                .addComponent(exitbtn)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        new User_Detail().setVisible(true);
    }//GEN-LAST:event_registerActionPerformed

    private void UpdateUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserAccActionPerformed
        new Update_Login_profile().setVisible(true);
    }//GEN-LAST:event_UpdateUserAccActionPerformed

    private void AddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountActionPerformed
        new Udate_User_detail().setVisible(true);
    }//GEN-LAST:event_AddAccountActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        new View_My_detail(empid).setVisible(true);
    }//GEN-LAST:event_viewProfileActionPerformed

    private void View_All_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_All_UsersActionPerformed
        new View_Users().setVisible(true);
    }//GEN-LAST:event_View_All_UsersActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed
   
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
//            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Users("").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccount;
    private javax.swing.JButton UpdateUserAcc;
    private javax.swing.JButton View_All_Users;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton register;
    private javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
