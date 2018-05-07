@Login2
Feature: AdminLogin to HRM home page
In order To Loginto Orange HRM 
As a Admin with validUsername and Password
I want to EnterUsername,Password,click on Login Button to Access to the Account

Scenario: Positive- AdminLogin Successfully
Given Admin Navigateto HRM Login page
When Admin Entervalid Usename and Password
And click on LogingButton
Then Admin will Land in Adminhome Page
