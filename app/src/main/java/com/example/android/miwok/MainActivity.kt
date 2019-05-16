/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)

        // Find the View that shows the numbers category
        val numbers = findViewById(R.id.numbers) as TextView?

        // Set a click listener on that View
        numbers!!.setOnClickListener // The code in this method will be executed when the numbers category is clicked on.
        {
            // Create a new intent to open the {@link NumbersActivity}
            val numbersIntent = Intent(this@MainActivity, NumbersActivity::class.java)

            // Start the new activity
            startActivity(numbersIntent)
        }

        // Find the View that shows the family category
        val family = findViewById(R.id.family) as TextView?

        // Set a click listener on that View
        family!!.setOnClickListener // The code in this method will be executed when the family category is clicked on.
        {
            // Create a new intent to open the {@link FamilyActivity}
            val familyIntent = Intent(this@MainActivity, FamilyActivity::class.java)

            // Start the new activity
            startActivity(familyIntent)
        }

        // Find the View that shows the colors category
        val colors = findViewById(R.id.colors) as TextView?

        // Set a click listener on that View
        colors!!.setOnClickListener // The code in this method will be executed when the colors category is clicked on.
        {
            // Create a new intent to open the {@link ColorsActivity}
            val colorsIntent = Intent(this@MainActivity, ColorsActivity::class.java)

            // Start the new activity
            startActivity(colorsIntent)
        }

        // Find the View that shows the phrases category
        val phrases = findViewById(R.id.phrases) as TextView?

        // Set a click listener on that View
        phrases!!.setOnClickListener // The code in this method will be executed when the phrases category is clicked on.
        {
            // Create a new intent to open the {@link PhrasesActivity}
            val phrasesIntent = Intent(this@MainActivity, PhrasesActivity::class.java)

            // Start the new activity
            startActivity(phrasesIntent)
        }
    }
}
