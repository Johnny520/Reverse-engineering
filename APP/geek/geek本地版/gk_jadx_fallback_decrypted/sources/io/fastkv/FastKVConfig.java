package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
public final class FastKVConfig {
    static int internalLimit;
    static volatile java.util.concurrent.Executor sExecutor;
    static io.fastkv.interfaces.FastLogger sLogger;

    static {
            io.fastkv.DefaultLogger r0 = new io.fastkv.DefaultLogger
            r0.<init>()
            io.fastkv.FastKVConfig.sLogger = r0
            r0 = 4096(0x1000, float:5.74E-42)
            io.fastkv.FastKVConfig.internalLimit = r0
            return
    }

    private FastKVConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor getExecutor() {
            java.util.concurrent.Executor r0 = io.fastkv.FastKVConfig.sExecutor
            if (r0 != 0) goto L18
            java.lang.Class<io.fastkv.FastKVConfig> r0 = io.fastkv.FastKVConfig.class
            monitor-enter(r0)
            java.util.concurrent.Executor r1 = io.fastkv.FastKVConfig.sExecutor     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch: java.lang.Throwable -> L12
            io.fastkv.FastKVConfig.sExecutor = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            java.util.concurrent.Executor r0 = io.fastkv.FastKVConfig.sExecutor
            return r0
    }

    public static void setExecutor(java.util.concurrent.Executor r0) {
            if (r0 == 0) goto L4
            io.fastkv.FastKVConfig.sExecutor = r0
        L4:
            return
    }

    public static void setInternalLimit(int r1) {
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 < r0) goto Lb
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto Lb
            io.fastkv.FastKVConfig.internalLimit = r1
        Lb:
            return
    }

    public static void setLogger(io.fastkv.interfaces.FastLogger r0) {
            io.fastkv.FastKVConfig.sLogger = r0
            return
    }
}
