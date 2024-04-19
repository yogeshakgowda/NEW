package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicAnnotationTest 
{
@Test
public void one_Script()
{
	System.out.println("---testscript1---");
}

@BeforeMethod
public void before_Method()
{
	System.out.println("---login---");
}

@AfterMethod
public void after_Method()
{
	System.out.println("---logout---");
}

@BeforeClass
public void before_Class()
{
	System.out.println("---Launch Browser---");
}

@AfterClass
public void after_Class()
{
	System.out.println("---close Browser---");
}

@BeforeSuite
public void ConnectToDb()
{
	System.out.println("---Connect to DB---");
}
@AfterSuite
public void CloseToDb()
{
	System.out.println("---Close to DB---");
}
@Test
public void createScript()
{
	System.out.println("--create acc---");
}

@BeforeMethod
public void before_Method1()
{
	System.out.println("---login 1---");
}

@AfterMethod
public void after_Method1()
{
	System.out.println("---logout1---");
}

@BeforeClass
public void before_Class1()
{
	System.out.println("---Launch Browser1---");
}

@AfterClass
public void after_Class1()
{
	System.out.println("---close Browser1---");
}

@BeforeSuite
public void ConnectToDb1()
{
	System.out.println("---Connect to DB1---");
}
@AfterSuite
public void CloseToDb1()
{
	System.out.println("---Close to DB1---");
}
}
