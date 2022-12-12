package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.CheckBoxPage;
import util.BrowserFactory;

public class RemoveElement 
{
WebDriver driver;
	
	@Before
	public void init() throws IOException
	{
		driver = BrowserFactory.init();
	}
	
	
	@Test
	public void removeElement() throws InterruptedException
	{
		CheckBoxPage checkbox = PageFactory.initElements(driver, CheckBoxPage.class);
		checkbox.clickToggleAll();
		Thread.sleep(3000);
		Assert.assertEquals(true, checkbox.removeOneitem());
	}
	
	@After
	public void tearDown()
	{
		BrowserFactory.tearDown();
	}
	

}
