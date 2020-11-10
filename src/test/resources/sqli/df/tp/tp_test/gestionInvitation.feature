#Author: Mattéo Lebriat
Feature: Gestion des invitations

	Scenario Outline: Scenario3
	Given Mr Pignon and Mr Le blanc go to bar <nameBar>
	And There are only <max> seats in the bar.
	When They arrive, there are <nbpeople> in the bar
	And They have <access> to enter the bar
	Then Mr Le Blanc orders <command> more cocktails
	And Mr. Leblanc checks the bill and pays <totalprice>
	And Mr Pignon is <health>
	
	Examples:
	|nameBar   |max|nbpeople|access|command|totalprice|health|
	|"le Juste"|10 |3			  |true	 |2			 |40				|"sick"|
	|"le Graal"|10 |5				|true	 |2			 |40				|"good"|