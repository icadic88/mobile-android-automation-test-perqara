package pages;

import static locator.AllLocators.LABEL_PRODUCT_NAME;
import static locator.AllLocators.LABEL_TOTAL_ITEMS;
import base.BasePageObject;

public class ShoppingCartPage extends BasePageObject {

  public String getItemName() {
    return getText(LABEL_PRODUCT_NAME);
  }

  public String getTotalItems() { return getText(LABEL_TOTAL_ITEMS); }
}
