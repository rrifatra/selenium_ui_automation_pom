Feature: As a user, I want to search for a product and proceed to checkout


  @ValidCase @SomeTags
  Scenario: Search for product and proceed to checkout
    Given Launch amazon website
    When I search for product and select the first item
    Then I add the product to cart and verify the price
    When I click on proceed to checkout and login
    Then I verify the price of the product on checkout page
