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

# Make Gradle wrapper executable
chmod +x ./gradlew

# Format Java code
find . -name "*.java" -not -path "./build/*" -not -path "./app/build/*" -exec java -jar tools/google-java-format.jar --replace {} \;

# Run Android lint
./gradlew --no-daemon lint

# Run unit tests since no CI was found
./gradlew --no-daemon test
