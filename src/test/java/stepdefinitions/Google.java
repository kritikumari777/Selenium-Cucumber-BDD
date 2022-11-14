package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
    WebDriver driver = null;
    
@Given("browaer is open")
public void browaer_is_open() {
    System.out.println("user is in browaser");
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    //driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MICROSECONDS);
    
}

@And("user is on google search page")
public void user_is_on_google_search_page() {
    System.out.println("user is on google search page");
    driver.navigate().to("https://google.com");
}

@When("user inter a text in text box")
public void user_inter_a_text_in_text_box() {
    System.out.println("user inter a text in text box");
    WebElement text = driver.findElement(By.name("q"));
    text.sendKeys("Automation step by step");
    text.sendKeys(Keys.ENTER);
    
}

@Then("user navigated to search page")
public void user_navigated_to_search_page() {
    System.out.println("user navigated to search page");
    
    driver.getPageSource().contains("Online Courses");
    driver.quit();
}
}
