Feature: Homepage Test
  As user I want to go to register page
  @regression
  Scenario: User should be able to navigate to register page
    Given I am on homepage
    When I accept cookies
    And I click join now button
