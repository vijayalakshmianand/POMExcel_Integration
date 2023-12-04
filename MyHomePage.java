package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecficationMethod;

public class MyHomePage extends ProjectSpecficationMethod {
	public  MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
		
	public MyLeadsPage  clickLeadstab() {
		
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
		
	}

	


}
