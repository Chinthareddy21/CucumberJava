Feature: This is a login test

  Scenario: Login tests

  Scenario Outline: This is a login scenario with valid credentials

    Given Navigated to login page
    When Enter <username> and <password>
    Then Click on login button

    Examples:
      | username | password |
      | Admin    | admin123 |


  Scenario Outline: This is a login scenario with invalid credentials

    Given Navigated to login page
    When Enter <invalidUsername> and <invalidPassword>
    Then Click on login button
    Then <errorMessage> should be displayed

    Examples:
      | invalidUsername | invalidPassword | errorMessage        |
      | Admin           | admin12$#       | Invalid credentials |