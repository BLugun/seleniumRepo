package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
	@FindBy(xpath="//div[text()='Tasks']")
	private  WebElement seltask;
	
	@FindBy(id="logoutLink")
	private WebElement setlgbtn;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setTimetab()
	{
		seltask.click();
	}
	
	public void setlogout()
	{
		setlgbtn.click();
	}
	
}
