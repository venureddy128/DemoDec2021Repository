package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
    launchBrowser();
    navigate();
	}
private static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.gecko.driver","D:\\ExampleAutomation\\Automation\\Web_Automation\\library\\drivers\\geckodriver.exe" );
		oBrowser=new FirefoxDriver();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void navigate()
{
	try
	{
		oBrowser.get("http://localhost:81/user/submit_tt.do");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
