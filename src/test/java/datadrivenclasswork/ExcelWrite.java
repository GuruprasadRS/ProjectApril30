package datadrivenclasswork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\Excel\\testwrite.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s = w.createSheet("input");
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("Name");
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	System.out.println("Done");
}
}
