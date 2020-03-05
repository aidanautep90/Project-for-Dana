package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumPracticeForm2 {
	public static WebDriver driver;
	public static void main(String[] args)  {
		try {
			System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
			String mainHandle = driver.getWindowHandle();
			driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
			Set<String> handles = driver.getWindowHandles();
			String textOnlyWindowHandle = "";
			for (String handle : handles) {
				if (!handle.equals(mainHandle)) {
					textOnlyWindowHandle = handle;
				}
			}
		driver.switchTo().window(textOnlyWindowHandle);
		driver.swit
		String resultText = driver.findElement(By.xpath("//body")).getText();
		System.out.println(resultText);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
			driver.quit();
			
		}
	}

}
