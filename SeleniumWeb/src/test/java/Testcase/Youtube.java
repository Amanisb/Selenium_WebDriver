package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Youtube {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// chemin Chrome Driver (path)
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver= new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		
	    //ouvrir URL
		driver.get("https://www.youtube.com/");
		//sleep
		Thread.sleep(5000);
		
	
		
		//identification d'element
		WebElement recherche;
		recherche= driver.findElement(By.name("search_query"));
		String text;
		text=recherche.getText();
		//Verification(ASSERT)
		Assert.assertEquals("https://www.youtube.com/results?search_query=Tunisie",text);
		System.out.println("test ok");
}


	}


