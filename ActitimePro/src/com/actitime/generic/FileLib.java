package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/Commdata.property");
		Properties p=new Properties();
		p.load(fis);
	    String data = p.getProperty(key);
	    return data;
		
	}
	
	public String getExcel(String custname, int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(custname).getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
	public void setExceldata(String custname, int row,int col, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	     wb.getSheet(custname).getRow(row).getCell(col).setCellValue(data);
	     
	     FileOutputStream fos=new FileOutputStream("./data/testScript1.xlsx");
	     wb.write(fos);
	     wb.close();
		
		
	}
}
