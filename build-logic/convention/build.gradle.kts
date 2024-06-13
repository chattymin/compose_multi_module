plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("AndroidApplicationPlugin") {
            id = "done.plugin.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("AndroidApplicationComposePlugin") {
            id = "done.plugin.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
    }
}
