package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass 
{
	public static WebDriver driver;
	public FileUtility fUtil;
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fUtil = new FileUtility();
		String URL = fUtil.getDataFromProperty("url");
		driver.get(URL);	
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		lp = new LoginPage(driver);
		String EMAIL = fUtil.getDataFromProperty("email");
		lp.getEmailTextField().sendKeys(EMAIL);
		
		String PASSWORD = fUtil.getDataFromProperty("password");
		lp.getPasswordTextField().sendKeys(PASSWORD);
		
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.getLogoutLink().click();	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
