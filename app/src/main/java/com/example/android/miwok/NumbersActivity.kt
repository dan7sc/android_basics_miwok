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

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView

class NumbersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        // Create an array of words
        var words: ArrayList<String> = ArrayList(10)
        words.add("one")
        words.add("two")
        words.add("three")
        words.add("four")
        words.add("five")
        words.add("six")
        words.add("seven")
        words.add("eight")
        words.add("nine")
        words.add("ten")

        // Find the root view of the whole layout
        var rootView: LinearLayout = findViewById(R.id.rootView) as LinearLayout
        for (index: Int in words.indices) {
            // Create a new TextView
            var wordView: TextView = TextView(this)
            // Set the text to be word at the current index
            wordView.setText(words.get(index))
            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView)
        }

        Log.v("NumbersActivity", "Word at index 0: " + words[0])
        Log.v("NumbersActivity", "Word at index 9: " + words[9])
    }
}
