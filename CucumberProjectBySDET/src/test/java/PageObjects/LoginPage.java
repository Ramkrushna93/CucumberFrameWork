package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "Email")
	@CacheLookup
	WebElement username;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	@CacheLookup
	WebElement login;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement logoutbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void loginWithValidCrendantial(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void ClickOnLoginBtn() {
		login.click();
	}

	public String verifyTitleOfThePage() {

		return driver.getTitle();
	}

	public void clickOnLogoutBtn() {
		logoutbtn.click();

	}

}
