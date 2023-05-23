Feature: Top Menu Test
  As a user i should navigate to any tab on top menu
  @sanity @regression
  Scenario: verify PageNavigation when user select any tab on top menu
    Given    user is on homepage
    When     click on "Electronics" tab from top menu
    Then     user should navigate to Electronics page
