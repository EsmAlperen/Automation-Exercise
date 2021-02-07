Feature: Search without Term
  Agile Story: As a user, I should be able to search without term when I am on Google search page.
@WithoutTerm
  Scenario: Voice search
  Given User is on the google search page
  When User clicks voice button
  Then User should see microphone icon and speak
