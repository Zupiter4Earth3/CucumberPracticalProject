@BackgroundColorFeature
Feature: Techfios background color change functionality validation 

@Scenario1
Scenario: Sky Blue Background
Given "Set SkyBlue Background" button exists 
When  I click on the button "SkyBlue" 
Then the background color will change to sky blue


@Scenario2
Scenario: White Background Change
Given "Set SkyWhite Background" button exists
When I click on the button "White"
Then the background color will change to white
