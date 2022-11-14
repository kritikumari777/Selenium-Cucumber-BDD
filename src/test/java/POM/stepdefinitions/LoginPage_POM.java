package POM.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.pageobjectfile.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_POM {
     
	WebDriver driver;
	LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("----I am inside LoginPage_POM-----");
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://example.testproject.io/web/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
	   login = new LoginPage(driver);
	   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	   login.userName(username);
	   login.userPass(password);
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		login.userLogin();  
	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() {
		try {
	   if(driver.getTitle().equals("TestProject Demo")) {
	      login.userLogout();
	      }
		}catch(Exception e) {
		   System.out.println(driver.getTitle());
		}
     }
     	
	@After
	public void sutdown() {
		//driver.quit();
	}
}

