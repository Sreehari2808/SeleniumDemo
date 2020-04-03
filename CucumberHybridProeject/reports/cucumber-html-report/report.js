$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "orangeHrm website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "launch the broswer and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter the \"\u003cusername1\u003e\" and \"\u003cpassword1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the login button",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 14,
      "id": "orangehrm-website;validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 15,
      "id": "orangehrm-website;validate-the-login-functionality;;2"
    },
    {
      "cells": [
        "admin",
        "Admin124"
      ],
      "line": 16,
      "id": "orangehrm-website;validate-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "launch the broswer and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter the \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Login.launch_the_broswer_and_enter_the_url()"
});
formatter.result({
  "duration": 1095765700,
  "error_message": "java.lang.NoSuchMethodError: com.google.common.base.Preconditions.checkState(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:124)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:329)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.baseClass.LibraryClass_orangehrmProject.launchApp(LibraryClass_orangehrmProject.java:32)\r\n\tat com.stepdefinition.Definition_Login.launch_the_broswer_and_enter_the_url(Definition_Login.java:22)\r\n\tat ✽.Given launch the broswer and enter the url(src/test/resources/Feature/Testcase.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Definition_Login.login_page_is_opened()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 11
    },
    {
      "val": "admin123",
      "offset": 23
    }
  ],
  "location": "Definition_Login.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_Login.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "launch the broswer and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "enter the \"admin\" and \"Admin124\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Login.launch_the_broswer_and_enter_the_url()"
});
formatter.result({
  "duration": 14219500,
  "error_message": "java.lang.NoSuchMethodError: com.google.common.base.Preconditions.checkState(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:124)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:329)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.baseClass.LibraryClass_orangehrmProject.launchApp(LibraryClass_orangehrmProject.java:32)\r\n\tat com.stepdefinition.Definition_Login.launch_the_broswer_and_enter_the_url(Definition_Login.java:22)\r\n\tat ✽.Given launch the broswer and enter the url(src/test/resources/Feature/Testcase.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Definition_Login.login_page_is_opened()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "Admin124",
      "offset": 23
    }
  ],
  "location": "Definition_Login.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_Login.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "search a directory menu",
  "description": "",
  "id": "orangehrm-website;search-a-directory-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc_02_Directory"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "launch the orangehrm appliction",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "click on the Directory",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "search with name and click seach button",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Directory.launch_the_orangehrm_appliction()"
});
formatter.result({
  "duration": 7910400,
  "error_message": "java.lang.NoSuchMethodError: com.google.common.base.Preconditions.checkState(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:124)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:329)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.baseClass.LibraryClass_orangehrmProject.launchApp(LibraryClass_orangehrmProject.java:32)\r\n\tat com.stepdefinition.Definition_Directory.launch_the_orangehrm_appliction(Definition_Directory.java:22)\r\n\tat ✽.Given launch the orangehrm appliction(src/test/resources/Feature/Testcase.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Definition_Directory.click_on_the_Directory()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_Directory.search_with_name_and_click_seach_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "To add a job title",
  "description": "",
  "id": "orangehrm-website;to-add-a-job-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@tc_03_jobtitle"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "launch the orangehrm page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "click on Admin menu",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click on job title in the job dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click on add button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "fill the details and save",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_jobtitle.launch_the_orangehrm_page()"
});
formatter.result({
  "duration": 8456900,
  "error_message": "java.lang.NoSuchMethodError: com.google.common.base.Preconditions.checkState(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:124)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:32)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:329)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.baseClass.LibraryClass_orangehrmProject.launchApp(LibraryClass_orangehrmProject.java:32)\r\n\tat com.stepdefinition.Definition_jobtitle.launch_the_orangehrm_page(Definition_jobtitle.java:24)\r\n\tat ✽.Given launch the orangehrm page(src/test/resources/Feature/Testcase.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Definition_jobtitle.click_on_Admin_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_jobtitle.click_on_job_title_in_the_job_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_jobtitle.click_on_add_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_jobtitle.fill_the_details_and_save()"
});
formatter.result({
  "status": "skipped"
});
});