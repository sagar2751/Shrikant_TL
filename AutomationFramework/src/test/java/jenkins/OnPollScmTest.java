package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OnPollScmTest 
{
	@Test
	public void onPollScm()
	{
		Reporter.log("On poll scm executed", true);
	}

}
