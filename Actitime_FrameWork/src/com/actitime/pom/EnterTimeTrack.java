package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack 
{
	@FindBy(id="logoutLink")
	private WebElement LGOUTLINK;
	
	@FindBy(id="container_tasks")
	private WebElement TaskTab;
	
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logoutClick()
	{
		LGOUTLINK.click();
		
	}
	
	public void taskTabClick()
	{
		TaskTab.click();
	}
}
