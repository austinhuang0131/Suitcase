/*
 * Copyright 2016-2021 Julien Guerinet
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

object Versions {

    const val SUITCASE = "6.0.0"
    const val KOTLIN = "1.4.31"

    object Plugins {
        const val ANDROID = "4.1.3"
        const val ANDROID_MAVEN = "2.1"
    }

    const val COROUTINES = "1.4.2-native-mt"
    const val DESUGAR_JDK_LIBS = "1.0.9"
    const val FIREBASE = "27.1.0"
    const val FIREBASE_API = "18.0.3" // as required by above
    const val KOIN = "2.2.2"
    const val KOTLINX_DATE_TIME = "0.2.0"
    const val MATERIAL_DIALOGS = "3.3.0"
    const val OKIO = "2.10.0"
    const val TIMBER = "4.7.1"

    object AndroidX {
        const val ANNOTATION = "1.2.0"
        const val APPCOMPAT = "1.2.0"
        const val BROWSER = "1.3.0"
        const val CONTENT = "1.0.0"
        const val CORE_KTX = "1.3.2"
        const val LIFECYCLE = "2.3.1"
        const val RECYCLERVIEW = "1.2.0"
        const val ROOM = "2.3.0"
    }

    object Android {
        const val MIN_SDK = 21
        const val TARGET_SDK = 30
    }
}

object Deps {

    object Plugins {
        const val ANDROID = "com.android.tools.build:gradle:${Versions.Plugins.ANDROID}"
        const val ANDROID_MAVEN =
            "com.github.dcendents:android-maven-gradle-plugin:${Versions.Plugins.ANDROID_MAVEN}"
    }

    const val DESUGAR_JDK_LIBS = "com.android.tools:desugar_jdk_libs:${Versions.DESUGAR_JDK_LIBS}"
    const val KOTLINX_DATE_TIME =
        "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.KOTLINX_DATE_TIME}"
    const val MATERIAL_DIALOGS = "com.afollestad.material-dialogs:core:${Versions.MATERIAL_DIALOGS}"
    const val OKIO = "com.squareup.okio:okio:${Versions.OKIO}"
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"

    object Coroutines {
        const val ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    }

    object Firebase {
        private const val BASE = "com.google.firebase:firebase"
        const val BOM = "$BASE-bom:${Versions.FIREBASE}"
        const val ANALYTICS = "$BASE-analytics-ktx:${Versions.FIREBASE_API}"
    }

    object Koin {
        const val ANDROID = "org.koin:koin-android:${Versions.KOIN}"
        const val CORE = "org.koin:koin-core:${Versions.KOIN}"
    }

    object AndroidX {
        private const val BASE = "androidx"
        const val ANNOTATION = "$BASE.annotation:annotation:${Versions.AndroidX.ANNOTATION}"
        const val APPCOMPAT =
            "$BASE.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
        const val BROWSER = "$BASE.browser:browser:${Versions.AndroidX.BROWSER}"
        const val CONTENT = "$BASE.appcompat:appcompat:${Versions.AndroidX.CONTENT}"
        const val CORE_KTX = "$BASE.core:core-ktx:${Versions.AndroidX.CORE_KTX}"
        const val RECYCLERVIEW = "$BASE.recyclerview:recyclerview:${Versions.AndroidX.RECYCLERVIEW}"
        const val LIFECYCLE = "$BASE.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.LIFECYCLE}"
        const val LIFECYCLE_COMPILER =
            "$BASE.lifecycle:lifecycle-compiler:${Versions.AndroidX.LIFECYCLE}"
        const val LIFECYCLE_LIVEDATA =
            "$BASE.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.LIFECYCLE}"
        const val ROOM = "$BASE.room:room-runtime:${Versions.AndroidX.ROOM}"
        const val ROOM_COMPILER = "$BASE.room:room-compiler:${Versions.AndroidX.ROOM}"
    }
}
