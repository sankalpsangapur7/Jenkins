package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TVS_TEST {
	
	@Test
	public void Browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	String url=Utility_Methods.Test_configuration();
		driver.get("https://www.tvsmotor.com/tvs-apache");
		driver.manage().window().maximize();
		}
}
