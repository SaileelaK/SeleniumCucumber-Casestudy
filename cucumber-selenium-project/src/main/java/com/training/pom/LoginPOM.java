package com.training.pom;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.training.beans.User;
import com.training.db.DBClient;
import com.training.db.UserDAO;
import com.training.util.Sleep;

public class LoginPOM {
	

	private WebDriver driver;
	private DBClient db;
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.db = new DBClient();
	}
	
	
	@FindBy(linkText = "Sign up!")
	private WebElement signUp;
	
	@FindBy(id = "registration_firstname")
	private WebElement firstName;
	
	@FindBy(id = "registration_lastname")
	private WebElement lastName;
	
	@FindBy(id = "registration_email")
	private WebElement email;
	
	@FindBy(id = "username")
	private WebElement uName; 
	
	@FindBy(id="pass1")
	private WebElement password;
	
	@FindBy(id = "pass2")
	private WebElement confirmpwd;
	
	@FindBy(id="registration_submit")
	private WebElement register;
	
	@FindBy(className = "dropdown-toggle")
	private WebElement avatarDropDown;
	
	@FindBy(id = "login")
	private WebElement loginUname; 
	
	@FindBy(id="password")
	private WebElement loginPwd;
	
	@FindBy(name="submitAuth")
	private WebElement login;
	
	@FindBy(linkText="Compose")
	private WebElement compose;
	
	@FindBy(className="select2-search__field")
	private WebElement recepientName;
	
	@FindBy(id="compose_message_title")
	private WebElement subject;
	
	@FindBy(xpath="/html/body")
	private WebElement msgBody;
	
	@FindBy(id="compose_message_compose")
	private WebElement sendMsg;
	
	public void clickSignUp() {
		this.signUp.click(); 
	}
	
	public void sendFirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName);
	}
	
	public void sendEmail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email);
	}
	
	public void sendUName(String userName) {
		this.uName.clear(); 
		this.uName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmpwd) {
		this.confirmpwd.clear(); 
		this.confirmpwd.sendKeys(confirmpwd);
	}
	
	public void clickRegister() {
		this.register.click();
	}
	
	public void validateFirstnameLastname() {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Dear')]"));
		Assert.assertTrue(list.size() > 0,"Text not found!");
	}
	
	public void validateEmail() {
		this.avatarDropDown.click();
		List<WebElement> list1 = driver.findElements(By.xpath("//*[contains(text(),db.email)]"));
		Assert.assertTrue(list1.size() > 0,"Text not found!");
		driver.quit();
	}
	
	public void sendLoginUName(String userName) {
		this.loginUname.clear(); 
		this.loginUname.sendKeys(userName);
	}
	
	public void sendLoginPassword(String password) {
		this.loginPwd.clear(); 
		this.loginPwd.sendKeys(password);
	}
	
	public void clickLogin() {
		Sleep.sleepSeconds(3);
		this.login.click();
	}
	
	public void validateUserValidity() {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Hello')]"));
		Assert.assertTrue(list.size() > 0,"Text not found!");
	}
	
	public void clickCompose() {
		this.compose.click(); 
	}
	
	public void validateComposePage() {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Compose message')]"));
		Assert.assertTrue(list.size() > 0,"Text not found!");
	}
	
	public void sendRecepientName(String name) {
		this.recepientName.clear(); 
		this.recepientName.sendKeys(name);
		Sleep.sleepSeconds(3);
		driver.findElement(By.xpath("//span[@class='select2-results']//li[contains(text(),name)]")).click();
	}
	
	public void sendSubject(String sub) {
		this.subject.clear(); 
		this.subject.sendKeys(sub);
	}
	
	public void composeMessage(String message) {
		Sleep.sleepSeconds(6);
		driver.switchTo().frame(0);
		this.msgBody.clear();
		this.msgBody.sendKeys("message");
		driver.switchTo().parentFrame();
	}
	
	public void clickSend() {
		this.sendMsg.click(); 
	}
	
	public void validateMsgAck() throws SQLException {
		Sleep.sleepSeconds(5);
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'The message has been sent to')]"));
		Assert.assertTrue(list.size() > 0,"Text not found!");
		db.updateUserSignup(db.username);
		driver.quit();
		db.closecon();
	}
	
	
}
