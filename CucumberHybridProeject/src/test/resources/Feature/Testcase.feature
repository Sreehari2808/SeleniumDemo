@orangeHRM
Feature: orangeHrm website


@tc_01_login
Scenario Outline: validate the login functionality

Given launch the broswer and enter the url
When login page is opened
Then enter the "<username1>" and "<password1>"
And click the login button

Examples:
|username1    |password1 |
|Admin		 |admin123 |
|admin       |Admin124 |


@tc_02_Directory
Scenario: search a directory menu
 Given launch the orangehrm appliction
Then click on the Directory 
And search with name and click seach button


@tc_03_jobtitle
Scenario: To add a job title
Given launch the orangehrm page
Then click on Admin menu
Then click on job title in the job dropdown
Then click on add button
And fill the details and save
