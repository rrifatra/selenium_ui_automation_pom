$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AmazonLoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to search for a product and proceed to checkout",
  "description": "",
  "id": "as-a-user,-i-want-to-search-for-a-product-and-proceed-to-checkout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6312096920,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for product and proceed to checkout",
  "description": "",
  "id": "as-a-user,-i-want-to-search-for-a-product-and-proceed-to-checkout;search-for-product-and-proceed-to-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ValidCase"
    },
    {
      "line": 4,
      "name": "@SomeTags"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch amazon website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for product and select the first item",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I add the product to cart and verify the price",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on proceed to checkout and login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify the price of the product on checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.loginToAmazonWebsite()"
});
formatter.result({
  "duration": 348204835,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.searchForProduct()"
});
formatter.result({
  "duration": 6170847172,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.addToCart()"
});
formatter.result({
  "duration": 1298324466,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.proceedToCheckout()"
});
formatter.result({
  "duration": 1782174807,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyProductPrice()"
});
formatter.result({
  "duration": 3676465106,
  "status": "passed"
});
formatter.after({
  "duration": 317146009,
  "status": "passed"
});
});