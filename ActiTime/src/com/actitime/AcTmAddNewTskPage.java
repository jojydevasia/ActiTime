package com.actitime;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AcTmAddNewTskPage {
	
	WebDriver driver;
	
	String addTskPgTitle=null;
	By custList=By.name("customerId");
	By custName=By.name("customerName");
	By projList=By.name("projectId");
	By projName=By.name("projectName");
	By taskName=By.xpath("//tr[2]/td[starts-with(@id,'task')]/input[1]");
	By deadLine=By.xpath("//td/input[@tabindex='13']");
	By billingTypeList=By.xpath("//div[@id='bt0']/select");
	By deleteRowBtn=By.xpath("//tr[2]/td[4]/a/img[@src='/img/default/delete_row.gif'][1]");
	By createTskBtn=By.xpath("//input[@type='button' and @value='Create Tasks']");
	By cancelBtn= By.xpath("//input[@type='button'  and @ value='Create Tasks']/following-sibling::input");
	
	public AcTmAddNewTskPage(WebDriver driver){
		this.driver=driver;
		addTskPgTitle=getPageTitle();		
	}
	
	
	public void selectCustName(String customer){
		Select sel1=new Select(driver.findElement(custList));
		sel1.selectByVisibleText(customer);
	}
	
	public void enterCustName(String customerName){
		driver.findElement(custName).sendKeys(customerName);
	}
	
	public void selectProjName(String project){
		Select sel2=new Select(driver.findElement(projList));
		sel2.selectByVisibleText(project);
	}
	
	public void enterProjectName(String projectName){
		driver.findElement(projName).sendKeys(projectName);
	}
	
	public void enterTaskName(String taskName1){
		driver.findElement(taskName).sendKeys(taskName1);
	}
	
	public void enterDeadLine(String lastDate){
		driver.findElement(deadLine).sendKeys(lastDate);
	}
	
	public void selectBillingType(String billType){
		Select sel3= new Select(driver.findElement(billingTypeList));
		sel3.selectByVisibleText(billType);
	}
	
	public void deleteTask(String taskName1){
		List <WebElement> t1=driver.findElements(By.xpath("//tr/td[starts-with(@id,'task')]/input[1]"));
		int s=t1.size();
		for(WebElement we1:t1){
			if(we1.getText().contains(taskName1)){
				String a=we1.getAttribute("name");
				String sb=a.substring(5, 6);
				driver.findElement(By.xpath("//td["+sb+"]/a/img")).click();
			}
		}
	}
	
	public void clickCreateTskBtn(){
		driver.findElement(createTskBtn).click();
	}
	
	public void clickCancelBtn(){
		driver.findElement(cancelBtn).click();
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	
	
	
	
	

	
}
	