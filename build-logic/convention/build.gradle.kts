plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        create("android-application") {
            id = "compose.application"
            implementationClass = "com.chattymin.convention.AndroidApplicationPlugin"
        }
        create("android-feature") {
            id = "compose.feature"
            implementationClass = "com.chattymin.convention.AndroidFeaturePlugin"
        }
        create("android-kotlin") {
            id = "compose.kotlin"
            implementationClass = "com.chattymin.convention.AndroidKotlinPlugin"
        }
        create("android-hilt") {
            id = "compose.hilt"
            implementationClass = "com.chattymin.convention.AndroidHiltPlugin"
        }
        create("android-compose") {
            id = "compose.compose"
            implementationClass = "com.chattymin.convention.AndroidComposePlugin"
        }
        create("android-test") {
            id = "compose.test"
            implementationClass = "com.chattymin.convention.AndroidTestPlugin"
        }
        create("junit5") {
            id = "compose.junit5"
            implementationClass = "com.chattymin.convention.JUnit5Plugin"
        }
        create("kotlin-serialization") {
            id = "compose.serialization"
            implementationClass = "com.chattymin.convention.KotlinSerializationPlugin"
        }
        create("kotlin") {
            id = "compose.kotlin"
            implementationClass = "com.chattymin.convention.KotlinJvmPlugin"
        }
        create("retrofit") {
            id = "compose.retrofit"
            implementationClass = "com.chattymin.convention.RetrofitPlugin"
        }
    }
}
