Feature: Login Page

Scenario Outline: Verify Login with multiple user 
Given User launches Login application
When User clicks on login button
And User enters the invalid login <username> and <password>
And User clicks on submit button
Then User gets restricted message 

Examples:
|username		|password		|
|abcd			|1234			|
|aaaa			|12345			|
|bbbb			|12346			|


 