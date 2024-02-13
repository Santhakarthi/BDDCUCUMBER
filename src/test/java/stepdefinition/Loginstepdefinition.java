package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdefinition {
	WebDriver driver;
	
		// TODO Auto-generated method stub
		@Given("^the browser is launched$")
		public void the_browser_is_launched() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    driver=new ChromeDriver();
		}

		@Given("^the application is loaded$")
		public void the_application_is_loaded() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    driver.get("");
		}

		@When("^the user enter valid username$")
		public void the_user_enter_valid_username() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@When("^the user enter valid password$")
		public void the_user_enter_valid_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    ;
		}

		@When("^the user click on login button$")
		public void the_user_click_on_login_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("^dashboard page is displayed$")
		public void dashboard_page_is_displayed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

	}


