plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    //plugin for firebase
    alias(libs.plugins.google.gms.google.services)
    //for apps distribution to testers in firebase
    alias(libs.plugins.google.firebase.appdistribution)
}

android {
    namespace = "com.lakshay.notificationsmodule"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.lakshay.notificationsmodule"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    //for notifications
    implementation(libs.firebase.messaging)
    //for analytics
    implementation(libs.firebase.analytics)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}