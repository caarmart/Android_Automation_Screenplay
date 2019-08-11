@Calculator
Feature: As Android user, I want to realize math operations in the Calculator APP

  Scenario Outline: Basic Math Operation
    Given I load the Calculator Application
    When I realize the + math operation between <firstNumber> and <secondNumber>
    Then I verify that result equals to the expectedResult

    Examples:
      | firstNumber | secondNumber |
      | 8           | 2            |
      | 7           | 6            |