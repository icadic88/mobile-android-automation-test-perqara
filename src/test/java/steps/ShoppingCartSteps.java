package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {

  ShoppingCartPage scPage = new ShoppingCartPage();

  @Then("user verify item name {string} & total item {string} is correct on shopping cart page")
  public void userVerifyItemNameTotalItemIsCorrectOnShoppingCartPage(String itemName,
      String totalItems) {
    Assert.assertThat("item name isn't match", scPage.getItemName(),
        CoreMatchers.equalTo(itemName));
    Assert.assertThat("item name isn't match", scPage.getTotalItems(),
        CoreMatchers.equalTo(totalItems));
  }
}
