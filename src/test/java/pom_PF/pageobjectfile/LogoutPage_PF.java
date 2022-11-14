package pom_PF.pageobjectfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_PF {
	
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement but_logout;
	
	public LogoutPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutButon() {
		but_logout.click();
	}

}
