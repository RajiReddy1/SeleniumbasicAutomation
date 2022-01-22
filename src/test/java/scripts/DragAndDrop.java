package scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import reusable.DriverManager;

public class DragAndDrop {
  @Test
 public void verifyDragAndDrop() {
	 
		
	  WebDriver driver = DriverManager.getDriver("Firefox");
		driver.get("https://jqueryui.com/droppable/");
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='demo-frame']")));
			//WebElement draggableElement = driver.findElement(By.cssSelector("//div[@id='draggable']"));
			//WebElement droppableElement = driver.findElement(By.cssSelector("//div[@id='droppable']"));
		//	Actions action = new Actions(driver);
			//action.dragAndDrop(draggableElement, droppableElement).build().perform();

				}
  }

