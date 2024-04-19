package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProdiver1Test{
	@Test(dataProvider = "data")
	public void getData(String name,int no)
	{
		System.out.println(name+"  "+no);
	}

	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[4][2];
		
		obj[0][0]="virat";
		obj[0][1]=18;
		
		
		obj[1][0]="MS dhoni";
		obj[1][1]=7;
		
		
		obj[2][0]="Yuvraj";
		obj[2][1]=12;
		
		obj[3][0]="Gambir";
		obj[3][1]=5;
		
		
		return obj;
	}
}
