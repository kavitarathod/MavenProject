package com.pkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello {
	WebDriver driver;
	

		@Test
		void printMsg() {
			
		System.out.println("Hello Kavitha");	
		
		String new1=System.getProperty("user.dir")+"\\Drivers";
		System.out.println(new1);
		System.setProperty("webdriver.chrome.driver",new1+"\\chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to url
		driver.get("https://www.google.com/");
		//closing the browser
		driver.close();
	}

}
