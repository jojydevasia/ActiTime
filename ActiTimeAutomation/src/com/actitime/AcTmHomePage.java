package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcTmHomePage {
	WebDriver driver;
	
	String homTitle= null;
	By timeTrackTab=By.xpath("//a[@class='menu_link' and text()='Time-Track']");
	By projectTaskTab=By.xpath("//a[@class='menu_link' and text()='Projects & Tasks']");
	By reportsTab=By.xpath("//a[@class='menu_link' and text()='Reports']");
	By usersTab=By.xpath("//a[@class='menu_link' and text()='Users']");
	By workScheduleTab=By.xpath("//a[@class='menu_link' and text()='Work Schedule']");
	By settingsTab=By.xpath("//a[@class='menu_link' and text()='Settings']");
	By myAccountTab= By.xpath("//a[@class='menu_link' and text()='My Account']");
	By logoutButton= By.xpath("//a/img[@class='logoutImg']");
	
	public AcTmHomePage(WebDriver driver){
		this.driver=driver;
		homTitle=getPageTitle();
	}
	
	public void clickTimeTrackTab(){
		driver.findElement(timeTrackTab).click();
	}
	
	public void clickProjectTaskTab(){
		driver.findElement(projectTaskTab).click();
	}
	
	public void clickReportsTab(){
		driver.findElement(reportsTab).click();
	}
	
	public void clickUsersTab(){
		driver.findElement(usersTab).click();
	}
	
	public void clickWorkScheduleTab(){
		driver.findElement(workScheduleTab).click();
	}
	
	public void clickSettingsTab(){
		driver.findElement(settingsTab).click();
	}
	
	public void clickMyAccountTab(){
		driver.findElement(myAccountTab).click();
	}
	
	public void clickLogoutButton(){
		driver.findElement(logoutButton).click();
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}

}
