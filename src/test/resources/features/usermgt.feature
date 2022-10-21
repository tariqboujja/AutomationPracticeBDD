Feature: User Mgt page scenarios
  Background: Navigate to User-Mgt page
    Given I open url of homepage
    When I click a button User-Mgt

  @US4001 @regression
  Scenario: User-Mgt page title test
    Then Verify title of the page is Register New User

  @US4002
  Scenario: Login button test
    Then Verify Login button is present

  @US4004
  Scenario: Register a new user
    Then verify First Name input field is displayed
    Then verify Last Name input field is displayed
    Then verify Phone Number input is displayed
    And verify Email address input is displayed

