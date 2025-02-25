#!/bin/bash

# Download and install Google Java Format
mkdir -p tools
if [ ! -f tools/google-java-format.jar ]; then
  curl -L https://github.com/google/google-java-format/releases/download/v1.17.0/google-java-format-1.17.0-all-deps.jar -o tools/google-java-format.jar
fi

# Make Gradle wrapper executable
chmod +x ./gradlew

# Run Gradle wrapper to download dependencies
./gradlew --no-daemon dependencies
