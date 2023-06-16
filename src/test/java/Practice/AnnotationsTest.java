package Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest
{
	@Test
	public void NameTest() 
	{
		Reporter.log("Sravya",true);
	}
	@BeforeMethod
	public void bmconfigurationTest()
	{
		Reporter.log("BeforeMethod",true);
	}
	@AfterMethod
	public void amconfigurationTest()
	{
		Reporter.log("BeforeMethod",true);
	}
	@BeforeClass
	public void bcconfigurationTest()
	{
		Reporter.log("BeforeClass",true);
	}
	@AfterClass
	public void acconfigurationTest()
	{
		Reporter.log("AfterClass",true);
	}
	@BeforeTest
	public void btconfigurationTest()
	{
		Reporter.log("BeforeTest",true);
	}
	@AfterTest
	public void atconfigurationTest()
	{
		Reporter.log("AfterTest",true);
	}
	@BeforeSuite
	public void bsconfigurationTest()
	{
		Reporter.log("BeforeSuite",true);
	}
	@AfterSuite
	public void asconfigurationTest()
	{
		Reporter.log("AfterSuite",true);
	}
	
}
