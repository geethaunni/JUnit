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

public class AllCheckBoxesChecked {
	
	
WebDriver driver;


@Before
public void init() throws IOException
{
	//CREATES CONNECTION BETWEEN BROWSERFACTORY AND ALLCHECKBOXESCHECKED
	driver = BrowserFactory.init();
}

@Test
public void validateAllcheckBoxesChecked() throws InterruptedException
{
	//CREATING OBJECT FOR THE CHECKBOX
	CheckBoxPage checkbox = PageFactory.initElements(driver, CheckBoxPage.class);
	checkbox.clickToggleAll();
	Thread.sleep(3000);
	
	Assert.assertEquals(true, checkbox.validateAllCheckBoxes());
}


@After
public void closeBrowser()
{
	BrowserFactory.tearDown();
}






}
