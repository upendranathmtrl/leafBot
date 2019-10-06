package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLead extends SeleniumBase{

	public CreateLead clickCreateLead() {
		click(locateElement("xpath","//a[text()='Create Lead']"));
		return this;
	}
	
	public CreateLead companyName(String companyName) {
		clearAndType(locateElement("id", "createLeadForm_companyName"), companyName);
		return this;
	}
	
	public CreateLead firstName(String firstName) {
		clearAndType(locateElement("id", "createLeadForm_firstName"), firstName);
		return this;
	}
	
	public CreateLead lastName(String lastName) {
		clearAndType(locateElement("id", "createLeadForm_lastName"),lastName);
		return this;
	}
	
	public CreateLead clickCreateLeadButton() {
		click(locateElement("xpath","//input[@value='Create Lead']"));
		return this;
	}

	
}
