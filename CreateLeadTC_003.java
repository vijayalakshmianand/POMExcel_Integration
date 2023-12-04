package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecficationMethod;
import pages.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecficationMethod{
    @Test(dataProvider="fetchData")
	public void runCreatelead(String cname,String fname,String lname,String phno ) {
	
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadstab()
		.clickCreateLead()
		.enterCompanyname(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterPhno(phno)
		.clickSubmitButton();
		
			}
	@BeforeTest
	public void SetData() {
	
		excelFileName= "CreateLeadExcel";
		
		
	}
}
