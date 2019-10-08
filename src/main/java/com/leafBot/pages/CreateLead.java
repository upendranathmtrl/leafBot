package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLead extends SeleniumBase{

	public CreateLead clickCreateLead() {
		click(locateElement("xpath","//a[text()='Create Lead']"));
		return this;
	}
	
	public CreateLead EnteringDetails(String companyName, String firstName, String lastName) {
		clearAndType(locateElement("id", "createLeadForm_companyName"), companyName);
		clearAndType(locateElement("id", "createLeadForm_firstName"), firstName);
		clearAndType(locateElement("id", "createLeadForm_lastName"),lastName);
		clearAndType(locateElement("id", "createLeadForm_generalProfTitle"), "My Profile");
		
		return this;
	}
	
	
	public EditLead clickCreateLeadButton() {
		click(locateElement("xpath","//input[@value='Create Lead']"));
		return new EditLead();
	}

	
}
