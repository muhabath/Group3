package com.Ictak.blog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Trainer {
	
	WebDriver driver;
    public static Properties prop = null;
    String driverPath = "C:\\\\Users\\\\Dr P Baburaj\\\\Desktop\\\\Eclipsework\\\\ICT\\\\driver\\\\chromedriver.exe";
    public static void Trainer() {
        try {
        	//Below line creates an object of Properties called 'prop'
            prop = new Properties();
          //Below line creates an object of FileInputStream called 'ip'. 
          //Give the path of the properties file which you have created
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
                    + "/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @BeforeTest
    public void onSetup() {
        Trainer(); // for loading the configurations
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();

        }
        else if (browserName.equals("firefox")) {
        	
        	System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();
        }
      // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();   
    }


}
