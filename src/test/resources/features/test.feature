Feature: Test Single Tag Failure
  Scenario: This test should fail
    When I run step 1
    Then I fail step 2
    And I run step 3