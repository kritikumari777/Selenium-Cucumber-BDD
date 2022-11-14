package pom_PF.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PF.pageobjectfile.LoginPage_PF;
import pom_PF.pageobjectfile.LogoutPage_PF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogoutPage_PF {

    WebDriver driver;
    LoginPage_PF login;
    LogoutPage_PF logout;
    
    @Before
    public void setup() {
    	System.out.println("--- We are inside LoginLogoutPage_PF--- ");
    	 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    }
@Given("user is on login page")
public void user_is_on_login_page() {

    driver.get("https://example.testproject.io/web/");
}

@When("^user enter (.*) and (.*)$")
public void user_enter_username_and_password(String name, String password) throws Exception {
	
	login = new LoginPage_PF(driver);
	login.enterUserName(name);
	Thread.sleep(2000);
	login.enterUserPassword(password);
	Thread.sleep(2000);
}

@And("user click on login button")
public void user_click_on_login_button() {
	
	login.clickLoginButton();
	String title = driver.getTitle();
	System.out.println(title);
}

@Then("user click on logout button")
public void user_click_on_logout_button() {
	logout = new LogoutPage_PF(driver);
	logout.clickLogoutButon();
	System.out.println("LOGOUT");
	driver.close();

}

@After
public void setdoen() {
	driver.quit();
}

}