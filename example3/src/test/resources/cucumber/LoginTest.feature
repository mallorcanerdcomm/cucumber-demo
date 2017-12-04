Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User enters UserName
    And User enters Password
    Then User is logged in successfully