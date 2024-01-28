package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.PageRepository.loginPage;

public class LoginSteps {

	public static WebDriver driver;
	loginPage login = new loginPage();

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Given("Navigated to login page")
	public void navigatedToLoginPage() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}

	@When("^Enter (.*) and (.*)$")
	public void enterUsernameAndPassword(String username, String password) {
		login.usernameEntry(driver, username);
		login.passwordEntry(driver, password);
	}

	@Then("Click on login button")
	public void clickOnLoginButton() throws InterruptedException {
		login.loginClick(driver);
		Thread.sleep(5000);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}