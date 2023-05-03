package Testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class ListeDeroulante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				//implicity wait (remplace thread sleep) 
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/select-menu");
				WebElement list;
				list = driver.findElement(By.id(""));
	}

}
