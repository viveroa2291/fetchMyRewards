# fetchMyRewards

This is my submission for the Fetch Rewards Coding Exercise. 
-----------------------------------------------------------------------------------------------------------------------------------------------------------

I did this in Android Studio and to run this, you need to have Android Studio downloaded and clone the project in order to pull it down on Anrdoid Studio. 

On the Android Studio application, there should be bar on top where it says "GIT" if you're using a Mac and find GITHUB where you could clone the project. The url to clone the project is: https://github.com/viveroa2291/fetchMyRewards.git

From there, you should be able to have access to the whole repository and run the app on the emulator. 

It should be a similar process for a PC computer. 

I did this exercise in Kotlin and down below will be a brief overview of how I completed the exercise. 
-----------------------------------------------------------------------------------------------------------------------------------------------------------

1. The way I did this was I downloaded the Json file from the web into a json file on my local computer and put it inside a file called "Assets", which can be found here: https://github.com/viveroa2291/fetchMyRewards/tree/master/app/src/main/assets

2. From there, in the xml file under the layout folder I created a ListView where it would display all of the data from the Json File onto the app which is in the xml file, in which can be found here: https://github.com/viveroa2291/fetchMyRewards/blob/master/app/src/main/res/layout/activity_main.xml

3. Then I began writing code in the Main Activity for 

- Reading the Json File
- Creating a list array for each piece of data
- Sorting it out by "listId" and "name" from smallest to largest 
- Filtering out any empty and null data in the "name"

which can be found in the Main Activity file here: https://github.com/viveroa2291/fetchMyRewards/blob/master/app/src/main/java/com/example/myapplication/MainActivity.kt

-----------------------------------------------------------------------------------------------------------------------------------------------------------

When testing, it should display the list of an id, listId, and Name (which are item #'s). 
