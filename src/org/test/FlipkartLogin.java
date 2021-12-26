package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SDK\\eclipse-workspace\\Selenium\\Browser\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement clse = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clse.click();
		
		WebElement txtbox = driver.findElement(By.name("q"));
		txtbox.sendKeys("sumsung mobiles");
		
		WebElement cl = driver.findElement(By.className("L0Z3Pu"));
		cl.click();
		

}

	
}