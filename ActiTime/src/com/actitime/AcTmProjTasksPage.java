package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcTmProjTasksPage {
	WebDriver driver;
	
	String prjPgTitle= null;
	By prjOpenTaskTab= By.xpath("//span[@class='sub_menu_link_act']");
	By prjCompltTaskTab= By.linkText("Completed Tasks");
	By prjProjNCustTab= By.linkText("Projects & Customers");
	By prjArchiveTab=By.linkText("Archives");
	
	public AcTmProjTasksPage(WebDriver driver){
		this.driver=driver;
		prjPgTitle=getPageTitle();
	}
	
	public void clickOpenTaskTab(){
		driver.findElement(prjOpenTaskTab).click();
	}
	
	public void clickCompltTaskTab(){
		driver.findElement(prjCompltTaskTab).click();
	}
	
	public void clickProjNCustTab(){
		driver.findElement(prjProjNCustTab).click();
	}
	
	public void clickArchiveTab(){
		driver.findElement(prjArchiveTab).click();
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	

}
