/*
 * Copyright 2016-2019 Julien Guerinet
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

package com.guerinet.room.converter

import androidx.room.TypeConverter

/**
 * Base converter to convert an object to a String and vice-versa for Room
 * @author Julien Guerinet
 * @since 4.2.0
 */
abstract class BaseConverter<T> {

    /**
     * Converts the [value] to a String. The default implementation is to call [toString].
     *  This can be overridden.
     */
    @TypeConverter
    open fun toString(value: T?): String? = value?.toString()

    /**
     * Converts the [value] to a [T]. If the [value] is null or empty, the returned [T] is null.
     *  If not, this called [objectFromString]. This can be overridden.
     */
    @TypeConverter
    open fun fromString(value: String?): T? =
        if (value.isNullOrEmpty()) null else objectFromString(value)

    /**
     * Converts the [value] to a [T]
     */
    abstract fun objectFromString(value: String): T?
}
