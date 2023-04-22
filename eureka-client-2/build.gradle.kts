plugins {
    java
    id("org.springframework.boot") version "2.7.11"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "ru.javabegin.micro.demo"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2021.0.6"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
