#Author: Mattéo Lebriat
Feature: Gestion des cocktails
Scenario Outline: Scenario2 
    Given They both go to the bar <Bar>
    And Maximum seating capacity is fixed to <maxSeating> 
    When They arrive there are <nbpeople> people in the bar
    And The bar is <etat>
    Then They each order a cocktail of the month at <price>
    And At the end the note is <totalPrice>
    And Mr Pignon is <mood>
    
    Examples:
    |Bar		   |maxSeating|nbpeople|etat  |price |totalPrice|mood	 |
    |"le Juste"|10				|8			 |"full"|10	   |20				|"good"|
    |"le Juste"|10				|8			 |"full"|10	   |20				|"sick"|