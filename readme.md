1.  直接通过 javac 编译某个特定的java问题
如： javac ./chapter10/Suger.java
javac HeapOOM.
2. 运行
java -jvmOpts package.javaFileName
在src目录下运行，需要加上包名
D:\projects\jvm\src>java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError chapter2.HeapOOM

 java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=. chapter2.HeapOOM


结果如下：
java.lang.OutOfMemoryError: Java heap space
Dumping heap to java_pid12064.hprof ...
Heap dump file created [28102065 bytes in 0.099 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Unknown Source)
        at java.util.Arrays.copyOf(Unknown Source)
        at java.util.ArrayList.grow(Unknown Source)
        at java.util.ArrayList.ensureExplicitCapacity(Unknown Source)
        at java.util.ArrayList.ensureCapacityInternal(Unknown Source)
        at java.util.ArrayList.add(Unknown Source)
        at chapter2.HeapOOM.main(HeapOOM.java:18)


JVM使用使用：
-XX:HeapDumpPath=.  dump出的内存快照地址
-XX:+HeapDumpOnOutOfMemoryError： 参数表示当JVM发生OOM时，自动生成DUMP文件。