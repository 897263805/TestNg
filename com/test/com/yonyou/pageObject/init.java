package com.yonyou.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
;

public abstract class init {
	public static WebDriver driver;
	
	@BeforeClass
	public void initWebDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\86178\\IdeaProjects\\atuomateed-testing-advanced\\chaper-01\\driver\\chromedriver.exe");
	driver = new ChromeDriver();		
	}
	


}
