package com.bookingapp.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.booking.genericlib.BaseClass;
import com.booking.genericlib.FileLib;
import com.booking.genericlib.WebDriverLib;
import com.bookingapp.pages.HomePage;
import com.bookingapp.pages.LoginPage;
import com.google.common.base.Throwables;


public class TC_01_TestScript01 extends BaseClass{
	
	WebDriverLib wc;
	FileLib flib;
	LoginPage lp;
	private WebElement siginbtn;
	
	@Test
	
	
	public void Demo_bookingApp() throws Throwable{
		// move to sign in button and hold
		lp.getSigninbtn();
		WebElement element = siginbtn;
		wc.moveToElement(element, driver);
		
		
		//move to sign in button and click
		lp.getSigninbtn();
		WebElement element1 = siginbtn;
		wc.moveToElement(element, driver);
		
		//for getting username and password
		flib.getPropKeyVal("username", "chinnappan2008@gmail.com");
		lp.getnextbtn();
		flib.getPropKeyVal("username", "chin@123");
		lp.getSigninbtn();
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chinnappan2008@gmail.com");
//	driver.findElement(By.xpath("//span[@class='bui-button__text']")).click();
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("chin@123");
	lp.loginToApp("chinnappan2008@gmail.com", "chin@123");
	HomePage hp= new HomePage(driver);
		//click on freewifibtn in bussiness filter field
	hp.clickfreewifibtnbtn();
		
		//click on breakfastbtn bussiness filter field
	hp.clickOntbreakfastbtn();
	//click on fitness btn bussiness filter field
		hp.clickonfitnessbtn();
	// check in search box (destination) bussiness filter field
		hp.clickOndestsearchboxbtn();
		hp.sendKeysOndestsearchboxbtn();
		hp.getdestsearchbox().sendKeys("chandigarh");
		
	//verification of home page 
		
		String HomePage=driver.getTitle();
		Assert.assertEquals("https://www.booking.com/bbm.html?aid=356980;sid=115afd40562dbd80b768fdb70b529b7c;user_role=undef&#", "homepagetitle");
		
		//verification of login paage
		
		
		String LoginPage=driver.getTitle();
		Assert.assertEquals("https://account.booking.com/sign-in", "homepagetitle");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
	
