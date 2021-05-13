@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1 | 12 | 13 |
      | -1 | 6 | 5 |
      | 2 | 2 | 4 |


  Scenario: do division operation on two numbers
    Given Two input values, 6 and 2, and an operation /
    When I apply the operation
    Then I expect the result 3

  Scenario: do power operation on two numbers
    Given Two input values, 2 and 3, and an operation ^
    When I apply the operation
    Then I expect the result 8

  Scenario Outline: do operation on two numbers
    Given Two input values, <first> and <second>, and an operation <op>
    When I apply the operation
    Then I expect the result <result>
    Examples:
      | first | second | op | result |
      | 6    | 2    | /  | 3     |
      | 15   | 5    | /  | 3     |
      | 16544| 47   | /  | 352   |
      | 6    | 2    | ^  | 36    |
      | 7    | 4    | ^  | 2401  |