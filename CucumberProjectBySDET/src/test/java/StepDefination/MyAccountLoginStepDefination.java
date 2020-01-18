package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefination {

	public WebDriver driver = null;

	@Given("^open browser$")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace2\\CucumberProjectBySDET\\Driver\\chromedriver (1).exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("^Enter the url\"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
		
		driver.get(url);
	    
	}

	@And("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
		
		driver.findElement(By.linkText("My Account")).click();

	}

/*	@And("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys("pavanoltraining");
		driver.findElement(By.id("password")).sendKeys("Test@selenium123");

	} */
	
/*	@When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}  */
	  // Login with data table method
/*	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable creditional) throws Throwable {
		
		List<List<String>> data=creditional.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));    
	} */
	
	  // Login with the data table method using header map table
	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable creditional) throws Throwable {
		
		List<Map<String, String>> data= creditional.asMaps(String.class,String.class);
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("pwd"));  
	}

	@And("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		
		driver.findElement(By.name("login")).click();

	}

	@Then("^User must be sucessfully Login to the Webpage$")
	public void user_must_be_sucessfully_Login_to_the_Webpage() throws Throwable {
		
		String captext=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertEquals(true,captext.contains("pavanoltraining"));
		driver.close();
	}
	
	@Then("^verify login$")
	public void verify_login() throws Throwable {
		String captext=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
			if(captext.contains("ERROR")) {
				
				Assert.assertTrue("Invalid Input - Error page", true);
			} else {
				Assert.assertTrue(false);
			}
	    
	}

}
