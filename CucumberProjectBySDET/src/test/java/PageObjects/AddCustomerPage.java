package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	public WebDriver rdriver;

	public AddCustomerPage(WebDriver ldriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By lnkcustomer_menu = By.xpath("(//span[text()='Customers'])[1]");
	By lnkcustomer_menuitem = By.xpath("(//span[text()='Customers'])[2]");

	By btnaddnew = By.xpath("//a[@class=\"btn bg-blue\"]");
	By txtemail = By.id("Email");

	public void clickOnCustomerMenu() {
		rdriver.findElement(lnkcustomer_menu).click();
	}

	public void clickOnCustoMenuItems() {
		
		rdriver.findElement(lnkcustomer_menuitem).click();
	}
	
	public void clickOnAddnew() {
		rdriver.findElement(btnaddnew).click();
	}
	
	public void setmail(String email) {
		rdriver.findElement(txtemail).sendKeys(email);
	}
}
