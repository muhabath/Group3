package com.blog.scripts;

import java.io.IOException;

//import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.blog.pages.Approv;
import com.blog.pages.Loginpag;
import com.blog.utilities.Excelutility;


public class TestClas extends TestBas{
	
	Loginpag objlogin;
	Excelutility objread;
    Approv objapp;
	
	@Test(priority=1)
	public void VerifyValidLogin() throws IOException
	{
		objlogin=new Loginpag(driver);
		objlogin.Profile();
		objlogin.Loginto();
		objread=new Excelutility();
		String StrArray[][] = Excelutility.getCellData();
		
		objlogin.setEmailid(StrArray[0][0]);
		objlogin.setPassword(StrArray[0][1]);
		objlogin.clicklogin();
	
		
			
	}
	
	@Test(priority=2)
	public void Verifyaction()
{
	objlogin.Actions1();
		objlogin.Pendingapprovals();
		
	}

	@Test(priority=3)
	public void Verifyapprove()
	{
		objapp.Clickapprove();
	
		//objapp.accept();
	}
	
}
