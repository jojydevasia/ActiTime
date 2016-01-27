package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcTmLoginPage {
	
	WebDriver driver;
	
	String lgTitle=null;
	By lgUserName=By.name("username");
	By lgPassWord=By.name("pwd");
	By lgSubmitButton= By.xpath("//input[@type='submit']");
	
	public AcTmLoginPage(WebDriver driver){
	  this.driver=driver;
	  lgTitle=getPageTitle();
	}  
	
	public void enterUserName(String userName){
		driver.findElement(lgUserName).sendKeys(userName);
	}
	
	public void enterPassword(String password){
		driver.findElement(lgPassWord).sendKeys(password);
	}
	
	public void submitLogin(){
		driver.findElement(lgSubmitButton).click();
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}

}
