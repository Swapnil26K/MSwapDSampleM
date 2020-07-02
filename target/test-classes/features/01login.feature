Feature: Login to GEP

Background:
	Given user is on Login page
	
@Login	
Scenario Outline:
	Given user enters "<username>" and "<password>"
	And clicks Login button
	Then verify that user lands on Home page	
Examples:
	|username |password   |
	|MDM_User2|MZa8!TRjE(S|


	
	