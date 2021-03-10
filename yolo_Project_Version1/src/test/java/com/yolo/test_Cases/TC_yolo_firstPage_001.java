package com.yolo.test_Cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_yolo_firstPage_001 extends baseClass

{
    @Test
	public void my_Test_01()
	{
    	long startTime=System.currentTimeMillis();
		driver.get(baseUrl);
		long finisTime=System.currentTimeMillis();
		
		long loadTime=finisTime-startTime;
		System.out.println("loadTime +" + loadTime);
		logger.info("loadTime =" +loadTime);
	    
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
		
		logger.info("Web page loaded successfully");
		
		if(driver.getTitle().equals("Online Bus Ticket Booking | YoloBus India"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	
       List<WebElement> links=driver.findElements(By.tagName("a"));
    	
    	for(int i=0; i<links.size(); i++)
    	{
    		WebElement webElement=links.get(i);
    		String url=webElement.getAttribute("href");
    		logger.info(url);
    	}
	    
	    
	}
    
   
	
}
