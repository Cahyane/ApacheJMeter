Feature:User add to cart and Checkout
  Scenario: user add to cart and checkout
    When user click product
    And user click to add cart
    And user veiw cart
    And user proceed to checkout
    And user fill checkout form
    And user click term and condition
    And user click place order
    Then user get order detail