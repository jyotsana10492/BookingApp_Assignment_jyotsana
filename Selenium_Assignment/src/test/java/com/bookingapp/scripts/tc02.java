package com.bookingapp.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tc02 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\jars\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
			driver.navigate().to("https://account.booking.com/sign-in"); 
			driver.navigate().to("https://account.booking.com/sign-in"); 
			 Actions mouseHover = new Actions(driver); 
			 mouseHover. moveToElement(driver. findElement(By.xpath("//h1[@class='bui_font_display_two bui_font_heading--bold bui-spacer--medium nw-step-header']"))).perform();
			  driver.navigate().to("https://account.booking.com/sign-in"); 
			 Actions  mouseHover2= new Actions(driver); 
			 mouseHover. moveToElement(driver. findElement(By.xpath("//h1[@class='bui_font_display_two bui_font_heading--bold bui-spacer--medium nw-step-header']"))).click();
	
			
			
			
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chinnappan2008@gmail.com");
			 driver.findElement(By.xpath("//span[@class='bui-button__text']")).click();
			 
			 Thread.sleep(4000);
			 
					 
			driver.findElement(By.id("//input[@id='password']")).sendKeys("chin@123");
			
			
			
			driver.findElement(By.xpath("//label[contains(text(),'Free WiFi')]")).click();
			 driver.findElement(By.xpath("//label[contains(text(),'Breakfast included')]")).click();
			 driver.findElement(By.xpath("//label[contains(text(),'Fitness center')]")).click();
			 
			 
			 
			 driver.findElement(By.name("//input[@name='destination']")).sendKeys("chandigarh");
			  
		
	}

}
