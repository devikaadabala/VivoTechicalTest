Feature: mini basket validations

  @mini
  Scenario: Ensure that the customer can remove one or more item(s) from the mini basket

    Given customer has added below items to the basket
      | product_name               | size | price   | qty |
      | primus-trail-iii-sg-womens | UK 5 | 145.00 | 1   |
      | primus-asana-mens          | UK 8 | 140.00 | 1   |
    When customer clicks on the mini basket and validate
    And customer update Qty and remove 1 item from the mini basket
    Then item should be removed from the mini basket and the subtotal amount '£145.00' is updated accordingly



