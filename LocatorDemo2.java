package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");      //openURL
		
		driver.manage().window().maximize();    //MaximizeWebsite
		
		//SizeOfDimensions 
		Dimension sliders = driver.findElement(By.className("a-carousel-card")).getSize();
		System.out.println(sliders);
		

	}

}
