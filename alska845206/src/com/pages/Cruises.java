package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cruises 
{

	By xpath1=By.xpath("//*[@id=\"rciHeaderOpenSidenav\"]//figure//img");
	By planacruise=By.xpath("//*[@id=\"rciHeaderSideNavMenu-1\"]");
	//By seachbyport=By.xpath("//*[@id=\"rciHeaderSideNavSubmenu-1-3\"]/span");
	By ship=By.xpath("//*[@id=\"rciHeaderMenuItem-2\"]");
	By rapsody=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div/figure/div");
	By deckplans=By.xpath("//*[@id=\"superHero-1073688544\"]/div[4]/div/div/div/div/div[3]/a");
	By deckeight=By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[2]/section/div[1]/label/select");
	public WebDriver driver;
	 public Cruises(WebDriver driver)
	{
		this.driver=driver;
	}
	 public void clicklinks() throws InterruptedException
	 {
		 
		 driver.findElement(xpath1).click();
		 Thread.sleep(1000);
		 driver.findElement(planacruise).click();
		 driver.findElement(By.xpath("//*[@id=\"rciHeaderCloseSidenav\"]/figure/img")).click();
		 driver.findElement(ship).click();
		 driver.findElement(rapsody).click();
		 WebElement a= driver.findElement(deckplans);
		a.click();
		WebElement b=driver.findElement(deckeight);
		b.click();
		Thread.sleep(5000);
		
		 Actions act=new Actions(driver);
		
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).build().perform();
		 act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		 
	 }
	 public void assertion()
	 {
		 String msg="hello";
		 WebElement  d=driver.findElement(By.xpath("//*[@id=\"textWithUI-262899300\"]/div/div[2]/a"));
		boolean b= d.isDisplayed();
		 System.out.println("passed");
		 driver.navigate().to("https://www.royalcaribbean.com/cruise-ships/rhapsody-of-the-seas/deck-plans/1896/BR");
		 WebElement b1=driver.findElement(By.xpath("//*[@id=\"deck-plans-template\"]/section/section[2]/section[1]/div[2]/section[5]/h4"));
		 boolean c=b1.isDisplayed();
		 boolean a=b&&c;
		 Assert.assertTrue(a);
		 
	 }
}
