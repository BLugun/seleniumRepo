package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TasksListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="//input[contains(@class,'inputNameField')]")
	private WebElement custname;
	
	@FindBy(xpath="//div[@class='inputContainer']/textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -']")
	private WebElement selecust;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow 'and text()='Our company']")
	private WebElement custpro;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement creatbtn;
	
	public TasksListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}
	
	public WebElement getSelecust() {
		return selecust;
	}


	public WebElement getCustpro() {
		return custpro;
	}

	public WebElement getCreatbtn() {
		return creatbtn;
	}
	

	

}
