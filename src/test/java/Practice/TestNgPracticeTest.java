package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPracticeTest {
	
	@Test
	public void NameTest()
	{
		Reporter.log("Sravya",true);
	}

	@Test
	public void Name1Test()
	{
	Reporter.log("Chandu",true);
	}
	
	@Test
	public void Name2Test()
	{
		Reporter.log("Sowmaya",true);
	}
}
