Feature: Testing Spring Cucumber

  Scenario: Calculator adds numbers correctly
    When 3 plus 3 is entered on the calculator
    Then The returned results should be 6