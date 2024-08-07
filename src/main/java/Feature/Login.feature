Feature: Test Login Functionality

  Scenario Outline: check login functionality with valid and invalid details.

    Given Browser is open
    And User is on the login page
    When User enter the <Username> and <Password>
    And Click on the login button
    Then User Navigated to the home page

    Examples:
      | Username | Password |
      | Raghav   | 12345    |
      | Vaibhav  | 1234     |
