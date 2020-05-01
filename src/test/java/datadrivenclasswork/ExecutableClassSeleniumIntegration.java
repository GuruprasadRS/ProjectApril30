package datadrivenclasswork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutableClassSeleniumIntegration extends BaseClassSeleniumIntegration{
	public static void main(String[] args) throws IOException {
		WebDriver driver = openbrowser();
		loadUrl("https://www.facebook.com/");
		pagetitle();
		pageurl();
		WebElement userid = driver.findElement(By.id("email"));
		fill(userid, getData(1,3));
		WebElement password = driver.findElement(By.id("pass"));
		fill(password, getData(1,1));
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		login(loginbutton);
	}

}
