package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecficationMethod;
import pages.LoginPage;


public class LoginLogoutTC_002 extends ProjectSpecficationMethod {
	@Test
	public void runLogout() {
		System.out.println("logout successfull:"+driver);

        new LoginPage(driver)
        
        .enterUsername()
        .enterPassword()
        .clickLoginButton()
        .clickLogoutButton();
        
        
        
        
        
   
	}

}
