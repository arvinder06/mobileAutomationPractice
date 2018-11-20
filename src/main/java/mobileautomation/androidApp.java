package mobileautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class androidApp 
{
    public static void main( String[] args ) throws MalformedURLException
    {
    	DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM,"Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Arvinder OnePlus");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
       
        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.get("https://www.cochlear.com/us/en/home");
        driver.findElement(By.xpath("//*[text()='Menu']")).click();
    }
}