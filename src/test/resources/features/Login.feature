@android
Feature: Saucelabs Testing App

  Scenario: Verify user sucessfully login when input valid username & password
    Given user is Products page
    And user choose item "Sauce Lab Back Packs" catalog page
    And user choose the blue color product page
    And user add qty 2 product page
    When user click button Add to cart product page
    And user click shopping cart button on product page
    Then user verify item name "Sauce Lab Back Packs" & total item "2 Items" is correct on shopping cart page
