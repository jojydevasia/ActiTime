package com.actitime;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TempXpathTestField {
	
	 static WebDriver driver;
	 
	static void setUp(){
		  driver.navigate().to("http://127.0.0.1/login.do");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
		
	  static void shutDown(){
		  driver.quit();
	  }
   
	 
  public static void main(String[] args){
	  
	  try{
		  driver= new FirefoxDriver();
	  	  
		  setUp();
		  
//		  String expHomTitle="actiTIME - Open Tasks";
//		  String actHomTitle=driver.getTitle();
//		  System.out.println("HOME PAGE: "+ driver.getTitle());
//		  System.out.println("Home Page Title Test : " + expHomTitle.equals(actHomTitle));
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Time-Track']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Projects & Tasks']")).click();
//		  System.out.println(driver.getTitle());
//		  driver.findElement(By.xpath("//span[@class='sub_menu_link_act']")).click();
//		  System.out.println("\t \t"+driver.getTitle());
//		  driver.findElement(By.linkText("Completed Tasks")).click();
//		  System.out.println("\t \t"+driver.getTitle());
//		  driver.findElement(By.linkText("Projects & Customers")).click();
//		  System.out.println("\t \t"+driver.getTitle());
//		  driver.findElement(By.linkText("Archives")).click();
//		  System.out.println("\t \t"+driver.getTitle());
//		  
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Reports']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Users']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Work Schedule']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='Settings']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a[@class='menu_link' and text()='My Account']")).click();
//		  System.out.println(driver.getTitle());
//		  
//		  driver.findElement(By.xpath("//a/img[@class='logoutImg']")).click();
//		  System.out.println(driver.getTitle());
//		  
		  driver.navigate().to("http://127.0.0.1/tasks/add_tasks.do?resetForm=true&origin=open_tasks&customerId=1&projectId=-1");
//		  System.out.println(driver.findElement(By.xpath("//input[@value='Add New Tasks']")).getTagName());
//		  System.out.println(driver.findElement(By.xpath("//select[@name='customerProject.shownCustomer']")).getText());
//		  System.out.println(driver.findElement(By.xpath("//select[@name='customerProject.shownProject']")).getText());
//		  System.out.println(driver.findElement(By.name("searchTasks")).getTagName());
		  System.out.println(driver.findElement(By.name("customerId")).getTagName());
		  System.out.println(driver.findElement(By.name("projectId")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//tr/td/input[@tabindex='11']")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//td/input[@tabindex='13']")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//div[@id='bt0']/select")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//tr[2]/td[4]/a/img[@src='/img/default/delete_row.gif'][1]")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//input[@type='button' and @ value='Create Tasks']")).getTagName());
		  System.out.println(driver.findElement(By.xpath("//input[@type='button' and @ value='Create Tasks']/following-sibling::input")).getTagName());
		  
		  List <WebElement> t1=driver.findElements(By.xpath("//tr/td[starts-with(@id,'task')]/input[1]"));
			int s=t1.size();
			System.out.println("List Size : "+ s + "\n******** \n******** \n");
			for(WebElement we1:t1){
				System.out.println(we1);
				System.out.println(we1.isDisplayed());
				
				String a=we1.getAttribute("name");
				System.out.println("Name Attribute: "+a);
				String sb=a.substring(5, 6);
				System.out.println(sb);
				//WebElement delBtn=driver.findElement(By.xpath("//td["+sb+"]/a/img"));
				//System.out.println(delBtn.getTagName());
			}
				
	  } catch(Exception e){
		     e.printStackTrace();
		     }
	  
	 finally{
		 shutDown();
	 }
	  
	  
	  
  }
  
}
