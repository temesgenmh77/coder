
package myfamproject;

import java.io.FileWriter;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class ExportToExcel {
    public void toExcel(DefaultTableModel model,String filename){
        try{
            filename = System.getProperty("user.dir")+"\\excel"+new Random().nextInt()+".xls";
        FileWriter excel = new FileWriter(filename);
        for(int i=0;i<model.getColumnCount();i++){
            excel.write(model.getColumnName(i)+"\t");
        }
        excel.write("\n");
        
        for(int i=0;i<model.getRowCount();i++){
            for(int j=0;j<model.getColumnCount();j++){
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
        }
        excel.close();
        javax.swing.JOptionPane.showMessageDialog(null, "your data is exported to  current directory!");
        }catch(Exception ex){System.out.println("Errot: "+ex.getMessage());}
    }
}
