package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageFactory.PageRepository.loginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

	public static WebDriver driver;
	loginPage login = new loginPage();

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Navigated to login page")
	public void navigatedToLoginPage() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter (.*) and (.*)")
	public void enterUsernameAndPassword(String username, String password) {
		login.usernameEntry(driver, username);
		login.passwordEntry(driver, password);
	}

	@Then("Click on login button")
	public void clickOnLoginButton() throws InterruptedException {
		login.loginClick(driver);
	}

	@When("^Enter (.*) and (.*)$")
	public void enterInvalidUsernameAndInvalidPassword(String invalidUsername, String invalidPassword) {
		login.usernameEntry(driver, invalidUsername);
		login.passwordEntry(driver, invalidPassword);
	}

	@Then("^(.*) should be displayed$")
	public void errorMessageshouldBeDisplayed(String errorMessage) {
		login.errorMessage(driver, errorMessage);
	}

	@Then("Navigated to home page")
	public void navigatedToHomepage() {
		String homepageurl = driver.getCurrentUrl();
		Assert.assertEquals(homepageurl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}