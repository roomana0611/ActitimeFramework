package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement UNTBX;
	
	@FindBy(name="pwd")
	private WebElement PWTBX;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement LGBTN;
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	public WebElement getUNTBX() {
		return UNTBX;
	}


	public WebElement getPWTBX() {
		return PWTBX;
	}


	public WebElement getLGBTN() {
		return LGBTN;
	}

	public void setUser(String UN, String PW)
	{
		UNTBX.sendKeys(UN);
		PWTBX.sendKeys(PW);
		LGBTN.click();
		
	}
}
