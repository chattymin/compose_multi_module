package com.chattymin.convention

import org.gradle.api.Project
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.assign
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *>,
) {
    val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

    commonExtension.apply {
        buildFeatures.compose = true

        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("compose.compiler").get().requiredVersion
        }
    }

    dependencies {
        // Disabling to work with Alpha
        "api"(platform(libs.findLibrary("compose.bom").get()))
        "implementation"(libs.findBundle("compose").get())
        "debugImplementation"(libs.findBundle("compose.debug").get())
    }
}
