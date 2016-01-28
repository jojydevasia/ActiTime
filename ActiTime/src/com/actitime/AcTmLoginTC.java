package com.actitime;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AcTmLoginTC {
	WebDriver driver;
	
  @BeforeTest
  
  public void setUp(){
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  driver.get("http://127.0.0.1/login.do");
	  System.out.println("@BeforeTest Comment");
   }

  @Test
  
  public void login() {
	  AcTmLoginPage actlgp= new AcTmLoginPage(driver);
	  
	  String pageTitle=actlgp.getPageTitle();
	  System.out.println(pageTitle);
	  actlgp.enterUserName("admin");
	  actlgp.enterPassword("manager");
	  actlgp.submitLogin();
	  System.out.println("@Test 1 Comment");
  }
  
  @SuppressWarnings("deprecation")
@Test 
  public void testTabs(){
	  AcTmHomePage actHomPg= new AcTmHomePage(driver);
	  
	  String pageTitle=actHomPg.homTitle;
	  System.out.println("Home Page Title = "+ pageTitle);
	  Assert.assertEquals("actiTIME - Open Tasks", driver.getTitle());
	  actHomPg.clickTimeTrackTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickProjectTaskTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickUsersTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickReportsTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickWorkScheduleTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickSettingsTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickMyAccountTab();
	  System.out.println(driver.getTitle());
	  
	  actHomPg.clickLogoutButton();
	  System.out.println("Logged Out of Acti Time");
	  
	  System.out.println("@Test 2 Comment");
	  	  
  }
  
  @AfterTest
  public void shutDown(){
	  	  driver.close();
	  	System.out.println("@AfterTest Comment");
  }
  
}
