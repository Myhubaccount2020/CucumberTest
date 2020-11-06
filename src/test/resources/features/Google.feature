Feature: Testing google links

  Background:
    Given I am on the "https://www.google.com/" URL
    And the page title should contains "Google"

    @googleads
  Scenario: Test advertising link
  Then I navigate to the "Advertising" link



  @googleLinks
  Scenario Outline: user should be able to navigate to google links
    Given user is on google web page
    And user navigate to the "<link>"
    Then the title of the page contains "<title>"

    Examples:
    |link |title|
    |Advertising |Advertising|
    |Business | Business     |
    |  How Search works |Search|
    |Privacy |Privacy |
    |Terms |Terms|

