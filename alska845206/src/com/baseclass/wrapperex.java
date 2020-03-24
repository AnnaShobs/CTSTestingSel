package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wrapperex
{
	
		protected WebDriver driver;
		public void launchApplication(String browser,String url)
		{
			try
			{
				if(browser.equalsIgnoreCase("firefox"))
				{
					System.setProperty("WebDriiver.geckodriver", "C:\\Users\\User\\eclipse-workspace\\alska845206\\drivers\\chromedriver.exe");
					driver=new FirefoxDriver();
					
				}
				else if(browser.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\alska845206\\drivers\\chromedriver.exe");
					driver=new ChromeDriver();
				}
				driver.manage().window().maximize();//Maximizing the window
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Waiting time
				driver.get(url);//Getting url
			}
				catch (WebDriverException e) 
				{
					System.out.println(" browser could not be launched");//If browser does not launched diplays message
				}
			
		}
						
	   public void quit()
	   {
			driver.close();//closing the driver
	   }
	}

