package testComponents;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BeCognizantPage;
import pageObjects.OneCognizantPage;
import pageObjects.TimeSheetPage;

import testBase.BaseClass;

public class testCases  extends BaseClass{

	@Test(priority=1)
	public void userVerification() throws InterruptedException, IOException 
	{

		BeCognizantPage beCog = new BeCognizantPage(driver);
		beCog.clickOnProfile();

		System.out.println("Account verified");

		beCog.getProfileData();
		captureScreenShot("img_userprofile");
		beCog.closeProfile();

		beCog.openOneCognizantPage(driver);

		beCog.windowHandlesOneCog(driver);

		captureScreenShot("img_onecognizant");
	}
	
	
	@Test(priority=2)
	@Parameters({"search","browser"})
	public void oneCognizantFunctions(String search, String br) throws InterruptedException
	{

		OneCognizantPage oneCog = new OneCognizantPage(driver); 

		if(br.equalsIgnoreCase("edge")) {

			oneCog.inputSearchBarEdge(search);

			captureScreenShot("img_timesheetIcon");
		}
		else {

			oneCog.inputSearchBarChrome(search);
			

			captureScreenShot("img_timesheetIcon");
		}
		
		Thread.sleep(10000);
		oneCog.windowHandelsTimesheet(driver);

	}
	
	
	// Timesheet validation by creating an object and implementing all its methods
	@Test(priority=3)
	public void timeSheetNavigation() throws Exception
	{

		TimeSheetPage ts = new TimeSheetPage(driver);
		
		ts.headerValidation();
		captureScreenShot("img_timesheet");

		
		Thread.sleep(1000);
		ts.threeWeeksTimesheetInfo();

		captureScreenShot("img_firstThreeWeeks");
		
		Thread.sleep(1000);
		ts.currentWeekInfo();

		captureScreenShot("img_currentWeek");
		ts.dateValidationTimesheet();
		
		Thread.sleep(5000);
		ts.tsStatusApprovedInfo();

		captureScreenShot("img_StatusApproved");
		
		Thread.sleep(5000);
		ts.tsStatusOverdueInfo();

		captureScreenShot("img_StatusOverdue");
		
		Thread.sleep(5000);
		ts.tsStatusPartiallyApprovedInfo();

		captureScreenShot("img_StatusPartiallyApproved");
		
//		Thread.sleep(5000);
//		ts.tsStatusPendingInfo();

//		captureScreenShot("img_StatusPending");
	
		Thread.sleep(5000);
		ts.tsStatusSavedInfo();

		captureScreenShot("img_StatusSaved");
		
		Thread.sleep(5000);
		ts.tsStatusSentBackforRevisionInfo();

		captureScreenShot("img_StatusSentBackforRevision");
		
		Thread.sleep(8000);
		ts.tsStatusSubmittedforApprovalInfo();

		captureScreenShot("img_StatusSubmittedforApproval");
		

	}
	
	
}
