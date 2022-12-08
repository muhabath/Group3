package com.ictak.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ictak.pages.Userpage;
import com.ictak.utilities.ExcelUtility;

public class TestClass extends TestBase{
	Userpage ObjUser;
	
	@Test(priority=1)
	public void verifyValidUser() throws IOException, InterruptedException
	{
		ObjUser=new Userpage(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
	}
	
	@Test(priority=2)
	public void verifySignup1() throws IOException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
		String name=ExcelUtility.getCellData(1, 0); 
		String email=ExcelUtility.getCellData(1, 1); 
		String password=ExcelUtility.getCellData(1, 2); 
		ObjUser.setName(name);
		ObjUser.clickAccount(); 
		ObjUser.setEmail(email);
		ObjUser.setPassword(password); 
	    ObjUser.clickSubmit();
		
	}
	

	@Test(priority=3)
	public void verifySignup2() throws IOException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
		String name=ExcelUtility.getCellData(2, 0); 
		String email=ExcelUtility.getCellData(2, 1); 
		String password=ExcelUtility.getCellData(2, 2); 
		ObjUser.setName(name);
		ObjUser.clickAccount(); 
		ObjUser.setEmail(email);
		ObjUser.setPassword(password); 
	    ObjUser.clickSubmit();
		
	}
	

	@Test(priority=4)
	public void verifySignup3() throws IOException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
		driver.navigate().refresh();
		String name=ExcelUtility.getCellData(3, 0); 
		String email=ExcelUtility.getCellData(3, 1); 
		String password=ExcelUtility.getCellData(3, 2); 
		ObjUser.setName(name);
		ObjUser.clickAccount(); 
		ObjUser.setEmail(email);
		ObjUser.setPassword(password); 
	    ObjUser.clickSubmit();
		
	}
	

	@Test(priority=5)
	public void verifySignup4() throws IOException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
		driver.navigate().refresh();
		String name=ExcelUtility.getCellData(4, 0); 
		String email=ExcelUtility.getCellData(4, 1); 
		String password=ExcelUtility.getCellData(4, 2); 
		ObjUser.setName(name);
		ObjUser.clickAccount(); 
		ObjUser.setEmail(email);
		ObjUser.setPassword(password);
	    ObjUser.clickSubmit();
		
	}
	
	@Test(priority=6)
	public void verifySignup5() throws IOException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickSignup();
		driver.navigate().refresh();
		String name=ExcelUtility.getCellData(5, 0); 
		String email=ExcelUtility.getCellData(5, 1); 
		String password=ExcelUtility.getCellData(5, 2); 
		ObjUser.setName(name);
		ObjUser.clickAccount(); 
		ObjUser.setEmail(email);
		ObjUser.setPassword(password);
	    ObjUser.clickSubmit();
		
	}
	
	
	
	
	
	@Test(priority=7)
	public void verifyLogin1() throws IOException, InterruptedException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickLogin();
		Thread.sleep(1000);
	String emailid=ExcelUtility.getCellData1(3, 0);
	String password1=ExcelUtility.getCellData1(3, 1);
	ObjUser.setEmail1(emailid);
	Thread.sleep(1000);
	ObjUser.setPswd(password1);
	Thread.sleep(1000);
	ObjUser.clickLogin1();
	Thread.sleep(1000);
	ObjUser.clickNewpost();
	}
	
	@Test(priority=8)
	public void verifyLogin2() throws IOException, InterruptedException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickLogin();
		Thread.sleep(1000);
		driver.navigate().refresh();
	String emailid=ExcelUtility.getCellData1(1, 0);
	String password1=ExcelUtility.getCellData1(1, 1);
	ObjUser.setEmail1(emailid);
	Thread.sleep(1000);
	ObjUser.setPswd(password1);
	Thread.sleep(1000);
	ObjUser.clickLogin1();
	Thread.sleep(1000);
	ObjUser.clickNewpost();
	
	}
		
	@Test(priority=9)
	public void verifyLogin3() throws IOException, InterruptedException
	{
		ObjUser=new Userpage(driver);
		ObjUser.clickDropdown();
		ObjUser.clickLogin();
		Thread.sleep(1000);
		driver.navigate().refresh();
	String emailid=ExcelUtility.getCellData1(4, 0);
	String password1=ExcelUtility.getCellData1(4, 1);
	ObjUser.setEmail1(emailid);
	Thread.sleep(1000);
	ObjUser.setPswd(password1);
	Thread.sleep(1000);
	ObjUser.clickLogin1();
	Thread.sleep(1000);
	ObjUser.clickNewpost();
	String title=ExcelUtility.getCellData2(1, 0);
	String image1=ExcelUtility.getCellData2(1, 1);
	String post=ExcelUtility.getCellData2(1, 2);
	ObjUser.setTitle(title);
	Thread.sleep(1000);
	ObjUser.setImage1(image1);
	Thread.sleep(1000);
	ObjUser.clickCatg();
	Thread.sleep(1000);
	ObjUser.clickComps();
	Thread.sleep(1000);
	ObjUser.setPost(post);
	Thread.sleep(1000);
	ObjUser.clickSend();
	}
	
	@Test(priority=10)
	public void verifyLogin4() throws IOException, InterruptedException
	{
		
	driver.navigate().refresh();
	String title=ExcelUtility.getCellData2(2, 0);
	String image1=ExcelUtility.getCellData2(2, 1);
	String post=ExcelUtility.getCellData2(2, 2);
	ObjUser.setTitle(title);
	Thread.sleep(1000);
	ObjUser.setImage1(image1);
	Thread.sleep(1000);
	ObjUser.clickCatg();
	Thread.sleep(1000);
	ObjUser.clickComps();
	Thread.sleep(1000);
	ObjUser.setPost(post);
	Thread.sleep(1000);
	ObjUser.clickSend();
	ObjUser.clickMypost();
	ObjUser.clickLogout();
	
	}
}

		


