package com.grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookLogin extends BaseClass {
	
	
	/*java -jar C:\SeleniumGrid\selenium-server-standalone-3.141.59.jar -port 4444 -role hub
	 * 
	 * 
	 * java -Dwebdriver.chrome.driver="C:\SeleniumGrid\chromedriver.exe" -jar C:\SeleniumGrid\selenium-server-standalone-3.141.59.jar -port 5001 -role node -hub http://192.168.43.33:4444/grid/register/ -browser "browserName=chrome,maxInstances=1"
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void testLogin(){
		getDriver().get("https://www.facebook.com/");
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		getDriver().findElement(By.id("email")).sendKeys("admin");
		getDriver().findElement(By.id("pass")).sendKeys("password");
	}
}

