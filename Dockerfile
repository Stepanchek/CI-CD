FROM eclipse-temurin:18-jdk-jammy

WORKDIR /ci-cd/

COPY . /ci-cd

CMD ["java", "-cp", "./target/ci-cd-test-1.0-SNAPSHOT.jar","org.example.Main"]


