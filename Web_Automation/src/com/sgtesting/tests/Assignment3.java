package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		closewindow();
		createcustomer();
		deletecustomer();
		logout();
		closeapplication();
	}
		
		private static void launchBrowser() {
			
			try 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web_Automation\\library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
}		
	  private static void navigate() {
		  
		  try
		  {
			oBrowser.get("http://localhost:81/user/submit_tt.do");
		  }catch(Exception e)
		  {
			e.printStackTrace();  
		  }
				
	}
	  private static void login() {
		  
		  try
		  {
			  oBrowser.findElement(By.name("username")).sendKeys("admin");
			  oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			  oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  private static void closewindow()
	  {
	  try
	     {
	         oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();//gettingStartedShortcutsPanelId
	         Thread.sleep(3000);
	     }catch(Exception e)
	      {
	         e.printStackTrace();
	     }
	  }
	  private static void createcustomer()
	  {
		  try
		  {
			  oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
		         Thread.sleep(3000);
			  oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
		         Thread.sleep(3000);
		      oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		         Thread.sleep(3000);
		      oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Cname");
		         Thread.sleep(3000);
			  oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Java is a programming language");
		         Thread.sleep(3000);
			  oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
		         Thread.sleep(3000);
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  private static void deletecustomer()
	  {
		  try
		  {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	         Thread.sleep(2000);
	        oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
	         Thread.sleep(2000);
	         oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();  
	         Thread.sleep(2000);
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  private static void logout()
	  {
	  try
	  {
	  oBrowser.findElement(By.id("logoutLink")).click();
	  Thread.sleep(3000);
	  }catch(Exception e)
	  {
	  e.printStackTrace();
	  }
	  }
	  private static void closeapplication()
	  {
	  try
	  {
	  oBrowser.close();
	  }catch(Exception e)
	  {
	  e.printStackTrace();
	  }
	  }
	  }
	  
	  