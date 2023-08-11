
package myfamproject;

public class Update_Login_profile extends javax.swing.JFrame {
    
    public Update_Login_profile() {
        
        initComponents();        
        try{
            int i=0;
            Eid.addItem("Select Id");
        DbConnection db = new DbConnection();
        db.stm = db.con.createStatement();
        db.rs = db.stm.executeQuery("select EmplID from user_detail" );
        while(db.rs.next()){
            Eid.addItem(db.rs.getString(1));            
        }
        }catch(Exception ex){System.out.println("Solution!!!: "+ ex.getMessage());}        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        role = new javax.swing.JTextField();
        isuedDate = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addUserbtn = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        pword2 = new javax.swing.JPasswordField();
        Eid = new javax.swing.JComboBox();
        done = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(163, 194, 32));

        jLabel1.setText("EmpID");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Role");

        jLabel5.setText("Issued Date");

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel6.setText("User profile updating interface");

        addUserbtn.setText("Add User");
        addUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserbtnActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel7.setText("Confrim password");

        done.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        done.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addUserbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updatebtn)
                                .addGap(83, 83, 83)
                                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Eid, 0, 131, Short.MAX_VALUE)
                                            .addComponent(pword)
                                            .addComponent(pword2)
                                            .addComponent(role)
                                            .addComponent(isuedDate)
                                            .addComponent(uname))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(searchbtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserbtn)
                    .addComponent(Exit)
                    .addComponent(updatebtn))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void addUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserbtnActionPerformed
        try{
        String str = "Insert into user values('"+ Eid.getSelectedItem()+"','"+uname.getText()+
                "','"+pword.getText()+"','"+role.getText()+"','"+isuedDate.getText()+"')";
        DbConnection db = new DbConnection();
        db.stm = db.con.createStatement();
        db.stm.executeUpdate(str );
        Eid.setSelectedIndex(0);
        uname.setText(null);
        pword.setText(null);
        pword2.setText(null);
        role.setText(null);
        isuedDate.setText(null);
        done.setText("Done!!!!!");
        }catch(Exception ex){System.out.println("Solution!!!: "+ ex.getMessage());}  
    }//GEN-LAST:event_addUserbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try{
        DbConnection db = new DbConnection();
        db.stm = db.con.createStatement();
        db.rs = db.stm.executeQuery("select * from user where empid='"+ Eid.getSelectedItem()+"'" );
        
        while(db.rs.next()){   
            uname.setText(db.rs.getString(2));
            pword.setText(db.rs.getString(3));
            pword2.setText(db.rs.getString(3));
            role.setText(db.rs.getString(4));
            isuedDate.setText(db.rs.getString(5));
            
        }
        }catch(Exception ex){System.out.println("Solution!!!: "+ ex.getMessage());} 
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        String str = "UPDATE user SET username='"+uname.getText()+"',Password='"+pword.getText()+
                "',Role='"+role.getText()+"',issuedDate='"+isuedDate.getText()+"' WHERE empid='"+Eid.getSelectedItem()+"'";
        try{
        DbConnection db = new DbConnection();
        db.stm = db.con.createStatement();
        db.stm.executeUpdate(str);  
        Eid.setSelectedIndex(0);
        uname.setText(null);
        pword.setText(null);
        pword2.setText(null);
        role.setText(null);
        isuedDate.setText(null);
        done.setText("Done!!!!!");
        }catch(Exception ex){System.out.println("Solution!!!: "+ ex.getMessage());} 
        
    }//GEN-LAST:event_updatebtnActionPerformed

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
//            java.util.logging.Logger.getLogger(Update_Login_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Update_Login_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Update_Login_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Update_Login_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Update_Login_profile().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Eid;
    private javax.swing.JButton Exit;
    private javax.swing.JButton addUserbtn;
    private javax.swing.JLabel done;
    private javax.swing.JTextField isuedDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pword;
    private javax.swing.JPasswordField pword2;
    private javax.swing.JTextField role;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField uname;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
