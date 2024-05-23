package com.mobile.tests;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.mobile.pages.HomePage;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomeTest extends BaseTest {

	@Test
	public void firstTest() throws MalformedURLException, InterruptedException {
		AndroidDriver driver = (AndroidDriver) BaseTest.getDriver("android");
		

//		IOSDriver iosDriver =  (IOSDriver) BaseTest.getDriver("ios");
		HomePage hp = new HomePage(driver);
		hp.firstItem.click();
		Thread.sleep(2000);
		hp.image.click();
		Thread.sleep(2000);
		
		//RemoteWebElement image = (RemoteWebElement) driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/action_bar_root"));
		RemoteWebElement image = (RemoteWebElement) hp.productImage;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("mobile: doubleClickGesture", ImmutableMap.of("elementId", image.getId()));
	
		

	}

}