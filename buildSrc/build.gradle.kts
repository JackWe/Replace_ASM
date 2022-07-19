import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.5.31"
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.2")
    compileOnly("commons-io:commons-io:2.6")
    compileOnly("commons-codec:commons-codec:1.15")
    compileOnly("org.ow2.asm:asm-commons:7.0")
    compileOnly("org.ow2.asm:asm-tree:7.0")
}