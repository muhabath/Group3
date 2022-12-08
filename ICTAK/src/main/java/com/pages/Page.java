package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	 WebDriver driver;
	
	  @FindBy(xpath="/html/body/app-root/app-login")
	  private WebElement okbtn;
	  public void ok()
	  {
		  okbtn.click();
	  }
	  @FindBy(xpath="/html/body/app-root")
	  private WebElement ooookkk;
	  public void postok()
	  {
		  ooookkk.click();
	  }
	  @FindBy(xpath="/html/body/app-root/app-signup/form/p/a")
	private  WebElement loginlink;
	  public void loginlinkk() {
		  loginlink.click();
	  }
	   
	    @FindBy(id="user")
	    private WebElement username;
	    @FindBy(id="pwd")
	    private WebElement password;    
	    @FindBy(id="logbut")
	    private WebElement login;
	    
	    public Page(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	    
	public void setUserName(String strUserName){
	    	username.sendKeys(strUserName);     
	    }

	    public void setPassword(String strPassword){
	        password.sendKeys(strPassword);
	    }
	    
	    public void clickLogin()
	    {
	    	login.click();
	    }
	    
	    @FindBy(xpath="/html/body/app-root/app-signup/form/input[1]")
	    private WebElement name;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/select")
	    private WebElement tclk;
	    @FindBy(xpath="//*[@id=\"sign\"]/select[1]/option[2]")
	    private WebElement trainer;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/select[2]")
	    private WebElement qualiclk;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/select[2]/option[2]")
	    private WebElement quali;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/input[2]")
	    private WebElement email;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/input[3]")
	    private WebElement pass;
	    @FindBy(xpath="/html/body/app-root/app-signup/form/button")
	    private WebElement submit;
	    public void fillname(String names)
	    {
	    	name.sendKeys(names);
	    }
	    public void trainerclk()
	    {
	    	tclk.click();
	    }
	    public void filltrainer()
	    {
	    	trainer.click();
	    }
	    public void qualiclk()
	    {
	    	qualiclk.click();
	    }
	    public void fillquali()
	    {
	    	quali.click();
	    }
	    
	    public void fillemail(String emailid)
	    {
	    	email.sendKeys(emailid);
	    }
	    public void fillpass(String passwrd)
	    {
	    	pass.sendKeys(passwrd);
	    }
	    public void submit() {
	    	
	    	submit.click();
	    }
	    @FindBy(xpath="/html/body/app-root/app-mypost/app-header/nav/div/div/ul/li[5]/a")
	    private WebElement post;
	    public void postb()
	    {
	    	post.click();
	    }
	    @FindBy(xpath="//*[@id=\"exampleInputEmail1\"]")
	    private WebElement title;
	    public void ptitle(String potitle)
	    {
	    	title.sendKeys(potitle);
	    }
	    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/div[3]/input")
	    private WebElement url;
	    public void purl(String pourl)
	    {
	    	url.sendKeys(pourl);
	    }
	    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/div[4]/select")
	    private WebElement cat;
	    public void catclk()
	    {
	    	cat.click();
	    }
	    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/div[4]/select/option[1]")
	    private WebElement category;
	    public void categoryslct()
	    {
	    	category.click();
	    }
	    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/div[5]/textarea")
	    private WebElement comment;
	    public void pcomment(String pocmnt)
	    {
	    	comment.sendKeys(pocmnt);
	    }
	    @FindBy(xpath="/html/body/app-root/app-trainerpost/form/button")
	    private WebElement psubmit;
	    public void posubmit()
	    {
	    	psubmit.click();
	    } 
	    @FindBy(xpath="/html/body/app-root/app-mypost/app-header/nav/div/div/ul/li[3]/a")
	    private WebElement vpost;
	    public void viewpost()
	    {
	    	//driver.switchTo();
	    	Actions actions=new Actions(driver);
	 	    actions.moveToElement(vpost);
	 	    actions.perform();
	    	//vpost.click();   
	 	    }
	    @FindBy(xpath="/html/body/app-root/app-mypost/app-header/nav/div/div/ul/li[10]/a")
	    private WebElement logout;
	    public void tlogout()
	    {
	    	
	    	logout.click();
	    }
}
