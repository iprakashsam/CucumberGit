@adactinpage @regression @sanity
Feature: To validate the adactin login page

Background:
Given user is in adactin login page

Scenario: To validate adactin page 

When user enter valid username and password in adactin page
|GnanaPrakash|holonext44|
And user click the login button in adactin page
And user enters the second page and search hotel
And user enters the third page and select hotel
And user enters the fourth page and book hotel
Then user enters the last page and booking details is displayed
