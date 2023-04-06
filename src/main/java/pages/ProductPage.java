package pages;

import static locator.AllLocators.BUTTON_VIEW_CART;
import static locator.AllLocators.PRODUCT_PAGE_LOCATOR;
import static locator.AllLocators.XPATH_ITEM;
import base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import org.openqa.selenium.Point;

public class ProductPage extends BasePageObject {

  public void chooseItem(String name) {
    click(MobileBy.xpath(String.format(XPATH_ITEM, name)));
  }

  public Boolean isOnProductPage() {
    return isDisplayed(PRODUCT_PAGE_LOCATOR);
  }

  public void clickViewCart() { click(BUTTON_VIEW_CART); }
}
