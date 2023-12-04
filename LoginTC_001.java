package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecficationMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTC_001 extends ProjectSpecficationMethod{
	
	
		@Test
		public void runLogin() {
			System.out.println("login successfull:"+driver);
			LoginPage lp = new LoginPage(driver);
			lp.enterUsername()
			.enterPassword()
			.clickLoginButton()
			.verifyLoginPage()
			.clickCrmsfaLink();
			

			
		
			
			
					
		}
		
		
	}


