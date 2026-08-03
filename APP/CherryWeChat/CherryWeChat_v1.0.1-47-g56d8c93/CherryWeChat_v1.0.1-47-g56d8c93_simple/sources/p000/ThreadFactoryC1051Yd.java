package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: Yd */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1051Yd implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable r3) {
        monitor-enter(this);
        Thread r0 = new Thread(r3, "glide-disk-lru-cache-thread");     // Catch: Throwable -> L6
        r0.setPriority(1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }
}
