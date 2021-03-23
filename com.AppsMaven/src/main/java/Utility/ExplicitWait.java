package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends BaseClass{

//		public void waitForElementToPresent(By ele) {
//			WebDriverWait wait = new WebDriverWait(driver, 60);
//			wait.until(ExpectedConditions.presenceOfElementLocated(ele));
//			driver.findElement(ele);
	public static void main(String[] args) {
			List<String> str = new ArrayList<String>();
			str.add("Priyanka");
			str.add("Ritika");
			str.add("Rohit");
			List<String> str1 = new ArrayList<String>();
			str1.add("Virendar");
			str1.add("Narendar");
			str1.addAll(str);
			System.out.println(str1);
		}
}
