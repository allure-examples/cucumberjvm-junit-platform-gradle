Feature: Test Scenarios with backgrounds

  Background:
    Given cat is sad

  @cat
  @severity=blocker
  @link.myLink=thecatsite.com
  @issue=61
  @tmsLink=12
  Scenario: Scenario with background
    When Pet the cat
    Then Cat is happy
    And cat is murmur
