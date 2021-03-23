package StackOverflow;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question02092021 {
	    private String baseUrl;
	    private WebDriver driver;

	    @BeforeTest
	    public void openBrowser() {
	        baseUrl = "http://myurl/";
	        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	    }

	    @Test
	    public void pageTitleAfterSearchShouldBeThere() throws IOException {
	        assertEquals("The page title should be this at the start of the test.", "my title", driver.getTitle());
	    }
	}
