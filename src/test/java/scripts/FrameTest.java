package scripts;
 
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import reusable.DriverManager;

public class FrameTest {
  @Test
  public void f() {
	
		WebDriver driver = DriverManager.getDriver("Chrome");
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath(" //button[@onclick=\"jsPrompt()\"]")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		 System.out.println( alert2.getText());
  }
}
