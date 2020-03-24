package com.testcases;

import org.junit.BeforeClass;
import org.junit.Test;

import com.baseclass.wrapperex;
import com.pages.Cruises;


public class cruisetestcase extends wrapperex
{
	@BeforeClass
	public void startup() 
	{
		launchApplication("chrome","https://www.royalcaribbean.com//alaska-cruises");
	}
	@Test
	public void run() throws InterruptedException
	{
		Cruises d=new Cruises(driver);
		//d.clicklinks();
		d.assertion();
	}

}
