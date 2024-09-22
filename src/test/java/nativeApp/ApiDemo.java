package nativeApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiDemo extends ContactManager{
	
	AndroidDriver<AndroidElement>driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		
		driver = contact();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	@Test
	public void tc() {
		
		System.out.println("Contact Manager Opened");
		
		driver.findElement(MobileBy.AccessibilityId("Add Contact")).click();
		
		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactNameEditText")).sendKeys("Simran");
		
		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactPhoneEditText")).sendKeys("8250085510");
		
		driver.findElement(MobileBy.id("com.example.android.contactmanager:id/contactEmailEditText")).sendKeys("Samgdghhb210@gmail.com");
		
		driver.findElement(MobileBy.AccessibilityId("Save")).click();
		
		System.out.println("Contact Manager Test done");
		
		
	}

}
