package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookTest{
	@Test(dataProvider = "login",dataProviderClass = DataStoreTest.class, groups = {"smoke"})
	public void getData(String name,String loc) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(name);
		driver.findElement(By.name("pass")).sendKeys(loc);
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
