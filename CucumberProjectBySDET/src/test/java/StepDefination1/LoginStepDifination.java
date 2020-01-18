package StepDefination1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDifination {
	
	LoginPage lp;
	public WebDriver driver;
	@Given("^User Lunch Chrome Browser$")
	public void user_Lunch_Chrome_Browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\workspace2\\CucumberProjectBySDET\\Driver\\chromedriver (1).exe");
		 driver=new ChromeDriver();
		  lp=new LoginPage(driver);
	}

	@When("^User open the url \"([^\"]*)\"$")
	public void user_open_the_url(String args1) throws Throwable {
		
		driver.get(args1);
	    
	}

	@When("^User Enter Username as \"([^\"]*)\" and Password  \"([^\"]*)\"$")
	public void user_Enter_Username_as_and_Password(String args1, String args2) throws Throwable {
		
		lp.loginWithValidCrendantial(args1, args2);
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
		lp.ClickOnLoginBtn();
	    
	}

	@Then("^Page Title Should be \"([^\"]*)\"$")
	public void page_Title_Should_be(String args1) throws Throwable {
		
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(args1, driver.getTitle());
		}
	    
	}

	@When("^User Click on Logout link$")
	public void user_Click_on_Logout_link() throws Throwable {
		lp.clickOnLogoutBtn();
		Thread.sleep(3000);
	    
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	    
	}
	
	// Customer feature step defination
	
	@When("^User click on customers menu$")
	public void user_click_on_customers_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Click on customers menu item$")
	public void click_on_customers_menu_item() throws Throwable {
	  
	}

	@When("^Click on Add new button$")
	public void click_on_Add_new_button() throws Throwable {
	    
	}

	@Then("^User can view Add new customer page$")
	public void user_can_view_Add_new_customer_page() throws Throwable {
	    
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws Throwable {
	    
	}

	@When("^Click on save button$")
	public void click_on_save_button() throws Throwable {
	    
	}

	@Then("^User can view confimation massage \"([^\"]*)\"$")
	public void user_can_view_confimation_massage(String arg1) throws Throwable {
	    
	}



}
