plugins {
    id("droidknights.android.feature")
}

android {
    namespace = "com.chattymin.home"
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")
}