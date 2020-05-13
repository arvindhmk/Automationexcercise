Feature: Verify the Rest Post Request in Api Testing

Scenario: To verify the post request Http status code
	Given Submit a POST Request with data endpoint "http://dummy.restapiexample.com/api/v1/create"
	When Send POST HTTP Request with Json body "http://dummy.restapiexample.com/api/v1/create"
	Then Verify the Http status code of POST Request Submitted "200"
