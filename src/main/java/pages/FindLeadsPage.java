package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{

	public FindLeadsPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads | opentaps CRM", "FAIL");
	}	

	public FindLeadsPage clickPhone() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.Phone.xpath"));
		Thread.sleep(5000);
		return this;
	}

	public FindLeadsPage clickPhoneNumber() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.PhoneNumber.xpath"));
		Thread.sleep(5000);
		return this;
	}

	public FindLeadsPage clickFindLead() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.FindLeads.xpath"));
		Thread.sleep(5000);
		return this;
	}

	
	public ViewLead clickDisplayedLeadId() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.fNameandLname.xpath"));
		Thread.sleep(5000);
		return new ViewLead();
	}
	
	public FindLeadsPage verifyDisplayText() throws InterruptedException
	{
		verifyText(prop.getProperty("FindLead.verifytext.xpath"));
		Thread.sleep(5000);
		return this;
	}

	public FindLeadsPage clickNameandID() throws InterruptedException
	{
		clickByXpath(prop.getProperty("FindLead.NameandID.xpath"));
		Thread.sleep(5000);
		return this;
	}
	public FindLeadsPage enterFName(String data)
	{
		enterById(prop.getProperty("FindLead.fname.xpath"), data);
		return this;
		}
	
}
