Feature: Share my ride
story as you like
Scenario: Valid post with success message
Given employee "Naveen" enter the details like "office" as source, "Home" as destination and time is "5:30pm"
And his email is "naveen@gmail.com" and phone is "99999999"
When click on "share" button
Then data get saved and message "Posting was successful." get displayed with "OK" button
And clicking on "OK" will take him to "home" page

Scenario: Valid post with failure message
Given employee "Naveen" enter the details like "office" as source, "Home" as destination and time is "5:30pm"
And his email is "naveen@gmail.com"
When click on "share" button
Then data get saved and message "Mandatory Input Data was missing." get displayed with "OK" button
And clicking on "OK" will take him to "home" page