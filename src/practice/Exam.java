package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {
	
	public static WebDriver driver;
	public static void main(String[] args) {
	try {
		System.setProperty("webdriver.chrome.driver", "src/Resourse/chromedriver.exe");
		driver = new ChromeDriver();
		// 1. Login to Bora Account:
		driver.navigate().to("https://lit-mesa-27064.herokuapp.com/");
		waitFor(1);
		driver.findElement(By.xpath("//li/a[text() ='Login']")).click();
		waitFor(1);
		driver.findElement(By.name("email")).sendKeys("aidanautep90@gmail.com");
		waitFor(1);
		driver.findElement(By.name("password")).sendKeys("Aibkair2019");
		waitFor(1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		waitFor(1);
		// 2. **Verify user profile is existing and correct:
		driver.findElement(By.xpath("//a[@href='/edit-profile']")).click();
		waitFor(1);
		String expectedCareer = "Test Automation Engineer";
		String actualCareer = driver.findElement(By.xpath("//*[text()='Test Automation Engineer']")).getText();
		waitFor(3);
		System.out.println(actualCareer);
		if (actualCareer.equals(expectedCareer)) {
			System.out.println("Passed");	
		} else {
			System.out.println("Failed");
		}
		driver.navigate().back();
		//3. Add work experience:
		driver.findElement(By.xpath("//a[@href='/add-experience']")).click();
		waitFor(1);
		driver.findElement(By.name("title")).sendKeys("Test Automation Engineer");
		waitFor(1);
		driver.findElement(By.name("company")).sendKeys("BoraTech");
		waitFor(1);
		driver.findElement(By.name("location")).sendKeys("Annandale");
		waitFor(1);
		driver.findElement(By.name("from")).sendKeys("10/01/2019");
		waitFor(1);
		driver.findElement(By.name("current")).click();
		waitFor(1);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		waitFor(3);
		// 4. Add education:
		driver.findElement(By.xpath("//a[@href='/add-education']")).click();
		waitFor(1);
		driver.findElement(By.name("school")).sendKeys("BoraTech School");
		waitFor(1);
		driver.findElement(By.name("degree")).sendKeys("Bachelor");
		waitFor(1);
		driver.findElement(By.name("fieldofstudy")).sendKeys("Information Technology");
		waitFor(1);
		driver.findElement(By.name("from")).sendKeys("10/01/2019");
		waitFor(1);
		driver.findElement(By.name("current")).click();
		waitFor(1);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		// Logout:
		waitFor(1);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		waitFor(3);
		// Bora Community:
		driver.findElement(By.xpath("//a[text()='BoraCommunity']")).click();
		waitFor(1);
		// Find your account:
		driver.findElement(By.xpath("//*[text()='Aidana Utepkaliyeva']/..//a")).click();
		waitFor(3);
		// Verify work experience and education:
		String expectedExperience = "BoraTech";
		String actualExperience = driver.findElement(By.xpath("(//h3[@class='text-dark'])[1]")).getText();
		System.out.println(actualExperience);
		if (expectedExperience.equals(actualExperience)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		String expectedEducation = "BoraTech School";
		String actualEducation = driver.findElement(By.xpath("//h3[text()='BoraTech School']")).getText();
		System.out.println(actualEducation);
		if (expectedEducation.equals(actualEducation)) {
			System.out.println("Passed");
		} else {
			System.out.println("Passed");
		}

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
		}}

}