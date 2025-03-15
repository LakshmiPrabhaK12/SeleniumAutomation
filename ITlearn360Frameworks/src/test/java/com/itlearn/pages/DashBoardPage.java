package com.itlearn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;
	public DashBoardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\'login-list\']/li[1]/a") WebElement dash;
	@FindBy(xpath="//*[@id=\'learn-press-user-profile\']/ul/li[3]") WebElement offerAcademies;
	
	@FindBy(xpath="//*[@id=\'tab-academies\']/div/div/ul/li[1]/form/div/button") WebElement subsribebtn;



	public void dashboardclick() throws InterruptedException
	{
		
		dash.click();
		offerAcademies.click();
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		subsribebtn.click();
		
	}
	
}
