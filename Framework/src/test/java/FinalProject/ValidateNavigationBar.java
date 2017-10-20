package FinalProject;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.Base;

import java.util.jar.*;
import java.util.*;
import java.util.logging.*;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class ValidateNavigationBar extends Base{
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
		
		driver=initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		
		
			//one is inheritance
			// creating object to that class and invoke methods of it
			LandingPage l=new LandingPage(driver);
		    AssertJUnit.assertTrue(l.getNavigationBar().isDisplayed());
		    log.info("Navigation is validated");
		    driver.close();
		}
	
}
