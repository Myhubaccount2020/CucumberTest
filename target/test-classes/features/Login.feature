Feature: Testing facebook login
  Scenario:User should not be able to login with invalid credentials
    Given User is on facebook login page
    And User login with username,password
    Then User should see an error message

