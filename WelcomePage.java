package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecficationMethod;

public class WelcomePage extends ProjectSpecficationMethod{
	
	
	
	public WelcomePage(RemoteWebDriver driver) {
	this.driver = driver;
	}

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
     return new MyHomePage(driver);
		
	}

	public LoginPage clickLogoutButton() {
		
		System.out.println("Logout successfull");
		return new LoginPage(driver);
	}
	public WelcomePage verifyLoginPage() {
		System.out.println("Login Successfull");
	return this;
	}
}
