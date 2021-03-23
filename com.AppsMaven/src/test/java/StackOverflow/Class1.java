package StackOverflow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class Class1 extends BaseClass {
	
	@BeforeTest
	public void deriverSetUp() throws Exception {
		driverInitialization();
	}
	@Test
	public void cOMPOUNDcLASSES() {
		driver.get("https://pharmeasy.in/");
		driver.findElement(By.cssSelector("input[class='jss83._9Rsw_.undefined _2Saml']")).sendKeys("abc");
		
	}
	
}
