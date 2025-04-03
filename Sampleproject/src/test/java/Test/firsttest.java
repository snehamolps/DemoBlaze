package Test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;


public class firsttest {
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("92.0").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		
		
				
				driver.get("https://www.google.com/");
				driver.close();
	}
}
 