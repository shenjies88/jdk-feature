## JDK特性

### 环境
- `JDK15`
- `Gradle6.7`
### JDK9

- [Jshell详解](https://www.cnblogs.com/IcanFixIt/p/7199108.html)

- [模块化详解](https://www.baeldung.com/java-9-modularity)

  - ```shell
    #编译app模块
    javac --module-path mods -d mods/com.app.module app-module/src/main/java/module-info.java app-module/src/main/java/com/app/module/*.java
    
    #自定义Logger
    #编译
    javac --module-path mods -d mods/com.logging.module logging-module/src/main/java/module-info.java logging-module/src/main/java/com/logging/module/*.java
    #运行
    java --module-path mods -m com.app.module/com.app.module.MainApp
    
    #SLF4J
    #编译
    javac --module-path mods -d mods/com.slf4j.module slf4j-module/src/main/java/module-info.java slf4j-module/src/main/java/com/slf4j/module/*.java
    #运行
    java --module-path mods -Dlogback.configurationFile=mods/logback.xml -m com.app.module/com.app.module.MainApp
    ```

    

- 集合

- Stream

- Optional

- 进程 API

- [平台日志详解](https://www.baeldung.com/java-9-logging-api)

### JDK10

### JDK11

### JDK12

### JDK13

### JDK14

### JDK15
