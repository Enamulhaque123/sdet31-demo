package com.crm.testfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogoutOfVtiger {
	
	@Test
	public void credentials() {
		
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			driver.get(url);
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
		}
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		WebElement wbc = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(wbc).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
	}
}
