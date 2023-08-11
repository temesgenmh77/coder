package myfamproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class View_All_Message extends JFrame implements ActionListener{
    JTable tb;
    JButton viewData,export;
    DefaultTableModel model;
    public View_All_Message() {
        JPanel pl = new JPanel();
        model = new DefaultTableModel();
        tb = new JTable(model);
        viewData = new JButton("Exit");
        export = new JButton("Export");
        model.addColumn("Sender");
        model.addColumn("Message");
        model.addColumn("Message_title");
        model.addColumn("Posted date");
        viewData.addActionListener(this);
        export.addActionListener(this);
        
         String rowData[] = new String[15];
        int j;
        try{
        DbConnection db = new DbConnection();
        db.stm=db.con.createStatement();
        db.rs = db.stm.executeQuery("Select * from message");
        while(db.rs.next()){   
            j=0;
            for(int i=1;i<=4;i++){
                
                rowData[j]=db.rs.getString(i);
                j++;
               
            }
            model.addRow(rowData);
        }
        }catch(Exception ex){System.out.println("Error:" + ex.getMessage());}
        pl.add(new JScrollPane(tb));
        pl.add(viewData);
        pl.add(export);
        add(pl);
        setBounds(70,70,500,520);
        pack();
        setVisible(true);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new View_All_Message();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==viewData){
           
                this.dispose();
        }
        if(e.getSource()==export){
            new ExportToExcel().toExcel(model, null);
        }
    }
}
