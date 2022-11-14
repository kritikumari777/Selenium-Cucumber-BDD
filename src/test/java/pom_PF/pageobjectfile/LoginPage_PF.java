package pom_PF.pageobjectfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
  
@FindBy(id="name")
WebElement txt_user;

@FindBy(id="password")
WebElement txt_pass;

@FindBy(id="login")
WebElement but_login;

public LoginPage_PF(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);  // instance of this we can use "LoginPage_PF.class"
}                                            // its initialize all the element of FindBy annotation

public void enterUserName(String user) {
	txt_user.sendKeys(user);
}

public void enterUserPassword(String pass) {
	txt_pass.sendKeys(pass);
}
public void clickLoginButton() {
	but_login.click();
}

}