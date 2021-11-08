# fmu4j_template

Starter template for building FMUs using FMU4j.

## prerequisite

Download and install a JDK version 8:

* https://adoptopenjdk.net/
* https://docs.aws.amazon.com/de_de/corretto/latest/corretto-8-ug/downloads-list.html
* https://www.openlogic.com/openjdk-downloads
* https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html

### set the JAVA_HOME path:

#### Windows
[instruction for Windows 10](https://www.architectryan.com/2018/08/31/how-to-change-environment-variables-on-windows-10/)
* add the java installation folder (aka JAVA_HOME) and JAVA_HOME\jre\bin\server (should contain libjvm.dll) to the PATH variable

#### Linux
Linux (add to .bashrc)
```
export JAVA_HOME="java installation folder"
export PATH=$JAVA_HOME/bin:$PATH
# $JAVA_HOME/jre/lib/amd64/server should contain libjvm.so
export LD_LIBRARY_PATH=$JAVA_HOME/lib:$JAVA_HOME/jre/lib/amd64/server:$LD_LIBRARY_PATH 
```


## create FMU

1) Implement an instance of `Fmi2Slave`. See https://github.com/Vico-platform/fmu4j_template/blob/main/src/main/java/example/JavaSlave.java
2) Specify the fully qualified class name of the FMUs you have implemented in the `fmu4j` closure in `build.gradle`. Note that multiple FMUs can be implemented and built within the same project.

### Windows

```
gradlew.bat build fmu
```
### Linux

```
./gradlew build fmu
```

This should create the FMU(s) in build/fmus


