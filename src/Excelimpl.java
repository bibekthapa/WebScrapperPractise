package excelpractise.ExcelPractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javafx.scene.control.Cell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelimpl {

    public  void writeinexcelfile(String param1,String param2,int i) throws IOException {
        
        
        
        try {
            String filename = "C:/users/home/desktop/a.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");  

            HSSFRow rowhead = sheet.createRow((short)0);
           
            rowhead.createCell(1).setCellValue("Company");
            rowhead.createCell(2).setCellValue("Job Address");
            
            
          
            HSSFRow row = sheet.createRow((short)i);
            row.createCell(0).setCellValue(param1);
            row.createCell(1).setCellValue(param2);
           
           
            
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
     

}
