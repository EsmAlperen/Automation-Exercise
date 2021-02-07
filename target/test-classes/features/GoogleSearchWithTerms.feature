Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page.

  @SearchWithTerms
  Scenario Outline: Google title verification after search
    Given User is on the google search page
    Then User should see title is Google
    When User searches "<searchValue>"
    Then User should see "<expectedTitle>" in the title

    Examples: Search Values I want to search in Google
      | searchValue | expectedTitle |
      | medicine      | medicine       |
      | health       | health         |
      | water      | water        |




