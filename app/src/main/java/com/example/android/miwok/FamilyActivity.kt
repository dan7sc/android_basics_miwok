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
import android.widget.ListView


class FamilyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word>()

        words.add(Word("father", "әpә", R.drawable.family_father))
        words.add(Word("mother", "әṭa", R.drawable.family_mother))
        words.add(Word("son", "angsi", R.drawable.family_son))
        words.add(Word("daughter", "tune", R.drawable.family_daughter))
        words.add(Word("older brother", "taachi", R.drawable.family_older_brother))
        words.add(Word("younger brother", "chalitti", R.drawable.family_younger_brother))
        words.add(Word("older sister", "teṭe", R.drawable.family_older_sister))
        words.add(Word("younger sister", "kolliti", R.drawable.family_younger_sister))
        words.add(Word("grandmother", "ama", R.drawable.family_grandmother))
        words.add(Word("grandfather", "paapa", R.drawable.family_grandfather))

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        val adapter = WordAdapter(this, words, R.color.category_family)

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        val listView = findViewById(R.id.list) as ListView?

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView!!.setAdapter(adapter);
    }
}
