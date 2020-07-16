package com.bookingapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="//label[.='Free WiFi']") private WebElement freewifibtn ;
	@FindBy(xpath="//label[text()='Breakfast included']") private WebElement breakfastbtn ;
	@FindBy(xpath="//label[.='Fitness center']") private WebElement fitnesscenterbtn ;
	
	@FindBy(xpath="//input[name='destination']") private WebElement destsearchbox;
	
	
	
	
	
	
	public WebElement getfreewifibtn() {
		return freewifibtn;
	}
	public WebElement getbreakfastbtn() {
		return breakfastbtn;
	}
	public WebElement getfitnesscenterbtn () {
		return  fitnesscenterbtn ;
	}
	public WebElement getdestsearchbox() {
		return destsearchbox;
	}
	

	public void clickfreewifibtnbtn()
	{
		freewifibtn.click();
	}
	
	
	
	public void clickOntbreakfastbtn(){
	
		breakfastbtn.click();
	}
	
		
	public void clickOndestsearchboxbtn(){
		
		destsearchbox.click();
	}
	
	
	
	public void clickonfitnessbtn()
	{
		clickonfitnessbtn();
	}
	
	 
	public void sendKeysOndestsearchboxbtn() {
		
		
		sendKeysOndestsearchboxbtn();
	}
	
	
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
			
			
	
	


	
	
	
	
	
	
	


	
	
	
	
	
}
