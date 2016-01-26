package com.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AcTmCmpltTaskTab {
	WebDriver driver;
	
	String cmpltPgTitle=null;
	 By selCustList=By.id("shownCustomer");
	 By selProjList=By.id("shownProject");
	 By fromDtMonth=By.name("completionDateFromMonth");
	 By fromDtDay=By.name("completionDateFromDay");
	 By fromDtYear=By.name("completionDateFromYear");
	 By toDtMonth=By.name("completionDateToMonth");
	 By toDtDay=By.name("completionDateToDay");
	 By toDtYear=By.name("completionDateToYear");	
	 By activProjRadBtn= By.id("customerProjectStatus_active");
	 By allProjRadBtn=By.id("customerProjectStatus_all");
	 By showTskBtn=By.xpath("//input[@type='submit' and @value='Show Tasks']");
	 
	 
	 public AcTmCmpltTaskTab(WebDriver driver){
		 this.driver=driver;
		 cmpltPgTitle=getPageTitle();
	 }
	 
	 
	 public void selectCustomer(String customerName){
		 Select sel1=new Select(driver.findElement(selCustList));
		 sel1.selectByVisibleText(customerName);
	 }
	 
	 public void selectProject(String projectName){
		 Select sel2=new Select(driver.findElement(selProjList));
		 sel2.selectByVisibleText(projectName);
	 }
	 
	 public void selectFromDate(String frMm,String frDd, String frYy){
		new Select(driver.findElement(fromDtMonth)).selectByVisibleText(frMm);;
		new Select(driver.findElement(fromDtDay)).selectByVisibleText(frDd);
		new Select(driver.findElement(fromDtYear)).selectByVisibleText(frYy);
	 }
	 
	 public void selectToDate(String toMm,String toDd,String toYy){
		 new Select(driver.findElement(toDtMonth)).selectByVisibleText(toMm);
		 new Select(driver.findElement(toDtDay)).selectByVisibleText(toDd);
		 new Select(driver.findElement(toDtYear)).selectByVisibleText(toYy);
	 }
	 
	 public void clickActivePrjRadBtn(){
		 driver.findElement(activProjRadBtn).click();
	 }
	 
	 public void clickAllPrjRadBtn(){
		 driver.findElement(allProjRadBtn).click();
	 }
	 
	 public void clickShowTskBtn(){
		 driver.findElement(showTskBtn).click();
	 }
	 
	 public String getPageTitle(){
	 return driver.getTitle();
	 }

}
