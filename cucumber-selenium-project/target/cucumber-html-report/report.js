$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#this is login feature file"
    }
  ],
  "line": 3,
  "name": "to validate upskills application",
  "description": "",
  "id": "to-validate-upskills-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 124000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "to check user registration",
  "description": "",
  "id": "to-validate-upskills-application;to-check-user-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the web application is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on signup",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the firstname is entered",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the lastname is entered",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the email is entered",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the username is entered",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "confirm password is entered",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user signup is successful",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify if firstname and lastname is visible on screen",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "validate email displayed on screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.the_web_application_is_loaded()"
});
formatter.result({
  "duration": 10069821600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_user_clicks_on_signup()"
});
formatter.result({
  "duration": 2219094400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_firstname_is_entered()"
});
formatter.result({
  "duration": 141366600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_lastname_is_entered()"
});
formatter.result({
  "duration": 110791700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_email_is_entered()"
});
formatter.result({
  "duration": 167080200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_username_is_entered()"
});
formatter.result({
  "duration": 118699100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_password_is_entered()"
});
formatter.result({
  "duration": 152690400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.confirm_password_is_entered()"
});
formatter.result({
  "duration": 127570100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_Register_button()"
});
formatter.result({
  "duration": 1581350200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_signup_is_successful()"
});
formatter.result({
  "duration": 394232100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.verify_if_firstname_and_lastname_is_visible_on_screen()"
});
formatter.result({
  "duration": 17237600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_email_displayed_on_screen()"
});
formatter.result({
  "duration": 749566600,
  "status": "passed"
});
formatter.after({
  "duration": 281200,
  "status": "passed"
});
formatter.before({
  "duration": 238100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "to verify compose message",
  "description": "",
  "id": "to-validate-upskills-application;to-verify-compose-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "the web application is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user logins with username",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "enters the password",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user is valid",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user clicks on compose",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "verify compose message page launched",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user enters recepient name",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "enters the subject",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "message is entered",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "send the message",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify acknowledgement is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.the_web_application_is_loaded()"
});
formatter.result({
  "duration": 8727648900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_user_logins_with_username()"
});
formatter.result({
  "duration": 115758500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enters_the_password()"
});
formatter.result({
  "duration": 148970100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clicks_on_login()"
});
formatter.result({
  "duration": 6369332500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_is_valid()"
});
formatter.result({
  "duration": 19508800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_clicks_on_compose()"
});
formatter.result({
  "duration": 2003404800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.verify_compose_message_page_launched()"
});
formatter.result({
  "duration": 18604800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_enters_recepient_name()"
});
formatter.result({
  "duration": 3245082700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enters_the_subject()"
});
formatter.result({
  "duration": 108792000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.message_is_entered()"
});
formatter.result({
  "duration": 6164816100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.send_the_message()"
});
formatter.result({
  "duration": 1888837800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.verify_acknowledgement_is_shown()"
});
formatter.result({
  "duration": 5687320600,
  "status": "passed"
});
formatter.after({
  "duration": 38200,
  "status": "passed"
});
});