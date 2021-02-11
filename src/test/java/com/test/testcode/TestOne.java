package com.test.testcode;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	@Test
	public void test()
	{
System.out.println("maven test");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https:www.gmail.com");
	}

}
