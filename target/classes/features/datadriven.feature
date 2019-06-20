Feature: Multiple data submitform
Scenario Outline: Fillform
Given Launch the Browser
Then Enter url https://www.seleniumeasy.com/test/input-form-demo.html
When Enter First Name <firstname>
Then Enter Last Name <lastname>
Then Enter E-Mail <email>
Then Enter Phone# <phone>
Then Enter Address <address>
Then Enter City <city>
Then Enter State <state>
Then Enter Zip Code <zip>
Then Enter Website <website>
Then Enter Hosting
Then Enter Project Description <pd>
Then Enter Click the button Send
Examples:
|firstname|lastname|email|phone|address|city|state|zip|website|pd|
|Nazir|deen|nzr@gmail|5555|pondicherry|pondy|TN|655|www|welcome|
|Divya|vidhya|vdy@gmail|7777|cuddalore|kudaloore|Dubai|000|zzz|goback|
