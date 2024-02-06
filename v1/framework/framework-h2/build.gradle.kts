
dependencies {
    implementation(project(":v1:application"))
    implementation(project(":v1:domain"))

    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("com.h2database:h2")
}