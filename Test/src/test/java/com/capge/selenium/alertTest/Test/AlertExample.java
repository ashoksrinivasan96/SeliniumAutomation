package com.capge.selenium.alertTest.Test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertExample {
	
	WebDriver driver;
	@Test
	public void ExampleForAlert() throws InterruptedException {
		Logger logger = Logger.getLogger(App.class.getName());
		System.setProperty("webdriver.chrome.driver", "D:\\bdd-srini\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:7777/selenium/Alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		logger.info(alert.getText());
		alert.accept();
	}

}
