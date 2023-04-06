package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize(){
    //desired capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    caps.setCapability(MobileCapabilityType.APP, "/Users/icads/Repository/Interview-Task/Perqara"
        + "/mobile-android-automation-test-perqara/apk-file/saucelabs-testing.apk");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
    //additional capabilities
    caps.setCapability("appWaitActivity", "com.saucelabs.mydemoapp.android.view.activities.MainActivity");
    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
    caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

    //url appium
    String url = "http://localhost:4723/wd/hub";

    //initialize appium
    try {
      driver = new AndroidDriver<>(new URL(url), caps);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    //implict wait
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  public static void quit(){
    //delay
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //quit
    driver.quit();
  }
}
