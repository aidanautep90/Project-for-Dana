package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeForm {
 public static WebDriver driver;
 public static void main(String[] args) {
		
		String mainBrowser = "http://www.seleniumframework.com/Practiceform/";
		
		try {
			System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(mainBrowser);
			
			String mainHandle = driver.getWindowHandle();
//			System.out.println(mainHandle);
			driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
			
			waitFor(3);
			Set <String> handles = driver.getWindowHandles();
			String newHandle = "";
			for (String handle : handles) {
				if (!handle.equals(mainHandle)) {
				newHandle = mainHandle;
			}
			}
			driver.switchTo().window(newHandle);
			
			waitFor(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
		}

	}
	
	public static void waitFor (int seconds) {	
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
