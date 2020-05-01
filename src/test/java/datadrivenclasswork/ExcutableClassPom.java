package datadrivenclasswork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcutableClassPom extends BaseClassPom{
	public static void main(String[] args) throws IOException {
		WebDriver driver = openbrowser();
		loadUrl("https://www.facebook.com/");
		PojoClassPom l=new PojoClassPom();
		fill(l.getTxtEmail(), "Guru");
		fill(l.getTxtPass(), "selenium");
		driver.navigate().refresh();
		PojoClassPom l1=new PojoClassPom();
		fill(l1.getTxtEmail(), "Prasad");
		fill(l1.getTxtPass(), "selenium");
		login(l1.getBtnLogin());
	}

}
