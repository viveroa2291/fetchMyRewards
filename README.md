# fetchMyRewards

This is my submission for the Fetch Rewards Coding Exercise. 

I did this in Android Studio and to run this, you need to have Android Studio downloaded and clone the project and pull it down on Anrdoid Studio. 

From there, you should be able to have access to the whole repository and run the app on the emulator. 
-----------------------------------------------------------------------------------------------------------------------------------------------------------

The way I did this was I downloaded the Json file from the web onto a json file on my local computer and put it inside a file called "Assets", which can be found here: https://github.com/viveroa2291/fetchMyRewards/tree/master/app/src/main/assets

From there, I created a ListView in the the layout folder where it would display all of the data from the Json File onto the app which is in the xml file, in which can be found here: https://github.com/viveroa2291/fetchMyRewards/blob/master/app/src/main/res/layout/activity_main.xml

Then I began writing code for reading the Json File and creating a list array for each piece of data and sorted it out by List Id and Name from smallest to largest which can be found in the Main Activity file here: https://github.com/viveroa2291/fetchMyRewards/blob/master/app/src/main/java/com/example/myapplication/MainActivity.kt

-----------------------------------------------------------------------------------------------------------------------------------------------------------

When testing, it should display the list of an id, listId, and Name (which are item #'s). 
