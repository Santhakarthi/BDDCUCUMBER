Background:
Given the browser is launched
And the application is loaded
//data table
using map
Scenario :Testing the login feature with valid data

When the user enter valid credentials username and password
|username|password|
|admin|manager|
|trainee|trainee|
And the user click on login button
Then dashboard should be displayed
