# Koltin multiplatform example
This is a simple example on how to make use of Kotlin multiplatform and import both to iOS and Android projects.

## Usage
In order to run the project you'll need:
- Android Studio 4.1.1
- Xcode 12.2
- java 1.8

### Running the iOS project
Open the workspace from the iOS directory. Pods are commited to the project so it should run out of the box. Mind that as of now the project is configured to run only on iOS simulator.

### Editing Kotlin native code
Whenever you edit the Kotlin native code, the script will automatically rebuild the library. In case of errors, they will be seen in Xcode error log. 

### Running the Android project
Open the project in Android studio and sync gradle, then run the project on Android emulator. 

More info can be found here:
https://kotlinlang.org/docs/mobile/create-first-app.html