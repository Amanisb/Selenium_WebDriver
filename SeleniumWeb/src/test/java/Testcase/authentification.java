package Testcase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class authentification {

	public static void main(String[] args) throws InterruptedException   {
		
		// chemin Chrome Driver (path)
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				//ouverture chrome
				WebDriver driver= new ChromeDriver();
				//maximiser la fenetre 
				driver.manage().window().maximize();
				
			    //ouvrir URL
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				//sleep
				Thread.sleep(5000);
				//identification web element
				WebElement user;
				user = driver.findElement(By.name("username"));
				//action
				user.sendKeys("Admin");
				//identification de password
				WebElement password;
				password = driver.findElement(By.name("password"));
				//action 
				password.sendKeys("admin123");
				//identification boutton
				WebElement bouton;
				bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				bouton.click();
				//Verification(ASSERT)
				Thread.sleep(5000);
				//identification d'element
				WebElement profil;
				profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"))	;
				String text;
				text=profil.getText();
				
				Assert.assertEquals("Paul Collings",text);
				System.out.println("test ok");
	}

}
