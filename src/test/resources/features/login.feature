Feature: This is a login test

  Scenario Outline: This is a login scenario

    Given Navigated to login page
    When Enter <username> and <password>
    Then Click on login button

    Examples:
      | username | password |
      | Admin    | admin123 |