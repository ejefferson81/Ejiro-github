package MavenProject.MavenProjectGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.testng.annotations.Test;

public class newClass {
	@Test
	public void intializeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/ejiroghenejefferson/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		if (driver.getTitle().equals("Google")) {
			System.out.println("Test Passed");
		} else {

			System.out.println("Test Failed");

		}
	String color = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).getCssValue("color");
	
	System.out.println(color);
	
	}

}
