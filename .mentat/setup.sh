#!/bin/bash

# Check for Java
if ! command -v java &> /dev/null; then
    echo "Error: Java is not installed. Please install OpenJDK 11 or later."
    echo "Example installation on Ubuntu: sudo apt-get install openjdk-11-jdk"
    echo "Example installation on macOS: brew install openjdk@11"
    exit 1
fi

# Set JAVA_HOME if not already set
if [ -z "$JAVA_HOME" ] && [ -x /usr/bin/java ]; then
    export JAVA_HOME=$(readlink -f /usr/bin/java | sed "s:/bin/java::")
fi

# Download and install Google Java Format
mkdir -p tools
if [ ! -f tools/google-java-format.jar ]; then
  curl -L https://github.com/google/google-java-format/releases/download/v1.17.0/google-java-format-1.17.0-all-deps.jar -o tools/google-java-format.jar
fi

# Make Gradle wrapper executable
chmod +x ./gradlew

# Run Gradle wrapper to download dependencies
./gradlew --no-daemon dependencies
