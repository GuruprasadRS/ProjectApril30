package datadrivenclasswork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\Excel\\testwrite.xlsx");
	FileInputStream Fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(Fin);
	Sheet s = w.getSheet("input");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	String str = c.getStringCellValue();
	if (str.equals("Name")) {
		c.setCellValue("Student Name");
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
	}
	System.out.println("Done");
}
}
