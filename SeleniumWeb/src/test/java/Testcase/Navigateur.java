package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		// chemin Chrome Driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver= new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouvrir URL
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		
		
		

	}

}
