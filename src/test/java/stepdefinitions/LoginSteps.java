package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
    WebDriver driver;

@Given("user is on login page")
public void user_is_on_login_page() {
	System.out.println("I am inside LoginLogoutpage_Pf");
	
	 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://example.testproject.io/web/");
}

@When("^user enters (.*) and (.*)$")
public void user_enters_username_and_password(String username, String password) {
	
	driver.findElement(By.id("name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
}

@And("clicks on login button")
public void clicks_on_login_button() {
	
	driver.findElement(By.id("login")).click();
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	
	String title = driver.getTitle();
	System.out.println(title);
	driver.quit();
}
}

