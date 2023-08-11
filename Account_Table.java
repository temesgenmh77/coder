
package myfamproject;

import com.sun.java.swing.plaf.windows.DesktopProperty;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.print.PrinterException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Account_Table  extends JFrame implements ActionListener{
    JTable tb ;
    JButton viewData,export,exit;
    String query="";
    DefaultTableModel model;
    
    //Object column[] = {"acc_num","Total_inst_amount","Amont_paid","inst_period","Recieved_date","Issued_date",  "Reply_date","Last_inst_date","Cust_response","Action_taken","cust_category","contact","cust_status","collection_center","Handler"};
    public Account_Table(String query){
        JPanel pl = new JPanel();
         model = new DefaultTableModel();
        model.addColumn("acc_num");
        model.addColumn("Total_inst_amount");
        model.addColumn("Unpaid bill months");
        model.addColumn("Amont_paid");
        model.addColumn("inst_period");
        model.addColumn("Recieved_date");
        model.addColumn("Issued_date");
        model.addColumn("Reply_date from UBS");
        model.addColumn("Last_inst_date");
        model.addColumn( "Cust_response");
        model.addColumn("Action_taken");
        model.addColumn("cust_category");
        model.addColumn("contact");
        model.addColumn("cust_status");
        model.addColumn("collection_center");
        model.addColumn("Handler");
        tb= new JTable(model);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.getColumnModel().getColumn(1).setMinWidth(90);
        tb.getColumnModel().getColumn(2).setMinWidth(90);
        tb.getColumnModel().getColumn(3).setMinWidth(90);
        tb.getColumnModel().getColumn(4).setMinWidth(90);
        tb.getColumnModel().getColumn(5).setMinWidth(90);
        tb.getColumnModel().getColumn(6).setMinWidth(90);
        tb.getColumnModel().getColumn(7).setMinWidth(90);
        tb.getColumnModel().getColumn(8).setMinWidth(90);
        tb.getColumnModel().getColumn(9).setMinWidth(90);
        tb.getColumnModel().getColumn(10).setMinWidth(90);
        tb.getColumnModel().getColumn(11).setMinWidth(90);
        tb.getColumnModel().getColumn(12).setMinWidth(90);
        tb.getColumnModel().getColumn(13).setMinWidth(90);
        tb.getColumnModel().getColumn(14).setMinWidth(90);
        tb.getColumnModel().getColumn(15).setMinWidth(90);
        tb.getColumnModel().getColumn(0).setMinWidth(90);
        tb.setPreferredScrollableViewportSize(new Dimension(1300, 600));
        String rowData[] = new String[16];
        int j;
        try{
            String sql = "Select * from account"+query;
        DbConnection db = new DbConnection();
        db.stm=db.con.createStatement();
            System.out.println(""+sql);
        db.rs = db.stm.executeQuery(sql);
        while(db.rs.next())
        {   
            j=0;
            for(int i=1;i<=16;i++){
                rowData[j]=db.rs.getString(i);
                j++;
            }
            model.addRow(rowData);
        }
            System.out.println("Done!");
        }catch(Exception ex){System.out.println("Error:" + ex.getMessage());}
        
        
                
        viewData = new JButton("Print");
        exit= new JButton("Exit");
        export= new JButton("Export to Excel"); 
        viewData.addActionListener(this);
        export.addActionListener(this);
        exit.addActionListener(this);
        pl.setBackground(new Color(160,194,32));
        pl.add(new JScrollPane(tb));
        pl.add(viewData);
        pl.add(export);
        pl.add(exit);
        add(pl);
        //pack();
        setSize(1600,720);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==viewData){
            try {
                tb.print();
            } catch (PrinterException ex) { JOptionPane.showMessageDialog(rootPane, "Erro: "+ex.getMessage());
            }
        }
        if (e.getSource()==export){
            new ExportToExcel().toExcel(model, null);
        }
        if (e.getSource()==exit){
            this.dispose();
        }
    }
//    public static void main(String[] args) {
//        new Account_Table("");
//    }

}

