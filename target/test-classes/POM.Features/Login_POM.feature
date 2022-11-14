Feature: check login funcentility

  Scenario Outline: check login with authorise user or not
    Given user is on login page
    When user enter <name> and <password>
    And user click on login button
    Then user click on logout button

    Examples: 
      | name                     | password |
      | 123kritikumari@gmail.com |    12345 |
      | kritikumari@gmail.com    |    12345 |
