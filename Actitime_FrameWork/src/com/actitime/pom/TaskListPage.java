package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage
{
		@FindBy(xpath = "//div[.='Add New']")
		private WebElement AddNewBTN;
		
		@FindBy(xpath="//div[.='+ New Customer']")
		private WebElement NewCustBTN;
		
		@FindBy(xpath="//input[contains(@class,'inputNameField')]")
		private WebElement EnterCustTBX;
		
		@FindBy(xpath="//textarea[contains(@placeholder,'Description')]")
		private WebElement DescriptionTBX;
		
		@FindBy(xpath="//div[@class='emptySelection']")
		private WebElement CustListBX;
	
		@FindBy(xpath="//div[.='Our company' and contains(@class,'itemRow')]")
		private WebElement ProjectName;
		
		@FindBy(xpath="//div[contains(@class,'withPlusIcon') and contains(.,'Customer')]")
		private WebElement CreateCustBTN;
		
		@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
		private WebElement ActualText;
		
		
		public WebElement getAddNewBTN() {
			return AddNewBTN;
		}


		public WebElement getNewCustBTN() {
			return NewCustBTN;
		}


		public WebElement getEnterCustTBX() {
			return EnterCustTBX;
		}


		public WebElement getDescriptionTBX() {
			return DescriptionTBX;
		}


		public WebElement getCustListBX() {
			return CustListBX;
		}


		public WebElement getProjectName() {
			return ProjectName;
		}


		public WebElement getCreateCustBTN() {
			return CreateCustBTN;
		}


		public WebElement getActualText() {
			return ActualText;
		}
		
		public TaskListPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		}
		
		
}
