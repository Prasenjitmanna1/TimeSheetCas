package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;
import utilities.ExcelUtilities;

public class BeCognizantPage extends AbstractComponent{
	
WebDriver driver;
	
	public BeCognizantPage(WebDriver driver) 
	{
		super(driver);
	}
	
	

		@FindBy(xpath="//*[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']")
		WebElement userprofile;
		
		@FindBy(id="mectrl_currentAccount_primary")
		WebElement name;
		
		@FindBy(id="mectrl_currentAccount_secondary")
		WebElement emailId;
		
		@FindBy(xpath="//*[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']")
		WebElement profileXpathClose;
		
		@FindBy(id="mectrl_headerPicture")
		WebElement profileIdClose;
		
		@FindBy(xpath="//div[@title='OneCognizant']")
		WebElement oneCognizant;
		
		By names = By.id("mectrl_currentAccount_primary");
		By OneCognizant = By.xpath("//div[@title='OneCognizant']");

		// clicking on profile function
		public void clickOnProfile()
		{
			userprofile.click();
			
		}
		
		// fetching profile data function
		public void getProfileData() throws IOException
		{
			
			waitForElementToAppear(names);
			
			String userName = name.getText();
			String userEmail = emailId.getText();
			System.out.println("Personal Information");
			System.out.println("Name     : "+userName);
			System.out.println("Mail Id  : "+userEmail);
			System.out.println("");
			ExcelUtilities.writeExcel("Profile Info", 0, 0, userName);
			ExcelUtilities.writeExcel("Profile Info", 0, 1, userEmail);
			
		}
		
		// closing profile function
		public void closeProfile()
		{
			
			try
			{
				profileXpathClose.click();
			}
			catch(Exception e)
			{
				profileIdClose.click();
			}
			
		}
		
		// function for redirecting or opening the OneCognizant 
		public void openOneCognizantPage(WebDriver driver) throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement flag=driver.findElement(OneCognizant);
			js.executeScript("arguments[0].scrollIntoView();",flag);

			flag.click();
		}
		
		// window handling to OneCognizant function by driver switching
		public void windowHandlesOneCog(WebDriver driver) throws InterruptedException
		{
			
			Thread.sleep(10000);
			Set <String> Window = driver.getWindowHandles();
		    List <String> Window1 = new ArrayList<String>(Window); 
		 
		    driver.switchTo().window(Window1.get(1));
		    
		}
	

}
