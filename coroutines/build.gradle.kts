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

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("com.github.dcendents.android-maven")
}

android {
    compileSdkVersion(Versions.Android.TARGET_SDK)

    defaultConfig {
        minSdkVersion(Versions.Android.MIN_SDK)
        targetSdkVersion(Versions.Android.TARGET_SDK)
        versionName = Versions.SUITCASE
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Deps.AndroidX.APPCOMPAT)
    implementation(Deps.AndroidX.LIFECYCLE_EXT)
    kapt(Deps.AndroidX.LIFECYCLE_COMPILER)
    api(Deps.Coroutines.ANDROID)
}

// TODO
//    apply from: "https://raw.githubusercontent.com/jguerinet/Gradle-Artifact-Scripts/master/android-kotlin-artifacts.gradle"
