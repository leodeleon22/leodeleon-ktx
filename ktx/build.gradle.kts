plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinAndroidExtensions)
}
android {
    compileSdkVersion(BuildVersions.target_sdk)
    buildToolsVersion = BuildVersions.build_version
    defaultConfig {
        minSdkVersion(BuildVersions.min_sdk)
        targetSdkVersion(BuildVersions.target_sdk)
        versionCode = 1
        versionName = "0.1"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Deps.Kotlin.stdlib)
}