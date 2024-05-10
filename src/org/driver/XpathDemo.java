package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hi\\Desktop\\Java\\Selenium_Demo\\WebDrive1\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://www.facebook.com/");
		web.manage().window().maximize();
		
		WebElement user = web.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("ABCD@gmail.com");
		
		WebElement pass = web.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("abcd@123");
		
		WebElement log = web.findElement(By.xpath("//button[@name='login']"));
		log.click();
		
		
		
		
		
	}

}
