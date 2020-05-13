$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Getrequest.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Rest Get Request in Api Testing",
  "description": "",
  "id": "verify-the-rest-get-request-in-api-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To check Http status code is 200",
  "description": "",
  "id": "verify-the-rest-get-request-in-api-testing;to-check-http-status-code-is-200",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "serviceurl \"https://www.equifax.com/business/credit-trends\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Send the Http Get request for endpoint \"https://www.equifax.com/business/credit-trends\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify the valid Http response code is 200",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.equifax.com/business/credit-trends",
      "offset": 12
    }
  ],
  "location": "Getrequeststepdefinitions.serviceurl(String)"
});
formatter.result({
  "duration": 349095900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.equifax.com/business/credit-trends",
      "offset": 40
    }
  ],
  "location": "Getrequeststepdefinitions.send_the_http_get_request_for_something(String)"
});
formatter.result({
  "duration": 611739400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 39
    }
  ],
  "location": "Getrequeststepdefinitions.verify_the_valid_Http_response_code_is(int)"
});
formatter.result({
  "duration": 6501419000,
  "status": "passed"
});
});