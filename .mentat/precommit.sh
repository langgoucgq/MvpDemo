#!/bin/bash

# Make Gradle wrapper executable
chmod +x ./gradlew

# Format Java code
find . -name "*.java" -not -path "./build/*" -not -path "./app/build/*" -exec java -jar tools/google-java-format.jar --replace {} \;

# Run Android lint
./gradlew --no-daemon lint

# Run unit tests since no CI was found
./gradlew --no-daemon test
