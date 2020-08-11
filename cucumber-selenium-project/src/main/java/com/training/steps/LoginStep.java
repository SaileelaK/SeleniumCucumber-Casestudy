package com.training.steps;

import static com.training.util.Sleep.sleepSeconds;

import org.openqa.selenium.WebDriver;

import com.training.db.DBClient;
import com.training.pom.LoginPOM;
import com.training.util.CaptureScreenShot;
import com.training.util.DriverFactory;
import com.training.util.DriverNames;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	private WebDriver driver;
	private CaptureScreenShot screenShot; 
	private LoginPOM loginPOM;
	private DBClient db;
	
	public LoginStep() {
		 this.driver = DriverFactory.getDriver(DriverNames.CHROME); 
		 this.loginPOM = new LoginPOM(driver); 
		 this.screenShot = new CaptureScreenShot(driver); 
		 this.db = new DBClient();
	}
	
	@Given("^the web application is loaded$")
	public void the_web_application_is_loaded() throws Throwable {
	   System.out.println("application loaded........");

		// it will open the page... 
		driver.get("http://elearningm1.upskills.in/");
	}
	
	@When("^the user clicks on signup$")
	public void the_user_clicks_on_signup() throws Throwable {
	    loginPOM.clickSignUp();
	}

	@When("^the firstname is entered$")
	public void the_firstname_is_entered() throws Throwable {
		loginPOM.sendFirstName(db.firstname);
	}

	@When("^the lastname is entered$")
	public void the_lastname_is_entered() throws Throwable {
	    loginPOM.sendLastName(db.lastname);
	}

	@When("^the email is entered$")
	public void the_email_is_entered() throws Throwable {
	    loginPOM.sendEmail(db.email);
	}

	@When("^the username is entered$")
	public void the_username_is_entered() throws Throwable {
		loginPOM.sendUName(db.username);
	}
	
	@And("^the password is entered$")
	public void the_password_is_entered() throws Throwable {
		loginPOM.sendPassword(db.password);
	}

	@When("^confirm password is entered$")
	public void confirm_password_is_entered() throws Throwable {
		loginPOM.sendConfirmPassword(db.password);
	}

	@When("^user clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
	    loginPOM.clickRegister();
	}

	@When("^user signup is successful$")
	public void user_signup_is_successful() throws Throwable {
		screenShot.screenShot();
	}

	@Then("^verify if firstname and lastname is visible on screen$")
	public void verify_if_firstname_and_lastname_is_visible_on_screen() throws Throwable {
	    loginPOM.validateFirstnameLastname();
	}

	@Then("^validate email displayed on screen$")
	public void validate_email_displayed_on_screen() throws Throwable {
	    loginPOM.validateEmail();
	}

	@When("^the user logins with username$")
	public void the_user_logins_with_username() throws Throwable {
	    loginPOM.sendLoginUName(db.username);
	}
	
	@And("enters the password")
	public void enters_the_password() throws Throwable {
	    loginPOM.sendLoginPassword(db.password);
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable {
	    loginPOM.clickLogin();
	}

	@When("^user is valid$")
	public void user_is_valid() throws Throwable {
		loginPOM.validateUserValidity();
	}

	@When("^user clicks on compose$")
	public void user_clicks_on_compose() throws Throwable {
	    loginPOM.clickCompose();
	}

	@Then("^verify compose message page launched$")
	public void verify_compose_message_page_launched() throws Throwable {
	    loginPOM.validateComposePage();
	}

	@When("^user enters recepient name$")
	public void user_enters_recepient_name() throws Throwable {
	    loginPOM.sendRecepientName("SaileelaK");
	}

	@When("^enters the subject$")
	public void enters_the_subject() throws Throwable {
	    loginPOM.sendSubject("Testing");
	}

	@When("^message is entered$")
	public void message_is_entered() throws Throwable {
	    loginPOM.composeMessage("Hello  Naveen \\n\" + \"    This is for testing \\n\" + \"\\n\" + \"From,\"+ \"\\n\"+ \"Saileela");
	}

	@When("^send the message$")
	public void send_the_message() throws Throwable {
	    loginPOM.clickSend();
	}

	@Then("^verify acknowledgement is shown$")
	public void verify_acknowledgement_is_shown() throws Throwable {
	    loginPOM.validateMsgAck();
//	    loginPOM.closeBrowsers();
	}

	

}
