Feature: Valiadting the routes of two location

Scenario: Verify the direction from Mumbai to Nagpur
  Given user is on google map
  When user enter the "Mumbai"
  And user enter "Nagpur" and click on search
  Then verify the direction are displayed