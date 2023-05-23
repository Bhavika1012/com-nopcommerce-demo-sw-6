Feature: Computer Tab Functionality Test
  As a user i should add product to cart and order that product successfully

  @sanity @regression
  Scenario: verify Product Arrange In Alphabetical Order
    Given   User is on homepage
    When    User Click on Computer Menu
    And     User Click on Desktop
    And     User Select Sort By position Name: Z to A
    Then    User see  the Product will arrange in Descending order

  @smoke @regression
  Scenario: Verify product added to shopping cart successFully
    Given   User is on homepage
    When    User Click on Computer Menu
    And     User Click on Desktop
    And     User Select Sort By position "Name: A to Z"
    And     User Click on Add To Cart for "Build your own computer"
    Then    Verify the Text Build your own computer
    And     User Select Processor "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And     User Select Ram "8GB [+$60.00]" using Select class
    And     User select HDD radio "400 GB [+$100.00]"
    And     User select OS "Vista Premium"
    And     User select Microsoft Office
    And     User select Total Commander
    Then    Verify the price "$1,475.00" of desktop
    And     User  click on add to cart button
    Then    Verify the Message "The product has been added to your shopping cart" on top bar
    And     User close notification bar
    And     User MouseHover on Shopping cart and Click on GO TO CART button
    Then    Verify the message "Shopping cart"
    And     User Change the Qty to "2" and Click on Update shopping cart
    And     User click on update shopping cart
    Then    Verify total price is "$2,950.00"
    And     User click on checkbox I agree with the terms of service
    And     User Click on CHECKOUT
    Then    User Verify the Text "Welcome, Please Sign In!" on Home Page
    And     User Click on CHECKOUT AS GUEST Tab
    And     User enter first name "Prime"
    And     User enter last name  "Testing"
    And     User enter email "johnsmith123@gmail.com"
    And     User select country "United Kingdom"
    And     User enter city "London"
    And     User enter Address one "29 Harfield Grove"
    And     User enter ZipCode "nw28ys"
    And     User enter phone number "07854785478"
    And     User Click on CONTINUE
    And     User Click on Radio Button Next Day Air
    And     Click on Continue
    And     User click on Credit Card
    And     User click on payment continue
    And     User select Credit Card Type "Master card"
    And     User enter enter Card Holder Name "John Smith"
    And     User enter enter Card Number "1111222233334444"
    And     User select Expire Date "05" "2025"
    And     User enter card code "123"
    And     User click On Payment Info Continue
    Then    Verify Payment Method is "Credit Card"
    Then    Verify Shipping Method is "Next Day Air"
    Then    Verify Total is "$2,950.00"
    And     User Click on CONFIRM
    Then    Verify the Text "Thank you" on home page
    Then    Verify the message "Your order has been successfully processed!" on homepage
    And     User click on continue Button
    Then    Verify the text "Welcome to our store"