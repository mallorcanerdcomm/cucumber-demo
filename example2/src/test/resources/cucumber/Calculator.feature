Feature: Calculator to show how works Sceneario Outline
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5

  Scenario Outline: Show how works scenario Outline to add 2 numbers
    Given I have a calculator
    When I add <number1> and <number2>
    Then the result should be <result>
    Examples:
      | number1 | number2 | result |
      |    3    |    2    |    5   |
      |    6    |    7    |    13  |
      |    2    |    5    |    7   |
      |    4    |    6    |    10  |
      |    1    |    8    |    9   |
      |    2    |    5    |    7   |