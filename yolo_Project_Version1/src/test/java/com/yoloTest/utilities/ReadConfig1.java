package com.yoloTest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;

public class ReadConfig1 {

	Properties pro;
	 
	public ReadConfig1() 
	{
		BasicConfigurator.configure();
		File src=new File(".\\Cofiguration\\config.properties");
	
		
		//File src=new File(System.getProperty("user.dir")+ "\\Configuration\\config.properties");
		
		
		try {
		 FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis); 
			
			
	}
		catch(Exception e)
		{
			System.out.println("Exception is" + e.getMessage()	);
		}
	}
	
	public String getAppUrl()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
}
