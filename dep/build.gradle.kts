plugins {
    id("io.quarkus")
}

dependencies {
    implementation(platform(libs.quarkus.bom))
    implementation("io.quarkus:quarkus-rest-client")
    implementation("io.quarkus:quarkus-smallrye-fault-tolerance")
    implementation("io.quarkus:quarkus-rest-client-jackson")
}
