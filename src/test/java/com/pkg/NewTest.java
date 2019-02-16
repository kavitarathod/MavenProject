package com.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("");	
		System.out.println("Hello Kavitha");	
		System.out.println("Welcome");
		String new1=System.getProperty("user.dir");
		System.out.println(new1);
		System.setProperty("webdriver.chrome.driver",new1+"\\chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to url
		driver.get("https://www.google.com/");
		//closing the browser
		driver.findElement(By.name("q")).sendKeys("Java");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[2]/div/div/div[1]/a/h3")).click();
		//driver.close();
  }
}
