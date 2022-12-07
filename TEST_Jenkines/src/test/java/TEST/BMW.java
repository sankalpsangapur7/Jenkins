package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMW {
	
	WebDriver driver;

	
	@Test
	public void Browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	//	String url=Utility_Methods.Test_configuration();
		driver.get("https://www.bmw-motorrad.in/en/home.html#/filter-all");
		driver.manage().window().maximize();
		driver.quit();

}
} 
