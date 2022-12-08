package com.ictak.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ictak.utilities.ExcelUtility;

public class Userpage{

	WebDriver driver;

	
	  @FindBy(xpath="//img[(@src='../../assets/images/user.png')]") 
	  private WebElement image;
	  
	  @FindBy(xpath="//a[(@href='/signup')]")
	  private WebElement signup;
	  
	  
	  
	  @FindBy(id="first") 
	  private WebElement name;
	  
	  
	  @FindBy(xpath="//option[(@value='0: user')]") 
	  private WebElement accounttype;
	  
	  @FindBy(id="em") 
	  private WebElement email;
	  
	  @FindBy(id="pw") 
	  private WebElement password;
	  
	  @FindBy(xpath="//button[text()='Submit']") 
	  private WebElement submit;
	  
	  
	  @FindBy(xpath="//a[(@href='/login')]")
	  private WebElement login;
	  
	  
	  @FindBy(id="user") 
	  private WebElement emailid;
	  
	  @FindBy (id="pwd") 
	  private WebElement password1;
	  
	  @FindBy (id="logbut") 
	  private WebElement login1;
	  
	  @FindBy(xpath="//a[(@href='/usernewpost')]")
	  private WebElement newpost;
	  
	 @FindBy(xpath="//input[(@id='exampleInputEmail1')]")
	 private WebElement title;
	 
	 @FindBy(xpath="//input[(@name='P_image')]")
	 private WebElement image1;
	 
	 @FindBy(xpath="//select[(@name='p_cat')]")
	 private WebElement category;
	 
	 @FindBy(xpath="//option[(@value='2: NEW TEST\')]")
	 private WebElement computer;
	 
	 @FindBy(xpath="//textarea[(@name='p_post')]")
	 private WebElement post;
	 
	 @FindBy(xpath="//button[(@type='submit')]")
	 private WebElement sendfrapp;
	 
	 @FindBy(xpath="//a[(@href='/mypost')]")
	 private WebElement mypost;
	 
	 @FindBy(xpath="//a[(text()='logout')]")
	 private WebElement logout;
	 
	public Userpage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	
	  public void clickDropdown() 
	  { 
		  image.click(); 
		   }
	  
	  public void clickSignup() 
	  { 
		  signup.click(); 
		  }
	  
	  public void setName(String strName) throws IOException 
	  { 
		  name.sendKeys(strName);
			
	  }
	  
	 

	public void clickAccount() 
	  { 
		  accounttype.click(); 
		  }
	  
	  public void setEmail(String strEmail) 
	  { 
		  email.sendKeys(strEmail); 
		  }
	  
	  public void setPassword(String strPassword) 
	  { 
		  password.sendKeys(strPassword);
	  }
	  
	  public void clickSubmit() 
	  { 
		  submit.click();
		  signup.click(); 
		  driver.switchTo().alert().accept();
	   }
	  
	  public void clickLogin() 
	  { 
		  login.click();
		 
		  }
	  
	  public void setEmail1(String strEmailid) 
	  { 
		  emailid.sendKeys(strEmailid); 
		  }
	  
	  public void setPswd(String strPswd) 
	  { 
		  password1.sendKeys(strPswd); 
		  }
	  
	  public void clickLogin1() 
	  { 
		  login1.click();
	  
	  }
	  
	  public void clickNewpost()
	  {
		  newpost.click();
	  }
	  
	  public void setTitle(String strTitle)
	  {
		  title.sendKeys(strTitle);
	  }
	  public void setImage1(String strImage1)
	  {
		  image1.sendKeys(strImage1);
	  }
	 
	 public void clickCatg()
	 {
		
		 category.click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scroll(0,350)");
	 }
	 public void clickComps()
	 {
		 computer.click();
	 }
	 public void setPost(String strPost)
	 {
		 post.sendKeys(strPost);
	 }
	 public void clickSend()
	 {
		 sendfrapp.click();
	 }
	 public void clickMypost()
	 {
		 mypost.click();
		 driver.switchTo().alert().accept();
	 }
	 public void clickLogout()
	 {
		 logout.click();
	 }
}
