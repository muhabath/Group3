package com.ictak.scripts;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	public static Properties prop=null;
	String driverPath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public static void TestBase() 
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
		TestBase();
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
}


