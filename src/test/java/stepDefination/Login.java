package stepDefination;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Given("^User is at login page$")
	public void user_is_at_login_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.newtours.demoaut.com/");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("userName")).sendKeys("batman");
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("batman");
	}
	
	@When("^user enters username \"(.*?)\"$")
	public void user_enters_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enters password \"(.*?)\"$")
	public void user_enters_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^login is successful and homepage is displayed$")
	public void login_is_successful_and_homepage_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("Comparing Title","Find a Flight: Mercury Tours:", driver.getTitle());
	}


}
