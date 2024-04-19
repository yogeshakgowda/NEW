package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OnlineTest {
	@Test(dataProvider = "Oraganization")
	public void getData(String name,String loc) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/ADMIN/");
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(loc);
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}

	
	@DataProvider(name="Oraganization")
	public Object[][] data()
	{
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Admin";
		obj[0][1]="Test@123";
		
		
		obj[1][0]="Admin";
		obj[1][1]="Test@123";
	
		
		obj[2][0]="Admin";
		obj[2][1]="Test@123";
		
		
		return obj;
	}
}
