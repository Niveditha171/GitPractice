package gitPract;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PractBact{
	
	@Test(priority = -2)
	public void run()
	{
		//driver.get("https://www.amazon.in/");
		Reporter.log("Executing chrome",true);
	}
	
	@Test
	public void run1()
	{
		//driver.get("https://www.flipkart.com/");
		Reporter.log("Executing chrome",true);
	}
	
	@Test
	public void run2()
	{
		Reporter.log("Executing chrome",true);
	}

}
