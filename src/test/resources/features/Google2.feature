Feature: testing google links

  Background:
    Given User navigates to "https://www.google.com/"
    Then The title of the page contains "Google"
  @ads
  Scenario: Test Advertising lin on google
    And User should go to the advertising link
    Then User should see the Advertising page

  @bus
  Scenario: Test any given link
    And User clicks on "Business" link
    Then The title of the page contains "Business"
  @allinks
  Scenario Outline: Test all the links
    And User clicks on "<link>" link
    Then The title of the page contains "<title>"

    Examples:
      |link |title|
      |Advertising |Advertising|
      |Business    |Business   |
      |  How Search works |Search|
      |Privacy |Privacy |
      |Terms |Terms|