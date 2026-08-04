package yyds;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᛷᛱᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1475 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AtomicInteger f7007 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f7007.getAndIncrement());
        return thread;
    }
}
