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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClassSeleniumIntegration {
	public static WebDriver driver;
public static WebDriver openbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
}
public static void loadUrl(String url) {
	driver.get(url);
}
public static void pagetitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
public static void pageurl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}
public static void fill(WebElement e,String text) {
	e.sendKeys(text);
}
public static void login(WebElement e) {
	e.click();
}
public static String getData(int rowNumber,int columnNumber) throws IOException {
	File f=new File("C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\Excel\\Data.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet("Sheet1");
	Row r = s.getRow(rowNumber);
	Cell c = r.getCell(columnNumber);
	int celltype=c.getCellType();
	String value="";
	if(celltype==1) {
      value = c.getStringCellValue();
	} 
	else if (celltype==0) {
		if(DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
		     value = sim.format(d);
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			value = String.valueOf(l);
		}
		
	}
	return value;
}
}
