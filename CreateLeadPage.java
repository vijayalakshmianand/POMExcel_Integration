package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecficationMethod;

public class CreateLeadPage extends ProjectSpecficationMethod {
	
	
		public CreateLeadPage(RemoteWebDriver driver) {
			this.driver=driver;
	}


		public CreateLeadPage enterCompanyname(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		return this;
	}
	
		
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
       return this;
	}

	
	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
return this;
	}
	
	
	public CreateLeadPage enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage(driver);
	}
}

