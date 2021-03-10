package com.yolo.test_Cases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.yoloTest.utilities.ReadConfig;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.logging.log4j.*;
//import org.apache.log4j.PropertyConfigurator;
import com.yoloTest.utilities.ReadConfig1;

//import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;


public class baseClass 
{
	ReadConfig1 read=new ReadConfig1();
	

	public String baseUrl= read.getAppUrl();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		
		logger=Logger.getLogger("baseClass");
	    //logger= Logger.getLogger(baseClass.class);
		PropertyConfigurator.configure("log4j.properties");
		
		//BasicConfigurator.configure();
		if(br.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", read.getChromepath());
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		}
		
		else if(br.equals("firefox"))
		{
			
		}
		
		else if(br.equals("ie"))
		{
			
		}

	    
	     
		
	  
	    //PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
