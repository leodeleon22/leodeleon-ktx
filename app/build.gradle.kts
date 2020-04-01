import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion (BuildVersions.target_sdk)
    defaultConfig {
        applicationId = Release.appId
        minSdkVersion(BuildVersions.min_sdk)
        targetSdkVersion(BuildVersions.target_sdk)
        versionCode = 1
        versionName = Release.versionName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    dataBinding {
        isEnabled = true
    }
}

kapt {
    useBuildCache = true
}

tasks.withType<Test> {
    useJUnitPlatform()
}

//To see which deps need to update run: ./gradlew dependencyUpdates -Drevision=release
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    implementation(Deps.Google.material)
    implementation(Deps.Jetpack.navigationUI)
    implementation(Deps.Jetpack.navigationFragment)
    implementation(Deps.Jetpack.constraint)
    implementation(Deps.Jetpack.appcompat)
    implementation(Deps.Jetpack.fragment)
    implementation(Deps.Jetpack.cardview)
    implementation(Deps.Jetpack.viewModel)
    implementation(Deps.Jetpack.liveData)
    implementation(Deps.Jetpack.ktx)
    implementation(Deps.Utils.threeten)
    implementation(Deps.Utils.bindingAdapter)
    implementation(Deps.Utils.bindingRecycler)
    kapt(Deps.Kapt.lifecycle)
    kapt(Deps.Kapt.databinding)
    testImplementation(Deps.Test.kotest)
    testImplementation(Deps.Test.kotestAssert)
    androidTestImplementation(Deps.Test.runner)
    androidTestImplementation(Deps.Test.espresso)
}
