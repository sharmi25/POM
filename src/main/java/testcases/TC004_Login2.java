package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_Login2 extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String CompanyName, String FirstName, String LastName) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickCreateLead()
		.clickFindLeads()
		.clickPhone()
		.clickPhoneNumber()
		.clickFindLead()
		.clickDisplayedLeadId()
		.clickDelete()
		.clickFindLeads()
		.clickNameandID()
		.enterFName(FirstName)
		.clickFindLead()
		.verifyDisplayText();
		
		
		
		

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}

	
	
	
	
	
	
}
