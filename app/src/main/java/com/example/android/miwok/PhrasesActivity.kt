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


class PhrasesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word>()

        words.add(Word("Where are you going?", "minto wuksus", 0))
        words.add(Word("What is your name?", "tinnә oyaase'nә", 0))
        words.add(Word("My name is...", "oyaaset...", 0))
        words.add(Word("How are you feeling?", "michәksәs?", 0))
        words.add(Word("I’m feeling good.", "kuchi achit", 0))
        words.add(Word("Are you coming?", "әәnәs'aa?", 0))
        words.add(Word("Yes, I’m coming.", "hәә’ әәnәm", 0))
        words.add(Word("I’m coming.", "әәnәm", 0))
        words.add(Word("Let’s go.", "yoowutis", 0))
        words.add(Word("Come here.", "әnni'nem", 0))

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        val adapter = WordAdapter(this, words)

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        val listView = findViewById(R.id.list) as ListView?

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView!!.setAdapter(adapter);
    }
}
