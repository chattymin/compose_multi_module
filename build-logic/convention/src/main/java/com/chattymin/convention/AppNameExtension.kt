package com.chattymin.convention

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "com.droidknights.app.$name"
    }
}