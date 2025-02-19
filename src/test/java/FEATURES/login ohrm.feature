Feature: Login test for OrangeHRM

Scenario Outline: Login with multiple user details
Given the user is on login page
When the user enters username "<username>" and password "<password>"
And click on login option
Then user see the results
Examples:
	| username | password |
	| Admin | admin123 |
	| Adminn | admin123 |
	| Admin | admin1233 |
	|  | admin123 |
	| Admin |  |
	