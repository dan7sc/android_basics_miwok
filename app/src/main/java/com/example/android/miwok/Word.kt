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

/**
 * [Word] represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */


class Word constructor(defaultTranslation: String, miwokTranslation: String){
    /**
     * Cosntructor creates a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */

    /** Default translation for the word  */
    private var mDefaultTranslation: String = ""

    /** Miwok translation for the word  */
    private var mMiwokTranslation: String = ""

    /**
     * Get the default translation of the word.
     */
    fun getDefaultTranslation(): String {
        return this.mDefaultTranslation
    }

    /**
     * Get the Miwok translation of the word.
     */
    fun getMiwokTranslation(): String {
        return this.mMiwokTranslation
    }

}

