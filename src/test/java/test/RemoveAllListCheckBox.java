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

public class RemoveAllListCheckBox 
{
WebDriver driver;
	
	@Before
	public void init() throws IOException
	{
		driver =BrowserFactory.init();
	}
	
	
	@Test
	public void removeAllcheckboxes() throws InterruptedException
	{
		CheckBoxPage checkbox = PageFactory.initElements(driver, CheckBoxPage.class);
		checkbox.clickToggleAll();
		Thread.sleep(30000);
		Assert.assertEquals(0, checkbox.removeAllcheckbox());
	}
	
	@After
	public void tearDown()
	{
		BrowserFactory.tearDown();
	}

}
