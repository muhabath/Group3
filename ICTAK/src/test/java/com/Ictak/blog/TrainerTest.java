package com.Ictak.blog;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.constants.Constant;
import com.pages.Page;
import com.utilities.Excelutility;
import com.utilities.Signuputility;

public class TrainerTest extends Trainer{
	Page obj;
	@Test(priority=1)
	public void signupblnk() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		obj.submit();
	}
	@Test(priority=2)
	public void signup1empty() throws IOException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String email = Signuputility.getCellData(3, 3);
		String pass = Signuputility.getCellData(3, 4);
		obj.trainerclk();
		obj.filltrainer();
		obj.qualiclk();
		obj.fillquali();
		obj.fillemail(email);
		obj.fillpass(pass);
		obj.submit();
	}
	
	@Test(priority=3)
	public void signuppwd() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String name = Signuputility.getCellData(3, 0);
		String email = Signuputility.getCellData(3, 3);
		String pass = Signuputility.getCellData(6, 4);
		obj.fillname(name);
		obj.trainerclk();
		obj.filltrainer();
		obj.qualiclk();
		obj.fillquali();
		obj.fillemail(email);
		obj.fillpass(pass);
		obj.submit();
	}
	@Test(priority=4)
	public void signupinvalidemail() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		obj=new Page(driver);
		driver.navigate().refresh();
		String name = Signuputility.getCellData(7, 0);
		String email = Signuputility.getCellData(7, 3);
		String pass = Signuputility.getCellData(7, 4);
		obj.fillname(name);
		obj.trainerclk();
		obj.filltrainer();
		obj.qualiclk();
		obj.fillquali();
		obj.fillemail(email);
		obj.fillpass(pass);
		obj.submit();
	}
	@Test(priority=5)
	public void signup() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		obj=new Page(driver);
		driver.navigate().refresh();
		String name = Signuputility.getCellData(2, 0);
		String email = Signuputility.getCellData(2, 3);
		String pass = Signuputility.getCellData(2, 4);
		obj.fillname(name);
		obj.trainerclk();
		obj.filltrainer();
		obj.qualiclk();
		obj.fillquali();
		obj.fillemail(email);
		obj.fillpass(pass);
		obj.submit();
		obj.ok();
	}
	@Test(priority=6)
	public void clk() throws IOException
	{
		obj=new Page(driver);
		
		obj.loginlinkk();	
	}
	@Test(priority=7)
	public void invalidpwd() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(2, 0);
		String password = Excelutility.getCellData(2, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();
	}
	@Test(priority=8)
	public void validpwd() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(3, 0);
		String password = Excelutility.getCellData(3, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();
	}
	@Test(priority=9)
	public void invalidid() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(4, 0);
		String password = Excelutility.getCellData(4, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();
}
	@Test(priority=10)
	public void blankpwd() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(5, 0);
		String password = Excelutility.getCellData(5, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();
}
	@Test(priority=11)
	public void blankid() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(6, 0);
		String password = Excelutility.getCellData(6, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();	
}
	@Test(priority=12)
	public void blank() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(7, 0);
		String password = Excelutility.getCellData(7, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();		
}
	@Test(priority=13)
	public void verifylogin() throws IOException
	{
		obj=new Page(driver);
		driver.navigate().refresh();
		String username = Excelutility.getCellData(1, 0);
		String password = Excelutility.getCellData(1, 1);
		obj.setUserName(username);
		obj.setPassword(password);
		obj.clickLogin();
	}	
	@Test(priority=14)
	public void newpost()
	{
		obj.postb();
	}
	@Test(priority=15)
	public void tpostemp() throws IOException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String potitle = Signuputility.getCellData(10, 0);
		String pourl = Signuputility.getCellData(10, 1);
		obj.ptitle(potitle);
		obj.purl(pourl);
		//obj.catclk();
		obj.categoryslct();
		obj.posubmit();	
	}
	@Test(priority=16)
	public void tposturl() throws IOException
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String potitle = Signuputility.getCellData(11, 0);
		String pourl = Signuputility.getCellData(11, 1);
		String pocmnt = Signuputility.getCellData(11, 2);
		obj.ptitle(potitle);
		obj.purl(pourl);
		
		obj.categoryslct();
		obj.pcomment(pocmnt);
		obj.posubmit();	
		//driver.switchTo().alert().accept();
	}@Test(priority=17)
	public void tnewpost() throws IOException
	{
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		driver.navigate().refresh();
		String potitle = Signuputility.getCellData(10, 0);
		String pourl = Signuputility.getCellData(10, 1);
		String pocmnt = Signuputility.getCellData(10, 2);
		obj.ptitle(potitle);
		obj.purl(pourl);
		obj.categoryslct();
		obj.pcomment(pocmnt);
		obj.posubmit();
		//driver.switchTo().alert().accept();
		String expectedTitle =Constant.POSTTITLE;
		  String actualTitle =driver.getTitle();
		   Assert.assertEquals(expectedTitle,actualTitle);	
	}
	@Test(priority=18)
	public void viewpostt()
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		obj.viewpost();
	}

	@Test(priority=19)
	public void tlogout()
	
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		obj=new Page(driver);
		obj.tlogout();
	}
	@Test(priority=20)
	public void exit()
	
	{
		driver.quit();
	}

}
