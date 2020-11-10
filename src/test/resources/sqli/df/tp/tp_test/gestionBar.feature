#Author: Mattéo Lebriat
Feature: Gestion du Bar
	
  Scenario Outline: Scenario1 
    Given Mr <client1> as person
    And Mr <client2> as a person 
    And Go to the bar <nameBar>
    And Maximum seating capacity is fixed to <maxSeating> 
    When These <together> people arrive together 
    And There are <numberPerson> in the bar
    Then They are <access> the right of entry
    And The bar is <status>
    
    Examples:
    | client1  | client2  |nameBar   |maxSeating|together|numberPerson|access |status|
    |"Pignon"  |"Le Blanc"|"le Juste"|10	|2	 |9	      |false  |"full"|
    |"Pignon"  |"Le Blanc"|"le Juste"|10	|2       |7	      |true   |"open"|
    
