plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "chattymin.android.hilt"
            implementationClass = "com.chattymin.convention.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "chattymin.kotlin.hilt"
            implementationClass = "com.chattymin.convention.HiltKotlinPlugin"
        }
    }
}
