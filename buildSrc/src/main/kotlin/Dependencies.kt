object BuildVersions {
    const val kotlin = "1.3.71"
    const val min_sdk = 21
    const val target_sdk = 29
    const val android_plugin = "3.6.1"
}

object Release {
    const val versionName = "1.0"
    const val appId = "com.leodeleon.bootstrap"
}

object Classpath {
    const val android = "com.android.tools.build:gradle:${BuildVersions.android_plugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${BuildVersions.kotlin}"
    const val versions = "com.github.ben-manes:gradle-versions-plugin:0.27.0"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val versions = "com.github.ben-manes.versions"
}

object Deps {
    private object Versions {
        const val LIFECYCLE = "2.2.0-rc03"
    }

    object Jetpack {
        private const val NAVIGATION = "2.1.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        const val appcompat = "androidx.appcompat:appcompat:1.1.0"
        const val fragment = "androidx.fragment:fragment:1.1.0"
        const val cardview = "androidx.cardview:cardview:1.0.0"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
        const val ktx = "androidx.core:core-ktx:1.1.0"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$NAVIGATION"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:$NAVIGATION"
    }

    object Google {
        const val material = "com.google.android.material:material:1.2.0-alpha02"
    }

    object Test {
        private const val KOTEST = "4.0.1"
        const val kotest = "io.kotest:kotest-runner-junit5-jvm:$KOTEST"
        const val kotestAssert = "io.kotest:kotest-assertions-core-jvm:$KOTEST"
        const val espresso = "com.android.support.test.espresso:espresso-core:3.0.2"
        const val runner = "com.android.support.test:runner:1.0.2"
    }

    object Utils {
        private const val ADAPTER = "4.0.0"
        const val threeten = "com.jakewharton.threetenabp:threetenabp:1.2.3"
        const val bindingAdapter = "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter:$ADAPTER"
        const val bindingRecycler = "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-recyclerview:$ADAPTER"
    }

    object Splits {
        private const val VERSION = "3.0.0-alpha06"
    }

    object Kapt {
        const val lifecycle = "android.arch.lifecycle:compiler:${Versions.LIFECYCLE}"
        const val databinding = "com.android.databinding:compiler:${BuildVersions.android_plugin}"
    }
}