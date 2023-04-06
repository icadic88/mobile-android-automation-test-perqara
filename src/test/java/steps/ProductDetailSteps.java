package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProductDetailPage;
import pages.ProductPage;

public class ProductDetailSteps {

  ProductDetailPage detailPage = new ProductDetailPage();

  @And("user add qty {int} product page")
  public void userAddQtyProductPage(int times) {
    detailPage.clickIncreaseQty(times);
  }

  @And("user choose the blue color product page")
  public void userChooseTheBlueColorProductPage() {
    detailPage.chooseBlueColor();
  }

  @When("user click button Add to cart product page")
  public void userClickButtonAddToCartProductPage() {
    detailPage.clickAddToCart();
  }
}
