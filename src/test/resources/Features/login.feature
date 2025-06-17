Feature: feature to test login functionality
  Scenario Outline: Check login is successfully with valid credentials
    Given user is login page
    When user enters  "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to home page

    Examples:
      |username|password|
     |practice| SuperSecretPassword!|



 