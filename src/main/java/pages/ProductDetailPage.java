package pages;

import static locator.AllLocators.BUTTON_ADD_TO_CART;
import static locator.AllLocators.BUTTON_BLUE_COlOR;
import static locator.AllLocators.BUTTON_INCREASE_QUANTITY;
import base.BasePageObject;
import java.util.stream.IntStream;

public class ProductDetailPage extends BasePageObject {

  public void chooseBlueColor() {
    scrollIntoVisibleText("Product Highlights");
    click(BUTTON_BLUE_COlOR);
  }

  public void clickIncreaseQty(int qty) {
    IntStream.range(1, qty).forEach(i -> {
      click(BUTTON_INCREASE_QUANTITY);
    });
  }

  public void clickAddToCart() {
    click(BUTTON_ADD_TO_CART);
  }
}
