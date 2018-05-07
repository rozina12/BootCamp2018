@Login
Feature: Admin Login to HRM home page
In order To Login to Orange HRM 
As a Admin with valid Username and Password
I want to Enter Username,Password,click on Login Button to Access to the Account

Scenario: Positive-Admin Login Successfully
Given Admin Navigate to HRM Login page
When Admin Enter valid Usename and Password
And click on Loging Button
Then Admin will Land in Admin home Page

