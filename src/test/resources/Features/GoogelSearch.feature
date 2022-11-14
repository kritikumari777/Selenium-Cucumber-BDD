Feature: feature to test google functinalaty

  Scenario: validate google search is working
    Given browaer is open
    And user is on google search page
    When user inter a text in text box
    Then user navigated to search page
