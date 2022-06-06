package com.FacebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BaseTest {
	
	public void setFirstNameOfSignUpPage() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(showFName());
	}
	
	public void setLastNameOfSignUpPage() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(showLName());
		
	}
	
	
	public void passWord() {
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(setPassword());
		
	}
	
	
	public void getmobileNumber()
	{

	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getRandomMobile(8));

	}
	
	
	public void setDay(String strDay) {
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select setDay = new Select(Day);
		setDay.selectByVisibleText(strDay);

	}
	
	public void setMonth(String strMonth) {
		WebElement MonthSelect = driver.findElement(By.xpath("//select[@id='month']"));
		Select sltMonth = new Select(MonthSelect);
		sltMonth.selectByVisibleText(strMonth);
		
	}
	
	public void setYear(String strYear) {
		WebElement YearSelect = driver.findElement(By.xpath("//select[@id='year']"));
		Select sltYear = new Select(YearSelect);
		sltYear.selectByVisibleText(strYear);

	}
	
	
	public void clickTermsLink()
	{
	WebElement Terms = driver.findElement(By.xpath("//a[@id='terms-link']"));
	Terms.click();
	}
	
	

	public void cookiePolicyLink()
	{
	WebElement cookiepolicy = driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
	cookiepolicy.click();
	}
	
	
	
	public void dataPolicyLink()
	{
	WebElement datapolicy = driver.findElement(By.xpath("//a[@id='privacy-link']"));
	datapolicy.click();
	driver.getTitle();
	
	}
}