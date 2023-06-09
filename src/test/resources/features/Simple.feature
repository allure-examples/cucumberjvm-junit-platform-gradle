Feature: Simple feature

  Scenario: Add a to b (1)
    Given a is 5
    And b is 10
    When I add a to b
    Then result is 15
