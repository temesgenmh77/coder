
package myfamproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class createDatabase {
       public Connection con=null;
       public Statement stm=null;
       public ResultSet rs = null;
    public createDatabase() {
    String sql="";
    try{
        String user = JOptionPane.showInputDialog("Enter user name:");
        String Psword = JOptionPane.showInputDialog("Enter user Passwor:");
        if(user.equals("root")&&Psword.equals("")){
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password="+"");
        stm = con.createStatement();
        String dbname = JOptionPane.showInputDialog("Enter short Database Name");
        stm.executeUpdate("create database project;");
        }
       
        sql =  
               "CREATE TABLE IF NOT EXISTS account ("
               + "  acc_num int(11) NOT NULL,"
               + "  Total_inst_amount double DEFAULT '0',"
               + "  Num_month Varchar(40) not null,"
               + "  Amont_paid double DEFAULT '0',"
               + "  inst_period int(11) DEFAULT '1',"
               + "  recieved_date date DEFAULT NULL,"
               + "  Issued_date date DEFAULT NULL,"
               + "  reply_date date DEFAULT NULL,"
               + "  last_inst_date date DEFAULT NULL,"
               + "  Cust_response varchar(30) DEFAULT NULL,"
               + "  Action_taken varchar(35) DEFAULT NULL,"
                + " cust_category varchar(25) DEFAULT NULL,"
                + " contact varchar(20) DEFAULT NULL,"
                + " cust_status varchar(20) DEFAULT NULL,"
                + " collection_center varchar(30) DEFAULT NULL,"
                + " Handler varchar(30) DEFAULT NULL,"
                + "  PRIMARY KEY (acc_num)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
                
                    
                String sql4 = "INSERT INTO user (empid, username, Password, Role, issuedDate)"
                        + " VALUES('9137', 'Hanab', '1234', 'Admin', '0000-00-00')";
               
       
       String sql1 =""+ "CREATE TABLE IF NOT EXISTS message ("
                + "  UserId varchar(20) NOT NULL,"
                + "  MessageContent varchar(400) NOT NULL,"
                + "  MsgTitle varchar(30) NOT NULL,"
                + "  Date text NOT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
       String sql2 = ""         + "CREATE TABLE IF NOT EXISTS user ("
                + "  empid varchar(20) DEFAULT NULL,"
                + "  username varchar(25) DEFAULT NULL,"
                + "  Password varchar(25) DEFAULT NULL,"
                + "  Role varchar(20) DEFAULT NULL,"
                + "  issuedDate varchar(25) DEFAULT NULL"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
       String sql3 = ""+ "CREATE TABLE IF NOT EXISTS user_detail ("
                + "  Emplid varchar(15) NOT NULL,"
                + "  Full_name varchar(30) DEFAULT NULL,"
                + "  sex varchar(10) DEFAULT NULL,"
                + "  department varchar(20) DEFAULT NULL,"
                + "  position varchar(20) DEFAULT NULL,"
                + "  mobile_num varchar(15) DEFAULT NULL,"
                + "  Email varchar(50) DEFAULT NULL,"
                + "  Status tinyint(1) NOT NULL,"
                + "  PRIMARY KEY (`Emplid`)"
                + ") ENGINE=InnoDB DEFAULT CHARSET=latin1;"
               ;
       
       
       
       String sql5 = "INSERT INTO user_detail (`Emplid`, `Full_name`, `sex`, `department`, `position`,  `mobile_num`,  `Email`, `Status`) VALUES"
                + "('9137', 'Hana Berhanu', 'F', 'BO', 'Advisor',  '0911528639',  'hana.berhanu@ethiotelecom.et', 1)";
                
            DbConnection db = new DbConnection();
            db.stm = db.con.createStatement();
            db.stm.executeUpdate(sql);
            db.stm.executeUpdate(sql1);
            db.stm.executeUpdate(sql2);
            db.stm.executeUpdate(sql3);
            db.stm.executeUpdate(sql4);
            db.stm.executeUpdate(sql5);

            db.rs.last();
    }catch(Exception ex){System.err.println(""+ex.getMessage());}

    }
//    public static void main(String[] args) {
//        new createDatabase();
//    }
}