package datadrivenclasswork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassPom extends BaseClassPom {
  public PojoClassPom() {
	  PageFactory.initElements(driver, this);
} 

@FindBy(id="email")
private WebElement txtEmail;
@FindBy(id="pass")
private WebElement txtPass;
@FindBy(xpath="//input[@value='Log In']")
private WebElement btnLogin;
public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}

}
