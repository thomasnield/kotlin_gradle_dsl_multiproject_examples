

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

allprojects {
    dependencies {
        implementation(kotlin("stdlib"))
        compile("io.reactivex.rxjava2:rxjava:2.2.7")
    }
}