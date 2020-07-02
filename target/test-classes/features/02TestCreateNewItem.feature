Feature: Test Create New Item

Background:
	Given user has logged in into the application
	
@CreateItem	
Scenario:
	Given user is on home page
	And user clicks Create Item icon
	Then verify that user lands on Create New Item page
	
Scenario:
	Given user is on create new item page	
	And user enters Create Item icon