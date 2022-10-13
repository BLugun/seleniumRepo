package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TasksListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		Reporter.log("createCustomer",true);
		EnterTimeTrackPage en=new EnterTimeTrackPage(driver);
		en.setTimetab();
		
		FileLib f=new FileLib();
		String name = f.getExcel("createcustomer", 1, 3);
		String descp = f.getExcel("createcustomer", 1, 4);
		
		TasksListPage t=new TasksListPage(driver);
		t.getAddbtn().click();
		t.getNewcust().click();
		t.getCustname().sendKeys(name);
		t.getCustdesc().sendKeys(descp);
		t.getSelecust().click();
		t.getCustpro().click();
		t.getCreatbtn().click();
		
		
		
	}
}
