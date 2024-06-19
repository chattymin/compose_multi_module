import com.chattymin.convention.configureCoroutineAndroid
import com.chattymin.convention.configureHiltAndroid
import com.chattymin.convention.configureKotest
import com.chattymin.convention.configureKotlinAndroid

plugins {
    id("com.android.library")
    id("droidknights.verify.detekt")
}

configureKotlinAndroid()
// configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
