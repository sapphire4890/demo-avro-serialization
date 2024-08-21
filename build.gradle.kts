import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.davidmc24.gradle.plugin.avro.GenerateAvroJavaTask

plugins {
    id("org.springframework.boot") version "2.6.10"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    id("com.github.davidmc24.gradle.plugin.avro-base") version "1.3.0"
    kotlin("jvm") version "1.6.20"
    kotlin("plugin.spring") version "1.6.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.apache.avro:avro:1.11.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register<GenerateAvroJavaTask>("generateAvro") {
    source("src/main/avro")
    setOutputDir(file("src/main/java"))
}