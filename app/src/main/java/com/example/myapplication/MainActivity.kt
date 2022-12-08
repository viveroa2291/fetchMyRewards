package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    var final_arr = arrayListOf<String>()

    private lateinit var firstListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readJson()
    }
    fun readJson() {
        var json: String? = null

        try {
            val inputStream: InputStream = assets.open("fetch.json")
            json = inputStream.bufferedReader().use{it.readText()} // Reading the file as a text
            firstListView = findViewById(R.id.json_list)

            var jsonarr = JSONArray(json)
            var maxGroup: Int = 0 // Declaration for the MaxGroup Number
            var maxItem: Int = 0 // Declaration for the maxItem number

            // For loop to get the max number of the groups
            for(i in 0..jsonarr.length()-1) {
                var jsonobj = jsonarr.getJSONObject(i)

                if(maxGroup < jsonobj.getString("listId").toInt()) {
                    maxGroup = jsonobj.getString("listId").toInt()
                }
            }
            for(j in 1..maxGroup) {
                // For loop for the max Item Number
                for(i in 0..jsonarr.length()-1) {
                    var jsonobj = jsonarr.getJSONObject(i)

                    if(jsonobj.getString("name") != "null" && jsonobj.getString("name") != "" && jsonobj.getString("listId").toInt() == j) { // Filters out Blank and Null on names.
                        if(maxItem < jsonobj.getString("id").toInt() && jsonobj.getString("name") != "null") {
                            maxItem = jsonobj.getString("id").toInt()
                        }
                    }
                }
                // Adding the ordered lists onto the final array list
                for(k in 0..maxItem) {
                    for(a in 0..jsonarr.length()-1) {
                        var jsonobj = jsonarr.getJSONObject(a)

                        if(jsonobj.getString("name") != "null" && jsonobj.getString("name") != "" && jsonobj.getString("listId").toInt() == j && jsonobj.getString("id").toInt() == k) { // Filters out Blank and Null on names.
                            final_arr.add("id: " + jsonobj.getString("id") + "\nList id: " + jsonobj.getString("listId") + "\nName: " + jsonobj.getString("name"))
                        }
                    }
                }
                maxItem = 0 // 0 for the next listId number
            }

            var adpt = ArrayAdapter(this, android.R.layout.simple_list_item_1, final_arr)
            firstListView.adapter = adpt
        }
        catch (e : IOException) { }
    }
}