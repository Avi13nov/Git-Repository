Feature: Validate Add place Api

Scenario: Verify place is sucessfully added in API
Given Add place payload
When User call Add Place Api with POST Http request
Then Response status code 200
And Staus in response is OK


