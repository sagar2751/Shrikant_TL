package login;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActionTest 
{
	@Test
	public void action()
	{
		Reporter.log("Action performed", true);
	}

}
