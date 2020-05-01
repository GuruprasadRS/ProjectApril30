package datadrivenclasswork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\Excel\\Data.xlsx");
	FileInputStream fin=new FileInputStream(f);
    Workbook w=new XSSFWorkbook(fin);
    Sheet s=w.getSheet("Sheet1");
    Row r = s.getRow(0);
    Cell c = r.getCell(0);
	System.out.println(c);
	System.out.println("Guru");
	System.out.println();
	int NumberOfRows = s.getPhysicalNumberOfRows();
	System.out.println(NumberOfRows);
	Row b = s.getRow(1);
	int NumberOfCells = b.getPhysicalNumberOfCells();
	System.out.println(NumberOfCells);
	System.out.println();
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row o = s.getRow(i);
		for (int j = 0; j < o.getPhysicalNumberOfCells(); j++) {
			Cell p = o.getCell(j);
			System.out.println(p);	
		}	
	}
}
}

