import com.chattymin.convention.configureHiltAndroid
import com.chattymin.convention.configureKotestAndroid
import com.chattymin.convention.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()
