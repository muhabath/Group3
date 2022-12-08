package com.blog.pages;

import java.time.Duration;
//                                                                                                                                                                                                                                                                                                      import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Approv {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	@FindBy(xpath="//button[text()='Approve'][1]")
	private WebElement button1;

	public Approv (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		
		
	}
	
	//@FindBy(xpath="/html/body/app-root/app-pendingapproval/div[2]/li[1]/div/div/div/button[1]")
	//private WebElement approved;
	//String xpathOfSameElements="//button[@class='btn btn-outline-danger ng-star-inserted']/preceding-sibling::button[text()='Approve']";
	//List <WebElement> approved=driver.findElements(By.xpath(xpathOfSameElements));

	

	
    public void Clickapprove()
    {try {
			
			wait.until(ExpectedConditions.visibilityOf(button1));
			js.executeScript("arguments[0].click();",button1);
			//button1.click();
			Thread.sleep(1000);
		}
		catch (Exception e) {
		}
    }
	public void accept()
	{
		driver.switchTo().alert().accept();
	}
	
}
	
