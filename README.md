# Rock-Paper-Scissor
[![Build Status](https://travis-ci.com/cristianodiniz/RockPaperScissorKotlin.svg?branch=master)](https://travis-ci.com/cristianodiniz/RockPaperScissorKotlin)
[![Crates.io](https://img.shields.io/crates/l/rustc-serialize)](https://raw.githubusercontent.com/cristianodiniz/RockPaperScissorKotlin/master/LICENSE)

This project is a simple example of implementation of the game Rock, Paper, and Scissor using Kotlin language.

https://en.wikipedia.org/wiki/Rock-paper-scissors

## Technology and Requisites

| Name                    | Version                                          |
| ----------------------- | --------------------------------------------------- |
| Kotlin                  | 1.3.50                                           |
| Java SDK                | 8                                                |
| Junit                   | 4.12                                             |
| jupiter Junit           | 5.4.2                                            |
| jupiter Junit engine    | 5.4.2                                            |
| Travis-CI               | -                                                |

## Project Structure
 
```
RockPaperScissorKotlin
├─ .gitignore
├─ .travis.yml
├─ LICENSE
├─ README.md
├─ build
├─ build.gradle
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
├─ settings.gradle
└─ src
   ├─ main
   │  ├─ java
   │  ├─ kotlin
   │  │  ├─ Demo.kt
   │  │  ├─ RockPaperScissor.kt
   │  │  ├─ enums
   │  │  │  └─ enumsFile.kt
   │  │  └─ exceptions
   │  │     └─ exceptionsFile.kt
   │  └─ resources
   └─ test
      ├─ java
      ├─ kotlin
      │  └─ RockPaperScissorKtTest.kt
      └─ resources

```

## How to run with IntelliJ

- 1 - Clone the project
- 2 - Open IntelliJ
- 3 - Go to menu
       -> New -> Project from existing source
- 4 - On Import Project from external model selected Gradle
- 5 - Go to ./src/main/kotlin/Demo.kt at the "Project Explore"
- 6 - Run "main" function


## Author

Cristiano Diniz Pinto, cristianodp@gmail.com

## License
Chamada is available under the Apache License 2.0. See the LICENSE file for more info.
