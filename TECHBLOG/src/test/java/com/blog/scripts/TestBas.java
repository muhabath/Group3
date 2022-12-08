package com.blog.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBas {
	
	WebDriver driver;
	public static Properties prop=null;
String driverPath="E:\\Study\\Selenium\\driver";
	
	public static  void Testbas()
	{
		try
		{
		prop=new Properties();
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/config.properties");
		prop.load(ip);
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
			
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

	@BeforeTest
	public void onSetup()
	{
		Testbas();
		String browsername=prop.getProperty("Browser");
	  if(browsername.equals("chrome"))
			  {
		  System.setProperty("webdriver.chrome.driver","E:\\Study\\Selenium\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		  
			  }
	  else if(browsername.equals("firefox"))
	  { 
		  System.setProperty("webdriver.gecko.driver","driverPath");
	   driver=new ChromeDriver();
		  
	  }
	  
	  driver.get(prop.getProperty("url"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  
	

}}


