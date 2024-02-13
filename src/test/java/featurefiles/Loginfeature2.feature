Background:
Given the browser is launched
And the application is loaded
//parameterisation using example keyword

Scenario outline:Testing the login feature with valid data

When the user enter valid credentials "<username>" and "<password>"
And the user click on login button
Then dashboard should be displayed

Examples:
|username|password|
|admin|manager|
|trainee|trainee|