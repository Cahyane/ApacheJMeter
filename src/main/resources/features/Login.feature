Feature:Login User ShopDemo
  Scenario:User valid login into ShopDemo
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button show password
    And User click button rememberme
    And User click button login
    Then User go to page Myaccount

  Scenario: User invalid username
    When User enter invalid username
    And User enter valid password
    And User click button login
    Then User get eror message

  Scenario: Lost Password
    When User click forgot password
    And User enter user Login
    And User click reset password
    Then User go to page shopDemo




