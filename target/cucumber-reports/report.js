$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login",
  "description": "",
  "id": "test-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid data",
  "description": "",
  "id": "test-login;login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is at login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "login is successful and homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_at_login_page()"
});
formatter.result({
  "duration": 15989874100,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_username()"
});
formatter.result({
  "duration": 647762900,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_password()"
});
formatter.result({
  "duration": 170709600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_login_button()"
});
formatter.result({
  "duration": 6285602400,
  "status": "passed"
});
formatter.match({
  "location": "Login.login_is_successful_and_homepage_is_displayed()"
});
formatter.result({
  "duration": 46125400,
  "status": "passed"
});
});