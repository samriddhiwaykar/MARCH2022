Feature: Login functionality


Background: Successfully cancelled initial Login  page
When User open "Chrome" browser with exe as "F:\\Automation support\chromedriver.exe"
When User enter URL as "https://www.flipkart.com/"
When User cancel initial Login window

Scenario: Login functionality with valid credentials
When user navigate on Login button
When user click on MyProfile
When user enter "9767608638" as username
When user enter "123@abc" as password
When user click on Login button
Then Application shows user profile to user


Scenario: Login functionality by using invalid username and valid password 
When user navigate on Login button
When user click on MyProfile
When user enter "ABCDE" as username
When user enter "123@abc" as password
When user click on Login button
Then Application shows appropriate error message
Then browser close



Scenario: Login functionality by using valid username and invalid password 
When user navigate on Login button
When user click on MyProfile
When user enter "9767608638" as username
When user enter "abc@123" as password
When user click on Login button
Then Application shows appropriate error message
Then browser close