package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import java.util.Random;

public class demoblaze {
    public static void main(String[] args) throws InterruptedException {
        // Set the ChromeDriver path

        // Launch Chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     // Step 1: Open DemoBlaze website
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);

        // Step 2: Click on "Sign Up"
        driver.findElement(By.id("signin2")).click();
        Thread.sleep(2000);

        // Step 3: Enter username and password
        String username = "user" + new Random().nextInt(1000);
        String password = "Test@123";
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
        Thread.sleep(1000);

        // Step 4: Click "Sign Up" button
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
        Thread.sleep(2000);

        // Step 5: Handle Sign Up alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        // Step 6: Refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Step 7: Click on "Samsung Galaxy S6"
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        Thread.sleep(2000);

        // Step 8: Click on "Add to Cart"
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);

        // Step 9: Handle Add to Cart alert
        alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

     // Click on the "Cart" link
        driver.findElement(By.xpath("//a[@id='cartur']")).click();
        Thread.sleep(2000); // Wait for cart page to load

        // Click on "Place Order" button
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        Thread.sleep(2000); // Wait for the order form to appear



        // Step 12: Fill Place Order Form
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sneha");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("UPA");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kuttanad");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234567812345678");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2025");
        Thread.sleep(1000);

        // Step 13: Click "Purchase"
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
        Thread.sleep(2000);

        // Step 14: Click "OK"
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

        // Step 15: Close Browser
        driver.quit();
    }
}
