Feature: Google Searching
  As a web surfer, I want to search Google, so that I can learn new things.
 
 Background:
 Given a web browser is on the Google page
 
 @fast
  Scenario: Simple Google search

    When the search phrase "cpaat" is entered
    Then results for "cpaat" are shown
    
    @fast
     Scenario: Simple Google search

    When the search phrase "QualityKiosk" is entered
    Then results for "QualityKiosk" are shown
    
     Scenario: Simple Google search

    When the search phrase "Cucumber" is entered
    Then results for "Cucumber" are shown
    
    Scenario Outline: Simple Google search

    When the search phrase "<phrase>" is entered
    Then results for "<result>" are shown
    
    Examples:
    search reslts
    | phrase | result |
    | cpaat  |cpaat |
    | QualityKiosk | QualityKiosk |
    | Cucumber | Cucumber |