Feature: User Want To check larger of two numbers
 
 Background:
 Given ata Super smart calculator exist
 
 
#  Scenario: Add two numbers
#    When  Enter the First number "10"
#    And Enter the Second number "20"
#    Then largest number will be 20
    
     Scenario Outline: Add two numbers
    When  Enter the First number "<Number1>"
    And Enter the Second number "<Number2>"
    Then largest number will be <Result>
    
    Examples: Search Result
    |Number1|Number2|Result|
    |10|20|20|