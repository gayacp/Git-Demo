Feature: Test Login functionality

  Scenario Outline: Check Login is successfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the homepage

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
