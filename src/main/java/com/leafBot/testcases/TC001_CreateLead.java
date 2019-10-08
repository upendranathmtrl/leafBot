package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="Login Logout";
		testcaseDec = "Login and Logout to Leaftaps";
		author="Balaji";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password, String companyName, String firstName, String lastName) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickCreateLead()
		.EnteringDetails(companyName, firstName, lastName)
		.clickCreateLeadButton()
		.click_LeadTabAndFindLead_Edit()
		.verify_ClearAndType_CompanyName_ClickEdit();
	
	}

}
