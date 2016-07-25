package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLead extends OpentapsWrappers{

	public ViewLead() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead | opentaps CRM Page", "FAIL");
	}	

	public FindLeadsPage clickFindLeads() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.FindLeads.Link"));
		Thread.sleep(5000);
		return new FindLeadsPage();
	}


	public MyLeadsPage clickDelete() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.DeleteLead.Link"));
		Thread.sleep(5000);
		return new MyLeadsPage();
	}
	
	public EditLeadPage clickEdit() throws InterruptedException
	{
		clickByLink(prop.getProperty("ViewLead.EditLead.Link"));
		Thread.sleep(5000);
		return new EditLeadPage();
	}















}
