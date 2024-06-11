package login;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericutility.ExcelUtility;
import genericutility.FileUtility;

public class Demo 
{
	
	
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileUtility fUtil = new FileUtility();
		String url = fUtil.getDataFromProperty("url");
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5);
	}

}
