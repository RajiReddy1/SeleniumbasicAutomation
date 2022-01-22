  package reusable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class DriverManager {
	public static  WebDriver  getDriver(String browserName) {
		String userDir = System.getProperty("user.dir");
		String chromedriver = null;
		WebDriver driver = null;
		switch (browserName.toLowerCase()) {
		
		case "chrome":
			 chromedriver = userDir + "/src/test/resources/drivers/chromedriver.exe";
			  System.setProperty("webdriver.chrome.driver", chromedriver);
			   driver = new ChromeDriver();
				
			break;
			
		case "firefox":
		 chromedriver = userDir + "/src/test/resources/drivers/geckodriver.exe";
			  System.setProperty("webdriver.gecko.driver", chromedriver);
			   driver = new FirefoxDriver();
				
			break;
			
		case "ie":
			chromedriver = userDir + "/src/test/resources/drivers/IEDriverServer.exe";
			  System.setProperty("webdriver.ie.driver", chromedriver);
			  driver = new InternetExplorerDriver();
				
			break;
		case "edge":
			 chromedriver = userDir + "/src/test/resources/drivers/msedgedriver.exe";
			  System.setProperty("webdriver.edge.driver", chromedriver);
			   driver = new EdgeDriver();
				
			
		default:
			break;	
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
		 
	Reporter.log(" @@@@login"+ browserName+ "######", true);
		return driver; 
	}
	

}
