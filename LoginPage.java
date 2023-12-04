package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecficationMethod;

public class LoginPage extends ProjectSpecficationMethod{

	//public LoginPage(RemoteWebDriver driver) {
	//	this.driver = driver;
			
	//}

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;	
	}

	public LoginPage enterUsername() {
	System.out.println("loginpage:"+driver);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    // LoginPage lp=new LoginPage(driver);
	//return lp;
	return this;
}
	
	public LoginPage enterPassword() {
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	  
      return this;
	}
	
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	             return new WelcomePage(driver);
	}
}
