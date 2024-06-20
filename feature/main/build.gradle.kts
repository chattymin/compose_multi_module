import com.chattymin.convention.setNamespace

plugins {
    alias(libs.plugins.chattymin.feature)
}

android {
    setNamespace("feature.main")
}

dependencies {
}
