package gitPract;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PractPrioirity{
	
	@Test(priority = -1)
	public void A()
	{
		//driver.get("https://www.amazon.in");
		Reporter.log("Executing firefox",true);
	}
	@Test
	public void B()
	{
		//driver.get("https://www.amazon.in");
		Reporter.log("Executing firefox",true);
	}

}
