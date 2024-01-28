package pageFactory.PageRepository;

import org.openqa.selenium.WebDriver;
import pageFactory.ObjectRepository.loginObjects;

public class loginPage {

	public void usernameEntry(WebDriver driver, String user) {
		loginObjects.username(driver).sendKeys(user);
	}

	public void passwordEntry(WebDriver driver, String pass) {
		loginObjects.password(driver).sendKeys(pass);
	}

	public void loginClick(WebDriver driver) {
		loginObjects.loginButton(driver).click();
	}
}