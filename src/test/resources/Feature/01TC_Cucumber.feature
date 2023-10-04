Feature: BUBT annex checking
  Scenario Outline: Login check
    Given BUBT annex login page
    When click the interface
    And Student Input '<ID>' and '<password>'
    And click the login button
    Then go to the login page

    Examples:
    |ID|password|
    |17182103291  |01733113095        |