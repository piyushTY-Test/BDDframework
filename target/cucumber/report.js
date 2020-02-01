$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/CucumberQk/featurefiles/add.feature");
formatter.feature({
  "name": "User wants to provide add function for the calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "calculator exists",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.calculator_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add two numbers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fast"
    }
  ]
});
formatter.step({
  "name": "add is called with two numbers",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.add_is_called_with_two_numbers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "result is the addition of the two number",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.result_is_the_addition_of_the_two_number()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/CucumberQk/featurefiles/googleSearch.feature");
formatter.feature({
  "name": "Google Searching",
  "description": "  As a web surfer, I want to search Google, so that I can learn new things.",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a web browser is on the Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.a_web_browser_is_on_the_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Simple Google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fast"
    }
  ]
});
formatter.step({
  "name": "the search phrase \"cpaat\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.the_search_phrase_is_entered(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"cpaat\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.results_for_are_shown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a web browser is on the Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.a_web_browser_is_on_the_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Simple Google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fast"
    }
  ]
});
formatter.step({
  "name": "the search phrase \"QualityKiosk\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchSteps.the_search_phrase_is_entered(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"QualityKiosk\" are shown",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.results_for_are_shown(String)"
});
formatter.result({
  "status": "passed"
});
});