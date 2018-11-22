package mobileautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class iPhoneApp 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws MalformedURLException
    {
    	DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM,"ios");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone Simulator");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME ,"XCUITest");
        
        IOSDriver<IOSElement> driver=new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.get("https://www.cochlear.com/us/en/home");
        driver.findElement(By.xpath("//*[text()='Menu']")).click();
    }
}