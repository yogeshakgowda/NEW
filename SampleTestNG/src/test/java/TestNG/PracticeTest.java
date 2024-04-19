package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTest 
{
@Test(priority = -1, invocationCount = 2)
public void deleteTest()
{
	Reporter.log("---Delete file-----");
}

@Test(priority = 0)
public void editTest()
{
	Reporter.log("---edit file-----");
}

@Test(enabled = true)
public void createTest()
{
	//System.out.println(1/0);
	Reporter.log("---create-----");
}
}
