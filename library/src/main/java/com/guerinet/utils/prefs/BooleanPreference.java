/*
 * Copyright 2016 Julien Guerinet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.guerinet.utils.prefs;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;

/**
 * Preference utility class for booleans
 * @author Julien Guerinet
 * @since 1.0.0
 */
public class BooleanPreference extends BasePreference {
    /**
     * Default value
     */
    protected final boolean defaultValue;

    /**
     * Default Constructor
     *
     * @param prefs         {@link SharedPreferences} instance
     * @param key           Key under which the pref should be stored
     * @param defaultValue  Default value
     */
    public BooleanPreference(@NonNull SharedPreferences prefs, @NonNull String key,
            boolean defaultValue) {
        super(prefs, key);
        this.defaultValue = defaultValue;
    }

    /**
     * @return Current value of this boolean, defaulting to the default value
     */
    public boolean get() {
        return prefs.getBoolean(key, defaultValue);
    }

    /**
     * Sets the value in the {@link SharedPreferences}
     *
     * @param value New value to save
     */
    public void set(boolean value) {
        prefs.edit()
                .putBoolean(key, value)
                .apply();
    }
}
