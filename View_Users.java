package myfamproject;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class View_Users extends JFrame implements ActionListener{

    JTable tb;
    JButton viewData, bt;
DefaultTableModel model;
    public View_Users() {
        JPanel pl = new JPanel();
       model  = new DefaultTableModel();
        tb = new JTable(model);
        viewData = new JButton("Export");
        bt = new JButton("Exit");
        model.addColumn("UserName");
        model.addColumn("Password");
        model.addColumn("Role");
        model.addColumn("Issued date");
        viewData.addActionListener(this);
         bt.addActionListener(this);
        
         String rowData[] = new String[15];
        int j;
        try{
        DbConnection db = new DbConnection();
        db.stm=db.con.createStatement();
        db.rs = db.stm.executeQuery("Select * from user");
        while(db.rs.next()){   
            j=0;
            for(int i=1;i<=5;i++){
                if(i!=1 ){
                rowData[j]=db.rs.getString(i);
                j++;
                }
            }
            model.addRow(rowData);
        }
            //System.out.println("Done!");
        }catch(Exception ex){System.out.println("Error:" + ex.getMessage());}
        
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb.getColumnModel().getColumn(0).setMinWidth(100);
        tb.getColumnModel().getColumn(1).setMinWidth(100);
        tb.getColumnModel().getColumn(2).setMinWidth(100);
        tb.getColumnModel().getColumn(3).setMinWidth(100);
        tb.setPreferredScrollableViewportSize(new Dimension(450, 300));
        pl.add(new JScrollPane(tb));
        pl.add(viewData);
        pl.add(bt);
        add(pl);
        setBounds(70,70,500,520);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //pack();
        setVisible(true);
        
    }
    
//    public static void main(String[] args) {
//        new View_Users();
//    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==viewData){
            //try {
                new ExportToExcel().toExcel(model,null);
                //tb.print();
            //} catch (PrinterException ex) { JOptionPane.showMessageDialog(rootPane, "Erro: "+ex.getMessage());
            
        }
        if(e.getSource()==bt){
            this.dispose();
        
        }
    }
}
