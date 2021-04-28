Feature: To validate the Facebook login page 
Scenario Outline: 
	Given To validate user is in facebook login page 
	When To validate user enter "<username>" and  "<password>" 
	And To validate user click the login button 
	Then To validate user must be displayed with error msg 
	Examples: 
	
		|username|password|
		|gana|12e2342|
		|jjdv|4545|
		|jkjgkikk|4645567|
		
Scenario: 
	Given To validate user is in facebook login page 
	When To validate user enter username and  password 
		|username|password| 
		|vscvasd|fasdfae|
		|asdfd|asdSD|
		|sdfhtftyh|sdfgsfhg|
	And To validate user click the login button 
	Then To validate user must be displayed with error msg 
	
Scenario: 
	Given To validate user is in facebook login page 
	When To validate user enter usernames and  passwords 
	
		|vscvasd|fasdfae|
		|asdfd|asdSD|
		|sdfhtftyh|sdfgsfhg|
	And To validate user click the login button 
	Then To validate user must be displayed with error msg 