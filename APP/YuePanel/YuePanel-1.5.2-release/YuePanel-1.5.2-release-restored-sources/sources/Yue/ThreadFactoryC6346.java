package Yue;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class ThreadFactoryC6346 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥ */
    public final ThreadFactory f2025 = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: ۥ۟ */
    public final AtomicInteger f2026 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f16118;

    public ThreadFactoryC6346(String str) {
        this.f16118 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f2025.newThread(runnable);
        threadNewThread.setName(this.f16118 + "-" + this.f2026);
        return threadNewThread;
    }
}
