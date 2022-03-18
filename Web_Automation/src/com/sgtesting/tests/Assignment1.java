package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		closewindow();
		createuser();
		deleteuser();
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
	  private static void createuser()
	  {
		  try
		  {
			  oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			  oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			  oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("venu");
			  oBrowser.findElement(By.name("lastName")).sendKeys("R");
			  Thread.sleep(3000);
			  oBrowser.findElement(By.name("email")).sendKeys("venuR@gmail.com");
			  oBrowser.findElement(By.name("username")).sendKeys("venur");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("password")).sendKeys("1NC16CSE12");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("passwordCopy")).sendKeys("1NC16CSE12");
			  Thread.sleep(3000);
			//  oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			  oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			  Thread.sleep(4000);
		     }catch(Exception e)
		     {
			      e.printStackTrace();
		     }
	  }
	  private static void deleteuser()
	  {
	  try
	  {
	  oBrowser.findElement(By.className("userNameSpan")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
	  Thread.sleep(3000);
	  Alert alert = oBrowser.switchTo().alert();
	  alert.accept();
	  Thread.sleep(3000);
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



