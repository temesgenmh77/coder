
package myfamproject;

import java.sql.*;
import javax.swing.*;

public class DbConnection {
       public Connection con=null;
       public Statement stm=null;
       public ResultSet rs = null;
    public DbConnection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage()) ;}
    }
//    public static void main(String[] args) {
//        new DbConnection();
//    }
}
