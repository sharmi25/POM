package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not My Home | opentaps CRM Page", "FAIL");
	}	
	
	public MyLeadsPage clickLeads() throws InterruptedException
	{
		clickByLink(prop.getProperty("CRMSFA.Leads.Link"));
		Thread.sleep(5000);
		return new MyLeadsPage();
	}

	

    
    

    
    















}
