# fmu4j_template

Starter template for building FMUs using FMU4j.

## prerequisite

Download and install a JDK version 8:

* https://adoptopenjdk.net/
* https://docs.aws.amazon.com/de_de/corretto/latest/corretto-8-ug/downloads-list.html
* https://www.openlogic.com/openjdk-downloads

### set the JAVA_HOME path:

#### Windows
[instruction for Windows 10](https://www.architectryan.com/2018/08/31/how-to-change-environment-variables-on-windows-10/)
* add the java installation folder (aka JAVA_HOME) and JAVA_HOME\jre\bin\server (should contain libjvm.dll) to the PATH variable

#### Linux
Linux (add to .bashrc)
```
export JAVA_HOME="java installation folder"
export PATH=$JAVA_HOME/bin:$PATH
# $JAVA_HOME/lib/amd64/server should contain libjvm.so
export LD_LIBRARY_PATH=$JAVA_HOME/lib:$JAVA_HOME/lib/amd64/server:$PATH 
```


## create FMU

### Windows

```
gradlew.bat build fmu
```
### Linux

```
./gradlew build fmu
```

This should create the FMU in build/fmus


