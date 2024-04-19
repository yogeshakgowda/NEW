package TestNG;

import org.testng.annotations.DataProvider;

public class DataStoreTest {
	@DataProvider(name="login")
	public Object[][] data()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="yogi@gmail.com";
		obj[0][1]="Rajajinagar";
		
		
		obj[1][0]="Jspider@gmail.com";
		obj[1][1]="Rajajinagar";
	
		
		obj[2][0]="Pyspider@gmail.com";
		obj[2][1]="Rajajinagar";
		
		
		return obj;
	}
}
