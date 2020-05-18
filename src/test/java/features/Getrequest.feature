Feature: Verify the Rest Get Request in Api Testing

Scenario: To check Get Request Http status code is 200

Given serviceurl "https://www.equifax.com/business/credit-trends"
When Send the Http Get request for endpoint "https://www.equifax.com/business/credit-trends"
Then Verify the valid Http response code is 200
