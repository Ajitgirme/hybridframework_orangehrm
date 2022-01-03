package com.practise.hybridframework_2022Test_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaseBase {

	  public static WebDriver driver;

	@BeforeSuite
	public void init() {

	}

	@BeforeTest
	@Parameters({ "Browser", "url" })
	public void setUp(@Optional("Chrome") String Browser,
			@Optional("https://opensource-demo.orangehrmlive.com/") String Url) {
		if (Browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else {
			System.out.println("broser not match.....try again");

		}
		driver.manage().window().maximize();
		driver.get(Url);
	}

	@AfterTest

	public void tearDown() {
		driver.quit();
	}

}
