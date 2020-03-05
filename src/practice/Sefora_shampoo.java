package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sefora_shampoo {
public static WebDriver practice;
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver","src/Resourse/chromedriver.exe");
		practice = new ChromeDriver();
		practice.navigate().to("https://www.sephora.com/");
		waitFor (1);
		WebElement searchFor = practice.findElement(By.xpath("//input[@type='text']"));
		searchFor.sendKeys("Shampoo");
		searchFor.click();
	
	}
		catch (Exception e) { 
			e.printStackTrace();
		} 
		finally {
			practice.close();
			practice.quit();
		}
	}
public static void waitFor (int seconds) {
	try  { 
		Thread.sleep(seconds * 1000);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
}
