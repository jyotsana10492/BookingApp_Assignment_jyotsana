package com.bookingapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
	@FindBy(id="username") private WebElement usernametxt;
	@FindBy(id="password") private WebElement passwordtxt;
	@FindBy(className  ="bui-button__text") private WebElement nextbtn;
	@FindBy(className ="bui-button__text") private WebElement signinbtn;
	
	
	
	public WebElement getsignbtnAction() {
		return usernametxt;
	}
	
	public WebElement getUsernametxt() {
		return usernametxt;
	}
	public WebElement getPasswordtxt() {
		return passwordtxt;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}
	public WebElement getnextbtn() {
		return nextbtn;
	}
	
//	public void signinbtn()
//	{
//		signinbtn.moveToElement(WebElement element,WebDriver driver);
//		signinbtn.build();
//		siginbtn.perform();
//	}
//	public void signinbtn1()
//	{
//		signinbtn.moveToElement(WebElement element,WebDriver driver);
//		signinbtn.click();
//	}
	
	
	
	
	public void loginToApp(String username,String password) {
		usernametxt.sendKeys("chinnappan2008@gmail.com");
		passwordtxt.sendKeys("chin@123");
		signinbtn.click();
		nextbtn.click();
		
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
