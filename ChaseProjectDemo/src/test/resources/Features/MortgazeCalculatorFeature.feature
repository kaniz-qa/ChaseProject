Feature:  Mortgaze feature 

Scenario: As a user I want to do mortgaze calculation

    Given User navigate the url
    
    When Click on home loan link
    And Click on get start button from buying home 
    And Click on calculator 
    And Scroll down and click on Mortgage calculator
    And Select home purchage 
    And  Input home price 
    And Input down payment 
    And Input zipcode
    And Select credit score 
    And Choosing loan
    And Input current property value
    And Click on get my options 
    Then I can see my avaiability msg
    
    