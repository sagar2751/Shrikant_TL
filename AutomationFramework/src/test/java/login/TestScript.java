package login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TestScript extends BaseClass
{
	@Test
	public void click() throws EncryptedDocumentException, IOException
	{
		Reporter.log("Login to the application successfully", true);
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		ExcelUtility eUtil = new ExcelUtility();
		String booksPage = eUtil.getPageTitleFromExcel("login", 1, 6);
		Assert.assertEquals(driver.getTitle(), booksPage, "books page not displayed");
		Reporter.log("Books link has been clicked", true);
		
		hp.getComputersLink().click();
		Reporter.log("Computers link has been clicked", true);
	}

}
