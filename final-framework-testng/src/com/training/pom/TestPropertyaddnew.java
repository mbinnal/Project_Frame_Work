package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestPropertyaddnew {
	private WebDriver driver; 
	
	public TestPropertyaddnew(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//div[contains(@class, 'wp-menu-image dashicons-before dashicons-admin-multisite')]")
	private WebElement Proprty; 
	
	@FindBy(xpath="//a[@href='post-new.php?post_type=property']")
	private WebElement usercheck; 
	
	//@FindBy(id="title-prompt-text")
	//private WebElement title; 
	
	@FindBy(id="content")
	private WebElement Desc;
	
	@FindBy(id="_price")
	private WebElement price;
	
	@FindBy(id="_property_type")
	private WebElement type;
	
	@FindBy(id="in-property_feature-467")
	private WebElement Feature;
	
	@FindBy(id="in-region-540")
	private WebElement Region;
	
	@FindBy(id="publish")
	private WebElement publsh;
	
	@FindBy(xpath="//a[text()='View post']")
	private WebElement ViewPost;
	
	/*@FindBy(id="user_180")
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
	
	public void UserCheck() throws Throwable {
		Actions action=new Actions(driver);
		action.moveToElement(Proprty).build().perform();
		Thread.sleep(2000);
		this.usercheck.click();
		Thread.sleep(3000);
		//this.title.sendKeys("NewVilla");
		this.Desc.sendKeys("test2");
		this.price.sendKeys("1.5Cr");
		Select sel=new Select(type);
		sel.selectByVisibleText("Villas");
		this.type.click();
		this.Feature.click();
		this.Region.click();
		this.publsh.click();
		this.ViewPost.click();
		
	}
	
}	