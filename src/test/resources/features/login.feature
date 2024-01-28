Feature: This is a login test

  Scenario Outline: This is a login scenario

    Given Navigated to login page
    When Enter <username> and <password>
    Then Click on login button

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |