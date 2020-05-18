$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("postRequestwithmultipledata.feature");
formatter.feature({
  "line": 2,
  "name": "TO verify Api POST request with multiple test data",
  "description": "",
  "id": "to-verify-api-post-request-with-multiple-test-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Postwithmultipledata"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify POST request response and response body",
  "description": "",
  "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Submit a \"\u003cRequest Type\u003e\" Request with data \"\u003cendpoint\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify the Http status code of Request Submitted \"200\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;",
  "rows": [
    {
      "cells": [
        "Request Type",
        "endpoint"
      ],
      "line": 12,
      "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;;1"
    },
    {
      "cells": [
        "POST",
        "http://dummy.restapiexample.com/api/v1/create"
      ],
      "line": 13,
      "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;;2"
    },
    {
      "cells": [
        "POST",
        "http://dummy.restapiexample.com/api/v1/create"
      ],
      "line": 14,
      "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "To verify POST request response and response body",
  "description": "",
  "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Postwithmultipledata"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Submit a \"POST\" Request with data \"http://dummy.restapiexample.com/api/v1/create\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify the Http status code of Request Submitted \"200\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "POST",
      "offset": 10
    },
    {
      "val": "http://dummy.restapiexample.com/api/v1/create",
      "offset": 35
    }
  ],
  "location": "postRequestwithdatadriven.submit_a_something_request_with_data_something(String,String)"
});
formatter.result({
  "duration": 1251556700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "postRequestwithdatadriven.verify_the_http_status_code_of_request_submitted_something(String)"
});
formatter.result({
  "duration": 2725818600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To verify POST request response and response body",
  "description": "",
  "id": "to-verify-api-post-request-with-multiple-test-data;to-verify-post-request-response-and-response-body;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Postwithmultipledata"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Submit a \"POST\" Request with data \"http://dummy.restapiexample.com/api/v1/create\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify the Http status code of Request Submitted \"200\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "POST",
      "offset": 10
    },
    {
      "val": "http://dummy.restapiexample.com/api/v1/create",
      "offset": 35
    }
  ],
  "location": "postRequestwithdatadriven.submit_a_something_request_with_data_something(String,String)"
});
formatter.result({
  "duration": 3350400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "postRequestwithdatadriven.verify_the_http_status_code_of_request_submitted_something(String)"
});
formatter.result({
  "duration": 2407918300,
  "status": "passed"
});
});