package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead | opentaps CRM Page", "FAIL");
	}	
public CreateLeadPage enterCompanyName(String data)
{
	enterById(prop.getProperty("CreateLead.CompanyName.Id"), data);
	return this;
	}

public CreateLeadPage enterFirstName(String data)
{
	enterById(prop.getProperty("CreateLead.FirstName.Id"), data);
	return this;
	}

public CreateLeadPage enterLastName(String data)
{
	enterById(prop.getProperty("CreateLead.LastName.Id"), data);
	return this;
	}


public CreateLeadPage enterPhoneNumber(String data)
{
	enterById(prop.getProperty("CreateLead.Phonenumber.Id"), data);
	return this;
	}

public ViewLead clickCreateLead() throws InterruptedException
{
	clickByXpath(prop.getProperty("CreateLead.Submit.Name")); 
	Thread.sleep(5000);
	return new ViewLead();
}














}
