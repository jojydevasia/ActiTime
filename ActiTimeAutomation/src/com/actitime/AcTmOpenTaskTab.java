package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AcTmOpenTaskTab {
	
	
	WebDriver driver;
	
	String openTskPgTitle=null;
	By addNewTskBTN= By.xpath("//input[@value='Add New Tasks']");
	By custList= By.xpath("//select[@name='customerProject.shownCustomer']");
	By projList= By.xpath("//select[@name='customerProject.shownProject']");
	By showTskBtn=By.name("searchTasks");
	
	public AcTmOpenTaskTab(WebDriver driver){
		this.driver=driver;
		openTskPgTitle=driver.getTitle();
	}
	
	public void clickNewTskBtn(){
		driver.findElement(addNewTskBTN).click();
	}
	
	public void selCustList(String customer){
		Select sel1=new Select(driver.findElement(custList));
		sel1.selectByVisibleText(customer);
	}
	
	public void selProjList(String project){
		Select sel2=new Select(driver.findElement(projList));
		sel2.selectByVisibleText(project);
	}
	
	public void clickShowTaskBtn(){
		driver.findElement(showTskBtn).click();
	}

}
