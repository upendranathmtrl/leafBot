package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class EditLead extends SeleniumBase {

	public EditLead click_LeadTabAndFindLead_Edit() {
		click(locateElement("xpath", "//a[text()='Leads']"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		clearAndType(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Upendranath");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		click(locateElement("xpath","//a[text()='upendranath']"));
		verifyPartialText(locateElement("id", "viewLead_generalProfTitle_sp"), "My Profile");
		click(locateElement("xpath", "//a[text()='Edit']"));
		return this;
	}
	
	
	public EditLead verify_ClearAndType_CompanyName_ClickEdit() {
		clearAndType(locateElement("xpath", "//input[@id='updateLeadForm_companyName']"),"HCL");
		click(locateElement("xpath", "//input[@value='Update']"));
		return this;
	}
}
