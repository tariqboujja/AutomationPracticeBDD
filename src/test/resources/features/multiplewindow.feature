Feature: User Multiple Window scenarios

  Background: Navigate to page
    Given I open url of homepage
    When I click a button Multiple-window page

    @US4005
    Scenario: verify TLA, Google, Facebook button are enabled
      When I click a button Multiple-window page
      Then verify TLA button is enabled
      Then verify Google button is enabled
      Then verify Facebook button is enabled