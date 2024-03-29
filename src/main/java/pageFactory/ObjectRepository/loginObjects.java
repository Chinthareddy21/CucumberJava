package pageFactory.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObjects {
	private static WebElement element;

	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		return element;
	}

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		return element;
	}

	public static WebElement errorMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p"));
		return element;
	}
}