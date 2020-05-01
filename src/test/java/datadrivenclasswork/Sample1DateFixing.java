package datadrivenclasswork;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Sample1DateFixing {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\Excel\\Data.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet("Sheet1");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r=s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
	    Cell c = r.getCell(j);
	    int cellType = c.getCellType();
	    if(cellType==1) {
	    	String value = c.getStringCellValue();
	    	System.out.println(value);	
	    }
	    else if (cellType==0) {
	    	if(DateUtil.isCellDateFormatted(c)) {
	    		Date d = c.getDateCellValue();
	    		SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
	    		String value = sim.format(d);
	    		System.out.println(value);	
			}
	    	else {
				double d = c.getNumericCellValue();
				long l=(long)d;
				String value = String.valueOf(l);
				System.out.println(value);		
			}	
		}	
		}	
	}
}
}
