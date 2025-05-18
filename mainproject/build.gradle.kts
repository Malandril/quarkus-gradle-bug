plugins {
    id("io.quarkus")
}

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation("io.quarkus:quarkus-smallrye-health")
    implementation(project(":dep"))
}

listOf(
    tasks.compileQuarkusGeneratedSourcesJava,
    tasks.compileQuarkusTestGeneratedSourcesJava,
    tasks.processQuarkusGeneratedSourcesResources,
    tasks.processQuarkusTestGeneratedSourcesResources,
    tasks.quarkusAppPartsBuild,
    tasks.quarkusBuild,
    tasks.quarkusBuildAppModel,
    tasks.quarkusDependenciesBuild,
    tasks.quarkusGenerateAppModel,
    tasks.quarkusGenerateCode,
    tasks.quarkusGenerateCodeDev,
    tasks.quarkusGeneratedSourcesClasses,
    tasks.quarkusGoOffline,
    tasks.quarkusInfo,
    tasks.quarkusShowEffectiveConfig,
).forEach {
    it.configure {
        inputs.property("version", this.project.version)
    }
}
