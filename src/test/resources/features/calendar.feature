Feature: Calendar page tests

  @US1015 @smoke @regression
  Scenario: Choosing date from calendar
    Given I open url of homepage
    When I click a button Calendar
    And I click a button endDateInput
    And I click a button endDateCalendar
    And I click a button Submit
    Then text will display 1 day difference
