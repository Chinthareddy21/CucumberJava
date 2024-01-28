package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

	public static WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Given("Navigated to login page")
	public void navigatedToLoginPage() {
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@When("^Enter (.*) and (.*)$")
	public void enterUsernameAndPassword(String username, String password) {
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
	}

	@Then("Click on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.id("login-button")).click();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}