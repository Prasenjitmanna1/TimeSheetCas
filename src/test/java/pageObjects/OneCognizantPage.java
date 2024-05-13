package pageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;

public class OneCognizantPage extends AbstractComponent{

	
		public OneCognizantPage(WebDriver driver)
		{
			super(driver);
			
		}
		
		@FindBy(xpath="//*[@id='oneC_searchAutoComplete']")
		WebElement searchBar;
		
		@FindBy(xpath="//*[@class='searchTopBar']")
		WebElement searchEdgeIcon;
		
		@FindBy(xpath="//*[@id='oneCSearchTop']")
		WebElement searchBarEdge;
		
		@FindBy(xpath="//*[@id='newSearchQALST']//div[contains(text(),'Submit Timesheet')]")
		WebElement timeSheetIcon;
		
		By tsIcon =By.xpath("//*[@id='newSearchQALST']//div[contains(text(),'Submit Timesheet')]");
	
		// if chrome, input giving method
		public void inputSearchBarChrome(String input)
		{
			searchBar.sendKeys(input);
			
			timeSheetIcon.click();
		}
		
		// if edge, input giving method
		public void inputSearchBarEdge(String input) throws InterruptedException
		{
		
			searchEdgeIcon.click();
			searchBarEdge.sendKeys(input);

			waitForElementToAppear(tsIcon);
			timeSheetIcon.click();
		}
		
		// window handling to timesheet function by driver switching
		public void windowHandelsTimesheet(WebDriver driver) throws InterruptedException
		{
			Set <String> Window = driver.getWindowHandles();
		    List <String> Window1 = new ArrayList<String>(Window);
		  
			driver.switchTo().window(Window1.get(2));
			
		}
}
