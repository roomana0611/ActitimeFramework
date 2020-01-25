package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseClass
{
	public void waitforElementVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void pageLoadTimeout()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void select(WebElement element,int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void select(WebElement element,String text)
	{
		Select s = new Select(element);
		s.deselectByVisibleText(text);

	}


}



