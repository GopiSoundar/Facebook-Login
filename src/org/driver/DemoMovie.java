package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMovie {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Desktop\\Selenium\\Selenium_Demo\\WebDrive1\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Love Today");
		
		WebElement butt = driver.findElement(By.xpath("//button[@type='submit']"));
		butt.click();
		
		WebElement movie = driver.findElement(By.xpath("(//a[text()='Love Today'])[2]"));
		movie.click();
		
		WebElement selc = driver.findElement(By.xpath("(//a[@role='button'])[9]"));
		selc.click();
		
	}

}
