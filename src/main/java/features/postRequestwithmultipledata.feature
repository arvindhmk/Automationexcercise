@Postwithmultipledata
Feature: TO verify Api POST request with multiple test data

Scenario Outline: To verify POST request response and response body
 
Given Submit a "<Request Type>" Request with data "<endpoint>"
Then Verify the Http status code of Request Submitted "200"


Examples:

|Request Type|endpoint|
|POST|http://dummy.restapiexample.com/api/v1/create|
|POST|http://dummy.restapiexample.com/api/v1/create|