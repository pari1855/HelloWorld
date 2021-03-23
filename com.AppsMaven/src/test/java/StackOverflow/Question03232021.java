package StackOverflow;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class Question03232021 extends BaseClass {
		@BeforeMethod
		public void setUp() {
			try {
				driverInitialization();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Test
		public void test() {
			driver.get("https://www.amazon.in/s/ref=mega_sv_s23_1_2_1_2?rh=i%3Ashoes%2Cn%3A1983633031&ie=UTF8&lo=shoes");
			//driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li[1]/span/a/div/span")).click();
			driver.findElement(By.xpath("//div[@aria-label='4 Stars & Up']")).click();
			
			System.out.println("element found");
			
			
			
			
		}
}
