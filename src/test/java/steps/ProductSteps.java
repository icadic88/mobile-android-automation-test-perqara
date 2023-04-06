package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ProductPage;

public class ProductSteps {

  ProductPage productPage = new ProductPage();

  @And("user choose item {string} catalog page")
  public void userChooseItemCatalogPage(String itemName) {
    productPage.chooseItem(itemName);
  }

  @Given("user is Products page")
  public void userIsProductsPage() {
    Assert.assertTrue("failed! isn't on product page",
        productPage.isOnProductPage());
  }

  @And("user click shopping cart button on product page")
  public void userClickShoppingCartButtonOnProductPage() {
   productPage.clickViewCart();
  }
}
