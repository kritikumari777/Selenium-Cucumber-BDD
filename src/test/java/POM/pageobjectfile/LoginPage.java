package POM.pageobjectfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By user_name = By.id("name");
	By user_pass = By.id("password");
	By login = By.id("login");
	By logout = By.id("logout");  //we should create separate class for logout because as per POM rule each page 
                                  // have Separate class


public LoginPage(WebDriver driver) {
	this.driver = driver;
}

public void userName(String username) {
	driver.findElement(user_name).sendKeys(username);
}

public void userPass(String userpass ) {
	driver.findElement(user_pass).sendKeys(userpass);
}

public void userLogin() {
	driver.findElement(login).click();
}

public void userLogout() {           //we should create separate class for logout because as per POM rule each page have Separate class           
	driver.findElement(logout).click();
}

// we can write into one function like
/*public void LoginPage(String username, String userpass) {
	driver.findElement(user_pass).sendKeys(username);
	driver.findElement(user_pass).sendKeys(userpass);
	driver.findElement(login).click();
	driver.findElement(logout).click();
}*/

}