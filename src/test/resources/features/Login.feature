Feature: Testing facebook login
  @facelogin
  Scenario:User should not be able to login with invalid credentials
    Given User is on facebook login page
    And User login with username,password
    Then User should see an error message
  @facetestcred
  Scenario Outline: Test credentials
    Given User is on facebook login page
    And User logs in with "<user>","<pass>"
    Then user should see  error message

    Examples:
    |user   |pass|
    |test1  |password1|
    |test2  |password2|


