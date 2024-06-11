package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility 
{
	Actions act;
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebElement source, WebElement target)
	{
		act.dragAndDrop(source, target);
	}
	
	public void mouseHover(WebElement target)
	{
		act.moveToElement(target);
	}
	
	public void clickAndHold()
	{
		act.clickAndHold();
	}
	
	public void scrollByAmount(int x, int y)
	{
		act.scrollByAmount(x, y);
	}
	
	public void scrollToElement(WebElement element)
	{
		act.scrollToElement(element);
	}
	
	public WebDriver switchToFrame(WebDriver driver, int index)
	{
		return driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver, WebElement nameOrid)
	{
		driver.switchTo().frame(nameOrid);
	}

}
