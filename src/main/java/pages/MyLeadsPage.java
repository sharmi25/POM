package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Leads | opentaps CRM", "FAIL");
	}	
	public CreateLeadPage clickCreateLead() throws InterruptedException
	{
		clickByLink(prop.getProperty("MyLeadsPage.CreateLead.Link"));
		Thread.sleep(5000);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		clickByLink(prop.getProperty("MyLeadsPage.FindLeads.Link"));
		Thread.sleep(5000);
		return new FindLeadsPage();
	}
	}
	
	

    
    

    
    
















