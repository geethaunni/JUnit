package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage {
WebDriver driver;
	
	public CheckBoxPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	//WEBELEMENTS
	@FindBy(how = How.NAME, using = "allbox")WebElement TOGGLE_CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@id='todos-content']//input[@type='checkbox']")List<WebElement> LIST_OF_ELEMENT;
	@FindBy(how = How.NAME, using = "submit")WebElement REMOVE_ELEMENT;
	@FindBy(how = How.XPATH , using = "//div[@id='todos-content']//input[@type='checkbox']")List<WebElement> LIST_OF_WEBELEMENT_LATER;
	@FindBy(how = How.XPATH , using = "//div[@id='todos-content']//input[@type='checkbox']")List<WebElement> REMOVE_ALL_ELEMENT;
	
	
	//CORRESPONDING METHODS
	
	public void clickToggleAll()
	{
		TOGGLE_CHECKBOX_ELEMENT.click();
	}
	
	public boolean validateAllCheckBoxes()
	{
		int totalcheckbox = LIST_OF_ELEMENT.size();
		int checkcount = 0;
		
		for(int i=0; i<totalcheckbox;  i++)
		{
			if(LIST_OF_ELEMENT.get(i).isSelected())
			{
				checkcount++;
			}
		}
		System.out.println(checkcount);
		if(totalcheckbox==checkcount)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public boolean removeOneitem()
	{
		
		int totalCheckBox = LIST_OF_ELEMENT.size();
		LIST_OF_ELEMENT.get(0).click();
		REMOVE_ELEMENT.click();
		
		int latercheckbox = LIST_OF_WEBELEMENT_LATER.size();
		
		if(totalCheckBox > latercheckbox)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int removeAllcheckbox()
	{
	
		REMOVE_ELEMENT.click();
		int finalCount = REMOVE_ALL_ELEMENT.size();
		return finalCount;
	}
	
	

}
