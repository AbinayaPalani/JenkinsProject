/**
 * 
 */
/**
 * @author abinaya
 *
 */
package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class launchBrowser{
	
	WebDriver driver;
	
	public void openBrowser(){
		
		driver =  new ChromeDriver();
		driver.get("http://staging.jbilling.a-cti.com:8081");
		
	}
}