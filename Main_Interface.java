
package myfamproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main_Interface extends javax.swing.JFrame {
    String usertype;
    String empidd;
    String name;
    public Main_Interface(String u,String name,String eid) {
        initComponents();
        setSize(1350,800);
        setTitle("              Installment Recording System");
//        try{
//            //Image icon= new ImageIcon("C:\\Users\\TMH\\Pictures\\test.ico").getImage();
//            Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\TMH\\Pictures\\test.ico");
//            ImageIcon icon = new ImageIcon();
//            setIconImage(icon.getImage());
//        }catch(Exception ex){System.out.println(""+ex.getMessage());}
        //setLocation(150,80);
        
        usertype = u ;
        empidd = eid;
        this.name = name;
        if(!usertype.equals("Admin")){
           // addAccount.setVisible(false);
            addUserbtn.setVisible(false);
            createDb.setVisible(false);
        }  
        try{
            
            String stt="";
            DbConnection db = new DbConnection();
            
            db.stm = db.con.createStatement();
            db.rs = db.stm.executeQuery("Select MessageContent from message");
            if(db.rs.last()){
            //String sqll = "Select * from user_detail where Emplid="=
            
            area.setText(db.rs.getString(1));
            stt = "Message :\n"+db.rs.getString(1)+"\n";
            }
            DateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            String st1 = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue()+ "-" + new Date().getDate();
            db.rs = db.stm.executeQuery("Select acc_num, last_inst_date from Account where cust_status <> 'Closed' and cust_status <> 'Rejected'");                
            while(db.rs.next()){
                
                Date d= sdf.parse(st1);
                //if((st1.equals(db.rs.getString(2)))){
                    
                    
                    String sql = "UPDATE Account set cust_status='Rejected' where last_inst_date = '"+(LocalDate.now().minusDays(-1))+"'";
                    db.stm = db.con.createStatement();
                    db.stm.executeUpdate(sql);
                    //System.out.println((LocalDate.now().minusDays(-1)));
                //}
            }
            String sql = "select acc_num, contact, Handler from account where last_inst_date = '"+(LocalDate.now().minusDays(1))+"'";            
                    
            String str ="" ;      
                    db.stm = db.con.createStatement();
                    db.rs = db.stm.executeQuery(sql);
                    while(db.rs.next()){
                        str =str+db.rs.getString(3)+"\nTomorrow is the deadline for Acc No:"+db.rs.getString(1)+"\n Please Contact the customer!\nContact No:"+db.rs.getString(2)+"\n"; 
                    }
                    area.setText(str+stt);
                    
            
        }catch(Exception ex){JOptionPane.showMessageDialog(null, "Error:"+ex.getMessage());}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        changePasswrd = new javax.swing.JButton();
        addUserbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        addAccount = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        AnyNewsbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        update_acc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        createDb = new javax.swing.JMenuItem();
        close = new javax.swing.JMenuItem();
        userReport = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        updateNews = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        chPassword = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(160, 194, 32));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(160, 194, 32));

        area.setBackground(new java.awt.Color(204, 255, 102));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        area.setForeground(new java.awt.Color(255, 0, 0));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        changePasswrd.setText("Change Password");
        changePasswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswrdActionPerformed(evt);
            }
        });

        addUserbtn.setText("User");
        addUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserbtnActionPerformed(evt);
            }
        });

        jButton4.setText("Account reports");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        addAccount.setText("Add new Account");
        addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountActionPerformed(evt);
            }
        });

        Exitbtn.setText("Logout");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        AnyNewsbtn.setText("News");
        AnyNewsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnyNewsbtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myfamproject/logo.png"))); // NOI18N

        update_acc.setText("Update Account");
        update_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_accActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setText("Installment recording System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AnyNewsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUserbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePasswrd, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(update_acc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel2)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AnyNewsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(update_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(addUserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changePasswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
        );

        jMenu1.setText("File");

        createDb.setText("Create Db");
        createDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDbActionPerformed(evt);
            }
        });
        jMenu1.add(createDb);

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jMenu1.add(close);

        jMenuBar1.add(jMenu1);

        userReport.setText("Reports");

        jMenuItem1.setText("Account report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        userReport.add(jMenuItem1);

        jMenuItem10.setText("User report");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        userReport.add(jMenuItem10);

        jMenuBar1.add(userReport);
        jMenuBar1.add(jMenu4);

        jMenu6.setText("Account");

        jMenuItem5.setText("Register new Acc");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Update account");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem8.setText("View All Account");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Search sepecific acount");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("News");

        jMenuItem2.setText("Post news");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("View news");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        updateNews.setText("Delete news");
        updateNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNewsActionPerformed(evt);
            }
        });
        jMenu5.add(updateNews);

        jMenuItem4.setText("View all news");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("User");

        chPassword.setText("Change My Password");
        chPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPasswordActionPerformed(evt);
            }
        });
        jMenu3.add(chPassword);

        jMenuItem7.setText("View my profile");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        //System.exit(0);
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountActionPerformed
        new Account_Detail(name).setVisible(true);
    }//GEN-LAST:event_addAccountActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Reports().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AnyNewsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnyNewsbtnActionPerformed
        new Messages(empidd).setVisible(true);
    }//GEN-LAST:event_AnyNewsbtnActionPerformed

    private void addUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserbtnActionPerformed
        new Users(empidd).setVisible(true);
        
    }//GEN-LAST:event_addUserbtnActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new Update_Account_Deatil().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Reports().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new View_My_detail(empidd).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void chPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPasswordActionPerformed
        // TODO add your handling code here:
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_chPasswordActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new News(empidd).setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new ViewMessage().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new Account_Detail(name).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new Account_Table("").setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new Update_Account_Deatil().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void updateNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNewsActionPerformed
        // TODO add your handling code here:
        new DeleteMessage().setVisible(true);
    }//GEN-LAST:event_updateNewsActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new View_All_Message().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void createDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDbActionPerformed
        new createDatabase();
    }//GEN-LAST:event_createDbActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        new View_Users().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void changePasswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswrdActionPerformed
        // TODO add your handling code here:
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_changePasswrdActionPerformed

    private void update_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_accActionPerformed
        // TODO add your handling code here:
        new Update_Account_Deatil().setVisible(true);
    }//GEN-LAST:event_update_accActionPerformed

   
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
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Interface("","","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnyNewsbtn;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton addAccount;
    private javax.swing.JButton addUserbtn;
    private javax.swing.JTextArea area;
    private javax.swing.JMenuItem chPassword;
    private javax.swing.JButton changePasswrd;
    private javax.swing.JMenuItem close;
    private javax.swing.JMenuItem createDb;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem updateNews;
    private javax.swing.JButton update_acc;
    private javax.swing.JMenu userReport;
    // End of variables declaration//GEN-END:variables
}
