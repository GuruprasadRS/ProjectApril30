package datadrivenclasswork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassPom {
	public static WebDriver driver;
	public static WebDriver openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Maven-Workspace\\DataDriven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
    }
	public static void fill(WebElement e,String text) {
		e.sendKeys(text);
	}
	public static void login(WebElement e) {
		e.click();
	}
}