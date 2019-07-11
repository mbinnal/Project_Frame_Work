package com.training.sanity.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TestcaseChangerole;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangeRole {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private TestcaseChangerole tc1;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		tc1= new TestcaseChangerole(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(priority=1)
	public void validLoginTest() throws Throwable {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("adminuser@12345");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		tc1.UserCheck();
		
	}
	
	/*@Test(priority=2)
	public void UserAction() {
     WebElement link = driver.findElement(By.xpath("//div[contains(@class, 'wp-menu-image dashicons-before dashicons-admin-users')]"));
		
		Actions MH = new Actions(driver);
		
		//MH.moveToElement(link).click().build().perform();
		//driver.navigate().back();
		
		Action mouseover = MH.moveToElement(link).build();
						
		mouseover.perform();
	} */
}                                      



