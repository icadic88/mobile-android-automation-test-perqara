package locator;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public interface AllLocators {

  // product locator
  By PRODUCT_PAGE_LOCATOR = By.id("com.saucelabs.mydemoapp.android:id/productTV");
  String XPATH_ITEM = "//android.widget.ImageView[@content-desc='%s']";

  // product detail locator
  By BUTTON_BLUE_COlOR = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/"
      + "android.view.ViewGroup[2]");
  By BUTTON_INCREASE_QUANTITY = MobileBy.AccessibilityId("Increase item quantity");
  By BUTTON_ADD_TO_CART = MobileBy.AccessibilityId("Tap to add product to cart");

  // navbar cart
  By BUTTON_VIEW_CART = MobileBy.AccessibilityId("View cart");

  // shopping cart page
  By LABEL_PRODUCT_NAME = MobileBy.id("com.saucelabs.mydemoapp.android:id/titleTV");
  By LABEL_TOTAL_ITEMS = MobileBy.id("com.saucelabs.mydemoapp.android:id/itemsTV");
}
