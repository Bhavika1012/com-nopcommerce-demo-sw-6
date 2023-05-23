Feature: Electronic Tab Functionality Test
  As a user i should add product to cart and order that product successfully

  @sanity @regression
  Scenario:  Verify user should navigate to cell phones page successfully
    Given    user is on homepage
    When     click on "Electronics" tab from top menu
    Then     user should navigate to Electronics page

  @smoke @regression
  Scenario: Verify that the product added successfully and Place order successfully
    Given   User is on homepage
    When    User Mouse Hover on “Electronics” Tab
    And     User Mouse Hover on “Cell phones” and click
    Then    User Verify the text “Cell phones”
    And     User Click on List View Tab
    And     User Click on product name Nokia Lumia 1020 link
    Then    User Verify the text "Nokia Lumia 1020"
    Then    Verify the price "$349.00"
    And     User Change quantity to "2"
    And     User Click on ADD TO CART tab
    Then    User Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And     User close notification bar
    And     User MouseHover on Shopping cart
    And     User MouseHover and click on GO TO CART button
    Then    User Verify the message "Shopping cart"
    Then    User Verify the quantity is "2"
    Then    User Verify the Total "$698.00"
    And     User click on checkbox I agree with the terms of service
    And     User Click on CHECKOUT
    Then    User Verify the Text "Welcome, Please Sign In!" on Home Page
    And     User Click on REGISTER tab
    And     User enter First Name "Prime"
    And     User enter Last Name "Testing"
    And     User enter EmailId "Random"
    And     User enter password "Admin@123"
    And     User enter confirm password "Admin@123"
    And     User click on register button
    Then    User Verify the message "Your registration completed" on register page