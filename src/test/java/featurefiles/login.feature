Feature:Testing the login feature of actitime application



Background:
Given the browser is launched
And the application is loaded


Scenario:Testing the login feature with valid data

When the user enter valid username
And the user enter valid password
And the user click on login button
Then dashboard page is displayed


Scenario:Testing the forgotten password link
 When user clicks on forgotyour password
Then forgot your password component should be displayed     