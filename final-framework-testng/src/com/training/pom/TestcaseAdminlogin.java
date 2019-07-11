package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestcaseAdminlogin {
	private WebDriver driver; 
	
	public TestcaseAdminlogin(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn; 
	
	/*@FindBy(xpath="//div[contains(@class, 'wp-menu-image dashicons-before dashicons-admin-users')]")
	private WebElement User; 
	
	@FindBy(id="user_180")
	private WebElement usercheck;
	
	@FindBy(id="new_role")
	private WebElement role;
	
	@FindBy(id="changeit")
	private WebElement change;
	*/
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	/*public void UserCheck() throws Throwable {
		Actions action=new Actions(driver);
		action.moveToElement(User).build().perform();
		Thread.sleep(2000);
		this.User.click();
		*/
}

	

