pluginManagement {
    repositories {
        maven(url = "https://maven.minecraftforge.net/")
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "PotLeaves"
