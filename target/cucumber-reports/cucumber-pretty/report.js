$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AmazonLoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to create credentials",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6346339833,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Successful login using valid account",
  "description": "",
  "id": "as-a-user,-i-want-to-create-credentials;successful-login-using-valid-account",
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
  "duration": 322458569,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.searchForProduct()"
});
formatter.result({
  "duration": 5519619785,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.addToCart()"
});
formatter.result({
  "duration": 1352406301,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.proceedToCheckout()"
});
formatter.result({
  "duration": 1845256205,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyProductPrice()"
});
formatter.result({
  "duration": 4516842149,
  "status": "passed"
});
formatter.after({
  "duration": 269398892,
  "status": "passed"
});
});