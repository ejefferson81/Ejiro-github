package MavenProject.MavenProjectGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class newClass {
	public static Logger logger = Logger.getLogger(newClass.class);
			
	@Test
	public void intializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/ejiroghenejefferson/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		logger.info("Chrome is opened");
		if (driver.getTitle().equals("Google")) {
			System.out.println("Test Passed");
		} else {

			System.out.println("Test Failed");

		}
	String color = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).getCssValue("color");
	
	System.out.println(color);
	
	}
	

}
