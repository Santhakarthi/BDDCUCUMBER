Background:
Given the browser is launched
And the application is loaded
//parameterization

Scenario:Testing the login feature with valid data

When the user enter valid credentials "admin" and "manager"
And the user click on login button
Then dashboard should be displayed