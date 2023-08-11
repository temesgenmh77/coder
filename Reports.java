
package myfamproject;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Reports extends javax.swing.JFrame {

    String query1="";
    String query="";
    String temp="";
    public Reports() {
        initComponents();
        from.setVisible(false);
            to.setVisible(false);
            JDPtoDate.setVisible(false);
            jXDPfromdate.setVisible(false);
        setLocation(100,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox();
        Issuedate = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jXDPfromdate = new org.jdesktop.swingx.JXDatePicker();
        JDPtoDate = new org.jdesktop.swingx.JXDatePicker();
        from = new javax.swing.JLabel();
        to = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(160, 194, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Status");

        Status.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "New", "Closed", "UnClosed", "Progress", "All" }));
        Status.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusItemStateChanged(evt);
            }
        });

        Issuedate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Issuedate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Today", "Weekly", "date_Between", "Monthly", "Specific date" }));
        Issuedate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IssuedateItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Issued Date");

        view.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        view.setText("Ok");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        Exitbtn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Exitbtn.setText("Exit");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        from.setText("From");

        to.setText("To");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(to)
                                    .addGap(18, 18, 18)
                                    .addComponent(JDPtoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(from)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jXDPfromdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Issuedate, 0, 215, Short.MAX_VALUE)
                                    .addComponent(Status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JDPtoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXDPfromdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(from))
                        .addContainerGap(179, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void StatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusItemStateChanged
        if (!Status.getSelectedItem().equals("None")) {
            query = "";
        }
        if (Status.getSelectedItem().equals("Closed")) {
            query = "cust_status='Closed'";
        }
        if (Status.getSelectedItem().equals("UnClosed")) {
            query = "cust_status <>" +"'Closed'";
        }
        if (Status.getSelectedItem().equals("New")) {
            query = "cust_status =" +"'New'";
        }
        if (Status.getSelectedItem().equals("Progress")) {
            query = "cust_status='"+Status.getSelectedItem()+"'";
        }
        if (Status.getSelectedItem().equals("All")) {
            query = "";
        }
        temp=query;
    }//GEN-LAST:event_StatusItemStateChanged
    private void IssuedateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IssuedateItemStateChanged
        if (!Issuedate.getSelectedItem().equals("None")) {
            
            from.setVisible(false);
            to.setVisible(false);
            JDPtoDate.setVisible(false);
            jXDPfromdate.setVisible(false);
            query1="";
            
        }
        if (Issuedate.getSelectedItem().equals("date_Between")) {
            to.setText("To");
            from.setVisible(true);
            to.setVisible(true);
            JDPtoDate.setVisible(true);
            jXDPfromdate.setVisible(true);

        }
        if (Issuedate.getSelectedItem().equals("Specific date")) {
            from.setVisible(false);
            to.setVisible(false);
            JDPtoDate.setVisible(false);
            jXDPfromdate.setVisible(false);
            to.setVisible(true);
            to.setText("Select Date");
            JDPtoDate.setDate(null);
            JDPtoDate.setVisible(true);
        }
        if (Issuedate.getSelectedItem().equals("All")) {
            from.setVisible(false);
            to.setVisible(false);
            JDPtoDate.setVisible(false);
            jXDPfromdate.setVisible(false);
            query1 = "";
        }
         if (Issuedate.getSelectedItem().equals("Today")) {
            from.setVisible(false);
            to.setVisible(false);
            JDPtoDate.setVisible(false);
            jXDPfromdate.setVisible(false);
            query1=""+LocalDate.now();
        }
    }//GEN-LAST:event_IssuedateItemStateChanged

    
    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        query=temp;
           if (Issuedate.getSelectedItem().equals("Date_Between")) {
            if (!JDPtoDate.getDate().equals(null) && !JDPtoDate.getDate().equals(null)) {

                System.out.println(JDPtoDate.getMonthView().getCalendar());
                Date tto = JDPtoDate.getDate();
                
                String tt = (tto.getYear() + 1900) + "-" + ((int)(tto.getMonth())+1) + "-" + tto.getDate();
                Date ffrom = jXDPfromdate.getDate();
                String fr = (ffrom.getYear() + 1900) + "-" + ((int)(ffrom.getMonth())+1) + "-" + ffrom.getDate();
                query = "issued_date >='" + tt + "' and issued_date <='" + fr +"'";
            } else {
                JOptionPane.showMessageDialog(null, "Please select TO and FROM    date!");
            }
            
        }
       else if (Issuedate.getSelectedItem().equals("Specific date")) {
            if (!JDPtoDate.getDate().equals(null) && !JDPtoDate.getDate().equals(null)) {
                Date ttto = JDPtoDate.getDate();
                String ttt = (ttto.getYear() + 1900) + "-" + ((int)(ttto.getMonth())+1) + "-" + ttto.getDate();
                query1 = "issued_date='" + ttt + "'";
            }
            else{JOptionPane.showMessageDialog(null, "Please select specific date!");}
        }
           
       else  if (Issuedate.getSelectedItem().equals("Today")) {
         
            String st = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue() + "-" + new Date().getDate();
            query1 = "issued_date ='" + LocalDate.now() + "'";
        }
        
       else if (Issuedate.getSelectedItem().equals("Monthly")) {
            String st1 = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue() + "-" + new Date().getDate();
            String st = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue() + "-" + (new Date().getDay()-30);
            query1 = "issued_date<='" + LocalDate.now() + "' and issued_date >='" + LocalDate.now().minusDays(30) +"'";
        }
        
        else if (Issuedate.getSelectedItem().equals("Weekly")) {
            String st1 = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue()+ "-" + new Date().getDate();
            String st = (new Date().getYear() + 1900) + "-" + LocalDate.now().getMonthValue() + "-" + ((int)(new Date().getDate())-7);
            
            query1 = "issued_date>='" + LocalDate.now().minusDays(7) + "' and issued_date <='" + LocalDate.now() +"'";
        }
       
        else if(Issuedate.getSelectedItem().equals("None")){
            query1="";
        }
           if(query1!=""&& query!=""){  query = "  where " +query+" and "+query1;   }
           else if(query1!="" && query=="" ){query = "  where "+query1;}
           else if(query1=="" && query!="" ){query = "  where "+query;}
           else if(query1=="" && query=="" ){query = "";}
           
           System.out.println("  "+query);
           if(query=="")
                      System.out.println(" cool "+query);
           
           new Account_Table(query);
    }//GEN-LAST:event_viewActionPerformed

    
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
//            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Reports().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbtn;
    private javax.swing.JComboBox Issuedate;
    private org.jdesktop.swingx.JXDatePicker JDPtoDate;
    private javax.swing.JComboBox Status;
    private javax.swing.JLabel from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker jXDPfromdate;
    private javax.swing.JLabel to;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
