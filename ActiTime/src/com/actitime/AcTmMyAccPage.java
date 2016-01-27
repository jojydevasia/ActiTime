package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcTmMyAccPage {
	
	WebDriver driver;
	
	String myAccPgTitle=null;
	By curPassword=By.name("passwordCur");
	By newPassword=By.name("passwordNew");
	By rePassword=By.name("passwordRetype");
	By firstName=By.name("firstName");
	By lastName=By.name("lastName");
	By midName=By.name("middleName");
	By emailId=By.name("email");
	By phoneNo=By.name("phone");
	By fax=By.name("fax");
	By mobileNo=By.name("mobile");
	By otherCont=By.name("otherContact");
	By saveBtn=By.xpath("//input[@type='submit']");
	
	public AcTmMyAccPage(WebDriver driver){
		this.driver=driver;
		myAccPgTitle=getPgTitle();
	}
	
	public void enterCurPassword(String curPass){
		driver.findElement(curPassword).sendKeys(curPass);
	}
	
	public void enterNewPassword(String newPass){
		driver.findElement(newPassword).sendKeys(newPass);
	}
	
	public void enterRetypePassword(String rePass){
		driver.findElement(rePassword).sendKeys(rePass);
	}
	
	public void enterFirstName(String fsName){
		driver.findElement(firstName).sendKeys(fsName);
	}
	
	public void enterLastName(String lsName){
		driver.findElement(lastName).sendKeys(lsName);
	}
	
	public void enterMidName(String mdName){
		driver.findElement(midName).sendKeys(mdName);
	}
	
	public void enterEmail(String email){
		driver.findElement(emailId).sendKeys(email);
	}
	
	public void enterPhone(String phNum){
		driver.findElement(phoneNo).sendKeys(phNum);
	}
	
	public void enterFax(String faxNo){
		driver.findElement(fax).sendKeys(faxNo);
	}
	
	public void enterMobile(String mobNum){
		driver.findElement(mobileNo).sendKeys(mobNum);
	}
	
	public void enterOtherCont(String otrContc){
		driver.findElement(otherCont).sendKeys(otrContc);
	}
	
	public void clickSaveBtn(){
		driver.findElement(saveBtn).click();
	}
	
	public String getPgTitle(){
		return driver.getTitle();
	}


}
