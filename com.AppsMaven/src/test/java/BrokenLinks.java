import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class BrokenLinks extends BaseClass {

	@BeforeClass
	public void driverSetUp() {
		try {
			driverInitialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void brokenLinks() throws Exception {
	driver.get("https://graygaas.com");
	String homepage = "https://graygaas.com";
	String url = "";
	int resCode = 200;
	List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
	Iterator<WebElement> it = AllLinks.iterator();
	while(it.hasNext()) {
		url = it.next().getAttribute("href");
		//String name = it.next().getAttribute("value");
		//System.out.println(name);
		System.out.println(url);
		if(url==null||url.isEmpty()) {
		System.out.println("URL is empty.");
		continue;
	}
	if(!url.startsWith(homepage)) {
		System.out.println("URl belongs to other domain skipping it");
		System.out.println(url);
		continue;
	}
	HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
	huc.setRequestMethod("HEAD");
	huc.connect();
	resCode = huc.getResponseCode();
	if(resCode==400) {
		System.out.println(url + " is a broken link.");
	}
	else {
		System.out.println(url + " is a valid link.");
	}
		
	}
	
	
	
	}
}
	
	
 