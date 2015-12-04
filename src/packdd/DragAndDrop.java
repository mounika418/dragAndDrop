package packdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		driver=new FirefoxDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement dragBox=driver.findElement(By.id("draggable"));
		
		WebElement dropBox=driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		
		Action dragAndDrop=a.clickAndHold(dragBox).moveToElement(dropBox).release(dropBox).build();
		
		Thread.sleep(2000);
		
		dragAndDrop.perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
