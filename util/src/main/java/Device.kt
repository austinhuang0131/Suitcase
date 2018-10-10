/*
 * Copyright 2016-2018 Julien Guerinet
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

package com.guerinet.suitcase.util

import android.os.Build

/**
 * Helper methods relating to the user's device
 * @author Julien Guerinet
 * @since 2.0.0
 */
object Device {

    /**
     * @return True if the OS is Nougat or higher, false otherwise
     */
    @JvmStatic
    fun isAtLeastNougat(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    }

    /**
     * @return True if the OS is Marshmallow or higher, false otherwise
     */
    @JvmStatic
    fun isAtLeastMarshmallow(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
    }

    /**
     * @return True if the OS is Lollipop or higher, false otherwise
     */
    @JvmStatic
    fun isAtLeastLollipop(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
    }

    /**
     * @return Device manufacturer and model
     */
    @JvmStatic
    fun model(): String {
        var model = Build.MODEL
        if (!model.startsWith(Build.MANUFACTURER, true)) {
            model = "${Build.MANUFACTURER} $model"
        }
        return model
    }
}