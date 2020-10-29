## JDK特性

### 环境

- `JDK15`
- `Gradle6.7`

### 提示

- Gradle执行乱码问题`vmoptions`文件加上`-Dfile.encoding=utf-8`

### JDK9

- [Jshell详解](https://www.cnblogs.com/IcanFixIt/p/7199108.html)

- [模块化详解](https://www.baeldung.com/java-9-modularity)

- [平台日志详解](https://www.baeldung.com/java-9-logging-api)
    
     
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
    
    - 集合
    
    - Stream
    
    - Optional
    
    - 进程 API
    
    - 反应式流 (Reactive Streams)
    
    - 变量以及方法反射句柄
    
    - G1默认垃圾收集废弃CMS
    
    - 接口私有方法
        

### JDK10

- `var关键字`类型推断
  - 带有初始化的局部变量
  - 增强`for循环`
  - 普通`for循环变量`
- `Java`进程类共享
- `G1`并行收集

### JDK11

- `var关键字`可应用于`lambda表达式`
- [HttpClient API](https://juejin.im/post/6844903685563088903#heading-8)

### JDK12

- [介绍](https://developer.ibm.com/zh/articles/the-new-features-of-java-12/)
- `Shenandoah，它是作为一中低停顿时间的垃圾收集器` 
- `Java Microbenchmark Harness`性能测试套件
- 改进`G1`

### JDK13

- `Socket API`重构

### JDK14

- 美化`NullPointerException`信息打印
- `Switch 表达式`正式版
- 删除`CMS 垃圾回收器`

### JDK15

- `ZGC`毫秒级暂停`GC`
