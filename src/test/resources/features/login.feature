Feature: Login feature

  @smoke
  Scenario: Login to the application
    Given user is navigated to HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is logged in successfully
