package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");      //openURL
		
		driver.manage().window().maximize();    //MaximizeWebsite
		
		//ID Locator
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-Shirts");          //ReturnTheElement
		
		driver.findElement(By.id("nav-search-submit-button")).click(); 
		
		//LinkText
		driver.findElement(By.linkText("Gildan Women's Softstyle Cotton T-Shirt, Style G64000l, 2-Pack")).click();
		
		
		//PartialLinkText
		driver.findElement(By.partialLinkText("Gildan")).click();
		
		
	
	}

}
