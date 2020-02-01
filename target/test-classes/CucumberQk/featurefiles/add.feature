Feature: User wants to provide add function for the calculator
 
 Background:
 Given calculator exists
 
 @fast
  Scenario: Add two numbers
    When add is called with two numbers
    Then result is the addition of the two number
    
#  Scenario: Add two  given numbers
#    
#    When add is called with 30 and 40 
#    Then result 70
#    
#  Scenario: Add two  given numbers
#    
#    When add is called with 30.2 and 40.2
#    Then result must display "Improper input Provided Numbers Need To Be Integers only"
#    
#    Scenario: Add two  given numbers
#    
#    When add is called with 1001 and 40
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#    Scenario: Add two  given numbers
#    
#    When add is called with 20.2 and 10
#    Then result must display "Improper input Provided Numbers Need To Be Integers only"
#    
#    Scenario: Add two  given numbers
#    
#    When add is called with 20 and 70.2
#    Then result must display "Improper input Provided Numbers Need To Be Integers only"
#    
#     Scenario: Add two  given numbers
#    
#    When add is called with 1000 and 1000
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#     Scenario: Add two  given numbers
#    
#    When add is called with 20 and 1000
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#     Scenario: Add two  given numbers
#    
#    When add is called with 1000 and 20
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#     Scenario: Add two  given numbers
#    
#    When add is called with -1 and 10
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#    Scenario: Add two  given numbers
#    
#    When add is called with 10 and -1
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
#    
#     Scenario: Add two  given numbers
#    
#    When add is called with -1 and -1
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0"
    
#    Scenario Outline:Add two  given numbers
#     When add is called with <number1> and <number2>
#    Then result must display "Improper input Provided Numbers Need To Be Less then 1000 or greater then 0" 

 Scenario Outline:Add two  given numbers
     When add is called with <number1> and <number2>
    Then result must display "<result>"
    
     Examples:
    search reslts
    | number1 | number2|result|
    | -1  |-1 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 10  |-1 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | -1  |-10|Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 1000  |20 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 20  |1000 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 1000  |1000 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 20 |70.2 |Improper input Provided Numbers Need To Be Integers only|
    | 20.2  |10 |Improper input Provided Numbers Need To Be Integers only|
    | 1001 |40 |Improper input Provided Numbers Need To Be Less then 1000 or greater then 0|
    | 30.2  |40.2 |Improper input Provided Numbers Need To Be Integers only|
#    | 30  |40 |70|
      
    
    
    
    
    