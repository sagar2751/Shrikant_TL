package login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import objectrepository.HomePage;

public class DemoFile
{
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		ExcelUtility efile = new ExcelUtility();
		String url = efile.getStringDataFromExcel("login", 1, 0);
		boolean b = efile.getBooleanDataFromExcel("login", 1, 1);
		double x = efile.getNumericDataFromExcel("login", 1, 2);
		String date = efile.getStringDataFromExcel("login", 1, 3);
//		System.out.println(url+b+x+date);
	}
}
