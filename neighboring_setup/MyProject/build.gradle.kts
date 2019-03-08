


plugins {
    kotlin("jvm") version "1.3.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    compile(project(":ModuleA"))
    compile(project(":ModuleB"))
}