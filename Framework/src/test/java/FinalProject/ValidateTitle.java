package FinalProject;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.Base;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidateTitle extends Base{
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
	
		driver =initializeDriver();	
		driver.get(prop.getProperty("url"));
	
		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		AssertJUnit.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Title is validated");
		 driver.close();
		}
}
