#this is login feature file
@sanity @login
Feature: to validate upskills application

  Scenario: to check user registration
    Given the web application is loaded
    When the user clicks on signup
    And the firstname is entered
    And the lastname is entered
    And the email is entered
    And the username is entered
    And the password is entered
    And confirm password is entered
    And user clicks on Register button
    When user signup is successful
    Then verify if firstname and lastname is visible on screen
    And validate email displayed on screen

  Scenario: to verify compose message
    Given the web application is loaded
    When the user logins with username
    And enters the password
    And clicks on login
    When user is valid
    When user clicks on compose
    Then verify compose message page launched
    When user enters recepient name
    And enters the subject
    And message is entered
    And send the message
    Then verify acknowledgement is shown
