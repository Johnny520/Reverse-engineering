# Nuke Unidbg Harness

Runs the ARM64 `libnuke_bridge.so` and its current native engine in Unidbg.

```powershell
$env:JAVA_HOME = 'D:\Environment\Java\jar-26.0.1'
..\unidbg-reference\mvnw.cmd -q compile exec:java
```

The default workspace is the parent directory. An explicit workspace and JNI
input JSON can be supplied through Maven's `exec.args` property.
