package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@Test(dataProvider = "Oraganization")
	public void getData(String name,String loc,String course)
	{
		System.out.println(name+" "+loc+" "+course);
	}

	
	@DataProvider(name="Oraganization")
	public Object[][] data()
	{
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Qspider";
		obj[0][1]="Rajajinagar";
		obj[0][2]="manual";
		
		obj[1][0]="Jspider";
		obj[1][1]="Rajajinagar";
		obj[1][2]="java";
		
		obj[2][0]="Pyspider";
		obj[2][1]="Rajajinagar";
		obj[2][2]="Py Automation";
		
		return obj;
	}
}
