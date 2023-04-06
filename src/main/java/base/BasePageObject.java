package base;

import drivers.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class BasePageObject {

  public AndroidDriver<AndroidElement> getDriver() {
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By locator) {
    return getDriver().findElement(locator);
  }

  public void click(By locator) {
    find(locator).click();
  }

  public void type(By locator, String text) {
    AndroidElement element = find(locator);
    element.clear();
    element.sendKeys(text);
  }

  public String getText(By locator) {
    return find(locator).getText();
  }

  public Boolean isDisplayed(By locator) {
    return find(locator).isDisplayed();
  }

  public void scrollIntoVisibleText(String text) {
    getDriver().findElementByAndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
            + text + "\").instance(0))");
  }
}
