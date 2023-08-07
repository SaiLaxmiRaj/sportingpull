$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Test",
  "description": "As User, I Want navigate SportingBull homepage",
  "id": "homepage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5796878900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Should navigate homepage tab",
  "description": "",
  "id": "homepage-test;user-should-navigate-homepage-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 126030600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iShouldClickOnAcceptCookies()"
});
formatter.result({
  "duration": 475737000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iNavigateHomepage()"
});
formatter.result({
  "duration": 19700,
  "status": "passed"
});
formatter.after({
  "duration": 552700,
  "status": "passed"
});
});