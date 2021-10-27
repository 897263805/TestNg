package com.yonyou.businessLogic;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.yonyou.pageObject.imsVo;
import com.yonyou.pageObject.init;
import com.yonyou.pageObject.loginPageVo;

public class loginScuess extends init  {
	
	public static void login(loginPageVo loginPage,imsVo ims) throws InterruptedException {		
	       
			driver.get(ims.getUrl());
	        driver.findElement(By.cssSelector(loginPage.usernameElement)).sendKeys(ims.getUsername());
	        driver.findElement(By.cssSelector(loginPage.passwordElement)).sendKeys(ims.getPassword());
	        driver.findElement(By.className(loginPage.loginButton)).click();
	        TimeUnit.SECONDS.sleep(3);      
	        assertEquals(driver.findElement(By.cssSelector(loginPage.assertElement)).getText(),ims.getAssertKey());

	}

}
