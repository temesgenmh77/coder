package myfamproject;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.*;
public class LoginForm extends javax.swing.JFrame {
    String username;
    String rolee;
    String empidd;
    String un;
    String pw,pw1;
    int i=0;
    public LoginForm() {
        initComponents();  
        setTitle("User login Interface");
        setLocation(150, 100);
        //if(check())
        dbButton.setVisible(false);
        Connection con;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error:"+ex.getMessage());
            dbButton.setVisible(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        exitbtn1 = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dbButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(160, 194, 32));
        jPanel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("UserName");

        loginbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        exitbtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exitbtn1.setText("Exit");
        exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn1ActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setText("User Login Interface");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pword, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(uname)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(clearbtn)
                                .addGap(39, 39, 39)
                                .addComponent(exitbtn1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(msg))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msg)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TMH\\Documents\\NetBeansProjects\\MyFamProject\\Logo1.jpg")); // NOI18N

        dbButton.setText("Database");
        dbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dbButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(dbButton)))
                .addContainerGap(65, Short.MAX_VALUE))
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

    public boolean check(){
        boolean x = false;
        int i=0;
        try {
            DbConnection db = new DbConnection();
            db.stm = db.con.createStatement();
            db.rs = db.stm.executeQuery("select * from user");
            db.rs.first();
            i = db.rs.getRow();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No user created!!!");
        }
        
        if(i!=0)
           x=true;
        else 
            x=false;
        return x;
    }
    
    
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
            boolean flag = false;
            un = uname.getText();
             pw = pword.getText();
           
            if(i<3){
             try{   
            DbConnection db = new DbConnection();
            
            db.stm = db.con.createStatement();
            db.rs = db.stm.executeQuery("select * from user where username='"+un+ "'and password='"+pw+"';");
            while(db.rs.next()){
                username=db.rs.getString(2);
                pw1=db.rs.getString(3);
                rolee=db.rs.getString(4);
                empidd = db.rs.getString(1);
                flag=true;
            }
         
            if(flag){ 
                String sql="Select full_Name,status from user_detail where emplid='"+empidd+"';";
                db.rs = db.stm.executeQuery(sql);
                db.rs.first();
                if(db.rs.getInt(2)==1){
                new Main_Interface(rolee,db.rs.getString(1),empidd).setVisible(true);
                i=0;
                this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Error: this account is inactive" );
            }
            else{
                msg.setText("Wrong username or password");
                uname.setText(null);
                pword.setText(null);
                i++;
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(null, "Error:"+ex.getMessage());}
            }
            else {
                msg.setText("you already tried 3 time... no more option");
                System.exit(0);
            }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        uname.setText(null);
        pword.setText(null);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitbtn1ActionPerformed

    private void dbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbButtonActionPerformed
        // TODO add your handling code here:
        new createDatabase();
        
        //dbButton.setVisible(false);
    }//GEN-LAST:event_dbButtonActionPerformed
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton dbButton;
    private javax.swing.JButton exitbtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField pword;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
