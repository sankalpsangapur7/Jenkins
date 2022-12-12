package TEST;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class KTM_Test {
	public WebDriver driver;
		
		@Test
		public void Browsersetup() throws IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver=new ChromeDriver();
		/// String url=Utility_Methods.Test_configuration();
			driver.get("https://www.ktm.com/en-in.html");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.quit();
	}

}
