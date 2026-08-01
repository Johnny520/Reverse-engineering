package io.fastkv;

import io.fastkv.interfaces.FastLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class FastKVConfig {
    static volatile Executor sExecutor;
    static FastLogger sLogger = new DefaultLogger();
    static int internalLimit = 4096;

    private FastKVConfig() {
    }

    public static Executor getExecutor() {
        if (sExecutor == null) {
            synchronized (FastKVConfig.class) {
                try {
                    if (sExecutor == null) {
                        sExecutor = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return sExecutor;
    }

    public static void setExecutor(Executor executor) {
        if (executor != null) {
            sExecutor = executor;
        }
    }

    public static void setInternalLimit(int i) {
        if (i < 2048 || i > 65535) {
            return;
        }
        internalLimit = i;
    }

    public static void setLogger(FastLogger fastLogger) {
        sLogger = fastLogger;
    }
}
