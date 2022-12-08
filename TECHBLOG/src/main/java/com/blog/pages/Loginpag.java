package com.blog.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpag {
	
	WebDriver driver;

	
	
	
	@FindBy(id="user")
	private WebElement emailid;
	@FindBy(id="pwd")
	private WebElement password;
	@FindBy(id="logbut")
	private WebElement login;
	@FindBy(xpath="//*[@id=\"navbarDropdown\"]/img")
	private WebElement profile;
	@FindBy(css="[href='/login']")
	private WebElement Login;
    @FindBy(xpath="//li[@class='nav-item dropdown ng-star-inserted']/child::a")
	private WebElement Actions2;
	@FindBy(css="a[href='/approval']")
	private WebElement approve;
		

	
	
	public Loginpag (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	
	}
	


	public void Loginto()
	{
		Login.click();
	}
	public void Profile()
	{
		profile.click();
	}
	
	public void setEmailid(String strEmailid)
	{
		emailid.sendKeys(strEmailid);
	}

	public void setPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	public void Actions1()
	{
	Actions actions =new Actions(driver);
	actions.moveToElement(Actions2);
	actions.perform();
	
		Actions2.click();
	}
	
	public void Pendingapprovals()
	{
		approve.click();
	}
	 
	
	
}

	


