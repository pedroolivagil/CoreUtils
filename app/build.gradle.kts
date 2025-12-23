plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.olivadevelop.coreutils"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.olivadevelop.coreutils"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.material.calendarview)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.lottie)
    implementation(libs.preference)
    implementation(libs.work.runtime)
    implementation(libs.picasso)
    implementation(libs.exp4j)
    implementation(libs.activity)
    implementation(libs.legacy.support.v4)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    implementation(libs.room.runtime)
    implementation(libs.commons.lang3)
    annotationProcessor(libs.room.compiler)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.flexbox)
    implementation(libs.gson)
    implementation(libs.play.services.ads)
    implementation(libs.billing)
    implementation(libs.guava)
    implementation(libs.mpandroidchart)
}