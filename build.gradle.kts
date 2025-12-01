plugins {
    kotlin("jvm") version "2.2.20"
}

group = "net.joshuabrandes"
version = "1.0-SNAPSHOT"

val aocVersion = "1.1.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.toldoven.aoc:aoc-kotlin-notebook:$aocVersion")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}