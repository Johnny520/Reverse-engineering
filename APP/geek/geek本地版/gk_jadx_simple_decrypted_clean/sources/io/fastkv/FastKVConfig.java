package io.fastkv;

import io.fastkv.interfaces.FastLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class FastKVConfig {
    static int internalLimit;
    static volatile Executor sExecutor;
    static FastLogger sLogger;

    static {
        sLogger = new DefaultLogger();
        internalLimit = 4096;
    }

    private FastKVConfig() {
    }

    public static Executor getExecutor() {
        if (sExecutor != null) goto L16;
        monitor-enter(FastKVConfig.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (sExecutor != null) goto L11;
        sExecutor = Executors.newCachedThreadPool();     // Catch: Throwable -> L9
    L11:
        monitor-exit(FastKVConfig.class);     // Catch: Throwable -> L9
    L16:
        return sExecutor;
    }

    public static void setExecutor(Executor r0) {
        if (r0 == null) goto L5;
        sExecutor = r0;
        return;
    }

    public static void setInternalLimit(int r1) {
        if (r1 >= 2048) goto L5;
        return;
    L5:
        if (r1 > 65535) goto L9;
        internalLimit = r1;
        return;
    }

    public static void setLogger(FastLogger r0) {
        sLogger = r0;
    }
}
