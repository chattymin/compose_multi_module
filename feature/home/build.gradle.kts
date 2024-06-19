import com.chattymin.convention.setNamespace

plugins {
    id("droidknights.android.feature")
}

android {
    setNamespace("feature.home")
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")
}