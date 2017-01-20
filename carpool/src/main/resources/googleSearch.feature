Feature: Search Google for my name
story as you like
Scenario: Search Google with my name with success information
Given employee "Naveen" enter the details like "office" as source, "Home" as destination and time is "5:30pm"
And his email is "naveen@gmail.com" and phone is "99999999"
When click on "share" button
Then data get saved and message "Posting was successful." get displayed with "OK" button
And clicking on "OK" will take him to "home" page