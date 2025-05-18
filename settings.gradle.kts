rootProject.name = "quarkus-gradle-cache-bug"

include(":mainproject")
include(":dep")

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories.addAll(pluginManagement.repositories)
}
