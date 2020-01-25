package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskListPage;




public class CustomerModule extends BaseClass
{
	EnterTimeTrack e = new EnterTimeTrack(driver);
	TaskListPage t = new TaskListPage(driver);
	
	
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("testCreateCustomer");		
		String CustomerName = f.getExcelData("CreateCustomer",1,0);
		String CustomerDesc = f.getExcelData("CreateCustomer",1,0);	
		Thread.sleep(3000);
		e.taskTabClick();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBTN().click();
		t.getNewCustBTN().click();
		Thread.sleep(2000);
		t.getEnterCustTBX().sendKeys(CustomerName);
		t.getDescriptionTBX().sendKeys(CustomerDesc);
		t.getCustListBX().click();
		t.getProjectName().click();
		String Atext= t.getActualText().getText();
		Assert.assertEquals(CustomerName, Atext);
	}
}
