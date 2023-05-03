package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicity wait (remplace thread sleep) 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		WebElement to;
		to = driver.findElement(By.id("droppable"));
		WebElement from;
		from= driver.findElement(By.id("draggable"));
		Actions action= new Actions(driver);
		action.dragAndDrop(from, to).perform();
		String text;
		text=to.getText();
		//assert
	
		Assert.assertEquals(text, "Dropped!");
		System.out.print("Test ok");
		driver.close();
		
		
		
}
}
