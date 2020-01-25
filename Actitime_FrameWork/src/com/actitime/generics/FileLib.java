package com.actitime.generics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{

	public String getPropertyData(String path, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String path) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String exceldata = wb.getSheet("CreateCustomer").getRow(0).getCell(0).toString();	
		return exceldata;
		
	}
	public String getExcelData(String path, String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String exceldata = wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum).toString();	
		return exceldata;
	}
	
	public String getExcelData(String SheetName,int RowNum,int CellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String exceldata = wb.getSheet(SheetName).getRow(RowNum).getCell(CellNum).toString();	
		return exceldata;
	}
}
